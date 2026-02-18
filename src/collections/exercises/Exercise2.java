package collections.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 TODO:
 1. Create a Set<String> cities.
 2. Add at least 5 city names, including one duplicate.
 3. Print all cities (verify no duplicates).
 4. Check if a given city exists.
*/

public class Exercise2
{
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Bruxelles");
        cities.add("Bruxelles");
        cities.add("Tokyo");
        cities.add("Shanghai");
        cities.add("Seoul");
        System.out.println(cities);
        cities.forEach(city -> System.out.print(city + " "));
        System.out.println();
       /* if (cities.contains("Seoul")){
            System.out.println("Seoul exist" );
        } 
        else {
            System.out.println("Seoul doesn't exist");
        }
        if (cities.contains("Kyoto")){
            System.out.println("Kyoto exist" );
        } 
        else {
            System.out.println("Kyoto doesn't exist");
        }*/
        checkCityExistence(cities, "Tokyo");
        checkCityExistence(cities, "Kyoto");
        
    }

    public static void checkCityExistence(Set<String> cities, String city) {
        if (cities.contains(city)) {
            System.out.println(city + " exists in the set.");
        } else {
            System.out.println(city + " does not exist in the set.");
        }
    }
}
