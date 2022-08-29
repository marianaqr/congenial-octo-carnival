public class Ejercicio10 {
	
	int[][] A = new int[10][10];
	int[][] B= new int[10][10];
	int[][] C = new int[10][100];

	public static void main(String[] args) {
		System.out.println("Ejercicio 10");
		System.out.println("Operación con matrices");
		System.out.println("A.B= ");
		
		int[][] A = { {2, 0, 1}, {3, 0, 0}, {5, 1, 1} };
		int[][] B = { {1, 0, 1}, {1, 2, 1}, {1, 1, 0} };
		int[][] C = { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} };
		
		for ( int i = 0; i < A.length; i++) {
			for ( int j = 0; j < B.length; j++) {
				for (int k = 0; k < A.length; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
				
			}
		}

		for ( int i = 0; i < C.length; i++) {
			for ( int j = 0; j < C.length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
