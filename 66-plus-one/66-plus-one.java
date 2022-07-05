class Solution {
    public int[] plusOne(int[] digits) {
        int n= digits.length;
       
        int carry = 1;
        for(int i=n-1;i>=0 && carry == 1;i--){
            int temp = digits[i]+carry;
            if(temp >= 10){
                carry = 1;
                digits[i] = temp%10;
            }
            else{
                carry=0;
                digits[i] = temp;
                        
            }
        }
        if(carry != 0){
            int[] arr = new int[digits.length+1];
            arr[0]=1;
            for(int i=1;i<arr.length-1;i++){
                arr[i] = digits[i-1];
            }
            return arr;
        }
        
        return digits;
    }
}