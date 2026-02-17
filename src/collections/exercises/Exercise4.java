package collections.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 TODO:
 1. Create a Map<String, List<Integer>> grades.
    - Key = student name
    - Value = list of grades
 2. Add at least 3 students with multiple grades each.
 3. Print all students with their grades.
 4. Calculate and print the average grade for each student.
*/

public class Exercise4
{
   public static void main(String[] args) {
         Map<String, List<Integer>> grades = new HashMap<>();
         grades.put("Kien", List.of(85, 90, 78)); // init list from https://www.geeksforgeeks.org/java/initializing-a-list-in-java/
         grades.put("Truong", List.of(10, 24, 43));
         grades.put("Vinh", List.of(47, 84, 23));
         System.out.println(grades);
         Map<String, Double> avg = new HashMap<>();
         

         for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
            String key = entry.getKey();
            List<Integer> valList = entry.getValue();

            int sum = 0;
            for (int val : valList) {
               sum += val;
            }

            double calcAvg = (double) sum / valList.size();
            avg.put(key, (double)calcAvg);
         }

         System.out.println(avg);

   }

}
