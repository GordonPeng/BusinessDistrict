package com.risenb.business.network;

import com.lidroid.mutils.network.MUtilsHttpUtils;
import com.lidroid.xutils.http.client.HttpRequest;
import com.risenb.business.beans.BaseBean;

/**
 * @author 作者: wangjian
 * @version 创建时间：2015年9月21日 上午10:23:15
 * @类说明 联网二次封装
 */
public class NetUtils extends MUtilsHttpUtils<BaseBean>
{
    private static NetUtils netUtils;

    public static NetUtils getNetUtils()
    {
        if (netUtils == null)
        {
            netUtils = new NetUtils();
        }
        return netUtils;
    }

    public NetUtils()
    {
        super(BaseBean.class, 10000, 100, HttpRequest.HttpMethod.GET, true);
    }
}
