package com.gamecodeschool.c17snake;
import android.media.SoundPool;

/**
 * Created by Angelo on 11/26/2023.
 */

public class PlaySound implements AudioStrategy {
    @Override
    public int playSound(int soundID, SoundPool mSP){
        // return the sound playing
        return mSP.play(soundID, 1, 1, 0, 0, 1);
    }
}
