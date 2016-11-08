package bkoruznjak.from.hr.androidnarodniconcept;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bkoruznjak.from.hr.androidnarodniconcept.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnFirstTest.setOnClickListener(this);
        binding.btnSecondTest.setOnClickListener(this);
        binding.btnThirdTest.setOnClickListener(this);
        binding.btnFourthTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnFirstTest:
                Intent firstTestIntent = new Intent(this, FirstTestActivity.class);
                startActivity(firstTestIntent);
                break;
            case R.id.btnSecondTest:
                Intent secondTestIntent = new Intent(this, SecondTestActivity.class);
                startActivity(secondTestIntent);
                break;
            case R.id.btnThirdTest:
                break;
            case R.id.btnFourthTest:
                break;

        }
    }
}
