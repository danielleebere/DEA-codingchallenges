//Given a 32-bit signed integer, reverse digits of an integer.

class Solution {
    public int reverse(int x) {
        //convert the integer input to string
        String input = Integer.toString(x); 
        
        //initialise reversed variable
        String reversed = ""; 
        
        //make starting index the last digit in the input number
        //ch hold either the sign or the first digit in the input number
        //the for loop orders the input number in reverse
        int startingIndex = input.length()-1;
        char ch = input.charAt(0);
        for(int i = startingIndex; i >= 0 && input.charAt(i) != '-'; i--){
            reversed += input.charAt(i); 
        }
        
        //converts the reversed number back to int
        //catches numberformatexception 
        int reversedNumber = 0;
        try{
            reversedNumber = Integer.parseInt(reversed);
        } catch (NumberFormatException e){
            reversedNumber = 0;
        }
        
        //if the number was negative, makes it negative again and updates reversedNumber
        if (ch == '-')
        {
            reversedNumber = -reversedNumber ;
        }
        
        
        return reversedNumber;
    }
}
