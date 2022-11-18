package karlos.ejerciciostatus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mat;
    private EditText fis;
    private EditText qui;
    private TextView sta;
    public Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mat = (EditText) findViewById(R.id.txtMatematicas);
        fis = (EditText) findViewById(R.id.txtFisica);
        qui = (EditText) findViewById(R.id.txtQuimica);
        sta = (TextView) findViewById(R.id.statusAlumn);
        boton = (Button) findViewById(R.id.botonEvaluar);

        boton.setOnClickListener(view -> Status(sta));
    }


    public void Status(View view) {
        String matematicasString = mat.getText().toString();
        String fisicaString = fis.getText().toString();
        String quiString = qui.getText().toString();

        int matematicasInt = Integer.parseInt(matematicasString);
        int fisicaInt = Integer.parseInt(fisicaString);
        int quimicaInt = Integer.parseInt(quiString);

        int promedio = (matematicasInt + fisicaInt + quimicaInt) / 3;


        if (promedio >= 6) {
            sta.setText(String.format("%s%s", getString(R.string.Aprobado), promedio));
        } else {
            sta.setText(String.format("%s%s", getString(R.string.Reprobado), promedio));
        }

    }

}
