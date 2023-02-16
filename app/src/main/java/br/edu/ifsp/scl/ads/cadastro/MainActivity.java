package br.edu.ifsp.scl.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import br.edu.ifsp.scl.ads.cadastro.model.Formulario;
import br.edu.ifsp.scl.ads.cadastro.model.Sex;

public class MainActivity extends AppCompatActivity {

    private EditText nameInp;
    private EditText phoneInp;
    private EditText emailInp;
    private CheckBox emailListChk;
    private RadioGroup sexRadioGroup;
    private RadioButton sexRadioMale;
    private RadioButton sexRadioFemale;
    private EditText cityInp;
    private Spinner ufSpin;
    private Button saveBtn;
    private Button cleanBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInp = (EditText) findViewById(R.id.nameInp);
        phoneInp = (EditText) findViewById(R.id.phoneInp);
        emailInp = (EditText) findViewById(R.id.emailInp);
        emailListChk = (CheckBox) findViewById(R.id.emailListChk);
        sexRadioGroup = (RadioGroup) findViewById(R.id.sexRadioGroup);
        sexRadioMale = (RadioButton) findViewById(R.id.sexRadioMale);
        sexRadioFemale = (RadioButton) findViewById(R.id.sexRadioFemale);
        cityInp = (EditText) findViewById(R.id.cityInp);
        ufSpin = (Spinner) findViewById(R.id.ufSpin);

        saveBtn = (Button) findViewById(R.id.saveBtn);
        cleanBtn = (Button) findViewById(R.id.cleanBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(nameInp.getText());
                String phone = String.valueOf(phoneInp.getText());
                String email = String.valueOf(emailInp.getText());
                boolean joinList = emailListChk.isChecked();
                Sex sex = sexRadioMale.isChecked() ? Sex.MALE : Sex.FEMALE;
                String city = String.valueOf(cityInp.getText());
                String uf = ufSpin.getSelectedItem().toString();

                Formulario form = Formulario.getInstance(
                        name,
                        phone,
                        email,
                        joinList,
                        sex,
                        city,
                        uf
                );

                Toast.makeText(getApplicationContext(), form.toString(), Toast.LENGTH_LONG).show();
            }
        });

        cleanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameInp.setText("");
                phoneInp.setText("");
                emailInp.setText("");
                emailListChk.setChecked(false);
                sexRadioGroup.check(R.id.sexRadioMale);
                cityInp.setText("");
                ufSpin.setSelection(0);
            }
        });
    }
}