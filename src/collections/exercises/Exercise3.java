package collections.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 TODO:
 1. Create a Map<String, String> phoneBook (name → phone number).
 2. Add 3 entries.
 3. Print all entries.
 4. Retrieve one number by name.
 5. Remove one entry.
*/
public class Exercise3
{
    public static void main(String[] args) {
         Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Kien", "042222222");
        phoneBook.put("Truong", "04893745");
        phoneBook.put("Vinh", "04000333444");
        System.out.println(phoneBook.get("Kien"));
        phoneBook.remove("Kien");
        for (String name : phoneBook.keySet())
        {
            System.out.println(name + " : " + phoneBook.get(name));
        }
        for (Map.Entry<String, String> entry : phoneBook.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
        phoneBook.forEach((k,v) -> System.out.printf("%s : %s\n", k, v));
    }
}
