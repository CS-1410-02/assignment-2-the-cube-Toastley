
import java.util.Scanner;

public class Cube {
	public static void main(final String[] args){

    char[][][] color = new char[6][3][3];
    boolean isRunning = true;
    char tempColor0 = 'x';
    char tempColor1 = 'x';
    char tempColor2 = 'x';
    char tempColor3 = 'x';
    char tempColor4 = 'x';
    char tempColor5 = 'x';
    char tempColor6 = 'x';
    char tempColor7 = 'x';
    int iC = -1;
    int cF = -1;
    String commandsToSolve = "End";
    
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 3; k++) {

          switch (i) {
            case 0:
              color[i][j][k] = 'r';
              break;
            case 1:
              color[i][j][k] = 'b';
              break;
            case 2:
              color[i][j][k] = 'o';
              break;
            case 3:
              color[i][j][k] = 'g';
              break;
            case 4:
              color[i][j][k] = 'y';
              break;
            case 5:
              color[i][j][k] = 'w';
              break;
          }

        }
      }
    }

    Scanner theScanner = new Scanner(System.in);

    while (isRunning) {

      for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 3; j++) {
          for (int k = 0; k < 3; k++) {
  
            System.out.print(color[i][j][k]);
            if (k == 2) {
              System.out.println();
            }

            if (k != 2) {
              System.out.print("|");
            }

            if (j == 2 && k == 2) {
              System.out.println();
            }
          }
        }
      }

      System.out.println("Commands to solve: " + commandsToSolve);
      System.out.println();
      System.out.println("Enter command");
      String command = theScanner.nextLine();

      switch (command) {

        case "End":
          isRunning = false;
        break;

        case "U":
          for (int i = 0; i < 3; i++) {
            tempColor0 = color[0][0][i];
            tempColor1 = color[1][0][i];
            tempColor2 = color[2][0][i];
            tempColor3 = color[3][0][i];
            color[0][0][i] = tempColor3;
            color[1][0][i] = tempColor0;
            color[2][0][i] = tempColor1;
            color[3][0][i] = tempColor2;
          }

          cF = 4;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor6;
          color[cF][0][1] = tempColor7;
          color[cF][0][2] = tempColor0;
          color[cF][1][2] = tempColor1;
          color[cF][2][2] = tempColor2;
          color[cF][2][1] = tempColor3;
          color[cF][2][0] = tempColor4;
          color[cF][1][0] = tempColor5;
          
          commandsToSolve = "U, " + commandsToSolve;
        break;

        case "U'":
          for (int i = 0; i < 3; i++) {
            tempColor0 = color[0][0][i];
            tempColor1 = color[1][0][i];
            tempColor2 = color[2][0][i];
            tempColor3 = color[3][0][i];
            color[0][0][i] = tempColor1;
            color[1][0][i] = tempColor2;
            color[2][0][i] = tempColor3;
            color[3][0][i] = tempColor0;
          }

          cF = 4;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor2;
          color[cF][0][1] = tempColor3;
          color[cF][0][2] = tempColor4;
          color[cF][1][2] = tempColor5;
          color[cF][2][2] = tempColor6;
          color[cF][2][1] = tempColor7;
          color[cF][2][0] = tempColor0;
          color[cF][1][0] = tempColor1;

          commandsToSolve = "U', " + commandsToSolve;

        break;

        case "D":
          for (int i = 0; i < 3; i++) {
            tempColor0 = color[0][2][i];
            tempColor1 = color[1][2][i];
            tempColor2 = color[2][2][i];
            tempColor3 = color[3][2][i];
            color[0][2][i] = tempColor1;
            color[1][2][i] = tempColor2;
            color[2][2][i] = tempColor3;
            color[3][2][i] = tempColor0;
          }

          cF = 5;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor6;
          color[cF][0][1] = tempColor7;
          color[cF][0][2] = tempColor0;
          color[cF][1][2] = tempColor1;
          color[cF][2][2] = tempColor2;
          color[cF][2][1] = tempColor3;
          color[cF][2][0] = tempColor4;
          color[cF][1][0] = tempColor5;

          commandsToSolve = "D, " + commandsToSolve;

        break;

        case "D'":
          for (int i = 0; i < 3; i++) {
            tempColor0 = color[0][2][i];
            tempColor1 = color[1][2][i];
            tempColor2 = color[2][2][i];
            tempColor3 = color[3][2][i];
            color[0][2][i] = tempColor3;
            color[1][2][i] = tempColor0;
            color[2][2][i] = tempColor1;
            color[3][2][i] = tempColor2;
          }

          cF = 5;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor2;
          color[cF][0][1] = tempColor3;
          color[cF][0][2] = tempColor4;
          color[cF][1][2] = tempColor5;
          color[cF][2][2] = tempColor6;
          color[cF][2][1] = tempColor7;
          color[cF][2][0] = tempColor0;
          color[cF][1][0] = tempColor1;

          commandsToSolve = "D', " + commandsToSolve;

        break;
        
        case "R":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[1][i][2];
            tempColor1 = color[4][i][2];
            tempColor2 = color[3][iC][0];
            tempColor3 = color[5][i][2];
            color[1][i][2] = tempColor3;
            color[4][i][2] = tempColor0;
            color[3][iC][0] = tempColor1;
            color[5][i][2] = tempColor2;
            
          }

          cF = 0;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor6;
          color[cF][0][1] = tempColor7;
          color[cF][0][2] = tempColor0;
          color[cF][1][2] = tempColor1;
          color[cF][2][2] = tempColor2;
          color[cF][2][1] = tempColor3;
          color[cF][2][0] = tempColor4;
          color[cF][1][0] = tempColor5;

          commandsToSolve = "R, " + commandsToSolve;

        break;

        case "R'":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[1][i][2];
            tempColor1 = color[4][i][2];
            tempColor2 = color[3][iC][0];
            tempColor3 = color[5][i][2];
            color[1][i][2] = tempColor1;
            color[4][i][2] = tempColor2;
            color[3][iC][0] = tempColor3;
            color[5][i][2] = tempColor0;
            
          }

          cF = 0;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor2;
          color[cF][0][1] = tempColor3;
          color[cF][0][2] = tempColor4;
          color[cF][1][2] = tempColor5;
          color[cF][2][2] = tempColor6;
          color[cF][2][1] = tempColor7;
          color[cF][2][0] = tempColor0;
          color[cF][1][0] = tempColor1;

          commandsToSolve = "R', " + commandsToSolve;

        break;

        case "L":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[1][i][0];
            tempColor1 = color[4][i][0];
            tempColor2 = color[3][iC][2];
            tempColor3 = color[5][i][0];
            color[1][i][0] = tempColor1;
            color[4][i][0] = tempColor2;
            color[3][iC][2] = tempColor3;
            color[5][i][0] = tempColor0;
            
          }

          cF = 2;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor6;
          color[cF][0][1] = tempColor7;
          color[cF][0][2] = tempColor0;
          color[cF][1][2] = tempColor1;
          color[cF][2][2] = tempColor2;
          color[cF][2][1] = tempColor3;
          color[cF][2][0] = tempColor4;
          color[cF][1][0] = tempColor5;

          commandsToSolve = "L, " + commandsToSolve;

        break;

        case "L'":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[1][i][0];
            tempColor1 = color[4][i][0];
            tempColor2 = color[3][iC][2];
            tempColor3 = color[5][i][0];
            color[1][i][0] = tempColor3;
            color[4][i][0] = tempColor0;
            color[3][iC][2] = tempColor1;
            color[5][i][0] = tempColor2;
            
          }

          cF = 2;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor2;
          color[cF][0][1] = tempColor3;
          color[cF][0][2] = tempColor4;
          color[cF][1][2] = tempColor5;
          color[cF][2][2] = tempColor6;
          color[cF][2][1] = tempColor7;
          color[cF][2][0] = tempColor0;
          color[cF][1][0] = tempColor1;

          commandsToSolve = "L', " + commandsToSolve;

        break;

        case "F":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[4][2][i];
            tempColor1 = color[0][i][0];
            tempColor2 = color[5][0][i];
            tempColor3 = color[2][iC][2];
            color[4][2][i] = tempColor3;
            color[0][i][0] = tempColor0;
            color[5][0][i] = tempColor1;
            color[2][iC][2] = tempColor2;
            
          }

          cF = 1;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor6;
          color[cF][0][1] = tempColor7;
          color[cF][0][2] = tempColor0;
          color[cF][1][2] = tempColor1;
          color[cF][2][2] = tempColor2;
          color[cF][2][1] = tempColor3;
          color[cF][2][0] = tempColor4;
          color[cF][1][0] = tempColor5;

          commandsToSolve = "F, " + commandsToSolve;

        break;
        
        case "F'":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[4][2][i];
            tempColor1 = color[0][i][0];
            tempColor2 = color[5][0][i];
            tempColor3 = color[2][iC][2];
            color[4][2][i] = tempColor1;
            color[0][i][0] = tempColor2;
            color[5][0][i] = tempColor3;
            color[2][iC][2] = tempColor0;
            
          }

          cF = 1;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor2;
          color[cF][0][1] = tempColor3;
          color[cF][0][2] = tempColor4;
          color[cF][1][2] = tempColor5;
          color[cF][2][2] = tempColor6;
          color[cF][2][1] = tempColor7;
          color[cF][2][0] = tempColor0;
          color[cF][1][0] = tempColor1;

          commandsToSolve = "F', " + commandsToSolve;

        break;

        case "B":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[4][0][i];
            tempColor1 = color[0][i][2];
            tempColor2 = color[5][2][i];
            tempColor3 = color[2][iC][0];
            color[4][0][i] = tempColor1;
            color[0][i][2] = tempColor2;
            color[5][2][i] = tempColor3;
            color[2][iC][0] = tempColor0;
            
          }

          cF = 3;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor6;
          color[cF][0][1] = tempColor7;
          color[cF][0][2] = tempColor0;
          color[cF][1][2] = tempColor1;
          color[cF][2][2] = tempColor2;
          color[cF][2][1] = tempColor3;
          color[cF][2][0] = tempColor4;
          color[cF][1][0] = tempColor5;

          commandsToSolve = "B, " + commandsToSolve;

        break;

        case "B'":
          for (int i = 0; i < 3; i++) {

            switch (i) {
              case 0:
                iC = 2;
              break;
              case 1:
                iC = 1;
              break;
              case 2:
                iC = 0;
              break;
            }

            tempColor0 = color[4][0][i];
            tempColor1 = color[0][i][2];
            tempColor2 = color[5][2][i];
            tempColor3 = color[2][iC][0];
            color[4][0][i] = tempColor3;
            color[0][i][2] = tempColor0;
            color[5][2][i] = tempColor1;
            color[2][iC][0] = tempColor2;
            
          }

          cF = 3;

          tempColor0 = color[cF][0][0];
          tempColor1 = color[cF][0][1];
          tempColor2 = color[cF][0][2];
          tempColor3 = color[cF][1][2];
          tempColor4 = color[cF][2][2];
          tempColor5 = color[cF][2][1];
          tempColor6 = color[cF][2][0];
          tempColor7 = color[cF][1][0];
          color[cF][0][0] = tempColor2;
          color[cF][0][1] = tempColor3;
          color[cF][0][2] = tempColor4;
          color[cF][1][2] = tempColor5;
          color[cF][2][2] = tempColor6;
          color[cF][2][1] = tempColor7;
          color[cF][2][0] = tempColor0;
          color[cF][1][0] = tempColor1;

          commandsToSolve = "B', " + commandsToSolve;

        break;
        
      }
    }

  }
}
