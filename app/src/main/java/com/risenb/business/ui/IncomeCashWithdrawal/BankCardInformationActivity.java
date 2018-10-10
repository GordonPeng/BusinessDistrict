package com.risenb.business.ui.IncomeCashWithdrawal;

import android.widget.Button;
import android.widget.EditText;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by admin on 2016/7/21.
 * Tany
 * 填写银行卡信息(Activity)
 */
public class BankCardInformationActivity extends BaseUI {

    @Bind(R.id.et_card_type)
    EditText etCardType;
    @Bind(R.id.et_user_phone)
    EditText etUserPhone;
    @Bind(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.bank_card_information_activity);
        ButterKnife.bind(this);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("填写银行卡信息");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }

    @OnClick(R.id.btn_submit)
    public void onClick() {
    }
}
