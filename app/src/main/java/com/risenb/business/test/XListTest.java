package com.risenb.business.test;

import com.lidroid.mutils.xlist.XListView;
import com.lidroid.mutils.xlist.XListView.IXListViewListener;
import com.lidroid.xutils.view.annotation.ContentView;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.R;

@ContentView(R.layout.zzz)
public class XListTest extends BaseUI implements IXListViewListener {

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
        final XListView mlv = new XListView(getActivity());
        mlv.setXListViewListener(this);
    }

    @Override
    public void onLoadOver() {

    }

    @Override
    public void onLoad(int page) {

    }

}
