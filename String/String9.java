public class String9 {
    
    public static void main(String[] args){
        String str1 = args[0];
        String str2 = args[1];

        String bigStr = str1.length() > str2.length() ? str1 : str2;
        String smallStr = str1.length() < str2.length() ? str1: str2;

        String outStr = "";

        for(int i = 0; i < smallStr.length();i++){

            if(i < str1.length()){
               outStr += str1.charAt(i);
               outStr += str2.charAt(i);
            }
        }

        outStr += bigStr.substring(smallStr.length(), bigStr.length());
        System.out.println(outStr);
    }
}
