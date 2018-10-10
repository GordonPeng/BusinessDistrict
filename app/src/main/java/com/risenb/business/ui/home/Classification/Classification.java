package com.risenb.business.ui.home.Classification;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;

import com.lidroid.mutils.adapter.OnItemGridClickListener;
import com.lidroid.mutils.views.MyGridView;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.R;
import com.risenb.business.adapter.ClassifPinpaiGridAdapter;
import com.risenb.business.adapter.ClassifQuanbuGridAdapter;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.ui.ZUI;

/**
 * 商品分类
 */
@ContentView(R.layout.classification)
public class Classification extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @ViewInject(R.id.pinpai_classif_mgv)
    private MyGridView pinpaiGridView;

    @ViewInject(R.id.quanbu_classif_mgv)
    private MyGridView quanbuGridView;

    private ClassifQuanbuGridAdapter quanbuGridAdapter;
    private ClassifPinpaiGridAdapter pinpaiGridAdapter;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("商品分类");
    }

    @Override
    protected void prepareData() {
        // Intent intent = new Intent(getActivity(), ZUI.class);
        // startActivity(intent);
        pinpaiGridAdapter = new ClassifPinpaiGridAdapter(4);
        quanbuGridAdapter = new ClassifQuanbuGridAdapter(4);

        pinpaiGridView.setAdapter(pinpaiGridAdapter);
        quanbuGridView.setAdapter(quanbuGridAdapter);

        pinpaiGridAdapter.setOnItemGridClickListener(new OnItemGridClickListener() {
            @Override
            public void OnItemClick(Object o, int i) {
                Intent intent = new Intent(Classification.this, ClassificationInfo.class);
                startActivity(intent);
            }
        });

        quanbuGridAdapter.setOnItemGridClickListener(new OnItemGridClickListener() {
            @Override
            public void OnItemClick(Object o, int i) {
                Intent intent = new Intent(Classification.this, ClassificationInfo.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onLoadOver() {

    }
}
