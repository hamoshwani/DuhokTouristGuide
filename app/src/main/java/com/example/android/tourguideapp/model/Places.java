

package com.example.android.tourguideapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;



public class Places implements Parcelable {

    // String resource id for title
    private String titleName;
    // String resource id for item
    private String itemName;
    // String resource id for address
    private String address;
    // String resource id for tel
    private String tel = PHONE_NA;
    // String resource id for web
    private String web;
    // String resource id for desc
    private String desc;
    // Resource id for photo
    private int photoId;
    // Resource id for icon
    private int iconId;
    // Constant value that represent that tel is NA
    private static final String PHONE_NA = "NA";

    public Places(String titleName, int photoId, int iconId) {
        this.titleName = titleName;
        this.photoId = photoId;
        this.iconId = iconId;
    }


    public Places(String titleName, String itemName, int photoId) {
        this.titleName = titleName;
        this.itemName = itemName;
        this.photoId = photoId;
    }


    public Places(String titleName, String itemName, String address, String tel, String web, String desc, int photoId, int iconId) {
        this.titleName = titleName;
        this.itemName = itemName;
        this.address = address;
        this.tel = tel;
        this.web = web;
        this.desc = desc;
        this.photoId = photoId;
        this.iconId = iconId;
    }


    public String getTitleName(){
        return titleName;
    }


    public String getItemName() {
        return itemName;
    }


    public String getAddress() {
        return address;
    }


    public String getTel() {
        return tel;
    }


    public String getWeb() {
        return web;
    }


    public String getDesc() {
        return desc;
    }


    public int getPhotoId(){
        return photoId;
    }


    public int getIconId(){
        return iconId;
    }


    public boolean hasTel() {
        return !Objects.equals(tel, PHONE_NA);
    }

    public static final Parcelable.Creator  CREATOR = new Parcelable.Creator() {
        public Places createFromParcel(Parcel in) {
            return new Places(in);
        }

        public Places[] newArray(int size) {
            return new Places[size];
        }
    };


        public Places(Parcel in){
            this.titleName = in.readString();
            this.itemName = in.readString();
            this.address = in.readString();
            this.tel = in.readString();
            this.web =in.readString();
            this.desc = in.readString();
            this.photoId = in.readInt();
            this.iconId = in.readInt();
        }

    @Override
    public int describeContents() {
            return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.titleName);
            dest.writeString(this.itemName);
            dest.writeString(this.address);
            dest.writeString(this.tel);
            dest.writeString(this.web);
            dest.writeString(this.desc);
            dest.writeInt(this.photoId);
            dest.writeInt(this.iconId);
    }


    @Override
    public String toString() {
            return "Places{" +
                    "titleName='" + titleName + '\'' +
                    "itemName='" + itemName + '\'' +
                    "address='" + address + '\'' +
                    "tel='" + tel + '\'' +
                    "web='" + web + '\'' +
                    "desc='" + desc + '\'' +
                    "photoId='" + photoId + '\'' +
                    "drawableIconId='" + iconId +'\'' +
                    '}';
    }
}
