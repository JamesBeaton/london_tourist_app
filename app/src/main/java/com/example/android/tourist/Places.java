package com.example.android.tourist;

public class Places {

    /* name of place for the place */
    private String mPlaceId;
    /* image resource id for the place */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /* constructor */
    public Places(String PlaceId, int ImageResourceId) {
        mPlaceId = PlaceId;
        mImageResourceId = ImageResourceId;
    }

    /* getter method */
    public String getmPlaceId() {
        return mPlaceId;
    }

    /* because the int variable was initialised in the place constructor above
     any outside caller can assess it through this public method */
    /* getter method */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * boolean method is exposed to return an image
     */
    /* getter method */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}