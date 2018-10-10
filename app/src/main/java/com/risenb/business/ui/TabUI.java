package com.risenb.business.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.TabHost.TabSpec;

import com.lidroid.mutils.utils.Utils;
import com.risenb.business.MyApplication;
import com.risenb.business.R;
import com.risenb.business.enums.EnumTAB;

/**
 * 描述：导航
 * 
 * @author wanjian
 * 
 */
@SuppressWarnings("deprecation")
public class TabUI extends TabActivity implements OnClickListener
{
    private static TabUI tabUI;
    private MyApplication application;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.tab);
        application = (MyApplication) getApplication();
        tabUI = this;

        TabSpec spec;
        Intent intent = null;
        Drawable drawable;

        int right = Utils.getUtils().getDimen(this, R.dimen.dm040);
        int bottom = Utils.getUtils().getDimen(this, R.dimen.dm040);

        EnumTAB[] enumArr = EnumTAB.values();
        for (int i = 0; i < enumArr.length; i++)
        {
            enumArr[i].setRadioButton((RadioButton) findViewById(enumArr[i].getId()));
            enumArr[i].getRadioButton().setOnClickListener(this);
            enumArr[i].getRadioButton().setText(enumArr[i].getTitle());

            drawable = getResources().getDrawable(enumArr[i].getDrawable());
            drawable.setBounds(0, 0, right, bottom);
            enumArr[i].getRadioButton().setCompoundDrawables(null, drawable, null, null);

            intent = new Intent().setClass(this, enumArr[i].getClazz());
            spec = getTabHost().newTabSpec(enumArr[i].getTag()).setIndicator(enumArr[i].getTag()).setContent(intent);
            getTabHost().addTab(spec);
        }
    }

    @Override
    public void onClick(View v)
    {
        EnumTAB[] enumArr = EnumTAB.values();
        for (int i = 0; i < enumArr.length; i++)
        {
            if (enumArr[i].getId() == v.getId())
            {
                setCurrentTabByTag(enumArr[i]);
                break;
            }
        }
    }

    public void setCurrentTabByTag(EnumTAB enumTab)
    {
        EnumTAB[] enumArr = EnumTAB.values();
        for (int i = 0; i < enumArr.length; i++)
        {
            enumArr[i].getRadioButton().setChecked(enumArr[i] == enumTab);
        }
        getTabHost().setCurrentTabByTag(enumTab.getTag());
    }

    public static TabUI getTabUI()
    {
        return tabUI;
    }
}