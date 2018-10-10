package com.risenb.business.ui.PersonalInformation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.nineoldandroids.view.ViewHelper;
import com.risenb.business.R;
import com.risenb.business.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/7/22.
 */
public class BestBusinessCustomerFragmentActivity extends FragmentActivity {

    private ViewPager viewPager;
    private View tab;
    private TextView[] tabs;
    private int currentIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.best_business_customer_fragment_activity);
        initView();// 加载布局
    }

    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tab = findViewById(R.id.message_tab0);

        tabs = new TextView[2];
        tabs[0] = (TextView) findViewById(R.id.message_tv0);
        tabs[1] = (TextView) findViewById(R.id.message_tv1);

        List<Fragment> list = new ArrayList<Fragment>();
        list.add(new ThisWeekListFragment());// 本周排行榜
        list.add(new UniversalLeaderboardFragment());// 总排行榜

        viewPager.setAdapter(new MsgPageAdapter(getSupportFragmentManager(), list));
        // viewPager的滑动事件
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                tab.clearAnimation();
                tabs[currentIndex].setSelected(false);
                tabs[arg0].setSelected(true);
                currentIndex = arg0;
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                DisplayMetrics metrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(metrics);
                int num = CommonUtils.dip2px(BestBusinessCustomerFragmentActivity.this, 90);
                int width2 = tab.getWidth() + num;
                int w = (int) (arg1 * width2) + arg0 * width2;
                ViewHelper.setTranslationX(tab, w);
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

        currentIndex = 0;
        viewPager.setCurrentItem(currentIndex);
        tabs[currentIndex].setSelected(true);
    }

    // TabView的点击事件
    public void onTabClick(View v) {

        if (v.isSelected()) {
            return;
        }
        tabs[currentIndex].setSelected(false);
        int id = v.getId();
        switch (id) {
            case R.id.message_tv0:
                currentIndex = 0;
                break;
            case R.id.message_tv1:
                currentIndex = 1;
                break;
        }
        tabs[currentIndex].setSelected(true);
        viewPager.setCurrentItem(currentIndex, true);
    }

    static class MsgPageAdapter extends FragmentPagerAdapter {

        List<Fragment> list;

        public MsgPageAdapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @Override
        public Fragment getItem(int arg0) {
            return list.get(arg0);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
