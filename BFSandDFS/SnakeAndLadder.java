package BFSandDFS;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadder {

    public int snakeandladder(int [][] board){
        int n = board.length;
        int i = n - 1, j = 0, inc = 1;
        int index = 0;
        int [] arr = new int[n * n];
        while(index < n * n){

            arr[index++] = board[i][j];
            if(inc == 1 && j == n - 1){
                inc = -1;
                i--;
            }else if(inc == -1 && j == 0){
                inc = 1;
                i--;
            }else{
                j += inc;
            }

        }

        boolean [] visited = new boolean[arr.length];
        Queue<Integer> q = new LinkedList<Integer>();
        int step = 0;
        int start = arr[0] > -1 ? arr[0] - 1 : 0;
        q.offer(start);
        visited[start] = true;

        if (arr[0] > -1) {
            q.offer(arr[0] - 1);
        } else {
            q.offer(0);
        }


        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int curr = q.poll();

                if (curr == n * n - 1) {
                    return step;
                }

                for(int next = curr + 1 ; next <= Math.min(curr + 6 , n * n - 1); next++){
                    int dest = arr[next] > -1 ? arr[next] - 1 : next;
                    if (!visited[dest]) {
                        visited[dest] = true;
                        q.offer(dest);

                    }

                }
            }
            step++;
        }
        return -1;
    }
}
