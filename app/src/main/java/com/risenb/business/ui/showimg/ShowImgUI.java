package com.risenb.business.ui.showimg;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lidroid.mutils.banner.BaseBannerBean;
import com.lidroid.mutils.fragpage.BasePageFragment;
import com.lidroid.mutils.fragpage.BasePageUtils;
import com.lidroid.mutils.showimg.ShowBean;
import com.lidroid.mutils.showimg.ShowImageView;
import com.lidroid.mutils.showimg.ShowUtils;
import com.lidroid.mutils.utils.LoadOver;
import com.lidroid.mutils.utils.OnLoadOver;
import com.lidroid.xutils.BitmapUtils;
import com.lidroid.xutils.view.annotation.ContentView;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.risenb.business.R;
import com.risenb.business.ui.BaseUI;

@ContentView(R.layout.show_img)
public class ShowImgUI extends BaseUI {

    // Intent intent = new Intent(getActivity(), ShowImgUI.class);
    // intent.putExtra("list", (Serializable)list);
    // intent.putExtra("idx", 0);
    // startActivity(intent);

    /**
     * 显示的内容
     */
    @ViewInject(R.id.vp_show_img)
    private ViewPager vp_show_img;

    @ViewInject(R.id.btn_show_img)
    private Button btn_show_img;

    @ViewInject(R.id.tv_show_img)
    private TextView tv_show_img;

    private BitmapUtils bitmapUtils;

    private ShowImageView[] sivArr;
    private ShowBean bean;

    @Override
    protected void back() {
        finish();
    }

    @Override
    protected void setControlBasis() {
        setTitle("");
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void prepareData() {
        final List<BaseBannerBean> list = (List<BaseBannerBean>) getIntent().getSerializableExtra("list");

        bean = new ShowBean();
        bean.setBtn(btn_show_img);
        bean.setViewPager(vp_show_img);

        bitmapUtils = new BitmapUtils();
        bitmapUtils.configDefaultLoadFailedImage(R.drawable.default_image);
        bitmapUtils.configDefaultLoadingImage(R.drawable.default_image);

        sivArr = new ShowImageView[list.size()];
        bean.setSivArr(sivArr);
        List<ShowImgBean> listShow = new ArrayList<ShowImgBean>();
        for (int i = 0; i < list.size(); i++) {
            ShowImgBean showImgBean = new ShowImgBean();
            showImgBean.setUrl(list.get(i).getBannerBeanImage());
            listShow.add(showImgBean);
        }
        for (int i = 0; i < listShow.size(); i++) {
            listShow.get(i).setFragment(new PageFragment(listShow.get(i), i));
        }
        BasePageUtils<ShowImgBean> basePageUtils = new BasePageUtils<ShowImgBean>();
        basePageUtils.setActivity(getActivity());
        basePageUtils.setViewPager(vp_show_img);
        basePageUtils.setList(listShow);
        basePageUtils.setOnPageChangeListener(new OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {

            }

            @Override
            public void onPageScrolled(int position, float arg1, int arg2) {
                bean.setPosition(position);
                tv_show_img.setText((position + 1) + "/" + list.size());
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
        basePageUtils.setRadioButton00(R.id.radio_button00);
        basePageUtils.setRadioLayoutID(R.layout.rb_page_fragment);
        basePageUtils.info();

        ShowUtils.getShowUtils().setOnTouchListener(bean);
        vp_show_img.setCurrentItem(getIntent().getIntExtra("idx", 0));
    }

    @Override
    public void onLoadOver() {

    }

    @SuppressLint("ValidFragment")
    public class PageFragment extends BasePageFragment<ShowImgBean> implements OnLoadOver {

        @ViewInject(R.id.ll_show_image_show)
        private LinearLayout ll_show_image_show;

        public PageFragment(ShowImgBean baseMenuBean, int position) {
            super(baseMenuBean, position);
        }

        @Override
        protected void loadViewLayout(LayoutInflater inflater, ViewGroup container) {
            view = inflater.inflate(R.layout.show_img_item, null);
        }

        @Override
        protected void setControlBasis() {
            new LoadOver(getActivity(), this);
        }

        @Override
        protected void prepareData() {

        }

        @Override
        public void onLoadOver() {
            ll_show_image_show.removeAllViews();

            int screenW = ll_show_image_show.getWidth(); // 屏幕宽度（像素）
            int screenH = ll_show_image_show.getHeight(); // 屏幕高度（像素）

            sivArr[position] = new ShowImageView(getActivity(), screenW, screenH);
            ll_show_image_show.addView(sivArr[position]);
            if (!TextUtils.isEmpty(baseMenuBean.getUrl()) && baseMenuBean.getUrl().indexOf(":") == -1) {
                bitmapUtils.display(sivArr[position], "file:///" + baseMenuBean.getUrl());
            } else {
                bitmapUtils.display(sivArr[position], baseMenuBean.getUrl());
            }
        }
    }
}
