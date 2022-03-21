public class Assignment12 {
    public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int count = 0;
		
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0) {
				count++;
			}
			else {
				continue;
			}
		}
		if(count == 0) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is NOT prime");
		}
		}
	}

