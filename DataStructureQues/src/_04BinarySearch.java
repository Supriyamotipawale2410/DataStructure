
public class _04BinarySearch {

	public static int binarySearch(int[] arr,int num) {
		
		int low=arr[0];
		int high=arr.length-1;
		while(low<=high) {							//looping till low is less or = to high
			int mid =(low+high)/2;
		//System.out.println(low+"     "+mid+"        "+high);
		if(arr[mid]==num) {
			return mid;								//return exact index of number
		}
		else if(arr[mid]>num) {
			high = mid-1;
		}
		else if(arr[mid]<num) {
			low = mid+1;
		}
	}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {1,3,6,8,11,15,20};
		int num =8;
		
		int result=binarySearch(arr,num);			//function for searching number
		if(result==-1)
			System.out.println("No not found");
		
		else 
			System.out.println("Number found at index : "+result);
		
		}
	}

