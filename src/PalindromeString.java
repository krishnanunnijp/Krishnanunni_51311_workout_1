public class PalindromeString {
    private String VALUE;
    private String REVERSE = "";

    PalindromeString(String VALUE) {
        this.VALUE = VALUE;
        this.REVERSE = reverseString();
    }

    private String reverseString() {
        for (int i = this.VALUE.length(); i > 0; i--) {
            this.REVERSE = this.REVERSE + this.VALUE.charAt(i - 1);

        }
        return this.REVERSE;

    }

    private Boolean palindromeOrNot() {
        if (VALUE.equals(REVERSE)) {
            return true;
        } else {
            return false;
        }
    }

    public void printPalindromeOrNot() {
        if (palindromeOrNot()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
