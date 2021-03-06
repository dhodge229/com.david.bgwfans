package com.david.bgwfanspaid.attractions.coasters;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.david.bgwfanspaid.webviews.HiddenWiki;
import com.david.bgwfanspaid.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.manuelpeinado.fadingactionbar.FadingActionBarHelper;

public class VBolt extends SherlockFragmentActivity {
	FadingActionBarHelper mHelper;
	ImageView attrHeader;
	GoogleMap mMap;

	    static final CameraPosition HOME =
	            new CameraPosition.Builder().target(new LatLng(37.232449, -76.645534))
	                    .zoom(17)
	                    .bearing(0)
	                    .tilt(25)
	                    .build();

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setTheme(R.style.AppTheme_TranslucentActionBar);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayUseLogoEnabled(true);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		mHelper = new FadingActionBarHelper()
				.actionBarBackground(R.color.bgwfans_actionbar)
				.headerLayout(R.layout.attrheader)
				.contentLayout(R.layout.vbolt2)
				.lightActionBar(false);
		setContentView(mHelper.createView(this));
		mHelper.initActionBar(this);
		attrHeader = (ImageView) findViewById(R.id.attractionHeader);
		attrHeader.setImageResource(R.drawable.vbolt23);
		setUpMapIfNeeded();
	}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

	 @Override
	 protected void onResume() {
	        super.onResume();
	        setUpMapIfNeeded();
	  }

	private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

	 private void setUpMap() {
	        mMap.addMarker(new MarkerOptions().position(new LatLng(37.232449, -76.645534)).title("Verbolten").snippet("Brave the Black Forest!"));
	        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
	        mMap.setMyLocationEnabled(false);
	        mMap.getUiSettings().setZoomControlsEnabled(false);
	        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(HOME));
	    }

	 public void Wiki(View view) {
	        Intent i = new Intent(getApplicationContext(), HiddenWiki.class);
	        i.putExtra("wikiLink", "http://wiki.parkfans.net/index.php/Verbolten");
	        startActivity(i);
	    }

}
