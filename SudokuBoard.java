import java.io.*;
import java.util.*;

public class SudokuBoard {
   private char[][] board;
   
   public SudokuBoard(String fileName) throws FileNotFoundException {
      board = new char[9][9];
      String input = "";
      Scanner file = new Scanner(new File(fileName));
      for(int r = 0; r < 9; r++) {
         input = file.nextLine();
         for(int c = 0; c < 9; c++) {
            board[r][c] = input.charAt(c);
         }
      }
   }
   
   public String toString() {
      return "";
   }

}