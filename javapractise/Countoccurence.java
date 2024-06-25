import java.util.*;

public class Countoccurence{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("vanaja", "swamy", "vanaja", "prasanna", "balaram", "vanaja", "swamy");

        Map<String, Integer> nameCountMap = countOccurrences(names);

        // Print the occurrences
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countOccurrences(List<String> names) {
        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String name : names) {
            // If name already exists in the map, increment its count; otherwise, initialize it to 1
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        return nameCountMap;
    }
}
    

