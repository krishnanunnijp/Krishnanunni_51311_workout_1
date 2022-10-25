public class Patterns {
    private int num;
    private String line;

    Patterns(int num) {
        this.num = num;
    }

    public void generatePatterns() {
        for (int i = 1; i < num + 1; i++) {
            line = Integer.toString(i);
            for (int j = 1; j < i; j++) {
                line = line + i;
            }
            System.out.println(line);
        }

    }
}

