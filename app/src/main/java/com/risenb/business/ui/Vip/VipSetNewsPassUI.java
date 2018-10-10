package com.risenb.business.ui.Vip;

/**
 * 设置新密码
 * Created by Administrator on 2016/7/12.
 */

import android.content.Intent;
import android.view.View;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

@ContentView(R.layout.vipsetnewspass)
public class VipSetNewsPassUI extends BaseUI {


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

}