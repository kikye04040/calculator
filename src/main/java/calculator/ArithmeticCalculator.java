package calculator;

public class ArithmeticCalculator extends Calculator {
    public double calculate(int num1, int num2, char cal) throws InvalidOperatorException, DivisionByZeroException {
        double result = 0;
        if (cal == '+') {
            result = num1 + num2;
        } else if (cal == '-') {
            result = num1 - num2;
        } else if (cal == '*') {
            result = num1 * num2;
        } else if (cal == '/') {
            if (num2 == 0) {
                throw new DivisionByZeroException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = (double) num1 / num2;
            }
        } else if ((cal != '+') && (cal != '-') && (cal != '*') && (cal != '/')) {
            throw new InvalidOperatorException("사칙연산자를 잘못 입력하셨습니다.");
        }
        resultArray.add(result);
        return result;
    }
}
