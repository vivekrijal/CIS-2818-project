package com.project.menus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class EnergyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_energy);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.menu_health:
				startActivity(new Intent(getApplicationContext(), HealthActivity.class));
				return true;
			case R.id.menu_security:
				startActivity(new Intent(getApplicationContext(), SecurityActivity.class));
				return true;
			case R.id.menu_energy:
				startActivity(new Intent(getApplicationContext(), EnergyActivity.class));
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
}