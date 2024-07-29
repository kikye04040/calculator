package calculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // level 1-5
        int index = 0;

        // level 1-4
        while (true) {
            // level 1-1
            try {
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
                int result = calculator.calculate(num1, num2, cal);
                System.out.println("결과: " + result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeWord = sc.next();
                if (removeWord.equals("remove")) {
                    calculator.removeResult();
                    System.out.println("가장 오래된 결과가 삭제되었습니다.");
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiryWord = sc.next();
                if (inquiryWord.equals("inquiry")) {
                    ArrayList<Integer> resultArray = calculator.getResultArray();
                    int count = 1;
                    for (int resultNum : resultArray) {
                        System.out.println("결과: " + count + ": " + resultNum);
                        count++;
                    }
                }

                System.out.println("연산 결과를 새로운 리스트로 설정하시겠습니까? (set 입력 시 설정)");
                String setWord = sc.next();
                if (setWord.equals("set")) {
                    ArrayList<Integer> newResults = new ArrayList<>();
                    calculator.setResultArray(newResults);
                    System.out.println("새로운 결과 리스트가 설정되었습니다.");
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                String endWord = sc.next();
                if (endWord.equals("exit")) {
                    break;
                }
            } catch (InvalidOperatorException | DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("숫자를 잘못 입력하셨습니다.");
                sc.nextLine();
            }
        }
    }
}