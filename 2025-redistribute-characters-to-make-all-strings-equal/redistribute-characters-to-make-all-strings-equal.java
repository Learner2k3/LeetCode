class Solution {
    public boolean makeEqual(String[] words) {
        int[] charCount = new int[26];
        for(String inputWord : words){
            for(char ch : inputWord.toCharArray()){
                charCount[ch - 'a']++;
            }
        }
        for(int count: charCount){
            if(count%words.length!=0){
                return false;
            }
        }
        return true;
    }
}