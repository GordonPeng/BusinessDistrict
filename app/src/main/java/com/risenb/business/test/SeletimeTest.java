package com.risenb.business.test;

import android.widget.TextView;

import com.lidroid.mutils.seletime.OnDateCallback;
import com.lidroid.mutils.seletime.PopTime;
import com.risenb.business.ui.BaseUI;

public class SeletimeTest extends BaseUI
{

    @Override
    protected void back()
    {
        finish();
    }

    @Override
    protected void setControlBasis()
    {
        setTitle("");
    }

    @Override
    protected void prepareData()
    {
        final TextView title = new TextView(getActivity());
        PopTime.getSeleTime(getActivity(), "yyyy-MM-dd HH:mm", new OnDateCallback()
        {
            @Override
            public void onDateCallback(int year, int month, int day, int hour, int minute, String nowDate, long timestamps)
            {
                title.setText(nowDate);
            }
        });

    }

    @Override
    public void onLoadOver() {

    }

}
