public class GettingStartedAgain {
  public static void main(String[] args) { 
    
    System.out.println("Hello, World\n");
    
    //if you don't have the %-10s and you just put %s, it won't format the words on the left properly and evertything on the right will be pushed over 
    System.out.format("%-10s %8s %8s", "Team", "Wins", "Losses\n");
    System.out.format("%-10s %8s %8s", "Falcons", "10", "0\n");
    System.out.format("%-10s %8s %8s", "Champions", "0", "10\n\n");
    
    System.out.format("The final game score is: %4s %4s", "10", "5\n");
  }
}
