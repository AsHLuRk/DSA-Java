class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length, m = tasks.length;
        int[] res = new int[m];

        // {weight, index}
        PriorityQueue<int[]> free = new PriorityQueue<>((a, b) ->
            a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        // {finishTime, weight, index}
        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) ->
            a[0] != b[0] ? Integer.compare(a[0], b[0])
          : a[1] != b[1] ? Integer.compare(a[1], b[1])
          : Integer.compare(a[2], b[2]));

        for (int i = 0; i < n; i++) free.offer(new int[]{servers[i], i});

        int time = 0;
        for (int j = 0; j < m; j++) {
            time = Math.max(time, j);

            // No free server: wait until the earliest one finishes
            if (free.isEmpty()) time = Math.max(time, busy.peek()[0]);

            // Release all servers that are done by now
            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                int[] s = busy.poll();
                free.offer(new int[]{s[1], s[2]});
            }

            int[] s = free.poll();
            res[j] = s[1];
            busy.offer(new int[]{time + tasks[j], s[0], s[1]});
        }
        return res;
    }
}