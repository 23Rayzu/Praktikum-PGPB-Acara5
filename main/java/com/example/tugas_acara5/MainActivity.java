package com.example.tugas_acara5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Spinner spinnerKeterangan;
    private EditText editTextKeterangan;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        spinnerKeterangan = findViewById(R.id.spinnerKeterangan);
        editTextKeterangan = findViewById(R.id.editTextKeterangan);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Button onClick listener
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth() + 1;
                int year = datePicker.getYear();

                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                String keterangan = spinnerKeterangan.getSelectedItem().toString();
                String tambahanKeterangan = editTextKeterangan.getText().toString();

                // Show toast message with user input
                Toast.makeText(MainActivity.this,
                        "Presensi berhasil pada " + day + "/" + month + "/" + year +
                                " jam " + hour + ":" + minute + " dengan keterangan: " + keterangan +
                                ". Catatan: " + tambahanKeterangan,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
