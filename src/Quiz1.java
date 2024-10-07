import java.util.Scanner;


class Calculator{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public int divide(int num1, int num2){
        return num1/num2;
    }
}

public class Quiz1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int result = 0;

        System.out.println("첫 번쨰 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번쨰 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println("원하는 연산을 선택하세요 (+,-,*,/): ");
        char operator = scanner.next().charAt(0);


        switch (operator){
            case '+' :
                result = calculator.add(num1, num2);
                break;

            case '-' :
                result = calculator.subtract(num1, num2);
                break;

            case '*' :
                result = calculator.multiply(num1, num2);
                break;

            case '/' :
                result = calculator.divide(num1, num2);
                break;


            default:
                System.out.println("잘못된 연산자입니다. ");
                return;

        }



        System.out.println("계산 결과 " + result);
        scanner.close();
    }
}
