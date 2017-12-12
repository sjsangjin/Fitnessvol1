package com.example.sjhan.healthai;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.sjhan.healthai.Adapter.PagerAdapter;
import com.example.sjhan.healthai.Util.ActivityUtil;


public class TabActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        ActivityUtil.setActionBarColor(this, R.color.colorAccent);


        TabLayout tabLayout=(TabLayout)findViewById(R.id.tab_layout);

        // 탭 텍스트
        tabLayout.addTab(tabLayout.newTab().setText("가슴"));
        tabLayout.addTab(tabLayout.newTab().setText("등"));
        tabLayout.addTab(tabLayout.newTab().setText("하체"));
        tabLayout.addTab(tabLayout.newTab().setText("스트레칭"));
        tabLayout.setTabTextColors(Color.BLACK, Color.parseColor("#000000"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.setBackgroundColor(getColor(R.color.click));


        final ViewPager viewPager=(ViewPager)findViewById(R.id.pager); //viewPager 찾기
        PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount()); //adpater 찾기
        viewPager.setAdapter(adapter);
        //탭 동기화
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        }); //end tabLayout.setOnTabSelectedListener

    } //end onCreate

} //end MainActivity

