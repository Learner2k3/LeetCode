class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapA = new HashMap<>();
        Map<String, Character> mapB = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length()!=str.length){
            return false;
        }
        for(int i =0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            String curStr = str[i];
            if(mapA.containsKey(a)){
                if(!mapA.get(a).equals(curStr)){
                    return false;
                }
            }
            else{
                 mapA.put(a,curStr);
                }
                if(mapB.containsKey(curStr)){
                    if(mapB.get(curStr) != a){
                        return false;
                    }
            }else{
                  mapB.put(curStr, a);
                }
        }
            return true;             
     }
}