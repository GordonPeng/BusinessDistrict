package com.risenb.business.ui.web;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.webkit.WebView;

import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.R;
import com.risenb.business.ui.web.WebP.WebFace;

@SuppressLint("SetJavaScriptEnabled")
@ContentView(R.layout.web)
public class WebUI extends BaseUI implements WebFace {
    @ViewInject(R.id.wv_web)
    private WebView wv_web;

    private WebP presenter;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        isDestroy = false;
        setTitle(getIntent().getStringExtra("title"));
    }

    @Override
    protected void prepareData() {
        presenter = new WebP(this, getActivity());
        presenter.bind(wv_web);
    }

    @Override
    public void onLoadOver() {

    }

    /**
     * 返回文件选择
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        presenter.onActivityResult(requestCode, resultCode, intent);
    }

}
