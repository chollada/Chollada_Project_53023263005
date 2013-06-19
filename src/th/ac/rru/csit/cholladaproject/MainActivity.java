package th.ac.rru.csit.cholladaproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b1,b2,b3,b4; 
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.Pic);
        b2 = (Button)findViewById(R.id.vdo);
        b3 = (Button)findViewById(R.id.cal);
        b4 = (Button)findViewById(R.id.database);
        
        
       b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i = new Intent();
			i.setClass(MainActivity.this, Picture.class);
			startActivity(i);
		}
	});
       
       b2.setOnClickListener(new OnClickListener() {
   		
   		@Override
   		public void onClick(View arg0) {
   			Intent i = new Intent();
   			i.setClass(MainActivity.this, VDO.class);
   			startActivity(i);
   		}
   	});
       
       
       b3.setOnClickListener(new OnClickListener() {
   		
   		@Override
   		public void onClick(View arg0) {
   			Intent i = new Intent();
   			i.setClass(MainActivity.this, Cal.class);
   			startActivity(i);
   		}
   	});
       
       b4.setOnClickListener(new OnClickListener() {
   		
   		@Override
   		public void onClick(View arg0) {
   			Intent i = new Intent();
   			i.setClass(MainActivity.this,DataBase.class);
   			startActivity(i);
   		}
   	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
