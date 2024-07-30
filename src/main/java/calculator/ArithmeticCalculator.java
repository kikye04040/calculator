package calculator;

import calculator.AddOperator;
import calculator.SubtractOperator;
import calculator.MultiplyOperator;
import calculator.DivideOperator;

public class ArithmeticCalculator extends Calculator {
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    public double calculate(int num1, int num2, char op) throws InvalidOperatorException, DivisionByZeroException {
        double result = 0;
        switch (op) {
            case '+':
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                try {
                    result = divideOperator.operate(num1, num2);
                } catch (ArithmeticException e) {
                    throw new DivisionByZeroException("분모가 0이면 나눗셈을 할 수 없습니다.");
                }
                break;
            default:
                throw new InvalidOperatorException("사칙연산자를 잘못 입력하셨습니다.");
        }
        resultArray.add(result);
        return result;
    }
}
