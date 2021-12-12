package jo.zohour_zo3bi.android_app_developer.tourguideapp;

public class Item {
    private int ImgResourceId;
    private String itemName;
    private String phoneNumber;
    private String description;
    private String location;
    private boolean hasPhoneNumber;

    public Item(int imgResourceId, String itemName, String phoneNumber, String description, String location) {
        ImgResourceId = imgResourceId;
        this.itemName = itemName;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.location = location;
        this.hasPhoneNumber = true;
    }//end constructor

    public Item(int imgResourceId, String itemName, String description, String location) {
        ImgResourceId = imgResourceId;
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.hasPhoneNumber = false;
    }//end constructor

    public int getImgResourceId() {
        return ImgResourceId;
    }//end getImgResourceId()

    public String getItemName() {
        return itemName;
    }//end getItemName()

    public String getPhoneNumber() {
        return phoneNumber;
    }//end getPhoneNumber()

    public String getDescription() {
        return description;
    }//end getDescription()

    public String getLocation() {
        return location;
    }//end getLocation()

    public boolean isHasPhoneNumber() {
        return hasPhoneNumber;
    }//end isHasPhoneNumber()
}//end Item class
