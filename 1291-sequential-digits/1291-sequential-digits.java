class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s= "123456789";
        int value;
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=9;i++){
            for(int j=0;j+i<=s.length();j++){
                String substr = s.substring(j,i+j);
                value = Integer.parseInt(substr);
                if(value>=low && value <=high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}