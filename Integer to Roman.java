//Given an integer, convert it to a roman numeral.

class Solution {
    public String intToRoman(int num) {
       
        // created two arrays which store the roman symbols and their values with corresponding index positions
        int[] romanSymbolsValue = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        
        //initialise variable to store the output
        //use a loop to check when the symbols equate to the initial value of num
        //starting from the largest number to the smallest
        String romanNumeral = "";
        for(int i = 12; i >= 0 && num!=0 ; i--){
            while ((num - romanSymbolsValue[i])>=0){
                romanNumeral += romanSymbols[i];
                num -= romanSymbolsValue[i];
            }
        }
         
        
        return romanNumeral;
    }
}
