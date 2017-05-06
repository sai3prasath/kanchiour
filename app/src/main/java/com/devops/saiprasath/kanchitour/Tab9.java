package com.devops.saiprasath.kanchitour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by saiprasath on 5/5/2017.
 */

public class Tab9 extends ListFragment {

    private ListViewdapter customadapter;
    public int[] temple_images;
    public String[] taxis;
    String[] temple_loc;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab9,container,false);
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        taxis = getResources().getStringArray(R.array.taxis);
        temple_loc=getResources().getStringArray(R.array.temple_loc);
//        customadapter = new ListViewdapter(getActivity(),null,taxis,temple_loc);
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
