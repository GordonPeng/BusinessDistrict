package com.risenb.business.ui.IncomeCashWithdrawal;

import android.widget.TextView;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by admin on 2016/7/19.
 * Tany
 * 收入明细(Activity)
 */
public class IncomeDetailActivity extends BaseUI {

    @Bind(R.id.txt_income)
    TextView txtIncome;
    @Bind(R.id.txt_tixian)
    TextView txtTixian;
    @Bind(R.id.txt_income_one)
    TextView txtIncomeOne;
    @Bind(R.id.txt_income_two)
    TextView txtIncomeTwo;
    @Bind(R.id.txt_income_firee)
    TextView txtIncomeFiree;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.income_detail_activity);
        ButterKnife.bind(this);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("收入明细");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }
}
