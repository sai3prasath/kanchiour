package com.devops.saiprasath.kanchitour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by saiprasath on 5/5/2017.
 */

public class Tab7 extends android.support.v4.app.ListFragment {

    private ListViewdapter customadapter;
    public int[] temple_images;
    public String[] Lodges;
    String[] temple_loc;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab7,container,false);
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Lodges = getResources().getStringArray(R.array.residency);
        temple_loc=getResources().getStringArray(R.array.temple_loc);
//        customadapter = new ListViewdapter(getActivity(),null,Lodges,temple_loc);
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
                Toast.makeText(getActivity(), "You Long clicked "+(position+1), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
