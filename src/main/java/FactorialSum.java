import static java.lang.Integer.valueOf;

public class FactorialSum {
    public static void main(String[] args) {
        int fct2 = 1;
        int sumFac = 0;
        for (int i = 5; i > 0; i--) {
            fct2 = fct2 * i;
            sumFac += i;
        }
//        System.out.println(fct2);
////
//        String factstr = String.valueOf(i);
//        String[]spr = factstr.split(" ");
//      Integer i1 = valueOf(spr[0])+ valueOf(spr[1])+ valueOf(spr[2]);
        System.out.println(sumFac);
       System.out.println("5!="+ fct2);

   }}
