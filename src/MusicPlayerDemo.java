public class MusicPlayerDemo {

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("Snap - Manifest");
        playlist.addSong("Shape of You");
        playlist.addSong("Perfect");
        playlist.addSong("Photograph");
        System.out.println("=== MUSIC PLAYLIST ===");
        playlist.displayPlaylist();
        System.out.println("=== CURRENT SONG ===");
        playlist.displayCurrentSong();
        System.out.println("=== NEXT SONG ===");
        playlist.nextSong();
        playlist.displayCurrentSong();
        System.out.println("=== PREVIOUS SONG ===");
        playlist.previousSong();
        playlist.displayCurrentSong();
        playlist.removeSong("Snap - Manifest");
        System.out.println("=== AFTER REMOVING Snap SONG ===");
        playlist.displayPlaylist();
    }
}