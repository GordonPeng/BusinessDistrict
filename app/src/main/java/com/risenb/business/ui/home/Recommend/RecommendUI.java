package com.risenb.business.ui.home.Recommend;

import android.widget.RelativeLayout;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * 推荐
 */
@ContentView(R.layout.recommend)
public class RecommendUI extends BaseUI {
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
}
