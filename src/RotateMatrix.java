public class RotateMatrix {

    public static void rotateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose the matrix (swap rows with columns)
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row of the transposed matrix
        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = cols - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 11}
        };

        System.out.println("Original Matrix:");
        printMatrix(originalMatrix);

        rotateMatrix(originalMatrix);

        System.out.println("Rotated Matrix (90-degree clockwise):");
        printMatrix(originalMatrix);
    }
}

