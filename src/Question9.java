import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        float x=sc.nextFloat();
        System.out.println("The absolute no is"+x+ convert(x));
    }

    private static float convert(float n) {
        float absvalue=(n>=0)?n:-n;
        return absvalue;
    }
}
