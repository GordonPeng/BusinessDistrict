package com.risenb.business.ui.Vip;

/**
 * 个人中心
 * Created by Administrator on 2016/7/12.
 */

import android.content.Intent;
import android.view.View;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.ui.PersonalInformation.BestBusinessCustomerFragmentActivity;

@ContentView(R.layout.vip)
public class VipUI extends BaseUI {


    @Override
    protected void back() {
        exit();
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

    //设置页面
    @OnClick(R.id.vip_set_ll)
    private void onSet(View view){
        Intent intent = new Intent(this,VipSetUI.class);
        startActivity(intent);
    }

    //查看排行榜
    @OnClick(R.id.linear_ranking)
    private void ranking(View view){
        startActivity(new Intent(VipUI.this, BestBusinessCustomerFragmentActivity.class));
    }
}