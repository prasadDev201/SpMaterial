package main.materialdesign.spm.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import main.materialdesign.recycle.ObjectCountry;

/**
 * Created by sibaprasad.mohanty on 10/3/2015.
 */
public class RecyclerViewActivity extends AppCompatActivity {

    String[] arr = {"India","CHina","USA","AUSTRELIA","SOUTH AFRICA","NEWzland","WEST INDIZE","PAKISTAN","NEPAL","India","CHina","USA","AUSTRELIA","SOUTH AFRICA","NEWzland","WEST INDIZE","PAKISTAN","NEPAL","India","CHina","USA","AUSTRELIA","SOUTH AFRICA","NEWzland","WEST INDIZE","PAKISTAN","NEPAL"};

    RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);

        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);


        adapter = new RecyclerViewAdapter(createList());
        recyclerView.setAdapter(adapter);
        recyclerView.setClipToPadding(true);
    }
    private List<ObjectCountry> createList( ) {

        List<ObjectCountry> result = new ArrayList<ObjectCountry>();
        for (int i=1; i < arr.length; i++) {
            ObjectCountry ci = new ObjectCountry(arr[i-1],""+i,""+100000*i);


            result.add(ci);

        }

        return result;
    }
}
