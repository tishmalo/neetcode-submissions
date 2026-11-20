class Solution {
    public boolean isValidSudoku(char[][] board) {

        /**
        Input: board =
[["1","2",".",#".","3",".",".",".","."],
 ["4",".",".",#"5",".",".",".",".","."],
 [".","9","1",#".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

 rows=[{1, 2, 3}, {4, 5}, {9, 1,3}, {5, 6, 4}, {8, 3, 5}, {7, 2, 6}, {2}, {4, 1, 9, 8}, {8, 7, 9}]
 cols=
 boxes=(r/3*3)+c/3
 4/3*3
 1*3+1=4
        
        */


        int N=9;
        HashSet<Character>[] rows=new HashSet[N];
        HashSet<Character>[] cols=new HashSet[N];
        HashSet<Character>[] boxes=new HashSet[N];

        for(int i=0; i<N; i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();

        }

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){

                char val=board[r][c];

                if(val=='.')continue;

                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                int idx=(r/3*3)+c/3;

                if(boxes[idx].contains(val)){

                    return false;
                }

                boxes[idx].add(val);
                                  



            }
        }

        return true;
    


        
    }

}
