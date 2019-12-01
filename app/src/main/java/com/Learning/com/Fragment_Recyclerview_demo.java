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
import java.util.List;

public class Fragment_Recyclerview_demo extends Fragment {
    RecyclerView recyclerView;
    Context context;
    private List<Ver> vers;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancetate) {
        View view = inflater.inflate(R.layout.fragment_recycler_view_demo, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager=new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        data();
        adapter();
        return view;
    }
    private void data(){
        vers=new ArrayList<>();
        for(int i=0;i<=5;i++){
            vers.add(new Ver("Android",R.drawable.icon));
        }

    }
    private void adapter(){
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(vers);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
class Ver{
    String name;
    int logo;
    Ver(String name,int logo){
        this.name=name;
        this.logo=logo;
    }
}
