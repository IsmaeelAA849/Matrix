

public class MatricesCalculator {
	public void add(Matrix A, Matrix B){
		if(A.getMatrix().length!=B.getMatrix().length||A.getMatrix()[0].length!=B.getMatrix()[0].length){
			System.out.println("ERROR");
		}
		else{
			 for(int i=0;i<A.getMatrix().length;i++){
				 for(int j=0; j<A.getMatrix()[0].length;j++){
					 System.out.print(A.getMatrix()[i][j]+B.getMatrix()[i][j]+" ");
					 
				 }
				 System.out.println();
			 }
		}
	}
	
	public void subtract(Matrix A, Matrix B){
		if(A.getMatrix().length!=B.getMatrix().length||A.getMatrix()[0].length!=B.getMatrix()[0].length){
			System.out.println("ERROR");
		}
		else{
			 for(int i=0;i<A.getMatrix().length;i++){
				 for(int j=0; j<A.getMatrix()[0].length;j++){
					 System.out.print(A.getMatrix()[i][j]-B.getMatrix()[i][j]+" ");
					 
				 }
				 System.out.println();
			 }
		}
	}
	
	public void multiply(Matrix A, Matrix B){
		if(A.getMatrix()[0].length!=B.getMatrix().length){
			System.out.println("ERROR");
		}
		else{
			int[][]hold = new int[A.getMatrix().length][B.getMatrix()[0].length];
			for (int i = 0; i < A.getMatrix().length; i++) {
		           for (int j = 0; j < B.getMatrix()[0].length; j++) {
		               for (int k = 0; k < A.getMatrix()[0].length; k++) {
		                   hold[i][j] = hold[i][j] + A.getMatrix()[i][k] * B.getMatrix()[k][j];
		               }
		           }
		       }
			for(int i=0;i<hold.length;i++) {
				for(int j=0;j<hold[0].length;j++) {
					System.out.print(hold[i][j]+" ");
					
				}
				System.out.println();
			}
				 
		}
	}
	
	public void scMultiply(Matrix A, int B) {
		for(int i=0;i<A.getMatrix().length;i++){
			for(int j=0;j<A.getMatrix()[0].length;j++){
				System.out.print(A.getMatrix()[i][j]*B+" ");
			}
			System.out.println();
		}
	}   
	

	
	public int determinant(int[][] A){
		 
		if (A.length==2) { 
			return (A[0][0] * A[1][1] - A[0][1] * A[1][0]); 
			} 
		int d = 0; 
		int pos=1;
		for (int i=0; i<A.length; i++) 
		{ 
			d += (pos) * A[0][i] * determinant(submatrix(A, 0, i)); 
			pos*=-1;
		} 
		return d;
	}
	public int[][]submatrix(int[][]A, int nor, int noc){
		int[][]hold = new int[A.length-1][A[0].length-1];
		int x=-1;
		for(int i=0;i<A.length;i++) {
			if(i!=nor) {
				x++;
				int y=-1;
				for(int j=0;j<A[0].length;j++) {
					if(j!=noc) {
						hold[x][++y]= A[i][j];
					}
				}
				
			}
		}
		return hold;
	}
	
	public int[][] cofactor(int[][] A){
		
		int[][] hold = new int[A.length][A[0].length];
		
		int pos=1;
		int opos=1;
		for(int i=0;i< hold.length;i++) {
			for(int j=0; j<hold[0].length;j++) {
				hold[i][j]= pos*opos*determinant(submatrix(A,i,j));
				pos*=-1;
			}
			opos*=-1;
			
		}
          return hold;	
	}
	
	public int[][] transpose(int[][] A){
		int[][]B = new int[A[0].length][A.length];
		for(int i=0;i<B.length;i++) {
			for(int j=0; j<B[0].length;j++) {
				B[i][j]=A[j][i];
			}
			
		}
		return B;
		
		
	}
	
	public void inverse(int[][]A){
		int[][]B = transpose(cofactor(A));
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[0].length;j++) {
				int p = B[i][j];
				int q = determinant(A);
				for(int x=Math.abs(q);x>0;x--) {
					if(q%x==0&&p%x==0) {
						q/=x;
						p/=x;
					}
				}
				if(p<0&&q<0) {
					p=Math.abs(p);
					q=Math.abs(q);
				}
				System.out.print(p+"/"+q+" ");
			}
			System.out.println();
		}
		
	}

}


