class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        int m = edges.length;
        int[] head = new int[n];
        Arrays.fill(head, -1);
        int[] nxt = new int[m], to = new int[m], wt = new int[m];
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            to[i] = edges[i][1];
            wt[i] = edges[i][2];
            nxt[i] = head[u];
            head[u] = i;
        }

        char[] lab = labels.toCharArray();
        int K = k + 1;                       // run lengths 1..k, index 0 unused
        long M = (long) n * K;               // total number of state ids
        long[] dist = new long[(int) M];
        Arrays.fill(dist, Long.MAX_VALUE);

        PriorityQueue<Long> pq = new PriorityQueue<>();
        int start = 1;                       // node 0, run length 1
        dist[start] = 0;
        pq.add((long) start);                // key = dist * M + stateId

        while (!pq.isEmpty()) {
            long key = pq.poll();
            long d = key / M;
            int state = (int) (key % M);
            if (d > dist[state]) continue;

            int u = state / K;
            int r = state % K;
            if (u == n - 1) return (int) d;

            for (int e = head[u]; e != -1; e = nxt[e]) {
                int v = to[e];
                int nr;
                if (lab[v] == lab[u]) {
                    nr = r + 1;
                    if (nr > k) continue;
                } else {
                    nr = 1;
                }
                int ns = v * K + nr;
                long nd = d + wt[e];
                if (nd < dist[ns]) {
                    dist[ns] = nd;
                    pq.add(nd * M + ns);
                }
            }
        }
        return -1;
    }
}