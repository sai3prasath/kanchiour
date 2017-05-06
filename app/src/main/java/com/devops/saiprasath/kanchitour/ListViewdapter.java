package com.devops.saiprasath.kanchitour;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by saiprasath on 5/5/2017.
 */

public class ListViewdapter extends ArrayAdapter {

        private Context context;
    private int LayResId;
    ArrayList<ImageItem> data = new ArrayList<>();
    public ImageItem imageItem;

    public ListViewdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<ImageItem> objects) {
        super(context, resource, objects);
        this.context=context;
        this.LayResId=resource;
        this.data=objects;
    }

        public class ViewHolder
        {
            CircleImageView circleimage;
            TextView titletext;
            TextView titleloc;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewholder = new ViewHolder();
            if (convertView==null) {
                LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflator.inflate(LayResId, parent,false);
                convertView.setTag(viewholder);
            }
            else {
               viewholder = (ViewHolder) convertView.getTag();
            }
            imageItem = data.get(position);

            viewholder.circleimage = (CircleImageView)convertView.findViewById(R.id.image_circle);
            viewholder.circleimage.setImageBitmap(imageItem.getTitle_image());

            viewholder.titletext = (TextView)convertView.findViewById(R.id.titledisplay);
            viewholder.titletext.setText(imageItem.getTitle_text());

            viewholder.titleloc=(TextView)convertView.findViewById(R.id.titleloc);
            viewholder.titleloc.setText(imageItem.getTitle_loc());


//        int imgId = resources.getIdentifier((String) getItem(position),"drawable",context.getPackageName());
//        Drawable drawable = images.getDrawable(0);
//        viewholder.circleimage=(ImageView) convertView.findViewById(R.id.image_circle);
//        viewholder.circleimage.setImageDrawable(drawable);
//        images.recycle();
//        viewholder.circleimage.setBackgroundResource(images[position]);
//          viewholder.circleimage.setBac

            return convertView;
        }
    }


