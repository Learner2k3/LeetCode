class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(int i =0; i<emails.length; i++){
            String[] parts = emails[i].split("@");
            String localName = parts[0];//test+email
            String domainname = parts[1];//leetcode.com
            String[] plusRemoved =  localName.split("\\+"); //te.st email
            String concat = dotRemoved(plusRemoved[0]); 
            String ouput = concat+"@" + domainname;
            set.add(ouput);
        }
        return set.size(); 
    } 
    public static String dotRemoved(String str){//te.st
        StringBuilder sb = new StringBuilder();
        char [] inputString = str.toCharArray();
        for(int i =0; i<inputString.length; i++){
            if(inputString[i]!='.'){
                sb.append(inputString[i]);
            } 
        }
        return sb.toString();
   }
} 