import java.util.*;
public class tictactoe {
    public static void main(String[] args) {
       gamestart();

        }
        //start game========================================================================================
        public static void gamestart() {
            //Makes an empty 3x3 2D Array
            String[][] grid = new String[3][3];

            //counts round #
            int round = 1;
            //Variable to check if X is making or move or O
            boolean player1 = true;
            //Checks if game has ended or not
            boolean gameover = false;

            while (!gameover) {
                //Display the round #
                System.out.println("Round: "+ round);
                //prints board
                printboard(grid);
                //asks the user to input their choice
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

        //makes an empty tic tac toe board============================================
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

        //check if someone wins========================================================================================
        public static void win(String[][] grid, boolean gameover) {
        Scanner input = new Scanner(System.in);
        //checking row wins ========================================================================================
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

         //checking column wins ========================================================================================
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
            if (grid[0][0] != null && grid[0][0].equals("[X]")
                    && grid[1][1] != null && grid[1][1].equals("[X]")
                    && grid[2][2] != null && grid[2][2].equals("[X]")) {
                gameover = true;
                System.out.println("Player 1 Wins!");
                printboard(grid);
                //Play again or no ========================================================================================
                playagain();
            } else if (grid[0][0] != null && grid[0][0].equals("[0]")
                    && grid[1][1] != null && grid[1][1].equals("[0]")
                    && grid[2][2] != null && grid[2][2].equals("[0]")) {
                gameover = true;
                System.out.println("Player 2 Wins!");
                printboard(grid);
                //Play again or no ========================================================================================
                playagain();
            }
        }

        //asking the user to input their choice========================================================================================
        public static void quest(boolean turn, String[][] grid) {
        //variable to help check if the tictactoe spot has already been taken
        boolean repeat = true;
            Scanner input = new Scanner(System.in);
            //check if it is X's or O's turn ========================================================================================
            if (turn == true) {
                while(repeat) {
                    System.out.println("X, make your move(row,col):");
                    String ans1 = input.nextLine();
                    //converts the user's answers to places on the tictactoe board========================================================================================
                    int x1 = Integer.parseInt(ans1.substring(0, ans1.indexOf(",")));
                    int y1 = Integer.parseInt(ans1.substring(ans1.indexOf(",") + 1));

                    //Checking if the user inputs an "out of bounds" move
                    if (x1 >= 0 && x1 < 3 && y1 >= 0 && y1 < 3) {
                        //if there is nothing inside the spot, then fill it with X and the while loop stops
                        if (grid[x1][y1] == null) {
                            grid[x1][y1] = "[X]";
                            repeat = false;
                        } else {
                            System.out.println("That spot is already taken. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter values between 0 and 2 for row and column.");
                    }
                }
            } else if (turn == false) {
                //same process as above
                while(repeat) {
                    System.out.println("0, make your move(row,col):");
                    String ans2 = input.nextLine();
                    int x2 = Integer.parseInt(ans2.substring(0, ans2.indexOf(",")));
                    int y2 = Integer.parseInt(ans2.substring(ans2.indexOf(",") + 1));

                    if (x2 >= 0 && x2 < 3 && y2 >= 0 && y2 < 3) {
                        if (grid[x2][y2] == null) {
                            grid[x2][y2] = "[0]";
                            repeat = false;
                        } else {
                            System.out.println("That spot is already taken. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter values between 0 and 2 for row and column.");
                    }
                }
            }

        }

        //Asks user if they want to play again========================================================================================
        public static void playagain() {
        Scanner input = new Scanner(System.in);
            System.out.println("Play Again Y/N");
            String cont = input.nextLine();
            if (cont.equals("Y")) {
                gamestart();
            } else if (cont.equals("N")) {
                System.exit(0);
            }
        }

    }