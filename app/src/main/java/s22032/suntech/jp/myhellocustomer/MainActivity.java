package s22032.suntech.jp.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btDisplay = findViewById(R.id.btDisplay);
        MyHelloCustomer customer = new MyHelloCustomer();
        btDisplay.setOnClickListener(customer);

        Button btRClear = findViewById(R.id.btRClear);
        Button btNClear = findViewById(R.id.btNClear);

        btRClear.setOnClickListener(customer);
        btNClear.setOnClickListener(customer);
    }

    private class MyHelloCustomer implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText r_input = findViewById(R.id.edResi);
            EditText n_input = findViewById(R.id.edName);
            TextView output = findViewById(R.id.tvOut);
            String inputRStr = r_input.getText().toString()+"にお住いの";
            String inputNStr = n_input.getText().toString()+"さん、こんにちは！";
            int id =view.getId();
            if(id==R.id.btRClear){
                r_input.setText("");
                output = findViewById(R.id.tvOut);
                inputNStr = n_input.getText().toString()+"さん、こんにちは！";
                output.setText("");
            }
            else if (id==R.id.btNClear) {
                n_input.setText("");
                output = findViewById(R.id.tvOut);
                inputRStr = r_input.getText().toString()+"にお住いの";
                output.setText("");
            }
            else if (id==R.id.btDisplay) {
                output.setText(inputRStr+inputNStr);
            }
        }
    }
}