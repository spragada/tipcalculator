package com.yahoo.tipcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalculatorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
    public void calculateTip(View v)
    {
    	EditText amountField=(EditText)findViewById(R.id.editText1);
    	TextView tipField=(TextView)findViewById(R.id.textView2);   
    	
    	if(amountField.getText().toString().trim().length()>0)
    	{   
    		int amount=Integer.parseInt(amountField.getText().toString().trim());
    		int tip=0;
    		
    		if(v.getId()==R.id.button1)
    			tip=amount*10;
    		else if(v.getId()==R.id.button2)
    			tip=amount*15;
    		else
    			tip=amount*20;
    		
    		tipField.setText(tip+"");
    	}
    	else
    		Toast.makeText(getBaseContext(), "Enter Amount", Toast.LENGTH_SHORT).show();
    }
    
}
