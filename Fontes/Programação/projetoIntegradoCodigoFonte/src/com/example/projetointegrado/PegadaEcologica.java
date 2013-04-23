package com.example.projetointegrado;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class PegadaEcologica extends Activity
{
	MainActivity menu = new MainActivity();
	
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.pegada_ecologica);
	}
	
	public void back(View v)
	{
		if (menu.campanha_top2 == true)
		{
			Intent i = new Intent();
			i.setClass(this,MainActivity.class);
			startActivity(i);
			menu.campanha_top2 = false;
		}
		
		else
		{
			Intent i = new Intent();
			i.setClass(this,WWF.class);
			startActivity(i);
		}
		
	}

}
