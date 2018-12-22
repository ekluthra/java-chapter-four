public class Rectangle {
    public static void main(String[] args) { 
        for (int i = 1; i <= 15; i++){
            System.out.print("*");
        }
        int i = 0;
        while (i < 5){
            System.out.format("\n*%14s", "*");
            i++;
        }
        System.out.println();
        i = 0;
        do {
            System.out.format("*");
            i++;
        }while(i<15);
        System.out.println();
    }
}
