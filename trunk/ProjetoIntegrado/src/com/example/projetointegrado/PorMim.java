package com.example.projetointegrado;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Window;

public class PorMim extends Activity 
{
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.por_min);
	}

}
