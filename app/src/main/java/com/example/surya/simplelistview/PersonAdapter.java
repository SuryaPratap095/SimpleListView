package com.example.surya.simplelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by surya on 11/11/16.
 */
public class PersonAdapter extends ArrayAdapter<Person> {

    private Context context;
    private ArrayList<Person> arrayList;
    public PersonAdapter(Context context, ArrayList<Person> objects) {
        super(context,0, objects);
        this.context=context;
        this.arrayList=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Person p1 =new Person("Surya","Pratap",25,"Pune");
        Person p=arrayList.get(position);

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listViewItem=inflater.inflate(R.layout.list_view_2,parent,false);
        TextView txtFirstName=(TextView)listViewItem.findViewById(R.id.txtFirstName);
        TextView txtLastName=(TextView)listViewItem.findViewById(R.id.txtLastName);
     //   TextView txtView=listViewItem.findViewById(R.id.)
        //arrayList.get(getPosition(getN))
        txtFirstName.setText(p.getFirstName());
        //txtFirstName.setText(arrayList.get(position).toString());
        txtLastName.setText(arrayList.get(position).toString());
        return listViewItem;
    }
}
