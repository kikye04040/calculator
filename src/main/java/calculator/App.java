package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // level 1-1
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        // level 1-2
        System.out.print("사칙연산 기호를 입력하세요: ");
        char cal = sc.next().charAt(0);

        // level 1-3
        int result = 0;
        if (cal == '+') {
            result = num1 + num2;
        }
        else if (cal == '-') {
            result = num1 - num2;
        }
        else if (cal == '*') {
            result = num1 * num2;
        }
        else if (cal == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            else {
                result = num1 / num2;
            }
        }
        else {
            System.out.println("숫자를 잘못 입력하셨습니다.");
        }
        System.out.println("결과: " + result);
    }
}