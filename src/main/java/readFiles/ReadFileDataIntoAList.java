package readFiles;


import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFileDataIntoAList {
    public static void main(String[]args){

        List<Integer>nums = new ArrayList();
        try {FileReader fr = new FileReader("name of file");
             BufferedReader br = new BufferedReader(fr);
            String value;
            while((value=br.readLine())!= null){
                nums.add(Integer.valueOf(value));
            }
        }catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println(nums.size());//will give us count of all lines.size of list

        // print sum of all numbers
        int sum = 0;
        for(Integer number: nums){
            sum = sum + number;}
        System.out.println(sum);


        // print the largest number
        //1 option ( for loop)
         int max = nums.get(0);
         for(int i=1; i < nums.size();i++){
             if (max>nums.get(i)){
             }
         }
         System.out.println( "max number in list is "+max);

         // 2 option Sort and then take the last one
        Collections.sort(nums);
        System.out.println("max numer after sorting is"+ nums.get(nums.size()-1));

        //3 option Collection.max
        System.out.println(Collections.max(nums));


        //print unique numbers
        /*
        1)Create an emptyarrayList(newList)
        2)read a number from nums list, if the number is not in newList then store into it
        3)If the number already there(not unique), just skip it
        4) repeat step 2-3 for all numbers
         */

        List<Integer> newList = new ArrayList();
        int duplicates = 0;

        for(Integer number: nums){
            if(!newList.contains(number)){
                newList.add(number);
            }else{
                duplicates++;
            }
        }
        System.out.println( "Count of unique numbers"+ newList.size());

        System.out.println("count of duplicates"+ duplicates );










        ;
        }
    }

