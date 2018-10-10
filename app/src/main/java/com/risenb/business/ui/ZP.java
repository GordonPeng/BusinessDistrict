package com.risenb.business.ui;

import android.support.v4.app.FragmentActivity;

import com.lidroid.mutils.network.HttpBack;
import com.lidroid.mutils.utils.Utils;
import com.risenb.business.beans.BaseBean;
import com.risenb.business.utils.NetworkUtils;

public class ZP extends PresenterBase
{
    private ZP presenter;

    private ZFace face;

    public ZP(ZFace face, FragmentActivity activity)
    {
        this.face = face;
        setActivity(activity);
        bind();// 传入要实现的view
    }

    public void bind()// 将数据与view结合起来
    {
        Utils.getUtils().showProgressDialog(getActivity(), null);
        NetworkUtils.getNetworkUtils().ValidCode(new HttpBack<BaseBean>()
        {
            @Override
            public void onSuccess(BaseBean baseBean)
            {

            }

            @Override
            public void onFailure(String tag, String msg)
            {
                makeText(msg);
            }

            @Override
            public void onHttpOver()
            {
                Utils.getUtils().dismissDialog();
            }
        });
    }

    public interface ZFace
    {
        public void setText();
    }
}
