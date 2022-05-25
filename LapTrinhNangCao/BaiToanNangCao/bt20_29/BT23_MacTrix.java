package bt20_29;
/**
 * Bài Tập 23.	Bài tập về ma trận: ma trận tam giác, cộng, nhân ma trận
 * @author lethanhtam
 *
 */
public class BT23_MacTrix {
	public void triangleMatrix(int[][] arr) {
		for(int col=0;col<arr.length;col++) {
			for(int row=0;row<=col;row++) {
				System.out.println(arr[col][row]);
			}
			System.out.println();
		}
	}
	public int[][] matrixSumation(int[][] a,int[][] b){
		if(checkArrEquals(a,b)) {
			
			for(int col=0;col<a.length;col++) {
				for(int row=0;row<a[col].length;row++) {
					a[col][row]+=b[col][row];
				}
			}
		return a;
		}else {
			return null;
		}
	}
	
	private boolean checkArrEquals(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		return a.length==b.length && a[0].length==b[0].length;
	}
	public int[][] matrixMultiplication(int[][] a,int[][] b){
		if(a.length==b[0].length) {
			
		int[][] res= new int[a.length][b[0].length];
		for(int col=0;col<res.length;col++) {
			for(int row=0,sum=0;row<res[col].length;row++) {
				for(int i=0;col<a.length;i++) {
					sum+=a[col][i]+b[i][row];
				}
				res[col][row]=sum;
			}
		}
		
		return res;
		}else {
			return null;
		}
	}
}
