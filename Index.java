import java.util.Scanner;
public class Index {

    public static void main(String[] args) {
     Myfunc();
    }
    
    // create a tabel tic tac toe
    static void Myfunc() {
      Scanner scan = new Scanner(System.in);
      
      char[][] board = {{' ', ' ' , ' '},
                        {' ', ' ' , ' '},
                        {' ', ' ' , ' '}};
    
       printboard(board);
        while (true) { // looping agar tic tac toe berjalan sebelum menanng
            Playgame(scan , board);

            if (GameSelesai(board)) {
              break;
            }

           printboard(board);

           getPlayer2(board);
           if (GameSelesai(board)) {
            break;
           }

            printboard(board);
      
        }
     
      }

      // create tic tac toe tabel


    public static Boolean GameSelesai(char [][] board) {
    //  GameWins(board);

         if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
            (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
            (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
            
            (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
            (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
            (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
            
            (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
            (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
            
            printboard(board);
            System.out.println("Player 1 Winss...");
            return true;
        }

        if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
            (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
            (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
            
            (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
            (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
            (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
            
            (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
            (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {

            printboard(board);
            System.out.println("Player 2 Winss...");
            return true;
        }


      for (int i = 0; i < board.length; i++) {
        for(int j = 0; j < board[i].length; j++) {
           if (board[i][j] == ' ') {
             return false;
           } 
        }
    }
      printboard(board);
      System.out.println("Game sudah selesaii...");
      return false;

    }

    // public static Boolean GameWins(char [][] board) {

    //     if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
    //         (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
    //         (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
            
    //         (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
    //         (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
    //         (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
            
    //         (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
    //         (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
            
    //         printboard(board);
    //         System.out.println("Player 1 Winss...");
    //         return true;
    //     }

    //     if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
    //         (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
    //         (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
            
    //         (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
    //         (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
    //         (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
            
    //         (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
    //         (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {

    //         printboard(board);
    //         System.out.println("Player 2 Winss...");
    //         return true;
    //     }
    
    //     return true;
    // }

    public static void getPlayer2(char [][] board ) {
     Scanner scan2 = new Scanner(System.in);
     System.out.println("Player 2 silahkan jalan .... (angka 1-9)");
     int Input = scan2.nextInt();

     while (true) {
        if (IsSpace(board, Input)) {
            break;
        }
     }
      
      Playermove(Integer.toString(Input), board , 'O');
    }

    private static Boolean IsSpace(char [][] board , int position) {
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
               
            case 2:
                return(board[0][1] == ' ');

            case 3:
                return(board[0][2] == ' ');

            case 4:
                return(board[1][0] == ' ');
            
            case 5:
                return(board[1][1] == ' ');
            
            case 6:
               return(board[1][2] == ' ');
            
            case 7:
               return(board[2][0] == ' ');
            
            case 8:
              return(board[2][1] == ' ');
            
            case 9:
             return(board[2][2] == ' ');
            default:
              return false;
        }
    }

    private static void Playgame(Scanner scan , char [] [] board) {
      System.out.println("Player 1 Masukkan angka 1 - 9");
           String Myinput = scan.nextLine();

        Playermove(Myinput, board , 'X');

    }

    private static void Playermove(String Myinput, char[][] board , char Symbol) {
         switch (Myinput) {
            case "1":
                board[0][0] = Symbol;
                break;
            
            case "2":
                board[0][1] = Symbol;
                break;
            
            case "3":
                board[0][2] = Symbol;
                break;
            
            case "4":
                board[1][0] = Symbol;
                break;
            
            case "5":
                board[1][1] = Symbol;
                break;
            
            case "6":
                board[1][2] = Symbol;
                break;
            
            case "7":
                board[2][0] = Symbol;
                break;
            
            case "8":
                board[2][1] = Symbol;
                break;
            
            case "9":
                board[2][2] = Symbol;
                break;
           
            default:
                System.out.println("terjadi kesalahan..");
                break;
           }
    }


    private static void printboard(char[][] board) {
        System.out.println(board[0][0]+ " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("_ + _ + _");
        System.out.println(board[1][0]+ " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("_ + _ + _");
        System.out.println(board[2][0]+ " | " + board[2][1] + " | " + board[2][2]);
    }
}