
public class Assignment8 {
    public static void main(String[] args) {
		
		int[] array= {10, 3, 6, 1, 2, 7, 9};
		int sum = 0;
		boolean flag = false;

		for(int i = 0; i < array.length; i++) {
			if(array[i] == 6)
				flag = true;
			else if(array[i] == 7) {
					flag = false;
					i++;
			}
			if(flag != true)
				sum = sum + array[i];
		}
		System.out.println(sum);
    }
}
