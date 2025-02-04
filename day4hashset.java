import java.util.*;
public class day4hashset {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Chennai");
        cities.add("Krishnagiri");
        cities.add("Cochin");
        cities.add("Uthangarai");
        cities.add("Chennai");  
        System.out.println("Cities : " + cities);

        String cityToCheck = "Chennai";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " is available.");
        } else {
            System.out.println(cityToCheck + " is not available.");
        }

        // Remove a city from the set
        String cityToRemove = "Cochin";
        cities.remove(cityToRemove);

        // Display the updated set
        System.out.println("Updated set of cities: " + cities);
    }
}
