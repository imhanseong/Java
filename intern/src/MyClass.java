import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("차 모델을 입력하세요: ");
        String userInput = scanner.nextLine();

        System.out.println("입력된 값: " + userInput);

        scanner.close();
    }
}
