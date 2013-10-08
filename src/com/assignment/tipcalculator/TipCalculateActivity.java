package com.assignment.tipcalculator;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class TipCalculateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculate);

    }
    

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculate, menu);
        return true;
    }
    
    public void calculateTip(View v){
    	double percent = 100;

        switch (v.getId()) {
	        case (R.id.percent10):
	            percent = 10;
	        break;
	        case (R.id.percent15):
	            percent = 15;
	        break;
	        case (R.id.percent20):
	            percent = 20;
	        break;
        }
    	       

    	EditText inputAmount = (EditText) findViewById(R.id.etEnteredAmount);
    	EditText showTip = (EditText) findViewById(R.id.etTipAmount);
    	if(!inputAmount.getText().toString().isEmpty()){
	    	double tip = Double.parseDouble(inputAmount.getText().toString()) * percent /100 ;
	    	showTip.setText("$" + String.format("%1$,.2f",tip));
    	}
    	else
    		inputAmount.setHint("Please enter total amount");
    		

	}


}
