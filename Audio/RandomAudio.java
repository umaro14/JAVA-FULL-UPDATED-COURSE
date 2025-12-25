package Audio;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;


public class RandomAudio {

    String[] MyFiles = {
        "C:\\\\Users\\\\ajkla\\\\OneDrive\\\\Documents\\\\JAVA-FULL-COURSE-TELUSKO\\\\Audio\\\\seize-the-day-andrey-rossi-main-version-14571-01-40.wav",
        "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\making-progress-dan-phillipson-main-version-02-56-10491.wav",
        "C:\\Users\\ajkla\\OneDrive\\Documents\\JAVA-FULL-COURSE-TELUSKO\\Audio\\trendsetter-mood-maze-main-version-02-53-1004.wav"
        };

       

        public String MyFunction(){
            Random random = new Random();
            int randomIndex = random.nextInt(MyFiles.length);
            return MyFiles[randomIndex];
           
        }


    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {

        RandomAudio audio = new RandomAudio();
        String selectedAudio = audio.MyFunction();



   


        Scanner scanner = new Scanner(System.in);
        File file = new File(selectedAudio);
        AudioInputStream  audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
      
        String Myresponse = "";
       
        while(!Myresponse.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter Your Choise: ");

            Myresponse = scanner.nextLine().toUpperCase();

         switch(Myresponse){
            case "P": 
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
        System.out.println("program Terminated");

    }
}
