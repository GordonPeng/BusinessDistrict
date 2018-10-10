package com.risenb.business.adapter;

import android.content.Context;

import com.lidroid.mutils.adapter.BaseListAdapter;
import com.lidroid.mutils.adapter.BaseViewHolder;
import com.risenb.business.R;

public class ZAdapter<T extends Object> extends BaseListAdapter<T>
{
    @Override
    public int getCount()
    {
        return 5;
    }

    @Override
    protected BaseViewHolder<T> loadView(Context context, T bean, int position)
    {
        return new ViewHolder(context, getViewId(bean, position));
    }

    @Override
    protected int getViewId(T bean, int position)
    {
        return R.layout.title;
    }

    private class ViewHolder extends BaseViewHolder<T>
    {

        // @ViewInject(R.id.title)
        // private TextView title;
        //
        // @ViewInject(R.id.back)
        // private ImageView back;

        public ViewHolder(Context context, int layoutID)
        {
            super(context, layoutID);
            // bitmapInfo(R.drawable.default_image);
            // ImageLoader.getInstance().displayImage(bean.getImageBig(), iv_home_item, MyConfig.options);
        }

        @Override
        protected void prepareData()
        {
            // ViewDataUtils.inject(bean, convertView, bitmapUtils);
            // title.setText("");
            // bitmapUtils.display(back, "");
        }
    }

}
