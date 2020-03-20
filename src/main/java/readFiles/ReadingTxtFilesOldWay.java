package readFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFilesOldWay {
    public static void main (String []args) throws FileNotFoundException , IOException {
        FileReader fr = new FileReader(" name of the file "); // you have to import that file in same package before.//this helps as to read file by bytes
        BufferedReader br =new BufferedReader(fr);//we using BufferedReadier that helps to read files in buffered way( line after line) tht will make output faster.
       /* I OPTION TO READ TXT FILES
       for(int i=1; i<=1000;i++) {
            System.out.print(i + "--");
            System.out.println(br.readLine());
        }
        */
       // II OPTION TO READ TXT FILES
        String line = null;

        while((line=br.readLine())!= null){
            System.out.println(line);
        }
    }
}
