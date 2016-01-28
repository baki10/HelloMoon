package com.bakigoal.hellomoon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelloMoonFragment extends Fragment {

  private Button playButton;
  private Button stopButton;


  public HelloMoonFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_hello_moon, container);

    playButton = (Button) view.findViewById(R.id.hellomoon_play_button);
    stopButton = (Button) view.findViewById(R.id.hellomoon_stop_button);

    return view;
  }

}
