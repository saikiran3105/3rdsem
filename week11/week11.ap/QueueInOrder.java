public class QueueInOrder {
    static int firstBreak(int[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i] < tokens[i - 1]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] first = {3, 5, 5, 8, 6, 9};
        int[] second = {1, 2, 2, 7};

        System.out.println(firstBreak(first));
        System.out.println(firstBreak(second));
    }
}
