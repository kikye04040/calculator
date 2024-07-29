package calculator;

import java.util.ArrayList;

class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculator {
    private ArrayList<Integer> resultArray;
    public Calculator() {
        this.resultArray = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char cal) throws InvalidOperatorException, DivisionByZeroException {
        int result = 0;
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
                result = num1 / num2;
            }
        } else if ((cal != '+') && (cal != '-') && (cal != '*') && (cal != '/')) {
            throw new InvalidOperatorException("사칙연산자를 잘못 입력하셨습니다.");
        }
        System.out.println("결과: " + result);
        resultArray.add(result);

        return result;
    }

    public ArrayList<Integer> getResultArray() {
        return new ArrayList<>(resultArray);
    }

    public void setResultArray(ArrayList<Integer> resultArray) {
        this.resultArray = new ArrayList<>(resultArray);
    }

    public void removeResult() {
        if (!resultArray.isEmpty()) {
            resultArray.remove(0);
        }
    }
}
