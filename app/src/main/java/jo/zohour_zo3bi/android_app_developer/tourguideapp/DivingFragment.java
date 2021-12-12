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
public class DivingFragment extends Fragment {

    private ArrayList<Item> divingCenters = new ArrayList<>();

    public DivingFragment() {
        // Required empty public constructor
    }//end constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        // Create the list of diving centers
        createDivingCentersList();

        // Define a recycler view and set a linear layout manager for it with a divider between its items
        RecyclerView divingCentersRecyclerView = rootView.findViewById(R.id.category_content_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        divingCentersRecyclerView.setLayoutManager(manager);
        divingCentersRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        // Create a custom adapter for binding the created recycler view
        // with items taken from the created list of diving centers
        ItemAdapter divingCentersAdapter = new ItemAdapter(getActivity(), divingCenters);
        divingCentersRecyclerView.setAdapter(divingCentersAdapter);

        return rootView;
    }//end onCreateView()

    /**
     * Create an array list of the diving centers
     *
     */
    private void createDivingCentersList() {

        // adding items to the list
        divingCenters.add(new Item(R.drawable.coral_garden_diving_center,
                getString(R.string.coral_garden_diving_center_name),
                getString(R.string.coral_garden_diving_center_phone_number),
                getString(R.string.coral_garden_diving_center_description),
                getString(R.string.coral_garden_diving_center_location)));

        divingCenters.add(new Item(R.drawable.deep_blue_dive_center,
                getString(R.string.deep_blue_dive_center_name),
                getString(R.string.deep_blue_dive_center_phone_number),
                getString(R.string.deep_blue_dive_center_description),
                getString(R.string.deep_blue_dive_center_location)));

        divingCenters.add(new Item(R.drawable.arab_divers,
                getString(R.string.arab_divers_name),
                getString(R.string.arab_divers_phone_number),
                getString(R.string.arab_divers_description),
                getString(R.string.arab_divers_location)));

        divingCenters.add(new Item(R.drawable.aqaba_pro_divers,
                getString(R.string.aqaba_pro_divers_name),
                getString(R.string.aqaba_pro_divers_phone_number),
                getString(R.string.aqaba_pro_divers_description),
                getString(R.string.aqaba_pro_divers_location)));

        divingCenters.add(new Item(R.drawable.red_coral_dive_center,
                getString(R.string.red_coral_dive_center_name),
                getString(R.string.red_coral_dive_center_phone_number),
                getString(R.string.red_coral_dive_center_description),
                getString(R.string.red_coral_dive_center_location)));

        divingCenters.add(new Item(R.drawable.aqaba_adventure_divers,
                getString(R.string.aqaba_adventure_divers_name),
                getString(R.string.aqaba_adventure_divers_phone_number),
                getString(R.string.aqaba_adventure_divers_description),
                getString(R.string.aqaba_adventure_divers_location)));

        divingCenters.add(new Item(R.drawable.ahlan_aqaba_scuba_diving_center,
                getString(R.string.ahlan_aqaba_scuba_diving_center_name),
                getString(R.string.ahlan_aqaba_scuba_diving_center_phone_number),
                getString(R.string.ahlan_aqaba_scuba_diving_center_description),
                getString(R.string.ahlan_aqaba_scuba_diving_center_location)));
    }//end createDivingCentersList()
}//end DivingFragment
