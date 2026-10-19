public class SongNode {
    String title;
    SongNode prev;
    SongNode next;

    public SongNode(String title){
        this.title=title;
        this.next=null;
        this.prev=null;
    }
}
