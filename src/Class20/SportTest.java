package Class20;

public class SportTest {
    public static void main(String[] args) {

        Cricket ct = new Cricket("Cricket", "Pakistan", "green helmet");
        ct.display();

        Soccer sr = new Soccer("Soccer", "USA", "Virginia", 7);
        sr.display();
        sr.displayTeam();
    }
}
