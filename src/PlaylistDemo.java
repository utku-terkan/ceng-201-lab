
/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Utku
 * Student ID:  240446030
 * Date:        10/11/2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // Default constructor
        Track track1 = new Track();

        System.out.println("Default Track: ");
        System.out.println(track1);
        System.out.println();

        // Title-only constructor
        Track track2 = new Track("Neon Lights");

        System.out.println("Title-only track:");
        System.out.println(track2);
        System.out.println();

        // Title + artist constructor
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");

        System.out.println("Title + Artist Track:");
        System.out.println(track3);
        System.out.println();

        // Full constructor
        Track track4 = new Track(
                "Raindrop Waltz",
                "Clara Voss",
                210,
                false
        );

        System.out.println("Full Track (non-explicit):");
        System.out.println(track4);
        System.out.println();

        // Invalid duration test
        System.out.println("Invalid Duration Test:");

        Track track5 = new Track(
                "Broken Clock",
                "Static Noise",
                -50,
                false
        );

        System.out.println(track5);
        System.out.println();

        // Getter test
        Track track6 = new Track(
                "Stardust",
                "Stellar Echo",
                242,
                true
        );

        System.out.println("Getter Test:");
        System.out.println("Title:     " + track6.getTitle());
        System.out.println("Artist:    " + track6.getArtist());
        System.out.println("Duration:  " + track6.getDurationFormatted());
        System.out.println("Explicit:  " + track6.getIsExplicit());
    }
}