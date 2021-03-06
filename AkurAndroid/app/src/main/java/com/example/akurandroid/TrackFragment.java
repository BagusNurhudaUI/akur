package com.example.akurandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TrackFragment extends Fragment {
    private RecyclerView rvShipmentTrack;
    private ArrayList<Shipment> list = new ArrayList<>();
    private ArrayList<Shipment> newList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_track, container, false);
        rvShipmentTrack = v.findViewById(R.id.rv_row_track);
        rvShipmentTrack.setHasFixedSize(true);
        list.addAll(ShipmentData.getListData());
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).isAppear()){
                newList.add(list.get(i));
            }
        }
        rvShipmentTrack.setLayoutManager(new LinearLayoutManager(v.getContext()));
        ListShipmentTrackAdapter listShipmentTrackAdapter = new ListShipmentTrackAdapter(newList);
        rvShipmentTrack.setAdapter(listShipmentTrackAdapter);
        return v;
    }
}
