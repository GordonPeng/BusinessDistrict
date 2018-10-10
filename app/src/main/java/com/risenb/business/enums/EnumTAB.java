package com.risenb.business.enums;

import android.widget.RadioButton;

import com.risenb.business.R;
import com.risenb.business.ui.ProductCircle.ProdeuctCircleUI;
import com.risenb.business.ui.ShopCar.ShopCarUI;
import com.risenb.business.ui.Vip.VipUI;
import com.risenb.business.ui.home.HomeUI;
import com.risenb.business.ui.showimg.ShowImgUI;
import com.risenb.business.ui.web.WebUI;

public enum EnumTAB
{
    TAB1("tab1", R.id.rb_tab_1, R.drawable.tab_1, "首页", HomeUI.class), //
    TAB2("tab2", R.id.rb_tab_2, R.drawable.tab_2, "产品圈", ProdeuctCircleUI.class), //
    TAB3("tab3", R.id.rb_tab_3, R.drawable.tab_3, "购物车", ShopCarUI.class), //
    TAB4("tab4", R.id.rb_tab_4, R.drawable.tab_4, "我", VipUI.class); //

    private int id;
    private int drawable;
    private String tag;
    private String title;
    private Class<?> clazz;
    private RadioButton radioButton;

    private EnumTAB(String tag, int id, int drawable, String title, Class<?> clazz)
    {
        this.tag = tag;
        this.id = id;
        this.drawable = drawable;
        this.title = title;
        this.clazz = clazz;
    }

    public int getId()
    {
        return id;
    }

    public int getDrawable()
    {
        return drawable;
    }

    public String getTag()
    {
        return tag;
    }

    public String getTitle()
    {
        return title;
    }

    public Class<?> getClazz()
    {
        return clazz;
    }

    public void setRadioButton(RadioButton radioButton)
    {
        this.radioButton = radioButton;
    }

    public RadioButton getRadioButton()
    {
        return radioButton;
    }

}
