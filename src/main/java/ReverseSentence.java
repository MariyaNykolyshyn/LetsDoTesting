import java.lang.String;

public class ReverseSentence {
    public static void main(String[] args) {
    //    System.out.println(letter(" I love you"));
        System.out.println(sentence("my name is "));
    }

    // 1 way
//    public static String letter(String x) {
//        String[] arr = x.split(" ");
//        String finalPrint = " ";
//        for (int eachIndexOfWord = arr.length - 1; eachIndexOfWord > 0; eachIndexOfWord--) {
//            finalPrint = finalPrint + " " + arr[eachIndexOfWord];
//        }
//        return finalPrint;
//    }


        // 2 way
        public static String sentence (String k){
            StringBuilder othertype = new StringBuilder(sentence(k));
            StringBuilder otherReverse = othertype.reverse();
            return otherReverse.toString();
        }



    }





