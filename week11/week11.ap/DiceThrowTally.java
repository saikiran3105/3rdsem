import java.util.Arrays;

public class DiceThrowTally {
    static int[] diceSort(int[] rolls) {
        int[] count = new int[7];

        for (int roll : rolls) {
            if (roll >= 1 && roll <= 6) {
                count[roll]++;
            }
        }

        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i]);
            if (i < 6) {
                System.out.print("  ");
            }
        }
        System.out.println();

        int[] result = new int[rolls.length];
        int index = 0;

        for (int value = 1; value <= 6; value++) {
            for (int j = 0; j < count[value]; j++) {
                result[index] = value;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] rolls = {4, 1, 6, 4, 2, 1, 4};
        int[] sorted = diceSort(rolls);

        System.out.println("Sorted: " + Arrays.toString(sorted));
    }
}
