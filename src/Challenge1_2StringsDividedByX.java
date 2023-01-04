
public class Challenge1_2StringsDividedByX {

    public static void MainContent(){
        //Copy this data to main and run.
        //These are the test cases for the function

        System.out.println(Challenge1_2StringsDividedByX._2StringDividedByX("abaabaaba", "abaaba"));
        //output --> aba

        System.out.println(Challenge1_2StringsDividedByX._2StringDividedByX("abcabc", "abc"));
        // output --> abc

        System.out.println(Challenge1_2StringsDividedByX._2StringDividedByX("ababab", "abab"));
        //output --> ab

        System.out.println(Challenge1_2StringsDividedByX._2StringDividedByX("Leet", "code"));
        //empty output --> ""
    }
    public static String _2StringDividedByX(String str1, String str2){
        String result = "";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        boolean flag = str1.contains(str2);

        if(flag){
            int parseValue = str2.length()/2;
            while(true){
                String dummy1 = str2.substring(0,parseValue);
                String dummy2 = str2.substring(parseValue, parseValue + parseValue);

                if(dummy1.equals(dummy2)){
                    result = dummy1;
                    break;
                }
                parseValue--;
                if(parseValue == 0){
                    break;
                }
            }
            if(result.equals("")){
                result = str2;
            }
        }
        return "[ ".concat(result).concat(" ]") ;
    }
}
