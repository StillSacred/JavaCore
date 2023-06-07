package programm.notebook;

import programm.note.Note;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes = new ArrayList<>();

    public void addNote(String title, String content) {
        notes.add(new Note(title, content));
    }

    public void showNotes() {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }
}