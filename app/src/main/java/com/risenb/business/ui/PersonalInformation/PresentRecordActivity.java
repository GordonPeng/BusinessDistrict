package com.risenb.business.ui.PersonalInformation;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * Created by admin on 2016/7/26.
 * Tany
 * 提现记录(Activity)
 */
public class PresentRecordActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.present_record_activity);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("提现记录");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
