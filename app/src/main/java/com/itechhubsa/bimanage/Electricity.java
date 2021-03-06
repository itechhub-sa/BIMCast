package com.itechhubsa.bimanage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Electricity extends AppCompatActivity implements View.OnClickListener {
    private String _compare = "Electricity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electricity);
        initialize();
    }
    void initialize()
    {
        Button btnLightSwitch = findViewById(R.id.imgBtnLightSwitch);
        Button btnElectricalSockets = findViewById(R.id.btnElectricalSockets);
        Button btnElectronics = findViewById(R.id.btnElectronics);
        Button btnElectricityOther = findViewById(R.id.btnElectricityOther);
        btnLightSwitch.setOnClickListener(this);
        btnElectricalSockets.setOnClickListener(this);
        btnElectronics.setOnClickListener(this);
        btnElectricityOther.setOnClickListener(this);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getBaseContext(),Home.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.imgBtnLightSwitch:
                intent = new Intent(getBaseContext(),UnitMaintenance.class);
                intent.putExtra("_compare",_compare);
                intent.putExtra("_other",false);
                intent.putExtra("problem","Lights and Light Switches");
                startActivity(intent);
                finish();
                break;
            case R.id.btnElectricalSockets:
                intent = new Intent(getBaseContext(),UnitMaintenance.class);
                intent.putExtra("_compare",_compare);
                intent.putExtra("_other",false);
                intent.putExtra("problem","Electrical Sockets");
                startActivity(intent);
                finish();
                break;
            case R.id.btnElectronics:
                intent = new Intent(getBaseContext(),UnitMaintenance.class);
                intent.putExtra("_compare",_compare);
                intent.putExtra("_other",false);
                intent.putExtra("problem","Electronics");
                startActivity(intent);
                finish();
                break;
            case R.id.btnElectricityOther:
                intent = new Intent(getBaseContext(),UnitMaintenance.class);
                intent.putExtra("_compare",_compare);
                intent.putExtra("_other",true);
                intent.putExtra("problem","Other specification");
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }
}
