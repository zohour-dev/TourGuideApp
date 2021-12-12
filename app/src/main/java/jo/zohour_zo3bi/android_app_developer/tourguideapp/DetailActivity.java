package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ImageView itemImage;
    private TextView itemName;
    private TextView itemDescription;
    private TextView itemLocation;
    private TextView itemPhoneNumber;
    private ImageView phoneIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Define the layouts in the activity
        itemImage = findViewById(R.id.detail_activity_image_view);
        itemName = findViewById(R.id.detail_activity_item_name_text_view);
        itemDescription = findViewById(R.id.detail_activity_item_description_text_view);
        itemLocation = findViewById(R.id.detail_activity_item_location_text_view);
        itemPhoneNumber = findViewById(R.id.detail_activity_item_phone_text_view);
        phoneIcon = findViewById(R.id.detail_activity_item_phone_image_view);

        // 1. Get the intent sent when an item within a fragment list was clicked
        // 2. Retrieve the extra data sent within the intent
        // 3. Set the retrieved data to its specified layouts
        Intent itemIntent = getIntent();
        itemImage.setImageResource(itemIntent.getIntExtra("ITEM_IMAGE_RESOURCE_ID", 0));
        itemName.setText(itemIntent.getStringExtra("ITEM_NAME"));
        this.setTitle(itemName.getText().toString());
        itemDescription.setText(itemIntent.getStringExtra("ITEM_DESCRIPTION"));
        itemLocation.setText(itemIntent.getStringExtra("ITEM_LOCATION"));

        // Check if the clicked item has a phone number
        // if yes then the phone icon image and the phone number will appear
        // otherwise the phone icon image will disappear
        String phoneNumber = itemIntent.getStringExtra("ITEM_PHONE_NUMBER");
        if (phoneNumber != null) {
            itemPhoneNumber.setText(phoneNumber);
            phoneIcon.setVisibility(View.VISIBLE);
        } else {
            phoneIcon.setVisibility(View.GONE);
        }//end if-else
    }//end onCreate()
}//end DetailActivity class
