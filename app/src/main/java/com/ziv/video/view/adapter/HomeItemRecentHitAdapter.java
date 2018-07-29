package com.ziv.video.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ziv.video.R;
import com.ziv.video.model.entity.HomeItemRecentHitEntity;
import com.ziv.video.view.weight.RoundImageView;

import java.util.List;


public class HomeItemRecentHitAdapter extends BaseAdapter {

    private Context context;
    private List<HomeItemRecentHitEntity> homeItemRecentHitEntities;

    public HomeItemRecentHitAdapter(Context context, List<HomeItemRecentHitEntity> homeItemRecentHitEntities) {
        this.context = context;
        this.homeItemRecentHitEntities = homeItemRecentHitEntities;
    }

    @Override
    public int getCount() {
        return homeItemRecentHitEntities.size();
    }

    @Override
    public Object getItem(int position) {
        return homeItemRecentHitEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView = View.inflate(context, R.layout.item_recent_hit,null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        HomeItemRecentHitEntity homeItemRecentHitEntity = homeItemRecentHitEntities.get(position);
        viewHolder.videoTitle.setText(homeItemRecentHitEntity.getTitle());

        Glide.with(context)
                .load(homeItemRecentHitEntity.getImageResource())
                .into(viewHolder.videoImgage);
        return convertView;
    }
    class ViewHolder{
        protected RoundImageView videoImgage;
        protected TextView videoTitle;
        public ViewHolder(View convertView) {
            videoImgage =  convertView.findViewById(R.id.video_img);
            videoTitle = convertView.findViewById(R.id.video_title);
        }
    }
}
