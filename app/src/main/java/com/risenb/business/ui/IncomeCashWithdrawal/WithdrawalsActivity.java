package com.risenb.business.ui.IncomeCashWithdrawal;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by admin on 2016/7/20.
 * Tany
 * 提现(Avtivity)
 */
public class WithdrawalsActivity extends BaseUI {

    @Bind(R.id.txt_bank_type)
    TextView txtBankType;
    @Bind(R.id.relat_add_bank)
    RelativeLayout relatAddBank;
    @Bind(R.id.img_weixin)
    ImageView imgWeixin;
    @Bind(R.id.relat_weixin)
    RelativeLayout relatWeixin;
    @Bind(R.id.img_zhifubao)
    ImageView imgZhifubao;
    @Bind(R.id.relat_zhifubao)
    RelativeLayout relatZhifubao;
    @Bind(R.id.et_money)
    EditText etMoney;
    @Bind(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.withdrawals_activity);
        ButterKnife.bind(this);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("提现");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }

    @OnClick({R.id.relat_add_bank, R.id.relat_weixin, R.id.relat_zhifubao, R.id.btn_submit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.relat_add_bank:
                break;
            case R.id.relat_weixin:
                break;
            case R.id.relat_zhifubao:
                break;
            case R.id.btn_submit:
                break;
        }
    }
}
