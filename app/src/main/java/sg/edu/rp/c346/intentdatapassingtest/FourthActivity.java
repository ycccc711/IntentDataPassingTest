package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAns4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAns4 = findViewById(R.id.tvAns4);
        Intent intent = getIntent();
        double value = intent.getDoubleExtra("value",0.0);
        tvAns4.setText("Double value received is: "+value);
    }
}
