package edu.orangecoastcollege.cs273.bfazeli.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Associate the controller with the needed model
    Counter num = new Counter();

    Button tapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num.getCount();              //Display the current count when app loads, 0.


        // Hook up the tapButton with the one from the View
        tapButton = (Button) findViewById(R.id.tapButton);

        // Set up an ActionListener for when the button is clicked
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.incrementCount();
            }
        });
    }
}
