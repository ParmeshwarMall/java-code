package Hashmap;

import java.util.*;

public class CreateAHashmap {
    static void CreateHashmap() {
        //Syntax
        HashMap<String, Integer> mp = new HashMap<>();
        // Add entries into Hashmap
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rohan", 18);

        // Get the value particular key
        System.out.println(mp.get("Akash"));
        System.out.println(mp.get("Raj"));

        // Update the value of key
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));

        // Remove the keys and value from Hashmap
        System.out.println(mp.remove("Akash"));

        // Check that keys is present or not
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Lav"));

        // It add entries only when it is not already present in Hashmap
        mp.putIfAbsent("Lav", 20);

        // Print only all keys
        System.out.println(mp.keySet());

        // Print only the values of all keys
        System.out.println(mp.values());

        // Print all the entries of Hashmap
        System.out.println(mp.entrySet());

        System.out.println();
        // Traversing over all entries
        for (String key : mp.keySet())
        {
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        for(var e: mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }

    public static void main(String[] args) {
        CreateHashmap();
    }
}
