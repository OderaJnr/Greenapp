package com.example.greenpapmockup.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.greenpapmockup.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);



        Spinner TypeSpinner = root.findViewById(R.id.seedtypespinner);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("County");
        arrayList.add("Kiambu");
        arrayList.add("Kakamega");
        arrayList.add("Kwale");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        TypeSpinner.setAdapter(arrayAdapter);
        TypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String county = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });


        Spinner CountySpinner = root.findViewById(R.id.countyspinner);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("sub-county");
        arrayList2.add("A");
        arrayList2.add("B");
        arrayList2.add("C");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, arrayList2);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CountySpinner.setAdapter(arrayAdapter2);
        CountySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String subcounty = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });



        Spinner Subcountyspiner = root.findViewById(R.id.sub_countyspiner);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Ward");
        arrayList3.add("ward A");
        arrayList3.add("ward B");
        arrayList3.add("ward C");
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, arrayList3);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Subcountyspiner.setAdapter(arrayAdapter3);
        Subcountyspiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String ward = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });








        return root;
    }
}