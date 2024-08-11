class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>(); 
        for(int i =0; i<emails.length; i++){                     //n
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
            return str.replace(".","");
   }
} 