package com.Learning.com;

import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables

    Context mContext;
    LayoutInflater inflater;
    private List<VersionNames> versionNamesList = null;
    private ArrayList<VersionNames> arraylist;

    public ListViewAdapter(Context context, List<VersionNames> versionNamesList) {
        mContext = context;
        this.versionNamesList = versionNamesList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<VersionNames>();
        this.arraylist.addAll(versionNamesList);
    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return versionNamesList.size();
    }

    @Override
    public VersionNames getItem(int position) {
        return versionNamesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_items, null);
            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(versionNamesList.get(position).getVersionNames());
        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        versionNamesList.clear();
        if (charText.length() == 0) {
            versionNamesList.addAll(arraylist);
        } else {
            for (VersionNames wp : arraylist) {
                if (wp.getVersionNames().toLowerCase(Locale.getDefault()).contains(charText)) {
                    versionNamesList.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }

}