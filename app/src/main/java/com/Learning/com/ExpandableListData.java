package com.Learning.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListData {
    public static HashMap<String , List<String>> getData(){
        HashMap<String,List<String>> expandableListDetail=new HashMap<String, List<String>>();

        List<String> BikeList = new ArrayList<>();
        BikeList.add("\u2022\tYamaha");
        BikeList.add("\u2022\tHonda");
        BikeList.add("\u2022\tBajaj");
        BikeList.add("\u2022\tKTM");
        BikeList.add("\u2022\tKawasaki");
        BikeList.add("\u2022\tDucati");
        BikeList.add("\u2022\tRoyal Enfield");
        BikeList.add("\u2022\tSuzuki");
        BikeList.add("\u2022\tBeneli");

        List<String> CarList = new ArrayList<>();
        CarList.add("\u2022\tAudi");
        CarList.add("\u2022\tTata");
        CarList.add("\u2022\tDatsun ");
        CarList.add("\u2022\tMaruthi");
        CarList.add("\u2022\tRenault ");
        CarList.add("\u2022\tFord");


        expandableListDetail.put("Bike Products",BikeList);
        expandableListDetail.put("Car Products",CarList);






        return expandableListDetail;
    }
}



