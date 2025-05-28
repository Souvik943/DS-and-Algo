package Compiled.Patterns.ArraysAndHashing;

import java.util.HashSet;
//LC : 36
public class ValidSudoku {
//1. We need to initialise a hashset of String
//2. We go though the char array by using 2 loops
//3. If the char is '.' , we continue
//4. We need to understand that hashSet.add(currentChar + "at row" + i) returns a true , if its not present
//5. Now we defined a hashset of string type , because we will be adding the string like :
//            seenAt.add(currentChar + "at row" + i)
//            seenAt.add(currentChar + "at column" + j)
//            seenAt.add(currentChar + "at subbox" + i/3 + "-" + j/3)
//            It will always give unique values and will not throw an error .

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seenAt = new HashSet<>();
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                char currentChar = board[i][j];
                if(currentChar == '.') continue;
                if(!seenAt.add(currentChar + "at row" + i) ||
                        !seenAt.add(currentChar + "at column" + j) ||
                        !seenAt.add(currentChar + "at subbox" + i/3 + "-" + j/3)) {
                    return false;
                }
            }
        }
        return true;
    }
}
