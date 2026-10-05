/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Yıldız Karamahmut
 * Student ID:  240444039
 * Date:        05.10.2026
 */
public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");
        // --- Default constructor ---
        Track track1 = new Track();
        System.out.println("Track 1 (Default): " + track1.toString());
        // --- Title-only constructor ---
        Track track2 = new Track("Midnight City");
        System.out.println("Track 2 (Title-only): " + track2.toString());
        // --- Title + artist constructor ---
        Track track3 = new Track("Starboy", "The Weeknd");
        System.out.println("Track 3 (Title + Artist): " + track3.toString());
        // --- Full constructor ---
        Track track4 = new Track("Neon Lights", "Stellar Echo", 242, true);
        System.out.println("Track 4 (Full): " + track4.toString());
        // --- Invalid duration test ---
        System.out.println("\nTesting invalid duration (-120):");
        Track track5 = new Track("Broken Timing", "Error Maker", -120, false);
        System.out.println("Track 5 (Invalid duration): " + track5.toString());
        // --- Getter test ---
        System.out.println("\n--- Testing Individual Getters on Track 4 ---");
        System.out.println("Title:              " + track4.getTitle());
        System.out.println("Artist:             " + track4.getArtist());
        System.out.println("Duration (seconds): " + track4.getDurationSeconds());
        System.out.println("Duration (mm:ss):   " + track4.getDurationFormatted());
        System.out.println("Is Explicit:        " + track4.isExplicit());
    }
}
