package com.risenb.business.ui.home.Business;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lidroid.mutils.banner.BannerUtils;
import com.lidroid.mutils.views.MyListView;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.R;
import com.risenb.business.adapter.HomeBusinessAdapter;
import com.risenb.business.beans.BannerBean;
import com.risenb.business.ui.BaseUI;

import java.util.ArrayList;
import java.util.List;

/**
 * s生意圈
 */
@ContentView(R.layout.business)
public class BusinessUI extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @ViewInject(R.id.vp_businessbanner)
    private ViewPager vp_businessbanner;
    @ViewInject(R.id.ll_businessbanner)
    private LinearLayout ll_businessbanner;
    @ViewInject(R.id.tv_businessbanner)
    private TextView tv_businessbanner;

    @ViewInject(R.id.home_business_mlv)
    private MyListView home_business_mlv ;

    private HomeBusinessAdapter homeBusinessAdapter ;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("生意圈");
    }

    @Override
    protected void prepareData() {
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
        List<BannerBean> list = new ArrayList<BannerBean>();
        list.add(new BannerBean());
        list.add(new BannerBean());
        list.add(new BannerBean());
        BannerUtils<BannerBean> bannerUtils = new BannerUtils<BannerBean>();
        bannerUtils.setActivity(getActivity());
        bannerUtils.setViewPager(vp_businessbanner);
        bannerUtils.setDianGroup(ll_businessbanner);
        bannerUtils.setTextView(tv_businessbanner);
        bannerUtils.setList(list);
        bannerUtils.setDefaultImg(R.drawable.home_business_banner);
        bannerUtils.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
        bannerUtils.info();
        bannerUtils.start();

        homeBusinessAdapter = new HomeBusinessAdapter();
        home_business_mlv.setAdapter(homeBusinessAdapter);
        home_business_mlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Intent intent = new Intent(getActivity(), BusinessInfoUI.class);
                 startActivity(intent);
            }
        });
    }

    @Override
    public void onLoadOver() {

    }

    /**
     * 分类按钮
     * @param view
     */
    @OnClick(R.id.iv_classification_business)
    private void classification(View view){

    }

}
