import java.util.*;
import java.math.*;
import java.io.*;
public class lab31925{
	public static void main(String [] args){
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

		printArr(printArr(arr));
	}

	public static void printArr(int[] arr){
		for(int row=0; row < arr.length; row++){
			for(int column=0; column< arr[row].length;column++){
				System.out.print(arr[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static int[] reduce2Darray(int[][] arry){
		int[] result = new int[arr.length];
		for(int row=0; row < arr.length; row++){
			int sumRow = 0;
			for(int column=0; column<arr[row].length;column++){
				sumRow += arr[row][column];
			}
			result[row] = sumRow;
		}
	}