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
public class HotelsFragment extends Fragment {

    private final ArrayList<Item> hotels = new ArrayList<>();

    public HotelsFragment() {
        // Required empty public constructor
    }//end constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        // Create the list of hotels
        createHotelsList();

        // Define a recycler view and set a linear layout manager for it with a divider between its items
        RecyclerView hotelsRecyclerView = rootView.findViewById(R.id.category_content_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        hotelsRecyclerView.setLayoutManager(manager);
        hotelsRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        // Create a custom adapter for binding the created recycler view
        // with items taken from the created list of hotels
        ItemAdapter hotelsAdapter = new ItemAdapter(getActivity(), hotels);
        hotelsRecyclerView.setAdapter(hotelsAdapter);

        return rootView;
    }//end onCreateView()

    /**
     * Create an array list of the hotels
     *
     */
    private void createHotelsList() {

        // adding items to the list
        hotels.add(new Item(R.drawable.almanara_aluxury_collection_hotel_saraya_aqaba,
                getString(R.string.almanara_hotel_name),
                getString(R.string.almanara_hotel_phone_number),
                getString(R.string.almanara_hotel_description),
                getString(R.string.almanara_hotel_location)));

        hotels.add(new Item(R.drawable.inter_continental_aqaba_resort,
                getString(R.string.interContinental_hotel_name),
                getString(R.string.interContinental_hotel_phone_number),
                getString(R.string.interContinental_hotel_description),
                getString(R.string.interContinental_hotel_location)));

        hotels.add(new Item(R.drawable.hyatt_regency_aqaba_ayla_resort,
                getString(R.string.hayat_hotel_name),
                getString(R.string.hayat_hotel_phone_number),
                getString(R.string.hayat_hotel_description),
                getString(R.string.hayat_hotel_location)));

        hotels.add(new Item(R.drawable.movenpick_resort__residences_aqaba,
                getString(R.string.movenpick_hotel_name),
                getString(R.string.movenpick_hotel_phone_number),
                getString(R.string.movenpick_hotel_description),
                getString(R.string.movenpick_hotel_location)));

        hotels.add(new Item(R.drawable.movenpick_resort__spa_tala_bay_aqaba,
                getString(R.string.movenpick_spa_hotel_name),
                getString(R.string.movenpick_spa_hotel_phone_number),
                getString(R.string.movenpick_spa_hotel_description),
                getString(R.string.movenpick_spa_hotel_location)));

        hotels.add(new Item(R.drawable.kempinski_hotel_aqaba,
                getString(R.string.kempinski_hotel_name),
                getString(R.string.kempinski_hotel_phone_number),
                getString(R.string.kempinski_hotel_description),
                getString(R.string.kempinski_hotel_location)));

        hotels.add(new Item(R.drawable.double_tree_by_hilton_hotel_aqaba,
                getString(R.string.double_tree_hotel_name),
                getString(R.string.double_tree_hotel_phone_number),
                getString(R.string.double_tree_hotel_description),
                getString(R.string.double_tree_hotel_location)));
    }//end createHotelsList()
}//end HotelsFragment
