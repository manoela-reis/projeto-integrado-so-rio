package com.example.projetointegrado;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class BolsaFormacao extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.bolsa_formacao);
	}
	
	public void back(View v)
	{
		Intent i = new Intent();
		i.setClass(this,MainActivity.class);
		startActivity(i);		
	}
	
	public void go_to(View v)
	{
		Intent i = new Intent();
		i.setClass(this,CienciaSemFronteiras.class);
		startActivity(i);	
	}

}
