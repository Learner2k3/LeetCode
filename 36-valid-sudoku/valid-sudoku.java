import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
        Set<Character> rowSet = new HashSet<>();;
        Set<Character> colSet = new HashSet<>();
        for(int j=0; j<9; j++){
            char rowChar = board[i][j];
            char colChar = board[j][i];
            
            if(rowChar!='.'){
                if(!rowSet.add(rowChar)){
                    return false;
                }
            }
            if(colChar!='.'){
                if(!colSet.add(colChar)){
                    return false;
                }
            }
        }
    }
    //chech 3*3 subgrid
        for(int i=0; i<9; i+=3) {
            for(int j=0; j<9; j+=3) {
                if(!validateSubgrid(i,j,board)){
                    return false;
                }               
            }
        }
        return true;
    }
private boolean validateSubgrid(int startRow, int startCol, char[][] board){
    Set<Character> subGridSet = new HashSet<>();
    for(int i = startRow; i<startRow+3; i++){
        for(int j=startCol; j<startCol+3; j++){
            char currentChar = board[i][j];
            if(currentChar!='.'){
                if(!subGridSet.add(currentChar)){
                    return false;
                }
            }
        }
    }
    return true;
}
}
