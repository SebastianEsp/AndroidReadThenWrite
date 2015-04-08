package sen.tec.dk.readthenwrite;

import android.view.View;

public class Get_Handler implements View.OnClickListener {

    MainActivity mainActivity;

    public Get_Handler(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v)
    {
        mainActivity.textView_Show.setText(mainActivity.text);
    }
}
