package com.risenb.business.ui.PersonalInformation;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * Created by admin on 2016/7/25.
 * Tany
 * 兑换记录(Activity)
 */
public class ExchangeRecordActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.exchange_record_activity);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("兑换记录");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
