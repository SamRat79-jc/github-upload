package Lab8;

import java.util.Scanner;

/**
 * Created by (Samantha Ratcliffe) on (09/11/20)
 * Program to reverse name order
 */
public class ReverseNames
{
   public static void main(String[] args)
   {
      {
         Scanner keyboard = new Scanner(System.in);

         String[] name = new String[]{"Jim", "John", "Jeff", "Mary", "Tina"};
         System.out.println("Array in the correct order: " + name);

         for (int i = 0; i < name.length; i++)
         {
            System.out.print(name[i] + "");

         }

         System.out.println();
         System.out.println("Array reversed:");

         for (int i = name.length - 1; i >= 0; i--)
         {
            System.out.print(name[i] + "");
         }
      }


   }//main
}//class






































