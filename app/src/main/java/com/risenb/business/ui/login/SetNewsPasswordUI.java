package com.risenb.business.ui.login;

import android.view.View;
import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * 设置新密码
 */
@ContentView(R.layout.login_setnewspassword)
public class SetNewsPasswordUI extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("设置新密码");
    }

    @Override
    protected void prepareData() {
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
    }

    @Override
    public void onLoadOver() {

    }

    //完成
    @OnClick(R.id.login_forget_ok_tv)
    private void submit(View view){
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
        finish();
    }

}
