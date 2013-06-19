package th.ac.rru.csit.cholladaproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VDO extends Activity {
	Button BVdo;
	VideoView vdo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo);
        
        BVdo = (Button)findViewById(R.id.button1);
        vdo = (VideoView)findViewById(R.id.videoView1);
        
        
        MediaController mc = new MediaController(this);
        mc.setMediaPlayer(vdo);
        mc.setMediaPlayer(vdo);
        
        vdo.setMediaController(mc);
        vdo.setVideoPath("http://ladyshoppingz.com/korkai.3gp");
        vdo.start();
        
        
        
        
        
        
        BVdo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent i = new Intent();
				i.setClass(VDO.this, MainActivity.class);
				startActivity(i);
				
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_vdo, menu);
        return true;
    }
}
