package com.risenb.business.ui.PersonalInformation;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by admin on 2016/7/22.
 * Tany
 * 会员设置(Activity)
 */
public class MemberSettingActivity extends BaseUI {

    @Bind(R.id.img_user_icon)
    ImageView imgUserIcon;
    @Bind(R.id.relat_user_icon)
    RelativeLayout relatUserIcon;
    @Bind(R.id.et_user_nick)
    EditText etUserNick;
    @Bind(R.id.et_xiaodian_title)
    EditText etXiaodianTitle;
    @Bind(R.id.btn_submit)
    Button btnSubmit;

    @Override
    protected void onCreate() {
        super.onCreate();
        setContentView(R.layout.member_setting_activity);
        ButterKnife.bind(this);
    }

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("会员设置");
    }

    @Override
    protected void prepareData() {

    }

    @Override
    public void onLoadOver() {

    }

    @OnClick({R.id.relat_user_icon, R.id.btn_submit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.relat_user_icon:
                break;
            case R.id.btn_submit:
                break;
        }
    }
}
