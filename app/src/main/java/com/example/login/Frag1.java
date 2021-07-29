package com.example.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Frag1 extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.frag1_home, container,false);

        RecyclerView view2 = (RecyclerView)view.findViewById(R.id.main_recyclerview);
        view2.setLayoutManager(new LinearLayoutManager(getContext()));

        view2.setAdapter(new MyRecyclerViewAdapter());
        return view;
           }

}

