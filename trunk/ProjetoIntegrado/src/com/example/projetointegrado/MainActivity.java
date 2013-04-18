package com.example.projetointegrado;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.activity_main);
	}
	
	public void porMin(View v)
	{
		Intent i = new Intent();
		i.setClass(this, PorMim.class);
		startActivity(i);		
	}
	
	
}
