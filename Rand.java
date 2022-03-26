import java.util.Random;
/**
 * Created by ABDULRHMAN ALSHAMI on 25/03/2022.
 */
public class Rand {
        public static void main(String[] args) {
            int arr[]={11,22,33,44,55,66,77};
            Random r=new Random();
            for (int i = 0; i < arr.length; i++)
                System.out.print(" "+arr[r.nextInt(arr.length)]);}}


