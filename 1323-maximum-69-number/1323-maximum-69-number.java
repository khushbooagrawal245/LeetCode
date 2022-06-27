class Solution {
    public int maximum69Number (int num) {
        int org = num;
        int len = (int) (Math.log10(num) + 1);
        int arr[] = new int[len];
        int i=0;
        while(num!=0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        for(i=len-1;i>=0;i--){
            if(arr[i]==6){
                arr[i] = 9;
                break;   
            }
        }
        int fac =0;
        int n=0;
        for(i=len-1;i>=0;i--){
            n = arr[i] + fac * 10;
            fac = n;
            
        }
        return n;
    }
}

