import java.util.*;
public class tictactoe {
    public static void main(String[] args) {
       gamestart();

        }
        //start game========================================================================================
        public static void gamestart() {
            String[][] grid = new String[3][3];

            int round = 1;
            boolean player1 = true;
            boolean gameover = false;

            while (!gameover) {
                System.out.println("Round: "+ round);
                //prints an empty board
                printboard(grid);
                //asks the user to input placement
                quest(player1, grid);
                //check if there's a win
                win(grid, gameover);
                //switching turns
                if (player1==true) {
                    player1 = false;
                } else if (player1 == false) {
                    player1 = true;
                }

                round++;
            }
        }

        //makes an empty tic tac toe board with null============================================
        public static void printboard (String[][] grid) {
            for (int i = 0; i<grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == null){
                        System.out.print("[ ]");
                    } else {
                        System.out.print(grid[i][j]);
                    }
                }
                System.out.println();
            }
        }

        //check if win========================================================================================
        public static void win(String[][] grid, boolean gameover) {
        Scanner input = new Scanner(System.in);
        //checking horizontal wins ========================================================================================
            for (int i = 0; i<grid.length; i++) {
                //if X wins with a row ========================================================================================
                if (grid[i][0] != null && grid[i][0].equals("[X]") &&
                        grid[i][1] != null && grid[i][1].equals("[X]") &&
                        grid[i][2] != null && grid[i][2].equals("[X]")) {
                    gameover = true;
                    System.out.println("Player 1 Wins!");
                    printboard(grid);
                    //Play again or no ========================================================================================
                    playagain();
                //if 0 wins with a row =======================================================================================
                } else if (grid[i][0] != null && grid[i][0].equals("[0]") &&
                        grid[i][1] != null && grid[i][1].equals("[0]") &&
                        grid[i][2] != null && grid[i][2].equals("[0]")) {
                    gameover = true;
                    System.out.println("Player 2 Wins!");
                    printboard(grid);
                    //Play again or no ========================================================================================
                    playagain();
            }

         //checking vertical wins ========================================================================================
            for (int j = 0; j<grid[0].length; j++) {
                //Check if X wins with a column ========================================================================================
                if (grid[0][j] != null && grid[0][j].equals("[X]") &&
                        grid[1][j] != null &&grid[1][j].equals("[X]") &&
                        grid[3][j] != null && grid[2][j].equals("[X]")) {
                    gameover = true;
                    System.out.println("Player 1 Wins!");
                    printboard(grid);
                    //Play again or no ========================================================================================
                    playagain();
                //Check if 0 wins with a column ========================================================================================
                    } else if (grid[0][j] != null && grid[0][j].equals("[0]") &&
                        grid[1][j] != null &&grid[1][j].equals("[0]") &&
                        grid[3][j] != null && grid[2][j].equals("[0]")) {
                    gameover = true;
                    System.out.println("Player 2 Wins!");
                    printboard(grid);
                    //Play again or no ========================================================================================
                    playagain();
                    }
                }
            }
        //checking diagonal wins ========================================================================================
            if (grid[0][0].equals("[X]") && grid[1][1].equals("[X]") && grid[2][2].equals("[X]")) {
                gameover = true;
                System.out.println("Player 1 Wins!");
                printboard(grid);
                //Play again or no ========================================================================================
                playagain();
            } else if (grid[0][0].equals("[0]") && grid[1][1].equals("[0]") && grid[2][2].equals("[0]")) {
                gameover = true;
                System.out.println("Player 2 Wins!");
                printboard(grid);
                //Play again or no ========================================================================================
                playagain();
            }
        }

        //asking the user to input their placement========================================================================================
        public static void quest(boolean turn, String[][] grid) {
            Scanner input = new Scanner(System.in);
            //check if it is X's or O's turn ========================================================================================
            if (turn == true) {
                System.out.println("X, make your move(row,col):");
                String ans1 = input.nextLine();
                //converts the user's answers to places on the tictactoe board========================================================================================
                int x1 = Integer.parseInt(ans1.substring(0, ans1.indexOf(",")));
                int y1 = Integer.parseInt(ans1.substring(ans1.indexOf(",")+1));
                grid[x1][y1] = "[X]";
            } else if (turn == false) {
                System.out.println("0, make your move(row,col):");
                String ans2 = input.nextLine();
                //converts the user's answers to places on the tictactoe board========================================================================================
                int x2 = Integer.parseInt(ans2.substring(0, ans2.indexOf(",")));
                int y2 = Integer.parseInt(ans2.substring(ans2.indexOf(",")+1));
                grid[x2][y2] = "[0]";
            }

        }

        public static void playagain() {

        Scanner input = new Scanner(System.in);
            System.out.println("Play Again Y/N");
            String cont = input.nextLine();
            if (cont.equals("Y")) {
                gamestart();
            }
        }

    }