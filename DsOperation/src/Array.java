import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void maxInt(int[] numArr) {  		//fun to find max element in array
		int max=0;
		for(int i=0;i<numArr.length;i++) {
			if(numArr[i]>max)
				 max = numArr[i];
		}
		System.out.println(max);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArray = {10,20,30,40,50};
		int[] numArr =new int[5];
		
		for(int num:numArray) {
		System.out.print(num + "\t");       //print array
		}
		System.out.println();
		numArray[2]=25;
		for(int num:numArray) {
			System.out.print(num + "\t");       //print array after updating
			}
		System.out.println("\narray size : " + numArray.length);      //array size
		
		int sum = 0;
		for(int i=0;i<numArray.length;i++) {
			sum+=numArray[i];
		}
		System.out.println("sum of array element : " + sum);
		System.out.println();
	System.out.println("Enter array elements: ");	//array from user
	for(int i=0;i<numArr.length;i++) {
		numArr[i]=sc.nextInt();
	}
	for(int num:numArr) {
		System.out.print(num + "\t");
	}
	System.out.println();
	
	maxInt(numArr);				//max element in array using function
	int maxArr=Arrays.stream(numArr).max().getAsInt();
	System.out.println(maxArr);
}
}