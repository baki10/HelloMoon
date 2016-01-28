package com.bakigoal.hellomoon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelloMoonFragment extends Fragment {

  private AudioPlayer audioPlayer = new AudioPlayer(R.raw.one_small_step);
  private Button playButton;
  private Button stopButton;
  private Button pauseButton;


  public HelloMoonFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_hello_moon, container);

    playButton = (Button) view.findViewById(R.id.hellomoon_play_button);
    stopButton = (Button) view.findViewById(R.id.hellomoon_stop_button);
    pauseButton = (Button) view.findViewById(R.id.hellomoon_pause_button);

    playButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        audioPlayer.play(getActivity());
      }
    });
    pauseButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        audioPlayer.pause();
      }
    });
    stopButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        audioPlayer.stop();
      }
    });

    return view;
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    audioPlayer.stop();
  }
}
