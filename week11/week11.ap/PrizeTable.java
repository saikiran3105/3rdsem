import java.util.Arrays;

public class PrizeTable {
    static int prizeTable(int[] marks) {
        int swaps = 0;

        for (int i = 0; i < marks.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = marks[i];
                marks[i] = marks[maxIndex];
                marks[maxIndex] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] first = {45, 90, 60, 75};
        int[] second = {80, 70, 60};

        int swaps1 = prizeTable(first);
        int swaps2 = prizeTable(second);

        System.out.println(Arrays.toString(first) + "    swaps = " + swaps1);
        System.out.println(Arrays.toString(second) + "    swaps = " + swaps2);
    }
}
