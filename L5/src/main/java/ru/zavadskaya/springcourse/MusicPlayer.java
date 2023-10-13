package ru.zavadskaya.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Playing with volume " + volume + ": ");
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }

    public void initMethod() {
        System.out.println("Initializing MusicPlayer");
        playMusic();
    }
    public void destroyMethod() {
        System.out.println("Destroying MusicPlayer");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
