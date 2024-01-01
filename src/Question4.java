import java.math.BigDecimal;

public class Question4 {
    public static void main(String[] args) {
        float x=45.777f;
        BigDecimal result;
        int decimal_place=4;
        BigDecimal number= new BigDecimal(Float.toString(x));
        number=number.setScale(decimal_place,BigDecimal.ROUND_HALF_UP);
        System.out.println("original number"+ x);
        System.out.println("rounded upto 4 decimals"+number);
    }
}
