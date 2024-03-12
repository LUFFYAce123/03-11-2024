
public class matrixoperations {
	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        
	        int[][] result = new int[rows][cols];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }   }
	        return result;
	    }
	    
	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows1 = matrix1.length;
	        int cols1 = matrix1[0].length;
	        int cols2 = matrix2[0].length;
	        
	        int[][] result = new int[rows1][cols2];
	        
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        
	        return result;
	    }
	    
	    public static int[][] transposeMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        
	        int[][] result = new int[cols][rows];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[j][i] = matrix[i][j];
	            }
	        }
	        
	        return result;
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
	        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
	        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
	        
	        System.out.println("Matrix 1:");
	        printMatrix(matrix1);
	        
	        System.out.println("Matrix 2:");
	        printMatrix(matrix2);
	        
	        int[][] sum = addMatrices(matrix1, matrix2);
	        System.out.println("Sum of matrices:");
	        printMatrix(sum);
	        
	        int[][] product = multiplyMatrices(matrix1, matrix2);
	        System.out.println("Product of matrices:");
	        printMatrix(product);
	        
	        System.out.println("Transpose of matrix 1:");
	        int[][] transpose = transposeMatrix(matrix1);
	        printMatrix(transpose);
	    }
	}



