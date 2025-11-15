public class array2d_2 {
    public static void main(String[] args) {
        // HAR ROW KA SUM PRINT KARO
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // HAR ROW KA SUM PRINT KARO
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + i + " sum = " + rowSum);
        }
    }
}