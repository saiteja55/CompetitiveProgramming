package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by saite on 04-07-2017.
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int Q=s.nextInt();
        int lastAnswer=0;
        List<ArrayList<Integer>> seq=new ArrayList<ArrayList<Integer>>(N);
        for(int i=0;i<N;i++){
            seq.add(new ArrayList<>());
        }
        for(int i=0;i<Q;i++){
         int query=s.nextInt();
         int x=s.nextInt();
         int y=s.nextInt();
         if (query==1){
             //QUERY  1
             int index=(x^lastAnswer)%N;
             seq.get(index).add(y);
         }else{
             //QUERY 2
             int index=(x^lastAnswer)%N;
             int seqSize=seq.get(index).size();
             int elementIndex=(y%seqSize);
             lastAnswer=seq.get(index).get(elementIndex);
             System.out.println(lastAnswer);
         }

        }
        s.close();
    }
}
