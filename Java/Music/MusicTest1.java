package Java.Music;
import javax.sound.midi.*;

public class MusicTest1 {
    
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();//MidiSystem.getSequencer()方法抛出了异常，所以一定要try catch处理异常
        } catch (MidiUnavailableException e) {
            System.out.println("Bummer");
            e.printStackTrace();
        }
        System.out.println("We got a sequencer");
    }// 关闭播放

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }




}
