package com.Learning.com;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;

public class Fragment_Recyclerview_inside_recyclerview extends Fragment {
    RecyclerView rvVertical;


    ArrayList<VerticalModel> mArrayList = new ArrayList<>();
    Context context;

    VerticalRecyclerViewAdapter mAdapter;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_recyclerview_inside_recyclerview, container, false);
        rvVertical=(RecyclerView)view.findViewById(R.id.rvVertical);
        rvVertical.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

        mAdapter = new VerticalRecyclerViewAdapter(getActivity(), mArrayList);

        rvVertical.setAdapter(mAdapter);

        setDataOnVerticalRecyclerView();
        return view;
    }
    private void setDataOnVerticalRecyclerView() {
        for (int i = 1; i <= 5; i++) {

            VerticalModel mVerticalModel = new VerticalModel();

            mVerticalModel.setTitle("Title " + i);

            ArrayList<HorizontalModel> arrayList = new ArrayList<>();

            for (int j = 0; j <= 5; j++) {
                HorizontalModel mHorizontalModel = new HorizontalModel();
                mHorizontalModel.setDescription("Description : " + j);
                mHorizontalModel.setName("Name : " + j);
                arrayList.add(mHorizontalModel);
            }

            mVerticalModel.setArrayList(arrayList);

            mArrayList.add(mVerticalModel);

        }
        mAdapter.notifyDataSetChanged();
    }
}
