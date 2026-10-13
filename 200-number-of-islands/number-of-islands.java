class Solution {
public void bfs(int sr, int sc, int[][] vis, char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});
        vis[sr][sc] = 1;

        // 4 directions: down, up, right, left
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int cr = curr[0];
            int cc = curr[1];

            for (int d = 0; d < 4; d++) {
                int nr = cr + dir[d][0];
                int nc = cc + dir[d][1];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    vis[nr][nc] == 0 &&
                    grid[nr][nc] == '1') {

                    vis[nr][nc] = 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    bfs(i, j, vis, grid);
                    cnt++;
                }
            }
        }

        return cnt;
    }
}