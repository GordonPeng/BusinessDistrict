package com.risenb.business.ui.home.CrowdFunding;

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
import com.risenb.business.adapter.CrowdFundingAdapter;
import com.risenb.business.beans.BannerBean;
import com.risenb.business.ui.BaseUI;

import java.util.ArrayList;
import java.util.List;

/**
 * 众筹圈
 */
@ContentView(R.layout.crowdfunding)
public class CrowdFundingUI extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @ViewInject(R.id.vp_businessbanner)
    private ViewPager vp_businessbanner;
    @ViewInject(R.id.ll_businessbanner)
    private LinearLayout ll_businessbanner;
    @ViewInject(R.id.tv_businessbanner)
    private TextView tv_businessbanner;

    @ViewInject(R.id.crowdfun_mlv)
    private MyListView crowdfun_mlv ;

    private CrowdFundingAdapter crowdFundingAdapter ;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("众筹圈");
        rightVisible(R.drawable.crowdfunding_bangzhu);
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
        bannerUtils.setDefaultImg(R.drawable.crowdfunding_banner);
        bannerUtils.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
        bannerUtils.info();
        bannerUtils.start();
        crowdFundingAdapter = new CrowdFundingAdapter();
        crowdfun_mlv.setAdapter(crowdFundingAdapter);
        crowdfun_mlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 Intent intent = new Intent(getActivity(), CrowdFundingInfoUI.class);
                 startActivity(intent);
            }
        });
    }

    @Override
    public void onLoadOver() {

    }

    /**
     * 我要发布
     */
    @OnClick(R.id.crowdfun_myfabu_ll)
    private void myfabu(View view){
        Intent intent = new Intent(getActivity(), ReleaseUI.class);
        startActivity(intent);
    }

}
