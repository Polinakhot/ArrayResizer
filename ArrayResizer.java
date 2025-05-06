public class ArrayResizer {


    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int value : array2D[r]) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }

 
    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;
        for (int r = 0; r < array2D.length; r++) {
            if (isNonZeroRow(array2D, r)) {
                count++;
            }
        }
        return count;
    }


    public static int[][] resize(int[][] array2D) {
        int index = 0;
        int[][] newArray = new int[numNonZeroRows(array2D)][]; 
        for (int r = 0; r < array2D.length; r++) {
            if (isNonZeroRow(array2D, r)) {
                newArray[index] = array2D[r];
                index++;
            }
        }

        return newArray;
    }
}
