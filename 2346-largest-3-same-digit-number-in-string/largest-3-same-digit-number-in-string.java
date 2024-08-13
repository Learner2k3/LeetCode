class Solution {
    public String largestGoodInteger(String num) {
        String result = "";
        for(int i =0; i<num.length()-2; i++){
            char a = num.charAt(i);
            if(a==num.charAt(i+1)&&a==num.charAt(i+2)){
                String triplet =""+a+a+a;
                if(triplet.compareTo(result)>0){
                    result = triplet;
                }
            }
        }
        return result;
        
    }
}