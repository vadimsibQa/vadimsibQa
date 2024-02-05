package lesson2;

// 8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла
// (-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить
// элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1],
// [2][2], …, [n][n];
public class Task8Matrix {
    public static void main(String[] args) {
        createMatrix();
    }

    public static void createMatrix() {
        int rows = 9;
        int cols = 9;
        int[][] matrix = new int[rows][cols];

        // Filling two diagonals of a matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j || (i + j == rows - 1)) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Matrix Output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
