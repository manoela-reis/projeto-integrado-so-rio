package com.example.projetointegrado;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

// Classe equivalente a tela inicial, onde todas as opções são mostradas ao usuário.
public class MainActivity extends Activity 
{
	public boolean campanha_active = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setVolumeControlStream(AudioManager.STREAM_MUSIC);
		setContentView(R.layout.activity_main);
	}

	// Por mim
	public void click_Mim(View v)
	{
		Intent i = new Intent();
		i.setClass(this, BolsaFormacao.class);
		startActivity(i);
	}
	
	// Pelo Outro
	public void click_Outro(View v)
	{
		Intent i = new Intent();
		i.setClass(this, AbrigoTerezaDeJesus.class);
		startActivity(i);
	}
	
	// Pelo Mundo
	public void click_Mundo(View v)
	{
		Intent i = new Intent();
		i.setClass(this, GreenPeace.class);
		startActivity(i);
	}
	
	// Campanhas
	public void click_TodasCampanhas(View v)
	{
		campanha_active = true;
		if (campanha_active == true)
		{
			Intent i = new Intent();
			i.setClass(this, PegadaEcologica.class);
			startActivity(i);
		}
		else 
		{
			Intent i = new Intent();
			i.setClass(this, JovensEmbaixadores.class);
			startActivity(i);
		}
	}
	
	// Sair
	public void Quit(View v)
	{
		finish();
	}
	
	
}
