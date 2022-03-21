public class Assignment14 {
    public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int sum;
		
		for(sum = 0; num > 0; num = num/10) 
	        	sum = sum + (num % 10);
		
		System.out.println(sum);
		}
	}

