package DataStructures.Strings;

import java.util.Scanner;

/**
 * Created by saite on 28-06-2017.
 */
public class SubstringComparisions {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'



        int startIndexOuter=0;
        int endIndexOuter=k;
        int startIndexInner=0;
        int endIndexInner=k;

        boolean smallFlag=false;
        boolean largeFlag=false;



        for(int i=endIndexOuter;i<=s.length();i++){
            String smallestTemp=s.substring(startIndexOuter,endIndexOuter);
            String largestTemp=s.substring(startIndexOuter,endIndexOuter);
            startIndexInner=startIndexOuter+1;
            endIndexInner=endIndexOuter+1;
            boolean smallFound=true;
            if(smallFlag==false){
                for(int j=endIndexInner;j<=s.length();j++){
                    if(smallestTemp.compareTo(s.substring(startIndexInner,j))>0){
                        smallFound=false;
                        break;
                    }
                    startIndexInner++;
                }
                if(smallFound==true){
                    smallest=smallestTemp;
                    smallFlag=true;
                }
            }
            startIndexInner=startIndexOuter+1;
            endIndexInner=endIndexOuter+1;
            boolean largeFound=true;
            if(largeFlag==false){
                for(int j=endIndexInner;j<=s.length();j++){
                    if(largestTemp.compareTo(s.substring(startIndexInner,j))<0){
                        largeFound=false;
                    }
                    startIndexInner++;
                }
                if(largeFound==true){
                    largest =largestTemp;
                    largeFlag=true;
                }
            }
            if(largeFlag&&smallFlag){
                break;
            }
            startIndexOuter++;
            endIndexOuter++;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();


        System.out.println(getSmallestAndLargest(s, k));
    }
}
