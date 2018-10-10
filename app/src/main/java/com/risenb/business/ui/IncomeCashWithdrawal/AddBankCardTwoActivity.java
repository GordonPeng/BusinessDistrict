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
 * 添加银行卡(Activity)
 */
public class AddBankCardTwoActivity extends BaseUI {

    @Bind(R.id.et_user_name)
    EditText etUserName;
    @Bind(R.id.et_user_card)
    EditText etUserCard;
    @Bind(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.add_bank_card_two_activity);
        ButterKnife.bind(this);
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

    @OnClick(R.id.btn_submit)
    public void onClick() {
    }
}
