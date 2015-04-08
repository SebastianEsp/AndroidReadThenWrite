package sen.tec.dk.readthenwrite;

import android.view.View;

public class Send_Handler implements View.OnClickListener {

    MainActivity mainActivity;

    public Send_Handler(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v)
    {
       mainActivity.text =  mainActivity.editText_Write.getText().toString();
       mainActivity.editText_Write.setText("");
    }
}
