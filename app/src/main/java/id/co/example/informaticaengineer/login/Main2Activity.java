package id.co.example.informaticaengineer.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.idbtnActivity1)
    public void listMenu1() {
        Intent intent = new Intent(getApplicationContext(), sejarah_kempaka.class);
        startActivity(intent);
    }

    @OnClick(R.id.idbtnActivity2)
    public void listMenu2() {
        Intent intent = new Intent(getApplicationContext(), adrt_kempaka.class);
        startActivity(intent);
    }

    @OnClick(R.id.idbtnActivity3)
    public void listMenu3() {
        Intent intent = new Intent(getApplicationContext(), arah_kempaka.class);
        startActivity(intent);
    }

    @OnClick(R.id.idbtnActivity4)
    public void listMenu4() {
        Intent intent = new Intent(getApplicationContext(),MainActivity_data.class);
        startActivity(intent);
    }
}