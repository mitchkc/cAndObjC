import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/****
 * Created by: Michael Connolly
 * Created on: 31/01/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/

public class Main {

   public static void main(String[] args) {

      //HASH MAPS!
      HashMap<String, Integer> examScores = new HashMap<>();

      examScores.put("Maths", 75);
      examScores.put("Sociology", 85);
      examScores.put("English", 95);

      System.out.println(examScores.toString());

      examScores.forEach( (subject, score) -> {          // forEach - brackets around variables
         System.out.println(subject + " - " + score);
      });

      examScores.forEach( (subject, score) -> {
         examScores.replace(subject, score -10);   //change original values
      });

      System.out.println(examScores.toString());


////      System.out.println(examScores.toString());   //will be randomly ordered!
////      System.out.println(examScores.get("English"));  //does not work the other way around
//
//      examScores.putIfAbsent("Maths", 70);   //Maths already exists so not replaced
//      examScores.replace("Maths", 70);
//      System.out.println(examScores.toString());
//
//      System.out.println(examScores.getOrDefault("Re", -1));
//
//      System.out.println(examScores.containsKey("Maths"));  //boolean
//      System.out.println(examScores.containsValue(95));  //boolean
//
//      System.out.println(examScores.size());
//
//      System.out.println(examScores.remove("Sociology"));
//
//      System.out.println(examScores.toString());
//
//      System.out.println(examScores.isEmpty());
//
//      examScores.clear();
//
//      System.out.println(examScores.isEmpty());
//
//      System.out.println(examScores.toString());



//      ArrayList<Integer> num = new ArrayList<Integer>();    // Integer = wrapper class for primitive int, this makes it a reference type int
//
//      num.add(5);
//      num.add(3);
//      num.add(1);
//      num.add(4);
//      num.add(2);

//      num.forEach(nums -> {               //lambda expression, method with no name
//         System.out.println(nums * 2);    //original arrayList is unchanged
//      });
//
//      System.out.println(num.toString());

//      System.out.println("before: " + num.toString());
//
//      num.forEach(nums -> {                     //lambda expression, method with no name
//         num.set(num.indexOf(nums), nums*2);    //original arrayList is now changed incorrectly due to logic in indexOf method...
//      });
//
//      System.out.println("after: " + num.toString());

//      for( int i = 1; i <= 5; i++){
//         num.add(i);
//      }

//      num.sort(Comparator.naturalOrder());
//
//      System.out.println(num.toString());
//
//      num.sort(Comparator.reverseOrder());
//
//      System.out.println(num.toString());
//
//      System.out.println(num.contains(Integer.valueOf(1)));
//
//      System.out.println(num.toString());
//      System.out.println(num.get(0));
//
////      num.remove(Integer.valueOf(4));
////
////      System.out.println(num.toString());
////
////      num.clear();
////
////      System.out.println(num.toString());
//
//      num.set(2, Integer.valueOf(30));
//      System.out.println(num.toString());


//      int num = 5;
//      int multi = 1;
//
//      do{
//         System.out.printf( "%d x %d = %d \n", num, multi, num*multi);   // do while times tables. loops body execute first then condition check so! do-while = always done once!
//         multi++;
//      } while (multi <= 10);

//      int num = 5;
//      int multi = 1;
//
//      while(multi <= 10){
//         System.out.printf("%d x %d = %d \n", num, multi, num*multi);      //times table with while loop
//
//         multi++;
//      }



//      int nums[] = { 1, 2, 3, 4, 5 };
//
//      int sum = 0;
//
//      for( int num : nums ){  //modified for loop. nums becomes num and iterates through array
//         System.out.println(num);
//
//         sum += num;
//      }
//
//      System.out.println(sum);


//      for ( int num= 1; num <=50; num++){
//         if(num %2 == 0){
//            System.out.println(num);         //check for even
//         }
//      }

//      for (int num = 1; num <= 10; num++){
//
//         for (int multi = 1; multi <= 10; multi++){
//
//            System.out.printf("%d x %d = %d \n", num, multi, num*multi);  // times tables up to 10
//         }
//      }


//      int num = 5;
//
//      for( int multi = 1; multi < 10; multi++){
//         System.out.printf("%d x %d = %d \n", num, multi, num*multi);
//      }


//      int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//      int sum = 0;
//
//      for (int i = 0; i < num.length; i++)
//      {
//         sum += num[i];
//
//      }
//
//      System.out.println(sum);

//      int nums[] = {1, 2, 3, 4, 5};
//
//      int copy[] = Arrays.copyOf(nums, nums.length);
//
//      System.out.println(nums == copy); // = false
//
//      System.out.println(Arrays.equals(nums, copy));  // = true


//      int nums[] = {1, 2, 3, 4, 5};
//
//      int copyNums[] = nums;
//      int copyNums2[] = Arrays.copyOf(nums, nums.length);
//      Arrays.fill(nums, 0);  // arrays are reference types meaning a new variable is created but it points to original array, does not create a new one!
//                                 // instead must use copyof method as above!!
//      System.out.println(Arrays.toString(nums));
//      System.out.println(Arrays.toString(copyNums));
//
//
//
//      System.out.println(Arrays.toString(nums));
//      System.out.println(Arrays.toString(copyNums));
//      System.out.println(Arrays.toString(copyNums2));


//      char vowels[] = new char[5];
//      char vowels[] = {'e', 'a', 'u', 'o', 'i'};
//
//      int start = 1;
//      int end = 4;
//      Arrays.fill(vowels, start, end, 'x');
//
//      System.out.println(Arrays.toString(vowels));

//      vowels[0] = 'a';
//      vowels[1] = 'e';
//      vowels[2] = 'i';
//      vowels[3] = 'o';
//      vowels[4] = 'u';
//
//      System.out.println(vowels[2]);
//      System.out.println(Arrays.toString(vowels));
//
//      vowels[2] = 'x';
//
//      System.out.println(vowels[2]);
//      System.out.println(vowels.length);
//
//      Arrays.sort(vowels);
//      int start = 1;
//      int end = 4;
//
////      Arrays.sort(vowels, start, end);
//      System.out.println(Arrays.toString(vowels));
//
//      char key = 'b';
//
//      int found = Arrays.binarySearch(vowels, key);
//      int found = Arrays.binarySearch(vowels, start, end, key);
//      int found = Arrays.binarySearch(vowels, key);
//
//      System.out.println(Arrays.toString(vowels));
//      System.out.println(found);










                  // calculator with switch.  Faster than if-else!!
//
//      System.out.print("Enter num1: ");
//      double num1 = scan.nextDouble();
//
//      System.out.print("Enter num2: ");
//      double num2 = scan.nextDouble();
//      scan.nextLine();
//
//      System.out.println("What operation do you want? ");
//      String operation = scan.nextLine();
//
//      switch (operation) {
//         case "sum":
//            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
//            break;
//         case "minus":
//            System.out.printf("%f + %f = %f", num1, num2, num1-num2);
//            break;
//         case "times":
//            System.out.printf("%f * %f = %f", num1, num2, num1*num2);
//            break;
//         case "divide":
//            if(num2 == 0)
//            {
//               System.out.println("cannot divide by zero!");
//            } else {
//               System.out.printf("%f / %f = %f", num1, num2, num1/num2);
//            }
//            break;
//         default:
//            System.out.printf("%s is not supported", operation);
//      }




                 // calculator

//      System.out.print("Enter num1: ");
//      double num1 = scan.nextDouble();
//
//      System.out.print("Enter num2: ");
//      double num2 = scan.nextDouble();
//      scan.nextLine();
//
//      System.out.println("What operation do you want? ");
//      String operation = scan.nextLine();
//
//      if(operation.equals("sum"))
//      {
//         System.out.print("Answer: " + (num1 + num2));
//      }
//      else if(operation.equals("minus"))
//      {
//         System.out.println("Answer: " + (num1 - num2));
//      }
//      else if(operation.equals("times"))
//      {
//         System.out.println("Answer: " + (num1*num2));
//      }
//      else if (operation.equals("divide"))
//      {
//         if(num2 == 0)
//         {
//            System.out.println("Cannot divide by zero!");
//         }
//         else {
//            System.out.println("Answer: " + (num1 / num2));
//         }
//      }
//      else
//      {
//         System.out.println("That is not a supported operation!");
//      }




                     // format printing

//      String name = "Michael";
//      String country = "Ireland";
//      int age = 31;
//
//      String formatString = String.format("My name is %s. I am from %s. I am %d years old.", name, country, age);
//
//      System.out.println(formatString);

   }



}


