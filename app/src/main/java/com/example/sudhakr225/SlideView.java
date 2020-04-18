package com.example.sudhakr225;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class SlideView extends AppCompatActivity {

    ViewPager viewPager;
    DotsIndicator dot1;
    SpringDotsIndicator dot2;
    WormDotsIndicator dot3;
    ViewAdapter viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_view);

        viewPager = findViewById(R.id.v_pager);
        dot1 = findViewById(R.id.dot1);
        dot2 = findViewById(R.id.dot2);
        dot3 = findViewById(R.id.dot3);

        viewAdapter = new ViewAdapter(this);
        viewPager.setAdapter(viewAdapter);
        dot1.setViewPager(viewPager);
        dot2.setViewPager(viewPager);
        dot3.setViewPager(viewPager);


    }
}
