package com.example.android.visitcbe;

/**
 * Created by LENOVO on 22-06-2017.
 */

public class Info {

    //Name of the place(Temple,college,food,tourist,places)
    private String mNameId;

    // Description of the place(Temple,college,food,tourist,places)
    private String mDescriptionId;

    //Image of the place(Temple,college,food,tourist,places)
   // private int mImageId;

    public Info(String nameId, String descriptionId ){
        mNameId = nameId;
        mDescriptionId = descriptionId;
       // mImageId = imageId;
    }
    public String getNameId(){
        return mNameId;
    }
    public String getmDescriptionId(){
        return mDescriptionId;
    }

}
