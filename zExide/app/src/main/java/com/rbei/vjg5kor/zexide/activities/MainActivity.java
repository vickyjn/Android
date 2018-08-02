package com.rbei.vjg5kor.zexide.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rbei.vjg5kor.zexide.R;
import com.rbei.vjg5kor.zexide.adapters.TicketsRecyclerViewAdapter;
import com.rbei.vjg5kor.zexide.models.Ticket;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvTickets)
    RecyclerView rvTickets;
    private List<Ticket> tickets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initializeData();


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this.getApplicationContext());
        rvTickets.setHasFixedSize(true);
        rvTickets.setLayoutManager(linearLayoutManager);
        TicketsRecyclerViewAdapter adapter=new TicketsRecyclerViewAdapter(getApplicationContext(),tickets);
        rvTickets.setAdapter(adapter);
    }

    private void initializeData() {

        tickets = new ArrayList<>();
        tickets.add(new Ticket("https://cdn.pixabay.com/photo/2013/07/12/11/59/warning-145066_1280.png", "1234567890", "20/07/2017", "https://azure.microsoft.com/svghandler/app-service-mobile?width=600&height=315", "Vignesh", "+91 7760230189", "user@gmail.com", "653", "17th d main", "Bangalore", "KA", "560095", "PQW12340TW", "Li-ion 147", "AH342","653,17th d main road,koramangala,560095",12.9361148,77.6229113));
        tickets.add(new Ticket("https://cdn.pixabay.com/photo/2013/07/12/11/59/warning-145066_1280.png", "5678901234", "20/07/2017", "https://azure.microsoft.com/svghandler/app-service-mobile?width=600&height=315", "Thomas", "+91 8080980801", "user@gmail.com", "76", "Spurtank Road", "Chennai", "TN", "600031", "PQW12340TW", "Li-ion 147", "AH342","76,spurtank road,chetpet,chennai,600031",13.0703193,80.2456476));
        tickets.add(new Ticket("https://cdn.pixabay.com/photo/2013/07/12/11/59/warning-145066_1280.png", "5911234557", "20/07/2017", "https://azure.microsoft.com/svghandler/app-service-mobile?width=600&height=315", "Viki", "+14167983728", "user@gmail.com", "653", "17th d main", "Coimbatore", "TN", "560095", "PQW12340TW", "Li-ion 147", "AH342","76,spurtank road,chetper,chennai,600031",13.0703193,80.2456476));
        tickets.add(new Ticket("https://cdn.pixabay.com/photo/2013/07/12/11/59/warning-145066_1280.png", "1221234445", "20/07/2017", "https://azure.microsoft.com/svghandler/app-service-mobile?width=600&height=315", "Tom", "+14167983728", "user@gmail.com", "653", "17th d main", "Mysore", "KA", "560095", "PQW12340TW", "Li-ion 147", "AH342","76,spurtank road,chetper,chennai,600031",13.0703193,80.2456476));
        tickets.add(new Ticket("https://cdn.pixabay.com/photo/2013/07/12/11/59/warning-145066_1280.png", "1991234337", "20/07/2017", "https://azure.microsoft.com/svghandler/app-service-mobile?width=600&height=315", "John", "+14167983728", "user@gmail.com", "653", "17th d main", "Surat", "GJ", "560095", "PQW12340TW", "Li-ion 147", "AH342","76,spurtank road,chetper,chennai,600031",13.0703193,80.2456476));
    }
}
