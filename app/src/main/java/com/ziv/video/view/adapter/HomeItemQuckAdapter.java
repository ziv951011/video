package com.ziv.video.view.adapter;


import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.ziv.video.R;
import com.ziv.video.model.entity.HomeItemEntity;
import com.ziv.video.utils.imageloder.GlideImageLoader;

import java.util.ArrayList;
import java.util.List;

import static com.ziv.video.utils.VideoConstants.DELAY_TIME;

/**
 * 首页适配器
 */
public class HomeItemQuckAdapter extends BaseMultiItemQuickAdapter<HomeItemEntity, BaseViewHolder> {



    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public HomeItemQuckAdapter(List<HomeItemEntity> data) {
        super(data);
        addItemType(HomeItemEntity.HOME_BANNER, R.layout.home_item_banner);
    }


    @Override
    protected void convert(BaseViewHolder helper, HomeItemEntity item) {
        // 根据Item的值绑定对应的数据
        switch (item.getItemType()) {
            case HomeItemEntity.HOME_BANNER:
                initBannerData(helper);
                break;
            default:
                break;
        }
    }

    /***
     * 绑定banner数据
     * @param helper
     */
    private void initBannerData(BaseViewHolder helper) {

        /**
         * 假设数据为下面的
         */
        List<String> images = new ArrayList<>();
        images.add("http://pic2.iqiyipic.com/common/lego/20180728/cc1a7e0628d746d4a0b94ec3c4029d80.jpg");
        images.add("http://pic2.iqiyipic.com/common/lego/20180717/feab895c7db7413b9e541f99a03dbbd0.jpg");
        images.add("http://pic2.iqiyipic.com/common/lego/20180727/c92f3f52662241d98934339713d57384.jpg");
        images.add("http://pic3.iqiyipic.com/common/lego/20180720/0148995dfd3042699a3b2678e26da84d.jpg");

        Banner banner = helper.getView(R.id.home_banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.ForegroundToBackground);
        // 设置自动播放
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(DELAY_TIME);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.CENTER);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

    }
}
