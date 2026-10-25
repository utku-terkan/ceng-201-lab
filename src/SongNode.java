/**
 * SongNode.java
 * Represents a song in the playlist.
 * Name:       UTKU TERKAN
 * Student ID: 240446030
 * Date:       19/10/2026
 */
public class SongNode {
    String title;
    SongNode prev;
    SongNode next;
    // Creates a song node and initializes its links
    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
