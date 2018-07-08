package com.example.Funny_letters;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import com.example.igortaran.R;

public class MusicManager {
    private MediaPlayer mediaPlayer;
    private static MusicManager instance;

    public static MusicManager getInstance() {
        if (instance == null) {
            instance = new MusicManager();
        }
        return instance;
    }

    private MusicManager() {}

    public void startPlay(Context context) {
        //  if (audioManager == null && mediaPlayer == null) {
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

        mediaPlayer = MediaPlayer.create(context, R.raw.music);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        assert audioManager != null;
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 6, 0);
    }

    public void stopPlay() {
        mediaPlayer.stop();
    }
}