import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the integer");
        int x= sc.nextInt();
        System.out.println("The absolute value is"+x);
    }
    public static int convert(int n){
        int absvalue=(n>=0)?n:-n;
        return absvalue;
    }
}
