
public class findDuplicates {

    /**
     * void method which will accept String and print out characters that are duplicated
     * start = "t";
     * Input: 'start'
     * Output: 't'
     * <p>
     * Note! Some characters might be lower or upper case
     */

    public static void main(String[] args) {
       // duplicates("Start");
        countDuplicates("Manage");
    }

//    public static void duplicates(String k) {
//        String lower = "";
//        lower = k.toLowerCase();
//
//
//        for (int i = 0; i < lower.length(); i++) {
//            for (int j = i; j < lower.length(); j++) {
//                if (i != j) {
//                    if (lower.charAt(i) == lower.charAt(j)) {
//                        System.out.print(lower.charAt(i));
//                    }
//                }
//            }
//        }
//
//
//    }

    public static void countDuplicates(String k) {
        String lower = "";
        lower = k.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            int count = 1;

            for (int j = i; j < lower.length(); j++) {
                if (i != j) {
                    if (lower.charAt(i) == lower.charAt(j)) {
                        count++;
                    }
                }
            }

            System.out.println(lower.charAt(i)+"="+ count);
        }



    }
}