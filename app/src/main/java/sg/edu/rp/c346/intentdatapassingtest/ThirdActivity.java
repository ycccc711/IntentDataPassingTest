package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvchar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvchar = findViewById(R.id.tvAns3);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value",' ' );
        tvchar.setText("Character value received is: " +value);

    }
}
