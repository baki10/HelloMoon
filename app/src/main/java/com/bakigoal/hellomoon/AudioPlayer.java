package com.bakigoal.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by ilmir on 28.01.16.
 */
public class AudioPlayer {

  private MediaPlayer player;
  private int musicId;

  public AudioPlayer(int musicId) {
    this.musicId = musicId;
  }

  public void stop() {
    if (player != null) {
      player.release();
      player = null;
    }
  }

  public void play(Context context) {
    if (player != null && player.isPlaying()) {
      stop();
    }

    if (player == null) {
      player = MediaPlayer.create(context, musicId);
    }
    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
      @Override
      public void onCompletion(MediaPlayer mp) {
        stop();
      }
    });

    player.start();
  }

  public void pause() {
    if (player != null && player.isPlaying()) {
      player.pause();
    }
  }
}
