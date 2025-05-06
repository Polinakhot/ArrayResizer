public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 1, 0},
            {1, 3, 2},
            {0, 0, 0},
            {4, 5, 6}
        };

        System.out.println("Testing isNonZeroRow:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Row " + i + ": " + ArrayResizer.isNonZeroRow(arr, i));
        }

        System.out.println("\nTesting resize:");
        int[][] smaller = ArrayResizer.resize(arr);
        for (int[] row : smaller) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

