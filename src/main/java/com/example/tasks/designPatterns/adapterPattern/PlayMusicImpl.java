package com.example.tasks.designPatterns.adapterPattern;

public class PlayMusicImpl implements PlayMusic{

    private LegacyPlayer legacyPlayer;

    public PlayMusicImpl(LegacyPlayer player){
        this.legacyPlayer = player;
    }

    @Override
    public void playList(String type) {
        switch (type){
            case "classic":
                legacyPlayer.playClassicMusic();
                break;
            case "Rock":
                legacyPlayer.playRockMusic();
                break;
        }
    }
}
