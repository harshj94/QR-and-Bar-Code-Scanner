package jain.barcodereader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView=(TextView)findViewById(R.id.result);
        textView.setText(getIntent().getStringExtra("data"));
    }
}
