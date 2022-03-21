public class String3 {
    
    public static void main(String[] args){
        
        String str = args[0];
        String repStr = str.substring(0,2);
        String outStr = "";

        for(int i=0; i<str.length(); i++){
            outStr += repStr;
        }

        System.out.println(outStr);
    }
}
