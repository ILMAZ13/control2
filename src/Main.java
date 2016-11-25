/**
 * Created by ilmaz on 25.11.16.
 */
public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        new Thread(window).start();
    }
}
