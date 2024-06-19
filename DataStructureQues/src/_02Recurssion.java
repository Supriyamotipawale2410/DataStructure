
public class _02Recurssion {

	public static int findFact(int num) {

		if(num==0 || num==1) 
			return 1;							//for 0,1 -- return 1
		else
			return num*(findFact(num-1));		//recursive call to findFact method
	}
	
	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("Factorial of "+num +" : "+findFact(num));
	}
}

