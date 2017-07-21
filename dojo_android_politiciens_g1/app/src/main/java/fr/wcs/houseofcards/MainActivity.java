package fr.wcs.houseofcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ListView polList;
    private ArrayList<Politicien> arrayPol;
    private PoliticienAdapter mAdapter;
    private CheckBox mCheckBoxdepute;
    private CheckBox mCheckBoxMinistre;
    private StringBuffer stringBuffer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        polList = (ListView) findViewById(R.id.polist);
        arrayPol = new ArrayList<>();
        mCheckBoxdepute = (CheckBox) findViewById(R.id.checkBoxDeputes);
        mCheckBoxMinistre = (CheckBox) findViewById(R.id.checkBoxMinistre);
        mCheckBoxdepute.setOnCheckedChangeListener(this);
        mCheckBoxMinistre.setOnCheckedChangeListener(this);
        stringBuffer = new StringBuffer();
        stringBuffer.setLength(2);
        stringBuffer.setCharAt(0, Character.forDigit(Politicien.DEPUTE, 10));
        stringBuffer.setCharAt(1, Character.forDigit(Politicien.MINISTRE, 10));

        arrayPol.add(new Ministre(12000, 9999999, Parti.PS, "Valls"));
        arrayPol.add(new Depute(1000, 999, Parti.EELV, true, "Jean Pascal"));
        arrayPol.add(new Ministre(12000, 7837, Parti.PS, "El Khomri"));
        arrayPol.add(new Depute(12000, 9999999, Parti.FN, false, "Marine"));
        arrayPol.add(new Ministre(12000, 9999999, Parti.PS, "Valls"));
        arrayPol.add(new Ministre(12000, 9999999, Parti.PS, "Valls"));

        mAdapter = new PoliticienAdapter(arrayPol, R.layout.politician_item, this);

        polList.setAdapter(mAdapter);

        polList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                arrayPol.get(position).bullshit();
                mAdapter.notifyDataSetChanged();
            }
        });


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.checkBoxDeputes:
                if (isChecked){
                    stringBuffer.setCharAt(0, Character.forDigit(Politicien.DEPUTE, 10));
                }
                else{
                    stringBuffer.setCharAt(0, 'A');
                }
                break;
            case R.id.checkBoxMinistre:
                if (isChecked){
                    stringBuffer.setCharAt(1, Character.forDigit(Politicien.MINISTRE, 10));
                }
                else{
                    stringBuffer.setCharAt(1, 'A');
                }
                break;
        }

        PoliticienAdapter checkAdapter = new PoliticienAdapter(arrayPol, R.layout.politician_item, this);
        checkAdapter.getFilter().filter(stringBuffer);
        polList.setAdapter(checkAdapter);
        polList.deferNotifyDataSetChanged();

    }
}
