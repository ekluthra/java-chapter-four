import java.text.NumberFormat;

public class NumberFormatExample {
    public static void main(String[] args) { 
        
        //declaring variables under numberformat class for specific uses (money, int, decimal, percent)
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat number = NumberFormat.getIntegerInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        double x = 10.5;
        
        //using variableName.format(x), x being the variable we are formatting
        System.out.println(money.format(x));
        System.out.println(number.format(x));
        System.out.println(decimal.format(x));
        System.out.println(percent.format(x));
        
    }
}
