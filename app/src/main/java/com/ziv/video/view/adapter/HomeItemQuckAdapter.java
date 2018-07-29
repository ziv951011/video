package com.ziv.video.view.adapter;


import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.zhy.autolayout.AutoLinearLayout;
import com.ziv.video.R;
import com.ziv.video.model.entity.HomeItemEntity;
import com.ziv.video.model.entity.HomeItemRecentHitEntity;
import com.ziv.video.utils.imageloder.GlideImageLoader;
import com.ziv.video.view.weight.MyGridView;

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
     * @param
     */
    public HomeItemQuckAdapter(List<HomeItemEntity> data) {
        super(data);
        // 添加Banner
        addItemType(HomeItemEntity.HOME_BANNER, R.layout.home_item_banner);
        // 最近热播
        addItemType(HomeItemEntity.HOME_RECENT_HIT, R.layout.home_item_recent_hit);
        // 近期上线
        addItemType(HomeItemEntity.HOME_RECENT_LAUNCH, R.layout.home_item_recent_launch);
        // gif
        addItemType(HomeItemEntity.HOME_GIT_MOIVE, R.layout.home_item_gif_moive);
    }


    @Override
    protected void convert(BaseViewHolder helper, HomeItemEntity item) {
        // 根据Item的值绑定对应的数据
        switch (item.getItemType()) {
            case HomeItemEntity.HOME_BANNER:
                initBannerData(helper);
                break;
            case HomeItemEntity.HOME_RECENT_HIT:
                initRecentHit(helper);
                break;
            case HomeItemEntity.HOME_RECENT_LAUNCH:
                initRecentLaunch(helper);
                break;
            case HomeItemEntity.HOME_GIT_MOIVE:
                initGitMoive(helper);
                break;
            default:
                break;
        }
    }


    private void initGitMoive(BaseViewHolder helper) {

    }

    private void initRecentLaunch(BaseViewHolder helper) {
        AutoLinearLayout titleRecentHit = helper.getView(R.id.title_recent_hit);
        MyGridView rvRencentHit = helper.getView(R.id.rv_recent_launch);

        /**
         * 这里一共展示6个数据 一排3个
         */
        List<HomeItemRecentHitEntity> homeItemRecentHitEntities = new ArrayList<>();

        HomeItemRecentHitEntity homeItemRecentHitEntity1 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity1.setTitle("猛虫过江");
        homeItemRecentHitEntity1.setImageResource("http://pic8.qiyipic.com/image/20180720/72/18/v_115029559_m_601_m8_180_236.jpg");

        HomeItemRecentHitEntity homeItemRecentHitEntity2 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity2.setTitle("唐人街探案2");
        homeItemRecentHitEntity2.setImageResource("http://pic4.qiyipic.com/image/20180420/e1/c0/v_113158420_m_601_m5_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity3 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity3.setTitle("古墓奇谭2穿越死亡海");
        homeItemRecentHitEntity3.setImageResource("http://pic4.qiyipic.com/image/20180719/fb/0b/v_117268251_m_601_m1_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity4 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity4.setTitle("泄密者");
        homeItemRecentHitEntity4.setImageResource("http://pic7.qiyipic.com/image/20180718/a2/83/v_115262669_m_601_m8_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity5 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity5.setTitle("红海行动");
        homeItemRecentHitEntity5.setImageResource("http://pic4.qiyipic.com/image/20180428/84/a8/v_112882553_m_601_m4_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity6 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity6.setTitle("厉害了，我的国");
        homeItemRecentHitEntity6.setImageResource("http://pic6.qiyipic.com/image/20180418/4c/f5/v_115014542_m_601_m1_180_236.jpg");

        homeItemRecentHitEntities.add(homeItemRecentHitEntity1);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity2);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity3);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity4);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity5);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity6);


        HomeItemRecentHitAdapter homeItemRecentHitAdapter = new HomeItemRecentHitAdapter(mContext, homeItemRecentHitEntities);
        rvRencentHit.setAdapter(homeItemRecentHitAdapter);
    }

    /**
     * 绑定最近热播数据
     *
     * @param helper
     */
    private void initRecentHit(BaseViewHolder helper) {
        AutoLinearLayout titleRecentHit = helper.getView(R.id.title_recent_hit);
        MyGridView rvRencentHit = helper.getView(R.id.rv_recent_hit);

        /**
         * 这里一共展示6个数据 一排3个
         */
        List<HomeItemRecentHitEntity> homeItemRecentHitEntities = new ArrayList<>();

        HomeItemRecentHitEntity homeItemRecentHitEntity1 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity1.setTitle("猛虫过江");
        homeItemRecentHitEntity1.setImageResource("http://pic8.qiyipic.com/image/20180720/72/18/v_115029559_m_601_m8_180_236.jpg");

        HomeItemRecentHitEntity homeItemRecentHitEntity2 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity2.setTitle("唐人街探案2");
        homeItemRecentHitEntity2.setImageResource("http://pic4.qiyipic.com/image/20180420/e1/c0/v_113158420_m_601_m5_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity3 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity3.setTitle("古墓奇谭2穿越死亡海");
        homeItemRecentHitEntity3.setImageResource("http://pic4.qiyipic.com/image/20180719/fb/0b/v_117268251_m_601_m1_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity4 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity4.setTitle("泄密者");
        homeItemRecentHitEntity4.setImageResource("http://pic7.qiyipic.com/image/20180718/a2/83/v_115262669_m_601_m8_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity5 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity5.setTitle("红海行动");
        homeItemRecentHitEntity5.setImageResource("http://pic4.qiyipic.com/image/20180428/84/a8/v_112882553_m_601_m4_180_236.jpg");


        HomeItemRecentHitEntity homeItemRecentHitEntity6 = new HomeItemRecentHitEntity();
        homeItemRecentHitEntity6.setTitle("厉害了，我的国");
        homeItemRecentHitEntity6.setImageResource("http://pic6.qiyipic.com/image/20180418/4c/f5/v_115014542_m_601_m1_180_236.jpg");

        homeItemRecentHitEntities.add(homeItemRecentHitEntity1);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity2);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity3);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity4);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity5);
        homeItemRecentHitEntities.add(homeItemRecentHitEntity6);


        HomeItemRecentHitAdapter homeItemRecentHitAdapter = new HomeItemRecentHitAdapter(mContext, homeItemRecentHitEntities);
        rvRencentHit.setAdapter(homeItemRecentHitAdapter);
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
        banner.setBannerStyle(BannerConfig.CENTER);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置banner动画效果
        banner.setBannerAnimation(Transformer.CubeOut);
        // 设置自动播放
        banner.isAutoPlay(true);
        //设置轮播时间
        banner.setDelayTime(DELAY_TIME);
        //设置指示器位置（当banner模式中有指示器时）
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

    }




}
