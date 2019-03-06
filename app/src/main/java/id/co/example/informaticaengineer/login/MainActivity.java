package id.co.example.informaticaengineer.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText pasname, pasword;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pasname = findViewById(R.id.nama);
        pasword = findViewById(R.id.password);
        login = findViewById(R.id.botton);

    }
    public void movepage(View v){

        String stname = pasname.getText().toString();
        String stpasword = pasword.getText().toString();

        if (stname.equals("kempaka") && stpasword.equals("123456"))
        {
            Intent in = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(in);
        }
        else if (stname.equals("") || stpasword.equals(""))
        {
            Toast.makeText(getBaseContext(),"Salah Password",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getBaseContext(),"Password masih salah",Toast.LENGTH_SHORT).show();
        }
    }
}
