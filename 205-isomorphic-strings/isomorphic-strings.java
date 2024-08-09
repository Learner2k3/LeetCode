class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Character> mapt = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char S = s.charAt(i);
            char T = t.charAt(i);
            if(maps.containsKey(S)){
                if(maps.get(S)!=T){
                    return false;
                }
            }
            else{
                maps.put(S, T);
            }
            if(mapt.containsKey(T)){
                if(mapt.get(T)!=S){
                    return false;
                }
            }
            else{
                mapt.put(T, S);
            }
        }
        return true;
    }
}