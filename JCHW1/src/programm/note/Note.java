package programm.note;

public class Note {
    private String title;
    private String content;

    /**
     * Класс Note - заметка
     *
     * @param title   - заголовок заметки
     * @param content - соедржимое заметки
     */
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.format("Title: %s Content: %s", this.getTitle(), this.getContent());
    }
}