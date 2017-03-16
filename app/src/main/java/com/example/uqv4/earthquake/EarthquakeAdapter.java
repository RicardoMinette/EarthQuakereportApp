package com.example.uqv4.earthquake;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by UQV4 on 15/03/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<EarthQuake> {


    //construtor
    public EarthquakeAdapter(Activity context, ArrayList<EarthQuake> earthQuakes){
        super(context,0,earthQuakes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView=convertView;

        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_view_layout,parent,false);
        }
        EarthQuake currentEarthQuake = getItem(position);

        TextView magnitudeView=(TextView) listItemView.findViewById(R.id.magnitude);
        TextView cityView=(TextView) listItemView.findViewById(R.id.city);
        TextView dataView=(TextView) listItemView.findViewById(R.id.date);

        magnitudeView.setText(currentEarthQuake.getMag());
        cityView.setText(currentEarthQuake.getCity());
        dataView.setText(currentEarthQuake.getDate());

        return  listItemView;
    }


}
