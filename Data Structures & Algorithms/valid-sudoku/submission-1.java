class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (map.containsKey(board[i][j])) {
                        return false;
                    } else {
                        map.put(board[i][j], 1);
                    }
                }
            }
            map.clear();
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    if (map.containsKey(board[i][j])) {
                        return false;
                    } else {
                        map.put(board[i][j], 1);
                    }
                }
            }
            map.clear();
        }
        
        int x=0;
        int y=0;
        int j=0;
        int b=0;
        int l=0;
while(b<9){
            for (int i = x; i < x+3; i++) {
                for (j = y; j < y+3; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    } else {
                        if (map.containsKey(board[i][j])) {
                            return false;
                        } else {
                            map.put(board[i][j], 1);
                        }
                    }
                }
               
            }
            map.clear();
            if(l<2){
            y+=3;
            l++;
            }
            else{
            if(x<=5){
            x+=3;
            y=0;
            l=0;
            }
            else {break;}
            }
            
}
           
        
        return true;
    }
}
