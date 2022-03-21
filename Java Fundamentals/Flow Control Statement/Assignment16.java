public class Assignment16 {
    public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int digit, reverse = 0;
		
		while(num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}

