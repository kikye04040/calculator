package calculator;

public class DivideOperator implements Operation {
    @Override
    public double operate(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException("분모가 0이 될 수 없습니다.");
        }
        return (double) num1 / num2;
    }
}
