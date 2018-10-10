package com.risenb.business.ui.PersonalInformation;

import android.view.View;
import android.widget.RelativeLayout;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by admin on 2016/7/26.
 * Tany
 * 发展合伙人(Activity)
 */
public class PartnersDevelopmentActivity extends BaseUI{

    @Bind(R.id.back)
    RelativeLayout back;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.partners_development_activity);
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
