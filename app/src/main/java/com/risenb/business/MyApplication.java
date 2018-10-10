package com.risenb.business;

import android.app.Application;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.lidroid.mutils.MUtils;
import com.lidroid.mutils.utils.Log;
import com.risenb.business.beans.UserBean;
import com.risenb.business.utils.ErrorUtils;
import com.risenb.business.utils.ImageLoaderUtils;
import com.risenb.business.utils.MyConfig;
import com.risenb.business.utils.NetworkUtils;

public class MyApplication extends Application
{
    /** 根目录 */
    private String path;

    @Override
    public void onCreate()
    {
        super.onCreate();
        path = MUtils.getMUtils().getPath(this);
        Log.setDebug(!MyConfig.SIGN.equals(MUtils.getMUtils().getSignature()));
        Log.e("path = " + path);
        Log.e(MUtils.getMUtils().getSignature());
        ImageLoaderUtils.initImageLoader(this);
        NetworkUtils.getNetworkUtils().setApplication(this);
        ErrorUtils.info();
    }

    public String getPath()
    {
        return path;
    }

    public String getC()
    {
        return MUtils.getMUtils().getShared("c");
    }

    public void setC(String c)
    {
        MUtils.getMUtils().setShared("c", c);
    }

    public void setUserBean(UserBean userBean)
    {
        setC(userBean.getC());
        MUtils.getMUtils().setShared("UserBean", JSONObject.toJSONString(userBean));
    }

    public UserBean getUserBean()
    {
        String str = MUtils.getMUtils().getShared("UserBean");
        if (!TextUtils.isEmpty(str))
        {
            try
            {
                return JSONObject.parseObject(str, UserBean.class);
            }
            catch (Exception e)
            {

            }
        }
        return null;
    }

    public boolean getOne()
    {
        boolean isOne = "".equals(MUtils.getMUtils().getShared("one"));
        MUtils.getMUtils().setShared("one", "false");
        return isOne;
    }
}
