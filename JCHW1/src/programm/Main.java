package programm;

import programm.Notebook.Notebook;
import programm.controller.Controller;
import programm.view.View;

public class Main {
    public static void main(String[] args) {
        Notebook nb = new Notebook();
        Controller controller = new Controller(nb);
        View view = new View(controller);
        view.run();
    }
}