package com.risenb.business.ui.home.Classification;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;

import com.lidroid.mutils.views.MyGridView;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.R;
import com.risenb.business.adapter.ClassifPinpaiGridAdapter;
import com.risenb.business.adapter.ClassifQuanbuGridAdapter;
import com.risenb.business.adapter.ClassificationInfoGridAdapter;
import com.risenb.business.ui.BaseUI;

/**
 * 商品分类
 */
@ContentView(R.layout.classificationinfo)
public class ClassificationInfo extends BaseUI {
    @ViewInject(R.id.back)
    private RelativeLayout back;

    @ViewInject(R.id.classification_info_mgv)
    private MyGridView classification_info_mgv ;

    private ClassificationInfoGridAdapter classificationInfoGridAdapter ;

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

        classificationInfoGridAdapter = new ClassificationInfoGridAdapter(2);
        classification_info_mgv.setAdapter(classificationInfoGridAdapter);
    }

    @Override
    public void onLoadOver() {

    }
}
