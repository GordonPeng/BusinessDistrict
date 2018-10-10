package com.risenb.business.ui.PersonalInformation;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * Created by admin on 2016/7/22.
 * Tany
 * 购买合伙人(Activity)
 */
public class PurchasingPartnerActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.purchasing_partner_activity);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
