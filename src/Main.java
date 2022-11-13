import java.util.Arrays;

public class Main{
    public static void main(String[]args){
        int[] num = {7, 21, 35, 40, 52};
        //System.out.println(Arrays.toString(num));
        int a = num[0];
        num[0] = num[num.length - 1];
        num[num.length-1] = a;
        //System.out.println(Arrays.toString(num));
        int sum = num[num.length - 3] + num[0];
        System.out.println(sum);
    }
}
