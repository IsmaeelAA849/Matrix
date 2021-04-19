




import java.util.Scanner;

public class MatrixRunner {
	public static void main(String[]args){
		System.out.println("Welcome to Matrix Calculator!");
		System.out.println("Please choose how you would like your matrix");
		boolean go=true;
		MatricesCalculator calculator = new MatricesCalculator();
		while(go){
			System.out.println("Select which operation to perform:");
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Scalar Multiplication");
			System.out.println("5: Determinant");
			System.out.println("6: Cofactor Matrix");
			System.out.println("7: Trasnpose");
			System.out.println("8: Inverse");
			Scanner sc = new Scanner(System.in);
			int choice =sc.nextInt();
			if(choice==1){
				System.out.println("Make the first matrix:");
				Matrix A = new Matrix();
				System.out.println("Make the second matrix: ");
				Matrix B = new Matrix();
				calculator.add(A,B);
			}
			if(choice==2){
				System.out.println("Make the first matrix:");
				Matrix A = new Matrix();
				System.out.println("Make the second matrix: ");
				Matrix B = new Matrix();
				calculator.subtract(A,B);
			}
			if(choice==3){
				System.out.println("Make the first matrix:");
				Matrix A = new Matrix();
				System.out.println("Make the second matrix: ");
				Matrix B = new Matrix();
				calculator.multiply(A,B);
			}
			if(choice==4){
				System.out.println("Make the matrix:");
				Matrix A = new Matrix();
				System.out.println("What number do you want to scale by?: ");
				int B=sc.nextInt();
				calculator.scMultiply(A,B);
			}
			if(choice==5){
				System.out.println("Make the matrix:");
				Matrix A = new Matrix();
				int d = calculator.determinant(A.getMatrix());
				System.out.println("Determinant is "+d);
			}
			if(choice==6){
				System.out.println("Make the matrix:");
				Matrix A = new Matrix();
				int[][] c = calculator.cofactor(A.getMatrix());
				for(int i=0;i<c.length;i++){
					for(int j=0; j<c[0].length;j++){
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
			}
			if(choice==7){
				System.out.println("Make the matrix:");
				Matrix A = new Matrix();
				int[][] t = calculator.transpose(A.getMatrix());
				for(int i=0;i<t.length;i++){
					for(int j=0; j<t[0].length;j++){
						System.out.print(t[i][j]+" ");
					}
					System.out.println();
				}
			}
			if(choice==8){
				System.out.println("Make the matrix:");
				Matrix A = new Matrix();
				calculator.inverse(A.getMatrix());

			}
		}

	}
}


