import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            // Find the position of '@' in the email
            int atIndex = email.indexOf('@');
            
            // Extract the local part
            String localPart = email.substring(0, atIndex);
            
            // Find the position of '+' in the local part, if it exists
            int plusIndex = localPart.indexOf('+');
            
            // If '+' exists, ignore everything after it
            if (plusIndex != -1) {
                localPart = localPart.substring(0, plusIndex);
            }
            
            // Remove all '.' characters from the local part
            localPart = localPart.replace(".", "");
            
            // Concatenate the processed local part with the domain part
            String normalizedEmail = localPart + email.substring(atIndex);
            
            // Add the normalized email to the set
            uniqueEmails.add(normalizedEmail);
        }

        // Return the size of the set, which represents the number of unique emails
        return uniqueEmails.size();
    }
}