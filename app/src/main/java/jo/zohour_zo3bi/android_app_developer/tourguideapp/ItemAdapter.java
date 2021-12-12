package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Item> itemsList;

    public ItemAdapter(Context context, ArrayList<Item> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }//end constructor

    // Inflating an item layout from xml and returning a view holder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(context, itemView);
    }//end onCreateViewHolder()

    // Populating data into the item view components through holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = itemsList.get(position);

        ImageView itemImageView = holder.itemImage;
        itemImageView.setImageResource(item.getImgResourceId());

        TextView itemNameTextView = holder.itemName;
        itemNameTextView.setText(item.getItemName());

        TextView itemPhoneTextView = holder.itemPhoneNumber;
        // Check if an item has a phone number
        if (item.isHasPhoneNumber()) {
            itemPhoneTextView.setText(item.getPhoneNumber());
            itemPhoneTextView.setVisibility(View.VISIBLE);
        } else {
            itemPhoneTextView.setVisibility(View.GONE);
        }//end if-else
    }//end onBindViewHolder()

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return itemsList.size();
    }//end getItemCount()

    // Provide a direct reference to each of the subviews within a view item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Context context; // to check later on!
        private ImageView itemImage;
        private TextView itemName;
        private TextView itemPhoneNumber;

        public ViewHolder(Context context, @NonNull View itemView) {
            super(itemView);
            this.context = context;

            // Find the subviews for each item view (row)
            this.itemImage = itemView.findViewById(R.id.list_item_image_view);
            this.itemName = itemView.findViewById(R.id.list_item_text_view);
            this.itemPhoneNumber = itemView.findViewById(R.id.list_item_phone_text_view);

            // Make each item row clickable by using setOnClickListener
            itemView.setOnClickListener(this);
        }//end constructor

        // Set the action to be taken when an item view is clicked
        @Override
        public void onClick(View v) {
            // Get the selected item (clicked row) position & retrieve it's information
            // to send them to the DetailActivity using an intent!
            int position = getAdapterPosition();
            Item selectedItem = itemsList.get(position);
            int itemImageResourceId = selectedItem.getImgResourceId();
            String itemName = selectedItem.getItemName();
            String itemDescription = selectedItem.getDescription();
            String itemLocation = selectedItem.getLocation();
            String itemPhoneNumber = selectedItem.getPhoneNumber();

            // Check if the clicked item view is exist! if yes, an intent will be sent to the detail activity
            if (position != RecyclerView.NO_POSITION) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("ITEM_IMAGE_RESOURCE_ID", itemImageResourceId);
                intent.putExtra("ITEM_NAME", itemName);
                intent.putExtra("ITEM_DESCRIPTION", itemDescription);
                intent.putExtra("ITEM_LOCATION", itemLocation);

                // check if the clicked item has a phone number
                if (selectedItem.isHasPhoneNumber()) {
                    intent.putExtra("ITEM_PHONE_NUMBER", itemPhoneNumber);
                }//end if

                context.startActivity(intent);
            }//end if
        }//end onClick()
    }//end ViewHolder class
}// end ItemAdapter class
