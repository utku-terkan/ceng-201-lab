/**
 * MusicPlaylist.java
 * Represents a doubly linked list for a music playlist.
 * Name:       UTKU TERKAN
 * Student ID: 240446030
 * Date:       19/10/2026
 */
public class MusicPlaylist {
    // Stores the first, last, and current songs
    private SongNode head;
    private SongNode tail;
    private SongNode current;
    // Initializes an empty playlist
    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }
    // Adds a song to the end of the playlist
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);
        // Checks if the playlist is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            // Connects the new node to the last node
            newNode.prev = tail;
            tail.next = newNode;
            // Updates the tail
            tail = newNode;
        }
    }
    // Removes a song from the playlist
    public void removeSong(String title) {
        SongNode temp = head;
        // Searches for the song
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        // Checks if the song exists
        if (temp == null) {
            System.out.println("The song isn't in the playlist");
            return;
        }
        // Updates the current song if it is being removed
        if (current == temp) {
            if (temp.next != null) {
                current = temp.next;
            } else {
                current = temp.prev;
            }
        }
        // Updates the previous node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        // Updates the next node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
        // Clears the removed node's links
        temp.prev = null;
        temp.next = null;
        System.out.println("Removed: " + title);
    }
    // Moves to the next song
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }
    // Moves to the previous song
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }
    // Displays the current song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title);
        } else {
            System.out.println("No song is currently playing.");
        }
    }
    // Displays all songs from the beginning to the end
    public void displayPlaylist() {
        SongNode temp = head;
        if (temp == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        // Traverses the list using the next pointer
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
