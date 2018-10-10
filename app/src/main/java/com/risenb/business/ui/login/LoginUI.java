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
 * 登陆
 */
@ContentView(R.layout.login)
public class LoginUI extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("");
    }

    @Override
    protected void prepareData() {
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
    }

    @Override
    public void onLoadOver() {

    }
    //忘记密码
    @OnClick(R.id.login_forget_tv)
    private void forget(View view){
        Intent intent = new Intent(getActivity(), ForgetPasswordUI.class);
        startActivity(intent);
    }
    //注册
    @OnClick(R.id.login_register_tv)
    private void register(View view){
        Intent intent = new Intent(getActivity(), RegisterUI.class);
        startActivity(intent);
    }

}
