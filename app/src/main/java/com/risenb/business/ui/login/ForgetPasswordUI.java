package com.risenb.business.ui.login;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * 忘记密码
 */
@ContentView(R.layout.login_forgetpassword)
public class ForgetPasswordUI extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("找回密码");
    }

    @Override
    protected void prepareData() {
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
    }

    @Override
    public void onLoadOver() {

    }

    //跳转设置新密码
    @OnClick(R.id.login_forget_submit_tv)
    private void submit(View view) {
        Intent intent = new Intent(getActivity(), SetNewsPasswordUI.class);
        startActivity(intent);
        finish();
    }

}
