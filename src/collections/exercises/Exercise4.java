package collections.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

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
         //init with arraylist
         grades.put("Kien", new ArrayList<>(List.of(85, 90, 78)));
         grades.put("Truong", new ArrayList<>(List.of(10, 24, 43)));
         grades.put("Vinh", new ArrayList<>(List.of(47, 84, 23)));
         /*grades.put("Kien", List.of(85, 90, 78)); // init list from https://www.geeksforgeeks.org/java/initializing-a-list-in-java/ but immutable
         grades.put("Truong", List.of(10, 24, 43));
         grades.put("Vinh", List.of(47, 84, 23));*/
         System.out.println(grades);
         Map<String, Double> avg = new HashMap<>();
         

         for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
            String key = entry.getKey();
            List<Integer> valList = entry.getValue();

            int sum = 0;
            System.out.println(key + " grades:");
            for (int val : valList) {
               System.out.println(val);
               sum += val;
            }

            double calcAvg = (double) sum / valList.size();
            avg.put(key, (double)calcAvg);
         }

         avg.forEach((key, value) -> System.out.printf("avg %s: %.2f%n", key, value));

   }

}
