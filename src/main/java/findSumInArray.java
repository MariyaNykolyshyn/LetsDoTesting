import java.sql.Array;

public class findSumInArray {


        /**
         * [1,2,5,9]   no
         * [1,3,4,4]   yes
         */
public static void main ( String[]args) {

System.out.println(sumary("2563"));
}
    public static int sumary (String n){

        int pair = 0;
        int sumFinal = 8;
        String [] str = n.split("");
        for (int k = str.length - 1; k > 0; k--) {
            int i = 0;
            while(i < str.length-1) {
                int char1 = Integer.parseInt(str[k]);
                int char2 = Integer.parseInt(str[i]);
                int sumString = char1 + char2;
                if (sumString < sumFinal) {
                    i++;
                } else if (sumString == sumFinal) {
                    pair++;
                    i++;
                }else{
                    i++;
                }
            }
        }
        return pair;

    }



}

