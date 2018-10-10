package com.risenb.business.ui;

import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

import com.lidroid.mutils.MUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.risenb.business.R;

/**
 * 导航页
 *
 * @author Administrator
 */
@ContentView(R.layout.guide)
public class GuideUI extends BaseUI {
    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void onCreate() {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);// 去掉信息栏
    }

    @Override
    protected void setControlBasis() {
        setTitle("导航页");
        com.lidroid.mutils.MUtils.getMUtils().machineInformation();
    }

    @Override
    protected void prepareData() {
        if (!isTaskRoot()) {
            finish();
            return;
        }
        MUtils.getMUtils().getHandler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!isFinishing()) {
                    Intent intent = new Intent(getActivity(), TabUI.class);
                    startActivity(intent);
                }
            }
        }, 2000);
    }

    @Override
    public void onLoadOver() {

    }
}
