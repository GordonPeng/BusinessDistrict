package com.risenb.business.ui.Vip;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * 检测更新
 */

@ContentView(R.layout.vipsetupdating)
public class VipSetUpdatingUI extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("检测更新");
    }

    @Override
    protected void prepareData() {
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
    }

    @Override
    public void onLoadOver() {

    }

    //设置新密码
    @OnClick(R.id.vip_set_newpassword_ll)
    private void newPassword(View view) {
        Intent intent = new Intent(this, VipSetNewsPassUI.class);
        startActivity(intent);
    }

    //意见反馈
    @OnClick(R.id.vip_set_feedback_ll)
    private void newFeedback(View view) {
        Intent intent = new Intent(this, VipSetFeedbackUI.class);
        startActivity(intent);
    }


}
