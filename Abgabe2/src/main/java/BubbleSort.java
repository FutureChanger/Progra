import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        int counter = 1;
        int temp;
        for(int t = 0; t< a.length-1;t++) {
            counter = 1;
            for (int i = 0; i < a.length - 1; i++) {
                System.out.println("Pivot: "+ a[i]);
                if (a[i] > a[counter]) {
                    temp = a[counter];
                    a[counter] = a[i];
                    a[i] = temp;
                    counter++;
                    //System.out.println(Arrays.toString(a)+" if");
                } else {
                    counter++;
                    //System.out.println(Arrays.toString(a)+" else");
                }
            }//1 4 5 6 7 3 2 8 9
        }
    }
}

