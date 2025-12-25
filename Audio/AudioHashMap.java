package Audio;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AudioHashMap {

    // Creating a Map with keys (String) and values (String)
    Map<String, String> MyFiles = new HashMap<>();

    public AudioHashMap() {
        // Populating the Map with keys and corresponding file paths as values
        MyFiles.put("track1", "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\seize-the-day-andrey-rossi-main-version-14571-01-40.wav");
        MyFiles.put("track2", "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\making-progress-dan-phillipson-main-version-02-56-10491.wav");
        MyFiles.put("track3", "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\trendsetter-mood-maze-main-version-02-53-1004.wav");
    }

    public String getRandomFile() {
        Random random = new Random();
        Object[] keys = MyFiles.keySet().toArray(); // Get the keys as an array
        String randomKey = (String) keys[random.nextInt(keys.length)]; // Select a random key
        return MyFiles.get(randomKey); //Return the corresponding file path
    }

    public static void main(String[] args) throws Exception {

        AudioHashMap audio = new AudioHashMap();
        String selectedFile = audio.getRandomFile(); // Get a random file path

        Scanner scanner = new Scanner(System.in);
        File file = new File(selectedFile); // Pass the file path to the File constructor
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String Myresponse = "";

        while (!Myresponse.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter Your Choice: ");

            Myresponse = scanner.nextLine().toUpperCase();

            switch (Myresponse) {
                case "":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:
                    System.out.println("Invalid Response");
            }
        }

        scanner.close();
        System.out.println("Program Terminated");
    }
}

