package com.risenb.business.ui.IncomeCashWithdrawal;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.views.AlertDialog;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by admin on 2016/7/22.
 * Tany
 * 银行卡详情(Activity)
 */
public class BankCardDetailsActivity extends BaseUI {

    @Bind(R.id.img_jianshe)
    ImageView imgJianshe;
    @Bind(R.id.txt_jianshe)
    TextView txtJianshe;
    @Bind(R.id.txt_jianshe_weihao)
    TextView txtJiansheWeihao;
    @Bind(R.id.tv_right)
    TextView tvright;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.bank_card_details_activity);
        ButterKnife.bind(this);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("银行卡详情");
        rightVisible("删除");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }

    @OnClick(R.id.tv_right)
    public void onclick(View v){
        // 删除银行卡
        new AlertDialog(BankCardDetailsActivity.this).builder().setTitle("删除")
                .setMsg("确定要删除银行卡？")
                .setPositiveButton("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).setNegativeButton("取消", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
    }
}
