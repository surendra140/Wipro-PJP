public class String8 {
    
    public static void main(String[] args){
        String str = args[0];
        int index = str.indexOf("*");

        StringBuffer sbr = new StringBuffer(str);
        sbr.delete(index -1, index +2);
        System.out.println(sbr);
    }
}
