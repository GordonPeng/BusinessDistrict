package com.risenb.business.ui.PersonalInformation;

import com.risenb.business.ui.BaseUI;

/**
 * Created by admin on 2016/7/25.
 * Tany
 * 我的小店(Activity)
 */
public class MyLittleShopActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();

    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("我的小店");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
