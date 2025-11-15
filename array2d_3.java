public class array2d_3 {
    public static void main(String[] args) {
        // SUM OF ALL ELEMENT (CACULATE THE SUM OF WHOLE MATRIX)
       int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        // SUM OF ALL ELEMENTS
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // print element
                sum += arr[i][j];                  // add to sum
            }
            System.out.println();
        }

        System.out.println("Total sum = " + sum);
    }
}