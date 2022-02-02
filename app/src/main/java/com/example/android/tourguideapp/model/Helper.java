

package com.example.android.tourguideapp.model;

import android.content.Context;

import com.example.android.tourguideapp.R;

import java.util.ArrayList;


public class Helper {

    private Helper() {
    }


    public static ArrayList<Places> getCategory (Context context) {

        String [] category = context.getResources().getStringArray(R.array.categories1);
        int [] photoId = new int[]{R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4,
                R.drawable.cat5,R.drawable.cat6};

        ArrayList<Places> categoryList = new ArrayList<>();
        for (int i = 0; i<6; i++){
            categoryList.add(new Places(category[i], photoId[i], R.drawable.ic_navigate_next));
        }return categoryList;
    }

    public static ArrayList<Places> getInfo (Context context) {

        String [] titleName = context.getResources().getStringArray(R.array.info_desc);
        String [] itemName = context.getResources().getStringArray(R.array.info_desc_1);
        int [] photoId = new int[]{R.drawable.info_1, R.drawable.info_2, R.drawable.info_3,R.drawable.info_4};

        ArrayList<Places> infoList = new ArrayList<>();
        for (int i = 0; i<4; i++){
            infoList.add(new Places(titleName[i], itemName[i], photoId[i]));
        }return infoList;
    }

    public static ArrayList<Places> getHotel (Context context) {

        String titleName [] = context.getResources().getStringArray(R.array.title_name_1);
        String itemName [] = context.getResources().getStringArray(R.array.item_name_1);
        String address [] = context.getResources().getStringArray(R.array.address_1);
        String tel [] = context.getResources().getStringArray(R.array.tel_1);
        String web [] = context.getResources().getStringArray(R.array.web_1);
        String desc [] = context.getResources().getStringArray(R.array.desc_1);
        int [] photoId = new int[]{R.drawable.hotel_1, R.drawable.hotel_2,R.drawable.hotel_3, R.drawable.hotel_4, R.drawable.hotel_5,
               R.drawable.hotel_6, R.drawable.hotel_7, R.drawable.hotel_8, R.drawable.hotel_9, R.drawable.hotel_10};

        ArrayList<Places> hotelList = new ArrayList<>();
        for(int i = 0; i<10; i++){
            hotelList.add(new Places(titleName[i], itemName[i], address[i], tel[i], web[i], desc[i], photoId[i], R.drawable.ic_action_search));
        }return hotelList;
    }


    public static ArrayList<Places> getFood (Context context) {

        String titleName [] = context.getResources().getStringArray(R.array.title_name_2);
        String itemName [] = context.getResources().getStringArray(R.array.item_name_2);
        String address [] = context.getResources().getStringArray(R.array.address_2);
        String tel [] = context.getResources().getStringArray(R.array.tel_2);
        String web [] = context.getResources().getStringArray(R.array.web_2);
        String desc [] = context.getResources().getStringArray(R.array.desc_2);
        int [] photoId = new int[]{R.drawable.food_1, R.drawable.food_2, R.drawable.food_3, R.drawable.food_4, R.drawable.food_5,
                R.drawable.food_6, R.drawable.food_7, R.drawable.food_8, R.drawable.food_9, R.drawable.food_10};

        ArrayList<Places> foodList = new ArrayList<>();
        for(int i = 0; i<10; i++){
            foodList.add(new Places(titleName[i], itemName[i], address[i], tel[i], web[i], desc[i], photoId[i], R.drawable.ic_action_search));
        }return foodList;
    }


    public static ArrayList<Places> getBar (Context context) {

        String titleName [] = context.getResources().getStringArray(R.array.title_name_3);
        String itemName [] = context.getResources().getStringArray(R.array.item_name_3);
        String address [] = context.getResources().getStringArray(R.array.address_3);
        String tel [] = context.getResources().getStringArray(R.array.tel_3);
        String web [] = context.getResources().getStringArray(R.array.web_3);
        String desc [] = context.getResources().getStringArray(R.array.desc_3);
        int [] photoId = new int[]{R.drawable.pl1, R.drawable.pl2, R.drawable.pl3, R.drawable.pl4, R.drawable.pl5,
                R.drawable.pl6, R.drawable.pl7, R.drawable.pl8, R.drawable.pl9, R.drawable.pl10};

        ArrayList<Places> barList = new ArrayList<>();
        for(int i = 0; i<10; i++){
            barList.add(new Places(titleName[i], itemName[i], address[i], tel[i], web[i], desc[i], photoId[i], R.drawable.ic_action_search));
        }return barList;
    }


    public static ArrayList<Places> getEvents (Context context) {

        String titleName [] = context.getResources().getStringArray(R.array.title_name_4);
        String itemName [] = context.getResources().getStringArray(R.array.item_name_4);
        String address [] = context.getResources().getStringArray(R.array.address_4);
        String tel [] = context.getResources().getStringArray(R.array.tel_4);
        String web [] = context.getResources().getStringArray(R.array.web_4);
        String desc [] = context.getResources().getStringArray(R.array.desc_4);
        int [] photoId = new int[]{R.drawable.hi1, R.drawable.hi2, R.drawable.hi3, R.drawable.hi4,
                R.drawable.hi5, R.drawable.hi6, R.drawable.hi7, R.drawable.hi8};

        ArrayList<Places> eventsList = new ArrayList<>();
        for(int i = 0; i<8; i++){
            eventsList.add(new Places(titleName[i], itemName[i], address[i], tel[i], web[i], desc[i], photoId[i], R.drawable.ic_action_search));
        }return eventsList;
    }




        public static ArrayList<Places> getPlaces (Context context) {

            String titleName [] = context.getResources().getStringArray(R.array.title_name_5);
            String itemName [] = context.getResources().getStringArray(R.array.item_name_5);
            String address [] = context.getResources().getStringArray(R.array.address_5);
            String tel [] = context.getResources().getStringArray(R.array.tel_5);
            String web [] = context.getResources().getStringArray(R.array.web_5);
            String desc [] = context.getResources().getStringArray(R.array.desc_5);
            int [] photoId = new int[]{R.drawable.ml1, R.drawable.ml2, R.drawable.ml3, R.drawable.ml4,R.drawable.ml5};

            ArrayList<Places> placesList = new ArrayList<>();
            for(int i = 0; i<5; i++){
                placesList.add(new Places(titleName[i], itemName[i], address[i], tel[i], web[i], desc[i], photoId[i], R.drawable.ic_action_search));
            }return placesList;
    }

}