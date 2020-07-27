package com.puhor.test_ui.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.puhor.test_ui.MainActivity;
import com.puhor.test_ui.R;
import com.puhor.test_ui.Utils;

public class HomeFragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;
    ArrayAdapter<String> listviewAdapter;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        String[] itemsList = {"i1","i2"};
        listView = root.findViewById(R.id.listview);

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.item_element1) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View itemView = super.getView(position, convertView, parent);
                if (Utils.items_id == position)
                    itemView.setBackgroundColor(0xA0FF8000); // orange
                else
                    itemView.setBackgroundColor(Color.TRANSPARENT);
                return itemView;
            }
        };

        listviewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                itemsList
        );
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Utils.items_id = position;
                view.setBackgroundColor(0xA0FF8000); // orange
                adapter.notifyDataSetChanged();

            }
        });

        return root;
    }
}