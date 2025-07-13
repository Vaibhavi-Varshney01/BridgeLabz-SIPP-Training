package Day1_ClassesAndObjects;
class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }

 
    boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
 
    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome");
        }
    }
}
