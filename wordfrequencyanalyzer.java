import java.util.HashMap;
import java.util.Map;

public class wordfrequencyanalyzer {

    public static int findUniqueInteger(int[] nums) {
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new IllegalArgumentException("No unique integer found");
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 4, 2};
        int uniqueInteger = findUniqueInteger(nums);
        System.out.println("Unique integer: " + uniqueInteger);
    }
}