package com.risenb.business.ui.IncomeCashWithdrawal;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * Created by admin on 2016/7/21.
 * Tany
 * 添加成功(Activity)
 */
public class AddSuccessActivity extends BaseUI{

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.add_bank_card_activity);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("添加银行卡");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
