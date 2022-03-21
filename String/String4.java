public class String4 {
    
    public static void main(String[] args){

        String str = args[0];
        int length = str.length();

        if(length % 2 == 0){
            System.out.println(str.substring(0, length/2));
        }
        else{
            System.out.println("null");
        }
    }
}
