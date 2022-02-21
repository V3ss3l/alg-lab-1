package aisd;

import java.util.Random;

public class Main {
    public static long timeOfWork;
    public static int[] arr;
    public static Random rand;

    public static void main(String[] args) {
        var n = 20; // n = 40, 60, 80, 100;
        arr = new int[n];
        rand = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = rand.nextInt(100);
        }
        System.out.println(getMidAriphOfArr(arr));
        System.out.println(timeOfWork);
        System.out.println('\n');`
    }

    public static void getTimeOfWork(long begin, long finish) {
        timeOfWork = finish - begin;
    }

    public static double getMidAriphOfArr(int[] arr) {
        var begin = System.nanoTime();
        var sum = 0;
        for (var i : arr) {
            sum += i;
        }
        var finish = System.nanoTime();
        getTimeOfWork(begin, finish);
        return sum / arr.length;
    }
}
