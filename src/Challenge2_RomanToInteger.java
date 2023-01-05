import java.util.ArrayList;
import java.util.List;

public class Challenge2_RomanToInteger {

    //Main part and test cases
    public static void Main(){
        //III -> 3
        System.out.println("III : "+ Challenge2_RomanToInteger.romanToInt("III"));

        //LVIII -> 58
        System.out.println("LVIII : "+ Challenge2_RomanToInteger.romanToInt("LVIII"));

        //MCMXCIV -> 1994
        System.out.println("MCMXCIV : "+ Challenge2_RomanToInteger.romanToInt("MCMXCIV"));

    }

    private static int romanAlphabetToInteger(char ch){
        if(ch == 'I'){
            return 1;
        }else if(ch == 'V'){
            return 5;
        }else if (ch == 'X'){
            return 10;
        }else if (ch == 'L'){
            return 50;
        }else if (ch == 'C'){
            return 100;
        }else if(ch == 'D'){
            return 500;
        }else if (ch == 'M'){
            return 1000;
        }
        return -1;
    }

    public static int romanToInt(String str){
        int result = 0;

        List<Integer> integerList = new ArrayList<>();

        //constraints
        if(str.length() < 1 || str.length() > 15){
            return -1;
        }

        //loop to iterate/check each character and add it in list
        for (int i = 0;i < str.length(); i++){
            int value = romanAlphabetToInteger(str.charAt(i));

            //if entered string is invalid then returns -1;
            if(value == -1){
                return value;
            }

            integerList.add(value);
        }

        int total = 0;
        for(int i = 0; i < integerList.size() - 1; i++){
            if( integerList.get(i) < integerList.get(i + 1)){
                total = total - integerList.get(i);
            }else{
                total = total + integerList.get(i);
            }
        }

        return total + integerList.get(integerList.size() - 1);
    }
}
