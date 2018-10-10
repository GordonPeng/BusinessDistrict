package com.risenb.business.ui.IncomeCashWithdrawal;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by admin on 2016/7/20.
 * Tany
 * 添加银行卡(Activity)
 */
public class AddBankCardActivity extends BaseUI {

    @Bind(R.id.txt_user_phone)
    TextView txtUserPhone;
    @Bind(R.id.et_code)
    EditText etCode;
    @Bind(R.id.txt_send_code)
    TextView txtSendCode;
    @Bind(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.add_bank_card_activity);
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
}
