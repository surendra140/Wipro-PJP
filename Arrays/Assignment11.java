
public class Assignment11 {
    public static void main(String[] args) {
		
		int[] numbers = {1,4,1,4};
        boolean flag = true;
		
        for (int num : numbers) {
            if (num != 1 && num != 4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
