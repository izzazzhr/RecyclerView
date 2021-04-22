package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SmurfDetails extends AppCompatActivity {

    public final static String name = "SMURFS_NAME";
    public final static String summary = "SMURFS_SUMMARY";
    public final static String photo = "SMURFS_PHOTO";

    private ImageView iv_photo;
    private TextView tv_name;
    private TextView tv_summary;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smurf_details);

        iv_photo = findViewById(R.id.iv_detail);
        tv_name = findViewById(R.id.tv_detailName);
        tv_summary = findViewById(R.id.tv_detailSummary);

        iv_photo.setImageResource(getIntent().getIntExtra(photo, 0));
        tv_name.setText(getIntent().getStringExtra(name));
        tv_summary.setText(getIntent().getStringExtra(summary));

    }

    public void backButton(View view) {
        Intent back = new Intent(SmurfDetails.this, MainActivity.class);
        startActivity(back);
    }
}