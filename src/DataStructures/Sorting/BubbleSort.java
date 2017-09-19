package DataStructures.Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saite on 19-09-2017.
 */
public class BubbleSort {
    public static void main(String args[]){
        BubbleSort bubbleSort=new BubbleSort();
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        int[] a=new int[length];
        int[] sortedA=new int[length];
        for (int i=0;i<length;i++){
            a[i]=scanner.nextInt();
        }
        sortedA=bubbleSort.sort(a);
        System.out.println(Arrays.toString(sortedA));
    }

    private int[] sort(int[] a) {
        for (int i=0;i<a.length;i++){
            boolean swapped=false;
            for (int j=1;j<a.length-i;j++){
                if (a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                    swapped=true;
                }
            }
            if (swapped==false)
                break;
        }
        return a;
    }
}
