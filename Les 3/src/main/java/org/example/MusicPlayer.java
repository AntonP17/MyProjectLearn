package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    // ДЗ пройтись по списку музыики и вывести на экран все бины

    private Music music;
    private String name;
    private int volume;

    // IoC

    public MusicPlayer(Music music){
        this.music = music;
    }

    public MusicPlayer(){
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

    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic(){
        return "Playing : " + music.getSong();
    }


}


