import java.util.*;

class Solution {
    int[] bit;
    int N;

    void xorAt(int i, int v) {
        for (i++; i <= N + 1; i += i & -i) bit[i] ^= v;
    }

    // XOR v onto positions [l, r]
    void rangeXor(int l, int r, int v) {
        xorAt(l, v);
        if (r + 1 < N) xorAt(r + 1, v);
    }

    int pointQuery(int i) {
        int res = 0;
        for (i++; i > 0; i -= i & -i) res ^= bit[i];
        return res;
    }

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        N = n;
        bit = new int[n + 2];

        // adjacency (array-based)
        int[] head = new int[n];
        Arrays.fill(head, -1);
        int[] nxt = new int[2 * (n - 1)];
        int[] to = new int[2 * (n - 1)];
        int cnt = 0;
        for (int[] e : edges) {
            to[cnt] = e[1]; nxt[cnt] = head[e[0]]; head[e[0]] = cnt++;
            to[cnt] = e[0]; nxt[cnt] = head[e[1]]; head[e[1]] = cnt++;
        }

        int LOG = 1;
        while ((1 << LOG) < n) LOG++;
        int[][] up = new int[LOG + 1][n];
        int[] depth = new int[n];
        int[] tin = new int[n];
        int[] size = new int[n];
        int[] order = new int[n];

        // iterative DFS (preorder)
        int[] stack = new int[n];
        int sp = 0, timer = 0;
        stack[sp++] = 0;
        up[0][0] = 0;
        while (sp > 0) {
            int u = stack[--sp];
            tin[u] = timer;
            order[timer++] = u;
            for (int e = head[u]; e != -1; e = nxt[e]) {
                int v = to[e];
                if (v == up[0][u] && u != 0) continue;
                if (u == 0 && v == 0) continue;
                up[0][v] = u;
                depth[v] = depth[u] + 1;
                stack[sp++] = v;
            }
        }

        // subtree sizes
        Arrays.fill(size, 1);
        for (int i = n - 1; i > 0; i--) {
            int u = order[i];
            size[up[0][u]] += size[u];
        }

        for (int k = 1; k <= LOG; k++) {
            for (int v = 0; v < n; v++) {
                up[k][v] = up[k - 1][up[k - 1][v]];
            }
        }

        char[] cs = s.toCharArray();

        // build: each node's own letter toggles its whole subtree
        for (int u = 0; u < n; u++) {
            rangeXor(tin[u], tin[u] + size[u] - 1, 1 << (cs[u] - 'a'));
        }

        List<Boolean> ans = new ArrayList<>();
        for (String q : queries) {
            String[] p = q.split(" ");
            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);
                if (cs[u] != c) {
                    int delta = (1 << (cs[u] - 'a')) ^ (1 << (c - 'a'));
                    rangeXor(tin[u], tin[u] + size[u] - 1, delta);
                    cs[u] = c;
                }
            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                // LCA
                int a = u, b = v;
                if (depth[a] < depth[b]) { int t = a; a = b; b = t; }
                int diff = depth[a] - depth[b];
                for (int k = 0; diff > 0; k++, diff >>= 1) {
                    if ((diff & 1) != 0) a = up[k][a];
                }
                int lca;
                if (a == b) {
                    lca = a;
                } else {
                    for (int k = LOG; k >= 0; k--) {
                        if (up[k][a] != up[k][b]) {
                            a = up[k][a];
                            b = up[k][b];
                        }
                    }
                    lca = up[0][a];
                }

                int mask = pointQuery(tin[u]) ^ pointQuery(tin[v]) ^ (1 << (cs[lca] - 'a'));
                ans.add((mask & (mask - 1)) == 0);
            }
        }
        return ans;
    }
}