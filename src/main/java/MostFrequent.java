public class MostFrequent {
    public static void main(String[]args) {
        String str = "jytvyafassa";
        int length = str.length();
        char ch = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < length; i++) {
            count = 0;
            for (int j = 0; j < length; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    ch = str.charAt(i);
                }
            }
        }
        System.out.println("Character is:" + ch + " amount is:" + max);
    }
}
