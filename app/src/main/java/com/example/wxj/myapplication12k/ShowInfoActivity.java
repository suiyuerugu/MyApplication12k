package com.example.wxj.myapplication12k;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {
    private ImageView showImage;
    private TextView showTittle, showZhuliao, showFuliao, showPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        showImage=(ImageView)findViewById(R.id.show_image);
        showTittle=(TextView)findViewById(R.id.show_tittle);
        showZhuliao=(TextView)findViewById(R.id.show_zhuliao);
        showFuliao=(TextView)findViewById(R.id.show_fuliao);
        showPrice=(TextView)findViewById(R.id.show_price);

        Intent intent=getIntent();
        showImage.setImageResource(intent.getIntExtra("image1",1));
        showTittle.setText(intent.getStringExtra("tittle1"));
        showZhuliao.setText(intent.getStringExtra("zhuliao1"));
        showFuliao.setText(intent.getStringExtra("fuliao1"));
        showPrice.setText(intent.getStringExtra("price1"));
    }
}
