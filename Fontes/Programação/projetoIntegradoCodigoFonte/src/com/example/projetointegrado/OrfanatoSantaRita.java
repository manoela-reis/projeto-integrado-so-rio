package com.example.projetointegrado;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class OrfanatoSantaRita extends Activity
{
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.orfanato_santa_rita);
	}
	
	public void back(View v)
	{
		Intent i = new Intent();
		i.setClass(this,ClinicaIbmr.class);
		startActivity(i);		
	}
}
