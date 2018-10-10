package com.risenb.business.ui.PersonalInformation;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * Created by admin on 2016/7/25.
 * Tany
 * 我的积分(Activity)
 */
public class MyPointsActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.my_points_activity);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("我的积分");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
