package com.example.dhruvi.project;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

class CustomPagerAdapter extends PagerAdapter {

    Context  mContext;
    LayoutInflater mLayoutInflater;
//    private ArrayList<Integer> IMAGES;
    int IMAGES[];
//    ModelObject modelObject;
//    int mResources[];


    public CustomPagerAdapter(Context context,int IMAGES[])
    {
        mContext=context;
        this.IMAGES = IMAGES;
        mLayoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        return IMAGES.length;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {


//        ModelObject modelObject = ModelObject.values()[position];
//        LayoutInflater inflater = LayoutInflater.from(mContext);
//        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
//        collection.addView(layout);
//        return layout;
        View itemView = mLayoutInflater.inflate(R.layout.image_block,collection,false);
//        assert itemView != null;
        ImageView imageView =(ImageView) itemView.findViewById(R.id.imageView);

        imageView.setImageResource(IMAGES[position]);
        collection.addView(itemView);

        return itemView;

    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object object) {
        collection.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object ;
    }


}
