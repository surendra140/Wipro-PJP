public class VideoStore extends Video {
    
    Video[] store;
    int i = 0;

    VideoStore(String name){
        super(name);
    }

    void addVideo(String name) {    
		setVideoName(i, name);
		++i;
	}

    void doCheckout(String name) {  
		
		
		int j,index=0;
		for(j = 0 ;j < i; j++)
		{
			if(videoName[j].equals(name))
			{
				index=j;
				break;
			}
		}
		
		if (i != j) {
			doCheckout(index);
			System.out.println("\nVideo " + name + " checked out successfuly.\n");
		}
		
		else{
			System.out.println("\nSorry this video is not present in the inventory \n");
		}
	}

    void doReturn(String name) {   
		
		int j,index = 0;
		for(j = 0; j < i; j++)
		{
			if(videoName[j].equals(name))
			{
				index=j;
				break;
			}
		}
		if (i != j) {
			doReturn(index);
			System.out.println("\nVideo " + name + " returned successfuly\n");
		}
		else {
			System.out.println("\nSorry this video is not present in the inventory \n");
		}
		
	}	

    void recieveRating(String name, int rating) {   
		int j, index = 0;
		for(j = 0; j < i; ++j) {
			if(videoName[j].equals(name)) {
				index = j;
				break;
			}
		}
		if (i != j) {
			recieveRating(index, rating);
			System.out.println("\nRating " + rating + " has been mapped to the video " + name + ".\n");
		}
		else {
			System.out.println("\nSorry this video is not present in the inventory \n");
		}
	}

    void listInventory() {    
		for (int j = 0; j < i ; j++) {
			System.out.print(videoName[j] + "\t\t|");
			System.out.print("\t" + getCheckout(j) + "\t\t|");
			System.out.println("\t" + getRating(j));
			System.out.println();
		}
	}
}

