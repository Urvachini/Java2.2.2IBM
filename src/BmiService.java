public class BmiService {
    public double calculate(double mas, double height) {
        double BMI = mas / (height * height);
        return BMI;
    }
}
