public class vowelCharacter {
    private char INPUT;
    private boolean VOWELSORCONSONENT;

    vowelCharacter(char INPUT) {
        this.INPUT = INPUT;
    }

    private void vowelsOrNot() {
        switch (this.INPUT) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                this.VOWELSORCONSONENT = true;
                break;
            default:
                this.VOWELSORCONSONENT = false;
                break;
        }
    }

    public String getResult() {
        vowelsOrNot();
        if (this.VOWELSORCONSONENT) {
            return "Vowels";
        } else {
            return "Consonant";
        }
    }
}
