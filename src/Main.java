public class Main {
    public static void main(String[] args) {
        BmiService calc = new BmiService();
        double result = calc.calculate(85, 1.86);
        System.out.println(result);
    }
}