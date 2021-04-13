import java.util.Random;

public class Metods {
    public static int bin(int [] ab, int find1){
        int first = 0;
        int last = ab.length - 1;

        while (first <= last){
            int midlle = (first + last)/2;
            if(ab[midlle] < find1){
                first = midlle + 1;
            }else if (ab[midlle] > find1){
                last = midlle - 1;
            }else if (ab[midlle] == find1){
                return midlle;
            }
        }
        return -1;
    }

    public static int bubble(int [] ab){
        boolean sorted = false;
        int buff;
        while (!sorted){
            sorted = true;
            for (int i = 0; i <ab.length-1 ; i++) {
                if (ab[i] > ab[i+1]){
                    sorted =false;
                    buff = ab[i];
                    ab[i] = ab[i+1];
                    ab[i + 1] = buff;
                }

            }
        }
        return 0;
    }

    public void create(int [] a){
        Random rnd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(a.length/2);
        }
    }

    public void chage(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j <a.length ; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            int buff = a[i];
            a[i] = a[min];
            a[min] = buff;
        }
    }

    public void add(int[]a){
        for (int i = 0; i < a.length; i++) {
            int in = i;
            int buff = a[i];
            while (in > 0 && a[in - 1] >= buff){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = buff;
        }
    }
}
