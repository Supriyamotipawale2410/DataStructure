
public class _03SearchNoArray {

	public static void main(String[] args) {
		
		int[] arr = {15,87,9,87,12,87,60,62,65,68,69,72,73,75,77,87,90,7};
		int num = 7;
		int n = arr.length;
		System.out.println("size of array: "+n);
		int indexLast=0;
		int indexFirst=0;
		//first occurrence of number
		for(int i=0;i<=n-1;i++) {
			if(arr[i]==num) {
				indexFirst=i;
				break;				//if found come out of loop 
			}
		}
		System.out.println("First occurance of "+num +" is at index :"+ indexFirst);
		
		//last occurrence of number
		for(int j=n-1;j>=0;j--) {
			if(arr[j]==num) {
				indexLast=j;
				break;
			}
		}
		System.out.println("Last occurance of "+num +" is at index :"+ indexLast);
	}

}
