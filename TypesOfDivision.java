public class TypesOfDivision {
    public static void main(String[] args){
        
        int num1 = 5;
        int num2 = 3;
        int result;
        
        double doubleNum1 = 5;
        double doubleNum2 = 3;
        double doubleResult;
        
        result = num1/num2;
        System.out.println("num1/num2 = " + result);
        
        doubleResult = doubleNum1/doubleNum2;
        System.out.println("doubleNum1/doubleNum2 = " + doubleResult);
        
        doubleResult = num1/doubleNum2;
        System.out.println("num1/doubleNum2 = " + doubleResult);
        
        result = num1 % num2;
        System.out.println("num1%num2 = " + result);
        
        doubleResult = doubleNum1 % doubleNum2;
        System.out.println("doubleNum1%doubldNum2 = " + doubleResult);
        
    }
}
