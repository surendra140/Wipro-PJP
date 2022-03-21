import java.util.*;

public class VideoLauncher {
    
     public static void main(String[] args) {
        
        VideoStore obj = new VideoStore("");
		boolean flag = true;
		int choice ;
		Scanner sc = new Scanner(System.in);

        while(flag) {
			System.out.println("Main Menu");
			System.out.println("=========");
			System.out.println("1. Add Videos: ");
			System.out.println("2. Check out video: ");
			System.out.println("3. Return video: ");
			System.out.println("4. Recieve rating: ");
			System.out.println("5. List Inventory: ");
			System.out.println("6. Exit: ");
			System.out.println("Enter your choice (1..6): ");
			choice = sc.nextInt();
			sc.nextLine();

            switch(choice) {
			
                case 1: System.out.println("Enter the name of video you want to add: ");   
                        String str = sc.nextLine();
                        obj.addVideo(str);
                        System.out.println("\nVideo " + str + " added successfuly.\n");
                        break;
                        
                case 2: System.out.println("Enter the name of the video you want to check out: ");   
                        String str2 = sc.nextLine();
                        obj.doCheckout(str2);
                      
                        break;
                        
                case 3: System.out.println("Enter the name of the video you want to return: ");   
                        String str3 = sc.nextLine();
                        obj.doReturn(str3);
                       
                        break;
                        
                case 4: System.out.println("Enter the name of the video you want to rate: "); 
                        String str4 = sc.nextLine();
                        System.out.print("Enter the rating of this video: ");
                        int rating = sc.nextInt();
                        sc.nextLine();
                        obj.recieveRating(str4, rating);
                    
                        break;
                
                case 5: System.out.println("\n\n------------------------------------------------------------------");  
                        System.out.print("Video Name\t|");
                        System.out.print("\tCheckoutStatus\t|");
                        System.out.println("\t Rating");
                        System.out.println("");
                        obj.listInventory();
                        System.out.println("\n\n");
                        System.out.println("");
                        System.out.println();
                        break;
                        
                case 6: System.exit(0);	 
                        System.out.println("\nExiting...!! Thanks for using the application.");
                        break;
                        
                default: System.out.println("Wrong choice");		
                }
                
              
            }
    }
}
