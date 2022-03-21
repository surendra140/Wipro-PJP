public class String10 {
    
    public static void main(String[] args){
        String str = args[0];
        int n = Integer.parseInt(args[1]);

        String repStr = str.substring(str.length()-n);
        String outStr = "";

        for(int i =0; i < n; i++){
            outStr += repStr;
        }

        System.out.println(outStr);
    }
}
