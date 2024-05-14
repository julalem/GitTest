import java.util.ArrayList;
import java.util.List;

public class NoteManager {
        private List<Note> notes;

        public NoteManager() {
            this.notes = new ArrayList<>();
        }

        public void addNote(String title, String content) {
            int id = notes.size() + 1;
            Note newNote = new Note(id, title, content);
            notes.add(newNote);
            System.out.println("Note added successfully.");
        }

        public void displayNotes() {
            if (notes.isEmpty()) {
                System.out.println("No notes found.");
            } else {
                System.out.println("ID\tTitle\tContent");
                for (Note note : notes) {
                    System.out.println(note.getId() + "\t" + note.getTitle() + "\t" + note.getContent());
                }
            }
        }

        public void deleteNote(int id) {
            boolean found = false;
            for (int i = 0; i < notes.size(); i++) {
                if (notes.get(i).getId() == id) {
                    notes.remove(i);
                    found = true;
                    System.out.println("Note deleted successfully.");
                    break;
                }
            }
            if (!found) {
                System.out.println("Note with ID " + id + " not found.");
            }
        }
    }

