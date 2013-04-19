package com.example.projetointegrado;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class CienciaSemFronteiras extends Activity
{
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.ciencia_sem_fronteiras);
	}
	
	public void back(View v)
	{
		Intent i = new Intent();
		i.setClass(this,BolsaFormacao.class);
		startActivity(i);		
	}
	
	public void go_to(View v)
	{
		Intent i = new Intent();
		i.setClass(this,JovensEmbaixadores.class);
		startActivity(i);	
	}

}
