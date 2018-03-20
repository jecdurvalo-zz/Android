package br.com.fiap.dialogs;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlert(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.eu_sou_um_alertdialog);
        builder.setMessage(R.string.eu_funciono);
        builder.setCancelable(true);
        builder.setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, R.string.fechei, Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void abrirProgress(View view) {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle(getString(R.string.eu_sou_um_dialog));
        pd.setMessage(getString(R.string.aguarde_um_momento));
        pd.show();
    }

    public void abrirAlertDialog(View view) {
        final String[] itens = {"Fácil", "Médio", "Dificil"}; // Array

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.alert_com_items);
        builder.setItems(itens, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, R.string.selecionei_mais_itens + itens[1],
                        Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();


    }

    public void abrirDatePicker(View view) {
        DatePickerDialog picker = new DatePickerDialog(
                this,
                new DatePickerDialog.OnDateSetListener() {
                 @Override
                  public void onDateSet(DatePicker datePicker, int day, int month, int year) {
                     Toast.makeText(MainActivity.this, String.format("%d,%d,%d", day, month + 1, year),
                             Toast.LENGTH_SHORT).show();
            }
        },
                2018,
                3,
                20
        );
        picker.show();
    }

    public void abrirTimePicker(View view) {
        TimePickerDialog tp = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                Toast.makeText(MainActivity.this,String.format("%d:%d", hourOfDay, minute),
                        Toast.LENGTH_SHORT).show();
            }
        },
                11,
                25,
                true
        );
        tp.show();
    }

    public void abrirDialogPersonalizado(View view) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_personalizado);
        dialog.setTitle(R.string.eu_sou_um_dialog_personalizado);

        Button btnOk = dialog.findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.fui_pressionado, Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
}
