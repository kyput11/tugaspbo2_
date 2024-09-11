package matematika;

public class Bingo {
    private String verse;
    private String clap;
    private String name;

    // Konstruktor
    public Bingo(String name, String clap) {
        this.name = name;
        this.clap = clap;
        this.verse = "There was a farmer who had a dog,\nAnd Bingo was his name-o.";
    }

    private String displayVerse(int claps) {
        StringBuilder result = new StringBuilder();
        StringBuilder line = new StringBuilder();
        
        // Create the result line with claps
        for (int i = 0; i < 5; i++) {
            if (i < claps) {
                line.append(clap).append("-");
            } else {
                line.append(name.charAt(i)).append("-");
            }
        }
        // Remove the last "-" from the line
        line.setLength(line.length() - 1);

        for (int i = 0; i < 3; i++) {
            result.append(line.toString()).append("\n");
        }
        return result.toString();
    }

    public void sing() {
        System.out.println(verse);
        for (int i = 0; i <= 5; i++) {
            System.out.println(displayVerse(i));
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}
