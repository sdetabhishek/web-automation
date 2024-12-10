package launcher;

public class Arrays {

	public static void main(String[] args) {

//		printArray();
		nestedLoop();
		
	}
	
	
	static void printArray() {
		
		
		int arr[] = new int[] {10,20,30,40,50};
		
		System.out.println(arr.length);
		
		int i=0;
		
		while(i<arr.length) {
			
			System.out.println(arr[i]);
			i++;
		}
		
		
	}
	
	
	
	static void nestedLoop() {
		
		
		for(int i=0; i<=5; i++) {
			
			for(int j=0; j<=i ; j++)
				
				System.out.print("*");
			
			System.out.println();
			
		}
		
	}

}
