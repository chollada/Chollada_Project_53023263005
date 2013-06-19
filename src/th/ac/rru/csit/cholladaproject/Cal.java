package th.ac.rru.csit.cholladaproject;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cal extends Activity {
	Button black,plus;
	EditText ed1,ed2;
	TextView tv;
	
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        black = (Button)findViewById(R.id.button1);
        plus = (Button)findViewById(R.id.button2);
        ed1 = (EditText)findViewById(R.id.editText1);
        ed2 = (EditText)findViewById(R.id.editText2);
        tv = (TextView)findViewById(R.id.textView2);
        
        
        black.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent i = new Intent();
				i.setClass(Cal.this, MainActivity.class);
				startActivity(i);
				
			}
		});
        plus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				tv.setText( Integer.parseInt(ed1.getText().toString()) + 
						    Integer.parseInt(ed2.getText().toString())+"  "
						    );
				
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_cal, menu);
        return true;
    }
}
