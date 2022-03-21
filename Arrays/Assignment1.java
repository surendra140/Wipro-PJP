public class Assignment1 {
    public static void main(String[] args) {
		
		int[] array = {19, 14, 20, 18, 2};
		int sum = 0;
		
		
		for(int i = 0; i < array.length; i++) {										
			sum = sum + array[i];
		}

		double avg = (sum/array.length);


		System.out.println("The sum of the array is: "+sum);
												
		System.out.println("The average of the array is: "+avg);	
  }
}
