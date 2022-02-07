package aisd;

import java.util.Random;

public class Main {
    public static long timeOfWork;
    public static int[] arr;
    public static Random rand;

    public static void main(String[] args) {
        var n = 20;
        for (int i = 0; i < 5; i++) {
            mainWork(n);
            System.out.println('\n');
            n = n + 20;
        }
    }

    public static long getTimeOfWork(long begin) {
        var finish = System.nanoTime();
        timeOfWork = finish - begin;
        return timeOfWork;
    }

    public static double getMidAriphOfArr(int[] arr) {
        var sum = 0;
        for (var i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void mainWork(int n) {
        arr = new int[n];
        rand = new Random();
        long begin = System.nanoTime();
        for (var i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(getMidAriphOfArr(arr));
        System.out.println(getTimeOfWork(begin));
    }
}
