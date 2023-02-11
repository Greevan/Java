import java.util.Scanner;

public class ChallengeCalculator{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Two numbers : \n");
        Double num1=scan.nextDouble();
        scan.nextLine();
        Double num2=scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the Operation to be performed on it[+,-,*,/,%] :");
        String op= scan.nextLine();
        double result =0;
    try{
        switch (op){
            case "+":
                result= num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "%":
                result = num1%num2;
                break;
            default:
                System.out.println("Correct ah na Operation input ah kudu da Parama!");
        }
    }
    catch (Exception e){
        System.out.println("Number formatting Exception" + e.getMessage());
    }
System.out.println("Result: " + result);

    }
}
