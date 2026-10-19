
public class MusicPlaylist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(String title) {

        SongNode newSong = new SongNode(title);

        if (head == null) {
            head = newSong;
            tail = newSong;
            current = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
    }

    public void removeSong(String title) {

        SongNode temp = head;

        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }

        if (temp == current) {
            if (temp.next != null) {
                current = temp.next;
            } else {
                current = temp.prev;
            }
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

    public void nextSong() {

        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println(
                    "Already at the last song of the playlist."
            );
        }
    }

    public void previousSong() {

        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println(
                    "Already at the first song of the playlist."
            );
        }
    }

    public void displayCurrentSong() {

        if (current == null) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Current song: " + current.title);
        }
    }
    public void displayPlaylist() {
        SongNode temp = head;
        if (head == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }
}