package com.david.bgwfans;

import net.simonvt.widget.MenuDrawerManager;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Attractions extends WindowSample implements View.OnClickListener{
	
	private MenuDrawerManager mMenuDrawer;
	private static final String STATE_MENUDRAWER = "net.simonvt.menudrawer.samples.WindowSample.menuDrawer";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.attractions);

		
		ActionBar actionbar = getActionBar();
        actionbar.setDisplayShowTitleEnabled(false);
		actionbar.setListNavigationCallbacks(null, null);
        actionbar.setDisplayHomeAsUpEnabled(true);
        createNavigation();
        
        Button b1 = (Button) findViewById(R.id.coasters);
        b1.setOnClickListener(this);
        
        Button b2 = (Button) findViewById(R.id.flats);
        b2.setOnClickListener(this);
        
        Button b3 = (Button) findViewById(R.id.water);
        b3.setOnClickListener(this);
        
        Button b4 = (Button) findViewById(R.id.additional);
        b4.setOnClickListener(this);
        
        findViewById(R.id.item1).setOnClickListener(this);
        findViewById(R.id.item2).setOnClickListener(this);
        findViewById(R.id.item3).setOnClickListener(this);
        findViewById(R.id.item4).setOnClickListener(this);
        findViewById(R.id.item5).setOnClickListener(this);
        findViewById(R.id.item6).setOnClickListener(this);
        findViewById(R.id.item7).setOnClickListener(this);
        findViewById(R.id.item8).setOnClickListener(this);
        findViewById(R.id.item9).setOnClickListener(this);
        findViewById(R.id.item10).setOnClickListener(this);
        findViewById(R.id.item11).setOnClickListener(this);
        findViewById(R.id.item12).setOnClickListener(this);
        findViewById(R.id.item13).setOnClickListener(this);

}
	
	
	@Override
	public void onClick(View v) {
    	switch(v.getId()){
    	case R.id.coasters: Intent coastersActivity = new Intent(this, Coasters.class);
    		startActivity(coastersActivity);
    		break;
    	//case R.id.flats: Intent flatsActivity = new Intent(this, Flats.class);
		//	startActivity(flatsActivity);
		//	break;
    	//case R.id.water: Intent waterActivity = new Intent(this, Water.class);
		//	startActivity(waterActivity);
		//	break;
    	//case R.id.additional: Intent additionalActivity = new Intent(this, Additonal.class);
		//	startActivity(additionalActivity);
		//	break;
    	case R.id.item1: Intent infoActivity = new Intent(this, InfoScreen.class);
		startActivity(infoActivity);
		break;
    	case R.id.item2: Intent attrActivity = new Intent(this, Attractions.class);
		startActivity(attrActivity);
		break;
		case R.id.item3: Intent showsActivity = new Intent(this, HOS_Shows.class);
		startActivity(showsActivity);
		break;
    	case R.id.item4: Intent eatActivity = new Intent(this, Eateries.class);
		startActivity(eatActivity);
		break;
    	case R.id.item5: Intent mapActivity = new Intent(this, MapScreen.class);
		startActivity(mapActivity);
		break;
    	case R.id.item6: Intent hhActivity = new Intent(this, HOS_Houses.class);
		startActivity(hhActivity);
		break;
    	case R.id.item7: Intent hshowActivity = new Intent(this, HOS_Shows.class);
		startActivity(hshowActivity);
		break;
    	case R.id.item8: Intent featuresActivity = new Intent(this, HOS_Features.class);
		startActivity(featuresActivity);
		break;
    	case R.id.item9: Intent blogActivity = new Intent(this, BGWFans.class);
		startActivity(blogActivity);
		break;
    	case R.id.item10: Intent forumActivity = new Intent(this, Forums.class);
		startActivity(forumActivity);
		break;
    	case R.id.item11: Intent wikiActivity = new Intent(this, Wiki.class);
		startActivity(wikiActivity);
		break;
    	case R.id.item12: Intent settingsActivity = new Intent(this, Settings.class);
		startActivity(settingsActivity);
		break;
    	case R.id.item13: Intent aboutActivity = new Intent(this, About.class);
		startActivity(aboutActivity);
		break;
    		
    	}
    }
	
	private void createNavigation() {
		// TODO Auto-generated method stub
		
	}
}