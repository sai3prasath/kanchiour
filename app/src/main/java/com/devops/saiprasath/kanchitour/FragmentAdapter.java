package com.devops.saiprasath.kanchitour;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by saiprasath on 5/5/2017.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    /**
     * Created by sai3prasath on 5/3/2017.
     */

       int tabcount;
        String[] tab_title={"Temples","Hospitals","Hotels","ATM","Fuel Station","Police Station","Lodge","Bus/Train","Taxi"};
        public FragmentAdapter(FragmentManager fm, int tabcount) {
            super(fm);
            this.tabcount=tabcount;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Tab1 tab1 = new Tab1();
                    return tab1;
                case 1:
                    Tab2 tab2 = new Tab2();
                    return tab2;
//                case 2:
//                    Tab3 tab3 = new Tab3();
//                    return tab3;
//                case 3:
//                    Tab4 tab4 = new Tab4();
//                    return tab4;
//                case 4:
//                    Tab5 tab5 = new Tab5();
//                    return tab5;
//                case 5:
//                    Tab6 tab6 = new Tab6();
//                    return tab6;
//                case 6:
//                    Tab7 tab7 = new Tab7();
//                    return tab7;
//                case 7:
//                    Tab8 tab8 = new Tab8();
//                    return tab8;
//                case 8:
//                    Tab9 tab9 = new Tab9();
//                    return tab9;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return tabcount;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tab_title[position];
        }
    }




