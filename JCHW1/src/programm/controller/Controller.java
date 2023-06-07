package programm.controller;

import programm.Notebook.Notebook;

public class Controller {
    private Notebook notebook;

    public Controller(Notebook notebook) {
        this.notebook = notebook;
    }

    public void addNote(String title, String content) {
        notebook.addNote(title, content);
    }

    public void showNotes() {
        notebook.showNotes();
    }
}