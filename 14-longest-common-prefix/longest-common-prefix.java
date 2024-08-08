class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            char currentChar = strs[0].charAt(i);
            for(String s : strs){
                if(i>=s.length()||s.charAt(i)!=currentChar){
                    return sb.toString();
                }
            }
                sb.append(currentChar);
           
        }
       return sb.toString();
    }
}