package com.codingblocks.planetpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(getIntent()!=null)
        {
            ImageView image=findViewById(R.id.image);
            TextView textView =findViewById(R.id.tv);
            TextView textView1=findViewById(R.id.tv1);
            Picasso.get().load(getIntent().getStringExtra("url")).into(image);
            textView.setText(getIntent().getStringExtra("title"));
            textView1.setText(getIntent().getStringExtra("subtitle"));

        }
    }
}
