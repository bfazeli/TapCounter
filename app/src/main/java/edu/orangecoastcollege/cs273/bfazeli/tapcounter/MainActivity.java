package edu.orangecoastcollege.cs273.bfazeli.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Associate the controller with the needed model
    Counter num = new Counter();

    Button tapButton;
    TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hook up the tapButton and countTextView with the one from the View
        tapButton = (Button) findViewById(R.id.tapButton);
        countTextView = (TextView) findViewById(R.id.countTextView);

        countTextView.setText(Integer.toString(num.getCount()));        //Display the current count when app loads, 0.

        // Set up an ActionListener for when the button is clicked
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.incrementCount();                        // Increment the count
                countTextView.setText(Integer.toString(num.getCount()));       // Display the updated count
            }
        });
    }
}
