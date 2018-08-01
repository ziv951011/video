package com.ziv.video.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.ziv.video.R;
import com.ziv.video.model.entity.DataEntity;
import com.ziv.video.model.entity.HomeItemEntity;
import com.ziv.video.utils.imageloder.GlideImageLoader;
import com.ziv.video.view.adapter.HomeItemQuckAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.ziv.video.utils.VideoConstants.DELAY_TIME;


public class HomeFragment extends Fragment {

    private static final String TAG = HomeFragment.class.getSimpleName();

    @BindView(R.id.rv_main)
    RecyclerView rvMain;
    Unbinder unbinder;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // 设置适配器
        List<HomeItemEntity> homeData = DataEntity.getHomeData();
        HomeItemQuckAdapter homeItemQuckAdapter = new HomeItemQuckAdapter(homeData);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        View view = View.inflate(getActivity(), R.layout.home_item_banner, null);
        Banner banner = view.findViewById(R.id.home_banner);
        initHeadBanner(banner);
        homeItemQuckAdapter.addHeaderView(view);
        rvMain.setLayoutManager(linearLayoutManager);
        rvMain.setAdapter(homeItemQuckAdapter);

    }

    /**
     *  TODO  此处放在Presenter处理
     * @param banner
     */
    private void initHeadBanner(Banner banner) {
        /**
         * 假设数据为下面的
         */
        List<String> images = new ArrayList<>();
        images.add("http://pic2.iqiyipic.com/common/lego/20180728/cc1a7e0628d746d4a0b94ec3c4029d80.jpg");
        images.add("http://pic2.iqiyipic.com/common/lego/20180717/feab895c7db7413b9e541f99a03dbbd0.jpg");
        images.add("http://pic2.iqiyipic.com/common/lego/20180727/c92f3f52662241d98934339713d57384.jpg");
        images.add("http://pic3.iqiyipic.com/common/lego/20180720/0148995dfd3042699a3b2678e26da84d.jpg");

        //设置banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
