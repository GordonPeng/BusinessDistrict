package com.risenb.business.ui.IncomeCashWithdrawal;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by admin on 2016/7/21.
 * Tany
 * 选择付款方式(Activity)
 */
public class SelectPaymentMethodActivity extends BaseUI {

    @Bind(R.id.img_jianshe)
    ImageView imgJianshe;
    @Bind(R.id.txt_jianshe)
    TextView txtJianshe;
    @Bind(R.id.txt_jianshe_weihao)
    TextView txtJiansheWeihao;
    @Bind(R.id.relat_jianshe)
    RelativeLayout relatJianshe;
    @Bind(R.id.img_zhongguo)
    ImageView imgZhongguo;
    @Bind(R.id.txt_zhongguo)
    TextView txtZhongguo;
    @Bind(R.id.txt_zhongguo_weihao)
    TextView txtZhongguoWeihao;
    @Bind(R.id.relat_zhongguo)
    RelativeLayout relatZhongguo;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.select_payment_method_activity);
        ButterKnife.bind(this);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("选择付款方式");
        rightVisible(R.drawable.jiahao);
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }

    @OnClick({R.id.relat_jianshe, R.id.relat_zhongguo})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.relat_jianshe:
                break;
            case R.id.relat_zhongguo:
                break;
        }
    }
}
