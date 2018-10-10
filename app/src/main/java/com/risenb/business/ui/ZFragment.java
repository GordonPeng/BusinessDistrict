package com.risenb.business.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.risenb.business.R;

public class ZFragment extends BaseFragment
{

    @Override
    protected void loadViewLayout(LayoutInflater inflater, ViewGroup container)
    {
        this.inflater = inflater;
        view = inflater.inflate(R.layout.zzz, container, false);
    }

    @Override
    protected void setControlBasis()
    {

    }

    @Override
    protected void prepareData()
    {

    }

}
