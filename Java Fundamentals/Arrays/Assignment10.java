public class Assignment10 {

    static void evenOdd(int[] arr, int n){
		int j = -1;
		int temp;

		for(int i = 0; i < n; i++)
		{
			if(arr[i] % 2 == 0){
				j++;

			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		    }
	    }
	}
	public static void main(String[] args) {

		int[] arr = {1,0,1,0,0,1,1};
		int n = arr.length;

		evenOdd(arr,n);

		for (int i=0; i<arr.length; i++) {

			System.out.println(arr[i]+" ");

		}

	}

}
