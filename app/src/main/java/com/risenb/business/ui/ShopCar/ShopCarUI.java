package com.risenb.business.ui.ShopCar;

import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

@ContentView(R.layout.shopcar)
public class ShopCarUI extends BaseUI {

    @Override
    protected void back() {
        exit();
    }

    @Override
    protected void setControlBasis() {
        setTitle("购物车");
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
