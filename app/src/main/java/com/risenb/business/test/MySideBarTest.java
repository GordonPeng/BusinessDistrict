package com.risenb.business.test;

import java.util.ArrayList;
import java.util.List;

import android.widget.ListView;

import com.lidroid.mutils.sort.MySideBar;
import com.lidroid.mutils.sort.MySideBar.OnTouchingLetterChangedListener;
import com.lidroid.mutils.sort.PopSideBar;
import com.lidroid.mutils.sort.SortUtils;
import com.risenb.business.ui.BaseUI;
import com.risenb.business.R;

/**
 * @author 作者: wangjian
 * @version 创建时间：2015年7月14日 下午6:54:45
 * @类说明
 */
public class MySideBarTest extends BaseUI
{
    private MySideBar msb_ss;
    private ListView lv;

    private PopSideBar popSideBar;
    private int[] msb;

    @Override
    protected void back()
    {

    }

    @Override
    protected void setControlBasis()
    {
        SortUtils.getSrtUtils().info(R.layout.pop_side_bar, R.id.tv_side_bar);
    }

    @Override
    protected void prepareData()
    {
        List<CLbean> list = new ArrayList<CLbean>();
        msb = SortUtils.getSrtUtils().sort(list);

        msb_ss.setOnTouchingLetterChangedListener(new OnTouchingLetterChangedListener()
        {
            @Override
            public void onTouchingLetterUP()
            {
                popSideBar.dismiss();
            }

            @Override
            public void onTouchingLetterChanged(int idx)
            {
                lv.setSelection(msb[idx]);
            }

            @Override
            public void onTouchingLetterChanged(String s)
            {
                if (popSideBar == null)
                {
                    popSideBar = new PopSideBar(getActivity());
                }
                popSideBar.showAsDropDown();
                popSideBar.setText(s);
            }
        });
    }

    @Override
    public void onLoadOver() {

    }

    class CLbean extends com.lidroid.mutils.sort.BaseSortBean
    {
        @Override
        public String getBaseSortBeanTag()
        {
            return null;
        }

        // if (position == 0 || getItem(position - 1).getBaseSortBeanID() != bean.getBaseSortBeanID())
        // {
        // tv_city_item.setVisibility(View.VISIBLE);
        // }
        // else
        // {
        // tv_city_item.setVisibility(View.GONE);
        // }
    }

}
