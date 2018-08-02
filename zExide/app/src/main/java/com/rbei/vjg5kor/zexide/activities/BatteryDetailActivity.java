package com.rbei.vjg5kor.zexide.activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.vision.barcode.Barcode;
import com.rbei.vjg5kor.zexide.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BatteryDetailActivity extends AppCompatActivity {

    @BindView(R.id.btAddBattery)
    Button btAddBattery;
    @BindView(R.id.tvModel)
    TextView tvModel;
    @BindView(R.id.tvType)
    TextView tvType;
    @BindView(R.id.tvBatteryAH)
    TextView tvBatteryAH;
    @BindView(R.id.parent_linear_layout)
    LinearLayout parentLinearLayout;
    @BindView(R.id.etScanResult)
    EditText etScanResult;
    //  private LinearLayout parentLinearLayout;
    public static final int REQUEST_CODE = 100;
    public static final int PERMISSION_REQUEST = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_detail);
        ButterKnife.bind(this);
        // parentLinearLayout = (LinearLayout) findViewById(R.id.parent_linear_layout);


        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PERMISSION_REQUEST);
        }
        btAddBattery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BatteryDetailActivity.this, ScanActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View rowView = inflater.inflate(R.layout.newbattery, null);
                // Add the new row before the add field button.
                parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() - 1);
            }
        });

    }

//    public void addBattery(View view) {
//
//
//        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        final View rowView = inflater.inflate(R.layout.newbattery, null);
//        // Add the new row before the add field button.
//        parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() - 1);
//
//    }

    public void onDelete(View v) {

        parentLinearLayout.removeView((View) v.getParent());
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if(data != null){




                final Barcode barcode = data.getParcelableExtra("barcode");
                etScanResult.post(new Runnable() {
                    @Override
                    public void run() {
                        etScanResult.setText(barcode.displayValue);
                    }
                });
            }
        }
    }
}
