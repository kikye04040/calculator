package calculator;

import calculator.*;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator {
    private final List<Operation> operations;

    public ArithmeticCalculator() {
        operations = new ArrayList<>();
        operations.add(new AddOperator());
        operations.add(new SubtractOperator());
        operations.add(new MultiplyOperator());
        operations.add(new DivideOperator());
        operations.add(new ModOperator());
    }

    public double calculate(int num1, int num2, char operator) throws InvalidOperatorException, DivisionByZeroException {
        for (Operation op  : operations) {
            if (op instanceof AddOperator && operator == '+') {
                double result = op.operate(num1, num2);
                resultArray.add(result);
                return result;
            } else if (op instanceof SubtractOperator && operator == '-') {
                double result = op.operate(num1, num2);
                resultArray.add(result);
                return result;
            }
            else if (op instanceof MultiplyOperator && operator == '*') {
                double result = op.operate(num1, num2);
                resultArray.add(result);
                return result;
            }
            else if (op instanceof DivideOperator && operator == '/') {
                double result = op.operate(num1, num2);
                resultArray.add(result);
                return result;
            }
            else if (op instanceof ModOperator && operator == '%') {
                double result = op.operate(num1, num2);
                resultArray.add(result);
                return result;
            }
        }
        throw new InvalidOperatorException("사칙연산자를 잘못 입력하셨습니다.");
    }
}
