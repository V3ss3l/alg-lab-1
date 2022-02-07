package aisd;
import java.util.Random;
public class Main {
    public static long timeOfWork;
    public static int[] arr;
    public static Random rand;

    public static void main(String[] args) {
        arr = new int[10];
        rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println(getMidAriphOfArr(arr));
        System.out.println(getTimeOfWork());
    }

    public static long getTimeOfWork(){
        long begin = System.nanoTime();
        long finish = System.nanoTime();
        timeOfWork = finish - begin;
        return timeOfWork;
    }

    public static double getMidAriphOfArr(int[] arr){
        int sum = 0;
        int midAriph = 0;
        for (int i : arr){
            sum += i;
        }
        return midAriph = sum / arr.length;
    }
}
