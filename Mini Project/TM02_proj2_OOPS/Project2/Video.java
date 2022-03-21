public class Video {

        String[] videoName = new String[100];
        boolean[] checkout = new boolean[100];
        int[] rating = new int[100];

        Video(String name){
            
        }

        public void setVideoName(int i, String name) {
            videoName[i] = name;
        }

        public String getName(int i){
            return videoName[i];
        }

        public void doCheckout(int i){
            if(checkout[i] == false){
                checkout[i]= true;
            }
        }

        public void doReturn(int i ) {       
            if(checkout[i] == true) {
                checkout[i] = false;
            }
        }

        public void recieveRating(int i, int rate) {    
            rating[i] = rate;
        }

        public int getRating(int i) {     
            return rating[i];
        }
        
        public boolean getCheckout(int i) {  
            return checkout[i];
        }
}