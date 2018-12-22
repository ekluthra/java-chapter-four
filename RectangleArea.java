import java.util.Scanner;

public class RectangleArea {    
    public static void main(String[] args) { 
        int length, width;
        Scanner scan = new Scanner(System.in);
        System.out.print("The length of the rectangle is: ");
        length = scan.nextInt();
        System.out.print("Thw width of the rectangle is: ");
        width = scan.nextInt();
        System.out.println("The area of the rectangle is: " + (length*width));
        scan.close();
    }
}
