package com.example.projetointegrado;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class JovensEmbaixadores extends Activity
{
	MainActivity menu = new MainActivity();
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.jovens_embaixadores);
	}
	
	public void back(View v)
	{
		if (menu.campanha_top1 == true)
		{
			Intent i = new Intent();
			i.setClass(this,MainActivity.class);
			startActivity(i);
			menu.campanha_top1 = false;
		}
		
		else 
		{
			Intent i = new Intent();
			i.setClass(this,CienciaSemFronteiras.class);
			startActivity(i);
		}
	}
	
	public void go_to(View v)
	{
		Intent i = new Intent();
		i.setClass(this,CienciaSemFronteiras.class);
		startActivity(i);	
	}
}
