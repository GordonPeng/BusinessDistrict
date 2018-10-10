package com.risenb.business.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.lidroid.xutils.ViewUtils;
import com.risenb.business.MyApplication;

/**
 * 描述：自定义Fragment
 * 
 * @author wangjian
 * 
 */
public abstract class BaseFragment extends Fragment
{
    /** 视图 */
    protected View view;
    protected LayoutInflater inflater;
    protected MyApplication application = null;

    /**
     * 描述：创建
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    /**
     * 描述：加载视图
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        loadViewLayout(inflater, container);
        application = (MyApplication) getActivity().getApplication();
        ViewUtils.inject(this, view);
        setControlBasis();
        prepareData();
        return view;
    }

    /**
     * 描述：跳转页面
     * 
     * @param intent
     */
    public void startActivity(Intent intent)
    {
        getActivity().startActivity(intent);
    }

    protected View findViewById(int id)
    {
        return view.findViewById(id);
    }

    /**
     * 
     * 描述：toast提示
     * 
     * @param msg
     */
    protected void makeText(String msg)
    {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 描述：加载视图
     */
    protected abstract void loadViewLayout(LayoutInflater inflater, ViewGroup container);

    /**
     * 描述：设置控件基础
     */
    protected abstract void setControlBasis();

    /**
     * 描述：准备数据
     */
    protected abstract void prepareData();

}
