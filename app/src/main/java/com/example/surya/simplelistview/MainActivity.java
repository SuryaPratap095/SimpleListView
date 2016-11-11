package com.example.surya.simplelistview;

import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] Array={"Android","Iphone","Windows","Balckberrys","BADA","Aqua"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_view,Array);

        Person p1=new Person("Surya","Pratap",25,"Pune");
        Person p2=new Person("Ravi","Saraswat",23,"Jaipur");
        Person p3=new Person("Adam","dsffg",27,"Kota");
        Person p4=new Person("Sachin","Pratap",28,"Mumbai");
        Person p5=new Person("Ashwin","Pratap",25,"Banglore");
        Person p6=new Person("VIrat","Pratap",22,"Pune");
        ArrayList<Person> person=new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);
        person.add(p6);
        person.add(p6);
        PersonAdapter personAdapter=new PersonAdapter(this,person);






        final ListView listView=(ListView)findViewById(R.id.listValues);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int postion, long id) {
                String value=listView.getItemAtPosition(postion).toString();
                Toast.makeText(getApplicationContext(),"Item Clicked: "+value,Toast.LENGTH_LONG).show();
            }
        });
        //listView.setAdapter(adapter);

        listView.setAdapter(personAdapter);
    }
}
