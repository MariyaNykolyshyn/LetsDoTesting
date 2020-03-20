import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxNumberofArray {
    public static void main( String []args){

       // 1 method
//        int[] intArr = { 74, 8, 12,25,56};
//        Arrays.sort(intArr);
//        System.out.println("min of aaray:"+intArr[0]);
//        System.out.println("max of array:"+intArr[intArr.length-1]);

        List<Integer> list = Arrays.asList(74,8,12,25,56);
        Collections.sort(list);
        System.out.println("min of array:"+ list.get(0));
        System.out.println("max of array"+list.get(list.size()-1));

    }
}
