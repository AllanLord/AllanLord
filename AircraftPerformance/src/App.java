import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        menu.displayOptions();

        clrscr();
        input.close();
    }

    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            else
                Runtime.getRuntime().exec("clear");
            System.out.print("\033\143");

        } catch (IOException | InterruptedException exception) {
        }
    }
}