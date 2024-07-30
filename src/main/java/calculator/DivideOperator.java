package calculator;

public class DivideOperator {
    public int operate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("분모가 0이 될 수 없습니다.");
        }
        return num1 / num2;
    }
}
