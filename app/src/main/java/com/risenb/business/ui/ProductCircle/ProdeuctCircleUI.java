package com.risenb.business.ui.ProductCircle;

import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * 产品圈
 */
@ContentView(R.layout.prodeuctcircle)
public class ProdeuctCircleUI extends BaseUI {

    @Override
    protected void back() {
        exit();
    }

    @Override
    protected void setControlBasis() {
        setTitle("产品圈");
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
