package com.rbei.vjg5kor.zexide.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.rbei.vjg5kor.zexide.R;
import com.rbei.vjg5kor.zexide.models.Ticket;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TicketDetailActivity extends AppCompatActivity {

    @BindView(R.id.tvCustomerDetail)
    TextView tvCustomerDetail;
    @BindView(R.id.tvCustomerName)
    TextView tvCustomerName;
    @BindView(R.id.tvCustomerMobile)
    TextView tvCustomerMobile;
    @BindView(R.id.tvCustomerEmail)
    TextView tvCustomerEmail;
    @BindView(R.id.tvCustomerAddress)
    TextView tvCustomerAddress;
    @BindView(R.id.tvCustomerBuilding)
    TextView tvCustomerBuilding;
    @BindView(R.id.tvCustomerStreet)
    TextView tvCustomerStreet;
    @BindView(R.id.tvCustomerCity)
    TextView tvCustomerCity;
    @BindView(R.id.tvCustomerState)
    TextView tvCustomerState;
    @BindView(R.id.tvCustomerPinCode)
    TextView tvCustomerPinCode;

    Ticket ticket;
    @BindView(R.id.tvTicketNo)
    TextView tvTicketNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_detail);
        ButterKnife.bind(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ticket = (Ticket) extras.getSerializable("Ticket");
            tvTicketNo.setText(ticket.getTicketNo());
//            tvCustomerDetail.setText(ticket.getTicketNo());
            tvCustomerName.setText(ticket.getCustomerName());
            tvCustomerMobile.setText(ticket.getCustomerMobileNo());
            tvCustomerEmail.setText(ticket.getCustomerEmail());
            tvCustomerBuilding.setText(ticket.getCustomerBuildingNo());
            tvCustomerStreet.setText(ticket.getCustomerStreet());
            tvCustomerCity.setText(ticket.getCustomerCity());
            tvCustomerPinCode.setText(ticket.getCustomerPinCode());


        }
    }

    public void showMap(View view) {
        String urlAddress = "https://www.google.co.in/maps/place/" + ticket.getCustomerAddress() + "";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
        startActivity(intent);

    }

    public void startService(View view) {
        String ticket = tvCustomerDetail.getText().toString();
        Intent intent = new Intent(this.getApplicationContext(), BatteryDetailActivity.class);
        intent.putExtra("Ticket", ticket);
        this.startActivity(intent);

    }
}