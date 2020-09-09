package programmers;
//20.09.08
import java.util.Scanner;

public class Pr1_행렬의덧셈 {
	public static int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i=0; i<arr1.length; i++)
			for(int j=0; j<arr1[0].length; j++) {// 0행의 길이만큼 돌음.
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
				
		return answer;
	}
	
	public static void main(String[] args) {
		int arr1[][]= {{1,2}};
		int arr2[][]= {{3,4}};
		
		solution(arr1,arr2);
		
	}
}
