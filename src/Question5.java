import java.util.HashSet;

public class Question5 {
    public static void main(String[] args) {
       int[] number= {6,4,9,6,8,3,77,};
       int count=0;
        HashSet <Integer> set= new HashSet<Integer>();
        for(int i=0;i< number.length;i++){
            int n=Math.abs(number[i]);
            if(!set.contains(n)){
                set.add(n);
                count++;
            }
        }
        System.out.println(count);
    }
}
