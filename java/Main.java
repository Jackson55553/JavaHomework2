import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] a = new int[11];
    static int[] b = new int[11];

    public static void main(String[] args) {
        Metods m = new Metods();
        System.out.println("=====================================2.1");
        m.create(a);
        b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a, b));

        System.out.println("=====================================2.2");
        int find = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == find) {
                System.out.println("index: " + i);
            }
        }
        long start1 = System.nanoTime();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        long time1 = System.nanoTime() - start1;
        System.out.println("time: " + time1);
        long start2 = System.nanoTime();
        System.out.println(Metods.bin(a, 1));
        long time2 = System.nanoTime() - start2;
        System.out.println("time: " + time2);
        System.out.println("=====================================2.3");
        long start = System.nanoTime();
        int [] big = new int[400];
        m.create(big);
        Arrays.sort(big);
        System.out.println(Arrays.toString(big));
        long time = System.nanoTime() - start;
        System.out.println("time: " + time);
        System.out.println("=====================================2.4");
        long start3 = System.nanoTime();
        Metods.bubble(b);
        System.out.println(Arrays.toString(b));
        long time3 = System.nanoTime() - start3;
        System.out.println("time: " + time3);
        System.out.println("=====================================2.5");
        long start4 = System.nanoTime();
        int [] c = new int[10];
        m.create(c);
        m.chage(c);
        System.out.println(Arrays.toString(c));
        long time4 = System.nanoTime() - start4;
        System.out.println("time: " + time4);
        System.out.println("=====================================2.6");
        long start5 = System.nanoTime();
        int [] ab = new int [10];
        m.create(ab);
        m.add(ab);
        System.out.println(Arrays.toString(ab));
        long time5 = System.nanoTime() - start5;
        System.out.println("time: " + time5);
    }


}


