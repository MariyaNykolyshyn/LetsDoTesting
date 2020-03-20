import java.io.FileNotFoundException;
import java.util.Arrays;

public class ReadText {
    public static void main(String[]args)throws FileNotFoundException{
        String listen = "listen";
        String silent = "silent";

        char[]listenArr = listen.toCharArray();
        char[]silentArr = silent.toCharArray();

        Arrays.sort(silentArr);
        Arrays.sort(listenArr);

        for(int i = 0; i < silentArr.length; i++){
            if (silentArr[i]!= listenArr[i]){
                System.out.println("It's not an anagram");
                break;
            }else{
                if((i ==silentArr.length-1)&&(silentArr[i]==listenArr[i])){
                    System.out.println("Yes,this is anagram");
                    break;
                }else{
                    continue;
                }
            }
        }
    }
}
