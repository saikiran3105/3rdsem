import java.util.Arrays;

public class HeightLineUp {
    static void lineUp(int[] heights) {
        int pass = 1;

        while (true) {
            boolean swapped = false;

            for (int i = 0; i < heights.length - 1; i++) {
                if (heights[i] > heights[i + 1]) {
                    int temp = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
            pass++;

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] first = {4, 2, 5, 1};
        int[] second = {1, 3, 2, 4};

        lineUp(first);
        System.out.println();
        lineUp(second);
    }
}
