package sde.sdu.edu.helloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setTitle("Alert").setMessage(msg);
        builder.create().show();
    }

        public void ConfirmButtonClick(View v) {
            Object o = findViewById(R.id.textView);
            if( o instanceof EditText){
                EditText txt = (EditText)o;
                showDialog(txt.getText().toString());
            }else{
                //do noting;
                showDialog("error");
            }
        }


}
