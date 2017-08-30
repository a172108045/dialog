package com.fanwe.www.dialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.fanwe.library.dialog.ISDDialogConfirm;
import com.fanwe.library.dialog.impl.SDDialogBase;
import com.fanwe.library.dialog.impl.SDDialogConfirm;
import com.fanwe.library.dialog.impl.SDDialogMenu;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenDialogConfirm(View view)
    {
        new SDDialogConfirm(this)
                .setTextTitle("title")
                .setTextContent("content")
                .setTextCancel("cancel")
                .setTextConfirm("confirm")
                .setCallback(new ISDDialogConfirm.Callback()
                {
                    @Override
                    public void onClickCancel(View v, SDDialogBase dialog)
                    {
                        Toast.makeText(getApplicationContext(), "onClickCancel", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onClickConfirm(View v, SDDialogBase dialog)
                    {
                        Toast.makeText(getApplicationContext(), "onClickConfirm", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

    public void onClickOpenDialogMenu(View view)
    {
        SDDialogMenu dialogMenu = new SDDialogMenu(this);
        dialogMenu.setItems("hel", "koukouz", "zhady");
        dialogMenu.showBottom();
    }
}
