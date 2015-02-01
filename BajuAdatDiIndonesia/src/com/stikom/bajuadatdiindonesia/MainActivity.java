package com.stikom.bajuadatdiindonesia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void openErafone (View v){
    	Intent erafone = new Intent(getApplicationContext(),ErafoneActivity.class);
    	
    	startActivity(erafone);
    }
    public void openOke (View v){
    	Intent okeshop = new Intent(getApplicationContext(),OkeShopActivity.class);
    	
    	startActivity(okeshop);
    }
public void openSamsung (View v){
	Intent Samsung = new Intent(getApplicationContext(),SamsungActivity.class);
	
	startActivity(Samsung);
}
public void openriau (View v){
	Intent riau = new Intent(getApplicationContext(),riauActivity.class);
	
	startActivity(riau);
}
public void openjambi (View v){
		Intent jambi = new Intent(getApplicationContext(),jambiActivity.class);
		
	startActivity(jambi);
}
public void opensumatraselatan (View v){
		Intent sumatraselatan = new Intent(getApplicationContext(),sumatraselatanActivity.class);
		
	startActivity(sumatraselatan);
}
public void openlampung (View v){
		Intent lampung = new Intent(getApplicationContext(),lampungActivity.class);
		
	startActivity(lampung);
}
public void openbengkulu (View v){
		Intent bengkulu = new Intent(getApplicationContext(),bengkuluActivity.class);
		
	startActivity(bengkulu);
}
public void openbangkabelitung (View v){
		Intent bangkabelitung = new Intent(getApplicationContext(),bangkabelitungActivity.class);
		
	startActivity(bangkabelitung);
}
public void openkepulauanriau (View v){
		Intent kepulauanriau = new Intent(getApplicationContext(),kepulauanriauActivity.class);
		
	startActivity(kepulauanriau);
}
public void openmadura (View v){
		Intent madura = new Intent(getApplicationContext(),maduraActivity.class);
		
	startActivity(madura);
}
public void openjawabarat (View v){
		Intent jawabarat = new Intent(getApplicationContext(),jawabaratActivity.class);
		
	startActivity(jawabarat);
}
public void openbanten (View v){
		Intent banten = new Intent(getApplicationContext(),bantenActivity.class);
		
	startActivity(banten);
}
public void openAbout (View v){
	Intent About = new Intent(getApplicationContext(),AboutActivity.class);
	
	startActivity(About);
}
}
