package top.wordcount.java.patterns.adapter.adapt;

import top.wordcount.java.patterns.adapter.AdvancedMediaPlayer;
import top.wordcount.java.patterns.adapter.MediaPlayer;
import top.wordcount.java.patterns.adapter.impl.Mp4Player;
import top.wordcount.java.patterns.adapter.impl.VlcPlayer;

/**
 * 创建实现了 MediaPlayer 接口的适配器类。
 * 我们需要创建一个实现了 MediaPlayer 接口的适配器类 MediaAdapter，
 * 并使用 AdvancedMediaPlayer 对象来播放所需的格式。
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;//继承MediaPlay接口，并使用高级播放器的类实现播放功能

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
