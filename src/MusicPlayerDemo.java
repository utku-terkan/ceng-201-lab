/**
 * MusicPlayerDemo.java
 * Tests the music playlist.
 * Name:       UTKU TERKAN
 * Student ID: 240446030
 * Date:       19/10/2026
 */
public class MusicPlayerDemo {
    public static void main(String[] args) {
        // Creates a new playlist
        MusicPlaylist playlist = new MusicPlaylist();
        // Adds songs to the playlist
        playlist.addSong("Özkan Uğur - Olduramadım");
        playlist.addSong("Murat Göğebakan - Vurgunum");
        playlist.addSong("Hayko Cepkin - Fırtınam");
        playlist.addSong("Mountain - Mississippi Queen");
        // Displays the playlist
        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();
        // Displays the current song
        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();
        // Moves to the next song
        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println("Playing: Murat Göğebakan - Vurgunum");
        // Moves to the next song again
        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();
        System.out.println("Playing: Hayko Cepkin - Fırtınam");
        // Moves to the previous song
        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();
        System.out.println("Playing: Murat Göğebakan - Vurgunum");
        // Removes the first song
        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        playlist.removeSong("Özkan Uğur - Olduramadım");
        playlist.displayPlaylist();
        // Removes a song from the middle
        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        playlist.removeSong("Hayko Cepkin - Fırtınam");
        playlist.displayPlaylist();
    }
}
