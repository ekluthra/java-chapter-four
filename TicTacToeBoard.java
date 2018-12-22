public class TicTacToeBoard {
    public static void main(String[] args) { 
        for(int i = 1; i <= 3; i++){
            System.out.format("%8s %8s", "|", "|\n");
        }
        for(int i = 1; i<=24; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1; i <= 3; i++){
            System.out.format("%8s %8s", "|", "|\n");
        }
        for(int i = 1; i<=24; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1; i <= 3; i++){
            System.out.format("%8s %8s", "|", "|\n");
        }
    }
}
