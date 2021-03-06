package com.ziv.video.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gyf.barlibrary.ImmersionBar;
import com.heima.tabview.library.TabView;
import com.heima.tabview.library.TabViewChild;
import com.ziv.video.R;
import com.ziv.video.utils.Transparency;
import com.ziv.video.view.fragment.ClassificationFragment;
import com.ziv.video.view.fragment.HomeFragment;
import com.ziv.video.view.fragment.MineFragment;
import com.ziv.video.view.fragment.VipFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabView)
    TabView tabView;
    private ImmersionBar immersionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置沉浸式状态栏
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        immersionBar = ImmersionBar.with(this);
        /*
         *.statusBarDarkFont(true, 0.2f).
         * 可以解决状态栏颜色不通一的情况
         * */
        immersionBar
                .transparentStatusBar()
                .statusBarColor(R.color.black).
                init();
        initView();
    }

    /**
     * 初始化View层数据
     */
    private void initView() {
        List<TabViewChild> tabViewChildren = new ArrayList<>();
        TabViewChild tabViewChildHome = new TabViewChild(R.drawable.tab_home_selector, R.drawable.tab_home_unselector, getString(R.string.tab_main_home), new HomeFragment());
        TabViewChild tabViewChildClass = new TabViewChild(R.drawable.tab_classs_selector, R.drawable.tab_class_unselector, getString(R.string.tab_main_class), new ClassificationFragment());
        TabViewChild tabViewChildVip = new TabViewChild(R.drawable.tab_vip_selector, R.drawable.tab_vip_unselector, getString(R.string.tab_main_vip), new VipFragment());
        TabViewChild tabViewChildMine = new TabViewChild(R.drawable.tab_mine_selector, R.drawable.tab_mine_unselector, getString(R.string.tab_main_mine), new MineFragment());
        tabViewChildren.add(tabViewChildHome);
        tabViewChildren.add(tabViewChildClass);
        tabViewChildren.add(tabViewChildVip);
        tabViewChildren.add(tabViewChildMine);
        // 将数据添加布局
        tabView.setTabViewChild(tabViewChildren, getSupportFragmentManager());
        // 设置默认选择第一个(首页)
        tabView.setTabViewDefaultPosition(0);
        // 设置间距
        tabView.setImageViewTextViewMargin(2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (immersionBar != null)
            immersionBar.destroy();
    }
}
