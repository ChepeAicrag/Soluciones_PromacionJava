import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class Sound {

    Clip begin;
    Clip chomp;
    Clip siren;
    Clip death;
    Clip eat;
    Clip powerUp;


    public Sound(){
        begin = loadClip("sound/pacman_beginning.wav");
        chomp = loadClip("sound/pacman_chomp.wav");
        siren = loadClip("sound/pacman_siren_1.wav");
        death = loadClip("sound/pacman_death.wav");
        powerUp = loadClip("sound/pacman_intermission.wav");
        eat = loadClip("sound/pacman_eatghost.wav");
    }

    private static Clip loadClip(String url){
        // create AudioInputStream object
        Clip clip = null;
        try {
            URL source = Sound.class.getResource(url);
            AudioInputStream audioInputStream  =
                    AudioSystem.getAudioInputStream( source );
            // create clip reference
            clip = AudioSystem.getClip();
            // open audioInputStream to the clip
            clip.open(audioInputStream);


        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        return clip;
    }

    public void playBegin(){
        begin.start();
    }
    public void playChop(){
        if(!chomp.isRunning()){
            //chomp.stop();
            chomp.setFramePosition(0);
            chomp.start();
        }
    }
    public void playSiren(){
       //
        siren.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stopSiren(){
        siren.stop();
        chomp.setFramePosition(0);
    }
    public  void playDeath(){
        death.setFramePosition(0);
        death.start();
    }
    public void playPowerUp(){
        powerUp.setFramePosition(0);
        powerUp.start();
    }
    public void playEat(){
        eat.stop();
        eat.setFramePosition(0);
        eat.start();
    }
}
