package com.example.akurandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private TextView tv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        tv = v.findViewById(R.id.tv_home_fragment);
        String result = getActivity().getIntent().getStringExtra("EXTRA_SCAN_RESULT");
        //tv.setText(result);
        if(result != null){
            tv.setText(result);
        }
        return v;
    }

    public void setText(String result){
        tv.setText(result);
    }
}
