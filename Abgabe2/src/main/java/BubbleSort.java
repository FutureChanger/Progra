import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        int counter = 1;
        int temp;
        for(int t = 0; t< a.length-1;t++) {
            counter = 1;
            for (int i = 0; i < a.length - 1; i++) {
                //System.out.println("Pivot: "+ a[i]);
                if (a[i] > a[counter]) {
                    temp = a[counter];
                    a[counter] = a[i];
                    a[i] = temp;
                    //System.out.println(Arrays.toString(a)+" if");
                } else {
                    //System.out.println(Arrays.toString(a)+" else");
                }
                counter++;
            }
        }
    }
}

