package sen.tec.dk.readthenwrite;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button button_Send;
    Button button_Get;
    TextView textView_Show;
    EditText editText_Write;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Send = (Button)findViewById(R.id.button_SendText);
        Send_Handler send_Handler = new Send_Handler(this);
        button_Send.setOnClickListener(send_Handler);

        button_Get = (Button)findViewById(R.id.button_GetText);
        Get_Handler get_Handler = new Get_Handler(this);
        button_Get.setOnClickListener(get_Handler);
        textView_Show = (TextView)findViewById(R.id.textView_Show);
        editText_Write = (EditText)findViewById(R.id.editText_Write);
    }
}
