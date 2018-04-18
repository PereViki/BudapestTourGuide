package com.example.android.budapesttourguide;

/**
 * {@link Location} represents a location that the user wants to list.
 * It contains the location's name, description, address, opening hours, phone number, price range,
 * and its photo.
 */

public class Location {

    /**
     * Constant value that represents no phone number was provided for this location
     */
    private static final String NO_PHONE_NUMBER_PROVIDED = "";
    /**
     * Constant value that represents no opening hours was provided for this location
     */
    private static final String NO_OPENING_HOURS_PROVIDED = "";
    /**
     * Name of the location
     */
    private String mLocationName;
    /**
     * Description of the location
     */
    private String mLocationDescription;
    /**
     * Address of the location
     */
    private String mLocationAddress;
    /**
     * Opening hours of the location
     */
    private String mLocationOpeningHours = NO_OPENING_HOURS_PROVIDED;
    /**
     * Phone number of the location
     */
    private String mLocationPhone = NO_PHONE_NUMBER_PROVIDED;
    /**
     * Image of the location
     */
    private int mLocationImageResourceId;
    /**
     * TODO delete this
     */
    private int mPronunciationResourceID;

    /**
     * @param locationName            Name of the location
     * @param locationDescription     Description of the location
     * @param locationAddress         Address of the location
     * @param locationOpeningHours    Opening hours of the location
     * @param locationPhone           Phone number of the location
     * @param locationImageResourceId Resource ID of the image of the location
     */
    public Location(
            String locationName,
            String locationDescription,
            String locationAddress,
            String locationOpeningHours,
            String locationPhone,
            int locationImageResourceId) {

        mLocationName = locationName;
        mLocationDescription = locationDescription;
        mLocationAddress = locationAddress;
        mLocationOpeningHours = locationOpeningHours;
        mLocationPhone = locationPhone;
        mLocationImageResourceId = locationImageResourceId;

    }

    /**
     * @param locationName            Name of the location
     * @param locationDescription     Description of the location
     * @param locationAddress         Address of the location
     * @param locationImageResourceId Resource ID of the image of the location
     */
    public Location(
            String locationName,
            String locationDescription,
            String locationAddress,
            int locationImageResourceId) {

        mLocationName = locationName;
        mLocationDescription = locationDescription;
        mLocationAddress = locationAddress;
        mLocationImageResourceId = locationImageResourceId;

    }

    /**
     * Get the name of the location.
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the description of the location..
     */
    public String getLocationDescription() {
        return mLocationDescription;
    }

    /**
     * Get the address of the location..
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * Get the opening hours of the location..
     */
    public String getLocationOpeningHours() {
        return mLocationOpeningHours;
    }

    /**
     * Get the phone number of the location..
     */
    public String getLocationPhone() {
        return mLocationPhone;
    }

    /**
     * Get the image resource ID of the location.
     */
    public int getLocationImageResourceId() {
        return mLocationImageResourceId;
    }

    /**
     * Returns whether or not there is a phone number for this location.
     */
    public boolean hasPhone() {
        return mLocationPhone != NO_PHONE_NUMBER_PROVIDED;
    }

    /**
     * Returns whether or not there is opening hours for this location.
     */
    public boolean hasOpening() {
        return mLocationOpeningHours != NO_OPENING_HOURS_PROVIDED;
    }

}
