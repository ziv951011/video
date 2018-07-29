package com.ziv.video.view.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.ziv.video.R;
import com.ziv.video.model.entity.DataEntity;
import com.ziv.video.model.entity.HomeItemEntity;
import com.ziv.video.view.adapter.HomeItemQuckAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class HomeFragment extends Fragment {

    @BindView(R.id.rv_main)
    RecyclerView rvMain;
    Unbinder unbinder;

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
        rvMain.setLayoutManager(linearLayoutManager);
        rvMain.setAdapter(homeItemQuckAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
