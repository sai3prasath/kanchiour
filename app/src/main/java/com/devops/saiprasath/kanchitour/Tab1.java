package com.devops.saiprasath.kanchitour;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by saiprasath on 5/5/2017.
 */

public class Tab1 extends ListFragment {
    private ListViewdapter customadapter;
    public TypedArray temple_images;
    public String[] temple_lists;
    String[] temple_loc;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1,container,false);
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        customadapter = new ListViewdapter(getActivity(),R.layout.tablayout,getData());
        setListAdapter(customadapter);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "You clicked "+(position+1), Toast.LENGTH_SHORT).show();
            }
        });
        getListView().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getActivity(), "You Long clicked "+(position+1), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public ArrayList<ImageItem> getData() {
        ArrayList<ImageItem> data = new ArrayList<>();
        temple_images = getResources().obtainTypedArray(R.array.temple_imgs);
        temple_lists = getResources().getStringArray(R.array.temples);
        temple_loc=getResources().getStringArray(R.array.temple_loc);
        for (int i=0;i<temple_lists.length;i++)
        {
            Bitmap bitmap_data = BitmapFactory.decodeResource(getResources(),temple_images.getResourceId(i,-1));
            data.add(new ImageItem(bitmap_data,temple_lists[i],temple_loc[i]));
        }
        return data;
    }
}
