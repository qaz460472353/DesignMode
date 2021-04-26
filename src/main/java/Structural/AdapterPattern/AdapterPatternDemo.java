package Structural.AdapterPattern;
/**
 * @description 适配器模式
 *  为不同不兼容的接口之间建立一个桥梁
 * @date 2021/4/26 9:46
 * @auther ZY
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
