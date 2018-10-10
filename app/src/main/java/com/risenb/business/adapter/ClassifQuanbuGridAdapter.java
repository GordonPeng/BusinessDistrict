package com.risenb.business.adapter;

import android.content.Context;

import com.lidroid.mutils.adapter.BaseGridAdapter;
import com.lidroid.mutils.adapter.BaseViewHolder;
import com.risenb.business.R;

public class ClassifQuanbuGridAdapter<T extends Object> extends BaseGridAdapter<T>
{
    public ClassifQuanbuGridAdapter(int numColumns)
    {
        super(numColumns);
    }

    @Override
    public int getViewCount()
    {
        return 12;
    }

    @Override
    protected BaseViewHolder<T> loadView(Context context)
    {
        return new ViewHolder(context, R.layout.classification_item);
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
