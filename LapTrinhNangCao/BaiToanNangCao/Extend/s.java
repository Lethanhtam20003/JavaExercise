package Extend;

import java.util.Arrays;

public class s {
	public static int randomNum(int min, int max) {
		return (int) ((Math.random())*((max-min)+1)+min);
	}
	public static int[][] createMatrix(int row, int col){
		int[][] matrix = new int[row][col];
		//fill matrix
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j] = randomNum(1, 9);
			}
		}
		return matrix;
	}
	public static String printMatrix(int[][] matrix){
		int totalPerRow = 0;
		int index = 0;
		int maxValue = 0;
		String totalRow = "";
		String result ="";
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				result+=matrix[i][j]+" ";
				totalPerRow+=matrix[i][j];
			}
			totalRow+="Tổng dòng "+(i+1)+" bằng: "+totalPerRow+"\n";
			if(totalPerRow>maxValue) {
				maxValue = totalPerRow;
				index = i;
			}
			totalPerRow = 0;
			result = result.trim();
			result+="\n";
		}
		return result+"\n"+totalRow+"Dòng có giá trị lớn nhất là: "+(index+1);
	}
	public static void main(String[] args) {
		int[][] matrix = createMatrix(5, 5);
		System.out.println(printMatrix(matrix));}
	}
