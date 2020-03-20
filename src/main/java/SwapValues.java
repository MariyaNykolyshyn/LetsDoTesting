public class SwapValues {
    public static void main ( String[]args){
        int a= 10;
        int b= 4;

        b = a + b;
        System.out.println(b);
        a = b - a;
        System.out.println(a);
        b = b - a;
        System.out.println(b);


    }
}
