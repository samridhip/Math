public class Question2 {
    public static void main(String[] args) {
        double value=12.566;
        double fractional_value=value% 1;
        double integral_value=value-fractional_value;
        System.out.println("integral part is "+integral_value);
        System.out.println("original value is "+value);
        System.out.println("fractional part is "+fractional_value);
    }
}
