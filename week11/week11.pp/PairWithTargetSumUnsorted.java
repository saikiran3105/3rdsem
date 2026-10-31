import java.util.HashSet;

public class PairWithTargetSumUnsorted {
    static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            if (seen.contains(complement)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] first = {2, 7, 11, 15};
        int[] second = {3, 4, 6};

        System.out.println(hasPairWithSum(first, 9));
        System.out.println(hasPairWithSum(second, 20));
    }
}
