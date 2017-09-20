package com.youthlive.youthlive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Vlog extends Fragment{

    RecyclerView recyclerView;
    GridLayoutManager manager;
    VlogAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vlog , container , false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler);
        manager = new GridLayoutManager(getContext(),2);
        adapter = new VlogAdapter(getContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
