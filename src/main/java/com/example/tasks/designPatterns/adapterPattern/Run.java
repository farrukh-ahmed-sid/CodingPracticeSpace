package com.example.tasks.designPatterns.adapterPattern;

public class Run {

    public static void runIt() {
        PlayMusic playMusic = new PlayMusicImpl(new LegacyPlayer());
        playMusic.playList("Rock");
    }
}
