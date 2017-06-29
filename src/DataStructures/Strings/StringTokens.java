package DataStructures.Strings;

import java.util.Scanner;

/**
 * Created by saite on 30-06-2017.
 */

/*Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.*/


public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        char special[] = {' ', '!', ',', '?', '.', '_', '\'', '@'};
        String temp = "";
        String tempStr = "";
        for (int i = 0; i < s.length(); i++) {
            boolean isSpecial = false;
            for (int j = 0; j < special.length; j++) {
                if (s.charAt(i) == special[j]) {
                    if (temp.equals("")) {
                        isSpecial = true;
                        break;
                    } else {
                        if (tempStr.equals("")) {
                            tempStr = temp + ",";
                        } else {
                            tempStr = tempStr + temp + ",";
                        }
                        temp = "";
                        isSpecial = true;
                        break;
                    }
                }
            }
            if (!isSpecial) {
                temp += s.charAt(i);
            }
        }

        if(tempStr.equals("")){
            System.out.println(0);
        }else{
            String output[]=tempStr.split(",");
            System.out.println(output.length);
            for(int i=0;i<output.length;i++){
                System.out.println(output[i]);
            }
        }
    }
}
