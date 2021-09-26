package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class ex34 {

      public static void main(String[] Args){

          Scanner scanner = new Scanner(System.in);
          int num_employees = 5;

          String[] employees = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};

          System.out.println("There are " + num_employees + " employees.");
          for (int i = 0; i<num_employees; i++){
             System.out.println(employees[i]);
          }


          System.out.println("\nEnter an employee name to remove: ");
          String remove = scanner.nextLine();

          for (int j = 0; j<num_employees; j++){
              if (remove.equals(employees[j])){

                 num_employees -= 1;
                 for (int L = j; L < num_employees; L++){
                     employees[L] = employees[L+1];
                 }

              }
          }

          for (int k = 0; k<num_employees; k++){
              System.out.println(employees[k]);
          }


      }

}
