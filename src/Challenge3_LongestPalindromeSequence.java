public class Challenge3_LongestPalindromeSequence {

    public static void Main(){
//        System.out.println("babad : " + Challenge3_LongestPalindromeSequence.LongestPalindromeSequence("babad"));

        System.out.println("aacabdkacaa : " + Challenge3_LongestPalindromeSequence.LongestPalindromeSequence("aacabdkacaa"));
    }
    public static String LongestPalindromeSequence(String str){
        String result = "";

        if(str.length() < 1 || str.length() > 1000){
            return "";
        }

        if(str.length() == 1){
            return str;
        }

        boolean flag = false;
        int bigSize = 0;
        for (int i = str.length() - 1;i > 0; i--){
            for (int j = 0; j < i; j++){
                if(str.charAt(j) == str.charAt(i)){
                    int x = j;
                    int y = i;
                    while(x < y){
                        if(str.charAt(x) == str.charAt(y)){
                            x++;
                            y--;

                        }else{
                            break;
                        }
                    }
                    if((x == y || x == y+1) && i - j + 1 > bigSize){
                        result = str.substring(j,i+1);
                        bigSize = i - j + 1;
                        flag = true;
                    }
                }
            }
        }

        if(!flag){
            result = str.substring(0,1);
        }

        return result;
    }
}
