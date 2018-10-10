package com.risenb.business.utils;

import java.io.UnsupportedEncodingException;

import org.apache.http.entity.StringEntity;

import android.text.TextUtils;

import com.lidroid.mutils.network.HttpBack;
import com.lidroid.xutils.http.RequestParams;
import com.risenb.business.MyApplication;
import com.risenb.business.beans.BaseBean;
import com.risenb.business.network.NetUtils;
import com.risenb.business.R;

/**
 * 调用接口
 */
public class NetworkUtils
{
    private static NetworkUtils networkUtils;
    protected MyApplication application;

    public static NetworkUtils getNetworkUtils()
    {
        if (networkUtils == null)
        {
            networkUtils = new NetworkUtils();
        }
        return networkUtils;
    }

    public void setApplication(MyApplication application)
    {
        this.application = application;
    }

    /**
     * 
     * @param httpBack
     */
    public void ValidCode(final HttpBack<BaseBean> httpBack)
    {
        RequestParams param = new RequestParams("UTF-8");
        if (!TextUtils.isEmpty(application.getC()))
        {
            param.addBodyParameter("c", application.getC());
        }
        param.addBodyParameter("", "");
        param.setHeader("", "");
        try
        {
            param.setBodyEntity(new StringEntity("", "UTF-8"));
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        String url = application.getResources().getString(R.string.service_host_address).concat(application.getString(R.string.defaulpage));
        NetUtils.getNetUtils().send(false, url, param, httpBack);
    }

}
