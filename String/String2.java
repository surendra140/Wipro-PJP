public class String2 {
    
    public static void main(String[] args){

        String str1 = args[0];
        String str2 = args[1];
        String outStr;

        if(str1.charAt(str1.length()-1) == str2.charAt(0)){
            outStr = str1.substring(0,str1.length()-1)+str2;
            outStr = outStr.toLowerCase();
        }
        else
        {
            outStr = str1 + " " + str2;
            outStr = outStr.toLowerCase();
        }

        System.out.println(outStr);
    }
}
