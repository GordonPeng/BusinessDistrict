package com.risenb.business.ui;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Toast;

import com.lidroid.mutils.MUtils;
import com.lidroid.xutils.http.RequestParams;
import com.risenb.business.MyApplication;
import com.risenb.business.R;

/**
 * Presenter 基类
 * 
 * @author Administrator
 * 
 */
public abstract class PresenterBase
{
    protected FragmentActivity activity;
    protected MyApplication application;

    public FragmentActivity getActivity()
    {
        return activity;
    }

    public void setActivity(FragmentActivity activity)
    {
        this.activity = activity;
        application = (MyApplication) activity.getApplication();
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

    protected String getUrl(int id)
    {
        return getActivity().getResources().getString(R.string.service_host_address).concat(getActivity().getString(id));
    }

    protected RequestParams getRequestParams()
    {
        RequestParams params = new RequestParams(); // 默认编码UTF-8
        if (!TextUtils.isEmpty(application.getC()))
        {
            params.addBodyParameter("c", application.getC());
        }
        return params;
    }
}
