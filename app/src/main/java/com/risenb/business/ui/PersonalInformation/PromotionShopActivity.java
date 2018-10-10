package com.risenb.business.ui.PersonalInformation;

import android.view.View;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.OnClick;

/**
 * Created by admin on 2016/7/26.
 * Tany
 * 推广小店(Activity)
 */
public class PromotionShopActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.promotion_shop_activity);
    }

    @Override
    protected void back() {

    }

    @Override
    protected void setControlBasis() {

    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }

    @OnClick(R.id.back)
    public void onclick(View view){
        finish();
    }
}
