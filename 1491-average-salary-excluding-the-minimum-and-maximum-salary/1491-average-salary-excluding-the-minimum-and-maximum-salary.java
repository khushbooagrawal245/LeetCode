class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        Double d=Double.valueOf(salary.length-2);
        int s=0;
        for(int i=1;i<salary.length-1 ; i++ ){
            s= s+ salary[i];
        }
        if(salary.length > 3)
        { 
            return s/d;
        }
        return s;
    }
}