package com.risenb.business.ui.home;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lidroid.mutils.banner.BannerUtils;
import com.lidroid.mutils.views.MyGridView;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.adapter.HomeGridAdapter;
import com.risenb.business.beans.BannerBean;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.R;
import com.risenb.business.ui.Vip.VipSetNewsPassUI;
import com.risenb.business.ui.home.Business.BusinessUI;
import com.risenb.business.ui.home.Classification.Classification;
import com.risenb.business.ui.home.CrowdFunding.CrowdFundingUI;
import com.risenb.business.ui.home.Location.PositionUI;
import com.risenb.business.ui.login.LoginUI;

/**
 * 首页
 */
@ContentView(R.layout.home)
public class HomeUI extends BaseUI
{
    @ViewInject(R.id.vp_banner)
    private ViewPager vp_banner;

    @ViewInject(R.id.ll_banner)
    private LinearLayout ll_banner;

    @ViewInject(R.id.tv_banner)
    private TextView tv_banner;

    @ViewInject(R.id.home_gv)
    private MyGridView home_gv;
    private HomeGridAdapter homeGridAdapter ;

    @Override
    protected void back()
    {
        exit();
    }

    @Override
    protected void setControlBasis()
    {
        setTitle("首页");
        backGone();
    }

    @Override
    protected void prepareData()
    {
        homeGridAdapter = new HomeGridAdapter(2);
        home_gv.setAdapter(homeGridAdapter);
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);

        List<BannerBean> list = new ArrayList<BannerBean>();
        list.add(new BannerBean());
        list.add(new BannerBean());
        list.add(new BannerBean());
        BannerUtils<BannerBean> bannerUtils = new BannerUtils<BannerBean>();
        bannerUtils.setActivity(getActivity());
        bannerUtils.setViewPager(vp_banner);
        bannerUtils.setDianGroup(ll_banner);
        bannerUtils.setTextView(tv_banner);
        bannerUtils.setList(list);
        bannerUtils.setDefaultImg(R.drawable.banner);
        bannerUtils.setOnItemClickListener(new OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
            {

            }
        });
        bannerUtils.info();
        bannerUtils.start();
    }

    @Override
    public void onLoadOver() {

    }

    /**
     * 跳转登录
     * @param view
     */
    @OnClick(R.id.home_head_portrait)
    private void startLogin(View view){
        Intent intent = new Intent(this, LoginUI.class);
        startActivity(intent);
    }

    /**
     * 生意圈
     */
    @OnClick(R.id.home_shengyiquan_ll)
    private void shengyiquan(View view){
        Intent intent = new Intent(this, BusinessUI.class);
        startActivity(intent);
    }
    /**
     * 众筹圈
     */
    @OnClick(R.id.home_zhongchouquan_ll)
    private void zhongchou(View view){
        Intent intent = new Intent(this, CrowdFundingUI.class);
        startActivity(intent);
    }
    /**
     * 商品分类
     */
    @OnClick(R.id.home_fenlei_ll)
    private void fenlei(View view){
        Intent intent = new Intent(this, Classification.class);
        startActivity(intent);
    }
    /**
     * 位置
     */
    @OnClick(R.id.home_city)
    private void location(View view){
        Intent intent = new Intent(this, PositionUI.class);
        startActivity(intent);
    }

}
