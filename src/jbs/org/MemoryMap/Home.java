package jbs.org.MemoryMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Home extends Activity implements OnClickListener{

	/** Called when the activity is first created. 
	 * Lets user start game
	 * */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
		//Finds the play view
		View play = findViewById(R.id.launch_game);
		play.setOnClickListener(this);
    }

	public void onClick(View v) {
		switch(v.getId()) {	
		case R.id.launch_game:
			Intent i = new Intent(this, GamePlay.class);
			startActivity(i);
			break;
		}
	}    
}