package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // level 1-5
        int[] resultArray = new int[10];
        int index = 0;
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */

        // level 1-4
        while (true) {
            // level 1-1
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            sc.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();

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
                    continue;
                }
                else {
                    result = num1 / num2;
                }
            }
            else {
                System.out.println("숫자를 잘못 입력하셨습니다.");
                continue;
            }
            System.out.println("결과: " + result);

            // level 1-5
            resultArray[index] = result;
            index++;
            System.out.println(index);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String endWord = sc.next();

            if (endWord.equals("exit")) {
                break;
            }
        }
    }
}