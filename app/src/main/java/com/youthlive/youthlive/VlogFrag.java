package com.youthlive.youthlive;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TBX on 9/21/2017.
 */

public class VlogFrag extends Fragment {


    RecyclerView grid;
    GridLayoutManager manager;
    LiveAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vlog_frag_layout , container , false);

        grid = (RecyclerView)view.findViewById(R.id.grid);
        manager = new GridLayoutManager(getContext() , 2);


        adapter = new LiveAdapter(getContext());

        grid.setAdapter(adapter);
        grid.setLayoutManager(manager);


        return view;

    }


    public class LiveAdapter extends RecyclerView.Adapter<LiveAdapter.ViewHolder>
    {

        Context context;

        public LiveAdapter(Context context)
        {
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.vlog_list_model , parent , false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 14;
        }

        class ViewHolder extends RecyclerView.ViewHolder
        {

            public ViewHolder(View itemView) {
                super(itemView);
            }
        }
    }


}
