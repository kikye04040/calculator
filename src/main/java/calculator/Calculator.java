package calculator;

import com.sun.jdi.DoubleValue;

import java.lang.reflect.Array;
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
    protected ArrayList<Double> resultArray;
    private ArrayList<Double> circleAreaResults;

    public Calculator() {
        this.resultArray = new ArrayList<>();
    }

    public ArrayList<Double> getResultArray() {
        return new ArrayList<>(resultArray);
    }

    public void setResultArray(ArrayList<Double> resultArray) {
        this.resultArray = new ArrayList<>(resultArray);
    }

    public void removeResult() {
        if (!resultArray.isEmpty()) {
            resultArray.remove(0);
        }
    }

    public void inquiryResults() {
        if (resultArray.isEmpty()) {
            System.out.println("저장된 연산 결과가 없습니다.");
        } else {
            System.out.println("저장된 연산결과");
            for (int i = 0; i < resultArray.size(); i++) {
                System.out.println((i + 1) + ": " + resultArray.get(i));
            }
        }
    }

    public ArrayList<Double> getCircleAreaResults() {
        return new ArrayList<>(this.circleAreaResults);
    }

    public void setCircleAreaResults(ArrayList<Double> results) {
        this.circleAreaResults = new ArrayList<>(results);
    }

    public void displayCircleAreaResults() {
        if (circleAreaResults.isEmpty()) {
            System.out.println("조회할 데이터가 없습니다.");
        }
        else {
            System.out.println("저장된 원의 넓이 결과");
            for (int i = 0; i < circleAreaResults.size(); i++) {
                System.out.println((i + 1) + ": " + circleAreaResults.get(i));
            }
        }
    }
}
