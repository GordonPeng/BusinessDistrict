package com.risenb.business.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lidroid.mutils.MUtils;
import com.lidroid.mutils.utils.CrashHandler;
import com.lidroid.mutils.utils.LoadOver;
import com.lidroid.mutils.utils.Log;
import com.lidroid.mutils.utils.OnLoadOver;
import com.lidroid.mutils.utils.UIManager;
import com.lidroid.xutils.ViewUtils;
import com.risenb.business.MyApplication;
import com.risenb.business.R;

/**
 * 描述：自定义Activity
 * 
 * @author wangjian
 * 
 */
public abstract class BaseUI extends FragmentActivity implements OnLoadOver
{
    private long exitTime = 0;
    protected MyApplication application;
    private boolean isContentView = false;
    protected boolean isDestroy = true;

    /**
     * 描述：返回
     */
    protected abstract void back();

    /**
     * 描述：设置控件基础
     */
    protected abstract void setControlBasis();

    /**
     * 描述：准备数据
     */
    protected abstract void prepareData();

    /**
     * 描述：创建
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        CrashHandler.getInstance().init(getActivity());
        onCreate();
        ViewUtils.inject(this);
        application = (MyApplication) getApplication();
        Log.mem();
        UIManager.getInstance().pushActivity(this);
        new LoadOver(getActivity(), this);
        setControlBasis();
        RelativeLayout back = (RelativeLayout) findViewById(R.id.back);
        if (back != null)
        {
            back.setOnClickListener(new OnClickListener()
            {
                @Override
                public void onClick(View arg0)
                {
                    back();
                }
            });
        }
        prepareData();
    }

    @Override
    protected void onDestroy()
    {
        if (isDestroy)
        {
            UIManager.getInstance().popActivity(getClass());
        }
        super.onDestroy();
    }

    protected void onCreate()
    {

    }

    @Override
    public void setContentView(int layoutResID)
    {
        if (!isContentView)
        {
            isContentView = true;
            super.setContentView(layoutResID);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN)
        {
            back();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected FragmentActivity getActivity()
    {
        return BaseUI.this;
    }

    /**
     * 描述：退出程序
     */
    protected void exit()
    {
        if ((System.currentTimeMillis() - exitTime) > 2000)
        {
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        }
        else
        {
            UIManager.getInstance().popAllActivity();
        }
    }

    /**
     * 描述：设置标题
     * 
     * @param text
     *            标题
     */
    protected void setTitle(String text)
    {
        TextView tv_title = (TextView) findViewById(R.id.title);
        if (tv_title != null)
        {
            tv_title.setText(text);
        }
    }

    /**
     * 描述:隐藏返回按钮
     */
    protected void backGone()
    {
        RelativeLayout back = (RelativeLayout) findViewById(R.id.back);
        if (back != null)
        {
            back.setVisibility(View.GONE);
        }
    }

    /**
     * 描述:显示左菜单全部
     */
    protected void leftVisible(String title, int drawable)
    {
        backGone();
        leftVisible(title);
        leftVisible(drawable);
    }

    /**
     * 描述:显示左菜单文字
     */
    protected void leftVisible(String title)
    {
        LinearLayout ll_left = (LinearLayout) findViewById(R.id.ll_left);
        if (ll_left != null)
        {
            ll_left.setVisibility(View.VISIBLE);
        }
        TextView tv_left = (TextView) findViewById(R.id.tv_left);
        if (tv_left != null)
        {
            tv_left.setVisibility(View.VISIBLE);
            tv_left.setText(title);
        }
    }

    /**
     * 描述:显示左菜单图片
     */
    protected void leftVisible(int drawable)
    {
        LinearLayout ll_left = (LinearLayout) findViewById(R.id.ll_left);
        if (ll_left != null)
        {
            ll_left.setVisibility(View.VISIBLE);
        }
        ImageView iv_left = (ImageView) findViewById(R.id.iv_left);
        if (iv_left != null)
        {
            iv_left.setVisibility(View.VISIBLE);
            iv_left.setImageResource(drawable);
        }
    }

    /**
     * 描述:显示右菜单全部
     */
    protected void rightVisible(String title, int drawable)
    {
        rightVisible(title);
        rightVisible(drawable);
    }

    /**
     * 描述:显示右菜单文字
     */
    protected void rightVisible(String title)
    {
        LinearLayout ll_right = (LinearLayout) findViewById(R.id.ll_right);
        if (ll_right != null)
        {
            ll_right.setVisibility(View.VISIBLE);
        }
        TextView tv_right = (TextView) findViewById(R.id.tv_right);
        if (tv_right != null)
        {
            tv_right.setVisibility(View.VISIBLE);
            tv_right.setText(title);
        }
    }

    /**
     * 描述:显示右菜单图片
     */
    protected void rightVisible(int drawable)
    {
        LinearLayout ll_right = (LinearLayout) findViewById(R.id.ll_right);
        if (ll_right != null)
        {
            ll_right.setVisibility(View.VISIBLE);
        }
        ImageView iv_right = (ImageView) findViewById(R.id.iv_right);
        if (iv_right != null)
        {
            iv_right.setVisibility(View.VISIBLE);
            iv_right.setImageResource(drawable);
        }
    }

    protected void makeText(final String content)
    {
        MUtils.getMUtils().getHandler().post(new Runnable()
        {
            @Override
            public void run()
            {
                Toast.makeText(getActivity(), content, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
