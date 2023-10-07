package alejandro.corporation;

import lib.Login;
import lib.Menu;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu.printWelcome();
        Login.authenticate();
        Menu.main();
    }
}
