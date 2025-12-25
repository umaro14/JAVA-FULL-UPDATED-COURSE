
package Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchMusic {

    // Creating a Map with keys (String) and values (String)
    private Map<String, String> myFiles = new HashMap<>();
    private Clip clip;

    public SearchMusic() {
        // Populating the Map with keys and corresponding file paths as values
        myFiles.put("track1", "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\seize-the-day-andrey-rossi-main-version-14571-01-40.wav");
        myFiles.put("track2", "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\making-progress-dan-phillipson-main-version-02-56-10491.wav");
        myFiles.put("track3", "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\trendsetter-mood-maze-main-version-02-53-1004.wav");
    }

    public void playSong(String songPath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File(songPath); // Pass the file path to the File constructor
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }

    // Stops the song
    public void stopSong() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    // Resets the song
    public void resetSong() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }




    
    // Plays a song and handles playback control
    public void handlePlayback(String filePath) {
        try {
            playSong(filePath);

            Scanner scanner = new Scanner(System.in);
            String choice = "";
            while (!choice.equals("Q")) {
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.println("Enter Your Choice: ");
                choice = scanner.nextLine().toUpperCase();

                switch (choice) {
                    case "P":
                        if (clip != null && !clip.isRunning()) {
                            clip.start();
                        }
                        break;
                    case "S":
                        stopSong();
                        break;
                    case "R":
                        resetSong();
                        break;
                    case "Q":
                        stopSong();
                        System.out.println("Program Terminated");
                        return; // Exit the handlePlayback method and stop playback
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }






    // Main method to run the application
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Available tracks:");
                for (String key : myFiles.keySet()) {
                    System.out.println(key);
                }

                System.out.println("Enter the track name you want to play:");
                String track = scanner.nextLine().trim(); // Removes leading and trailing whitespace

                String filePath = myFiles.get(track);
                if (filePath == null) {
                    System.out.println("Track not found.");
                    continue; // Ask for the track name again if not found
                }

                handlePlayback(filePath); // Play the selected track and handle controls

                System.out.println("Do you want to play another track? (Y/N)");
                String response = scanner.nextLine().trim().toUpperCase();
                if (!response.equals("Y")) {
                    System.out.println("Exiting program.");
                    break; // Exit the loop and terminate the program
                }
            }
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }




    public static void main(String[] args) {
        SearchMusic musicPlayer = new SearchMusic();
        musicPlayer.run();
    }
}
