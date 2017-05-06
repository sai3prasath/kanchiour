package com.devops.saiprasath.kanchitour;

import android.graphics.Bitmap;
import android.widget.TextView;

/**
 * Created by saiprasath on 5/5/2017.
 */

public class ImageItem {
    public Bitmap title_image;
    public String title_text;
    public String title_loc;

    public ImageItem(Bitmap title_image, String title_text, String title_loc) {
        this.title_image = title_image;
        this.title_text = title_text;
        this.title_loc = title_loc;
    }

    public Bitmap getTitle_image() {
        return title_image;
    }

    public void setTitle_image(Bitmap title_image) {
        this.title_image = title_image;
    }

    public String getTitle_text() {
        return title_text;
    }

    public void setTitle_text(String title_text) {
        this.title_text = title_text;
    }

    public String getTitle_loc() {
        return title_loc;
    }

    public void setTitle_loc(String title_loc) {
        this.title_loc = title_loc;
    }
}
