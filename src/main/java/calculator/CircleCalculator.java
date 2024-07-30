package calculator;

public class CircleCalculator extends Calculator {
    private static final double PI = 3.14;

    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        resultArray.add(area);
        return area;
    }
}
