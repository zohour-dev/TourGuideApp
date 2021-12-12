package jo.zohour_zo3bi.android_app_developer.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {

    private final ArrayList<Item> restaurants = new ArrayList<>();

    public RestaurantsFragment() {
        // Required empty public constructor
    }//end constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        // Create the list of restaurants
        createRestaurantsList();

        // Define a recycler view and set a linear layout manager for it with a divider between its items
        RecyclerView restaurantsRecyclerView = rootView.findViewById(R.id.category_content_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        restaurantsRecyclerView.setLayoutManager(manager);
        restaurantsRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        // Create a custom adapter for binding the created recycler view
        // with items taken from the created list of restaurants
        ItemAdapter restaurantsAdapter = new ItemAdapter(getActivity(), restaurants);
        restaurantsRecyclerView.setAdapter(restaurantsAdapter);

        return rootView;
    }//end onCreateView()

    /**
     * Create an array list of the restaurants
     *
     */
    private void createRestaurantsList() {

        // adding items to the list
        restaurants.add(new Item(R.drawable.red_sea_grill,
                getString(R.string.red_sea_grill_restaurant_name),
                getString(R.string.red_sea_grill_restaurant_phone_number),
                getString(R.string.red_sea_grill_restaurant_description),
                getString(R.string.red_sea_grill_restaurant_location)));

        restaurants.add(new Item(R.drawable.alshami,
                getString(R.string.alshami_restaurant_name),
                getString(R.string.alshami_restaurant_phone_number),
                getString(R.string.alshami_restaurant_description),
                getString(R.string.alshami_restaurant_location)));

        restaurants.add(new Item(R.drawable.mirwas_restaurant_and_cafe,
                getString(R.string.mirwas_retaurant_name),
                getString(R.string.mirwas_retaurant_phone_number),
                getString(R.string.mirwas_retaurant_description),
                getString(R.string.mirwas_retaurant_location)));

        restaurants.add(new Item(R.drawable.khubza_w_seyneya,
                getString(R.string.khubza_seneya_restaurant_name),
                getString(R.string.khubza_seneya_restaurant_phone_number),
                getString(R.string.khubza_seneya_restaurant_description),
                getString(R.string.khubza_seneya_restaurant_location)));

        restaurants.add(new Item(R.drawable.burj_alhamam,
                getString(R.string.burj_alhamam_restaurant_name),
                getString(R.string.burj_alhamam_restaurant_phone_number),
                getString(R.string.burj_alhamam_restaurant_description),
                getString(R.string.burj_alhamam_restaurant_location)));

        restaurants.add(new Item(R.drawable.greek_corner,
                getString(R.string.greek_corner_retaurant_name),
                getString(R.string.greek_corner_retaurant_phone_number),
                getString(R.string.greek_corner_retaurant_description),
                getString(R.string.greek_corner_retaurant_location)));

        restaurants.add(new Item(R.drawable.captain,
                getString(R.string.captains_restaurant_name),
                getString(R.string.captains_restaurant_phone_number),
                getString(R.string.captains_restaurant_description),
                getString(R.string.captains_restaurant_location)));
    }//end createRestaurantsList()
}//end RestaurantsFragment
