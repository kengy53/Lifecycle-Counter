package com.papaalegredoriadelarosa.sedillo_lifecycle_counter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    // instance variables
    private int count = 0;
    private TextView countText;
    private Button countButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = findViewById(R.id.count_text);
        countButton = findViewById(R.id.count_button);

        // screen rotation
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
        }

        countText.setText("Kengy's Count: " + count);
        // set a click listener
        countButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                count++;
                countText.setText("Kengy's Count: " + count);
            }
        });
    }

    private static final String TAG = "Sedillo";

    @Override
    protected void onStart() {
        super.onStart(); Log.d(TAG, "onStart");;
    }
    @Override
    protected void onResume() {
        super.onResume(); Log.d(TAG, "onResume");;
    }
    @Override
    protected void onPause() {
        super.onPause(); Log.d(TAG, "onPause");;
    }
    @Override
    protected void onStop() {
        super.onStop(); Log.d(TAG, "onStop");;
    }
    @Override
    protected void onRestart() {
        super.onRestart(); Log.d(TAG, "onRestart");;
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
}