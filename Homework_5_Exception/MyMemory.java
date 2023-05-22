package Homework_5_Exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyMemory {
    public static void MyMemory(String[] args) {
        Scanner scanner = new Scanner(System.in);
       DataService service = new DataService() {
           @Override
           public void add(String text) throws littleMemory {

           }
           @Override
           public String get() throws NoItems {
               return null;
           }
       };
       while (true){
           String next = scanner.next();
           if ("exit" .equals(next)){
           break;
           } else if ("get".equals(next)) {
               try {

               }  catch (NoSuchElementException a){

               }
               System.out.println("NoItems");
           } else  {
               try {

               }catch (littleMemory a){
                   System.out.println("memory is full");
               }
           }
       }
}}