package com.risenb.business.test;

import android.inputmethodservice.KeyboardView;
import android.widget.EditText;

import com.lidroid.mutils.idcard.KeyboardUtil;
import com.lidroid.xutils.view.annotation.ContentView;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

/**
 * 输入身份证号
 * 
 * @author Administrator
 * 
 */
@ContentView(R.layout.zzz)
public class KeyboardTest extends BaseUI
{
    private EditText et_idCard;
    private KeyboardView keyboardView;

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
        // <RelativeLayout
        // android:layout_width="match_parent"
        // android:layout_height="match_parent" >
        //
        // <android.inputmethodservice.KeyboardView
        // android:id="@+id/keyboard_view"
        // android:layout_width="match_parent"
        // android:layout_height="wrap_content"
        // android:layout_alignParentBottom="true"
        // android:background="#202020"
        // android:focusable="true"
        // android:focusableInTouchMode="true"
        // android:keyBackground="@drawable/btn_keyboard_key"
        // android:keyPreviewLayout="@layout/key_preview_layout"
        // android:keyTextColor="@android:color/white"
        // android:visibility="gone" />
        // </RelativeLayout>

        KeyboardUtil keyboardUtil = new KeyboardUtil(getActivity(), et_idCard, keyboardView);
        if (!keyboardUtil.checkNum(et_idCard.getText().toString()))
        {
            makeText("请输入正确的身份证号");
            return;
        }

    }

    @Override
    public void onLoadOver() {

    }

}
