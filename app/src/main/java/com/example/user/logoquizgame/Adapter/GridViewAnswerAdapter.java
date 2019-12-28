package com.example.user.logoquizgame.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

/**
 * Created by user on 21/01/2018.
 */

public class GridViewAnswerAdapter extends BaseAdapter {


    private char[] answerCharacter;
    private Context context;

    public GridViewAnswerAdapter(char[] answerCharacter, Context context) {
        this.answerCharacter = answerCharacter;
        this.context = context;
    }



    @Override
    public int getCount() {
        return answerCharacter.length;
    }

    @Override
    public Object getItem(int i) {
        return answerCharacter[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        Button button;
        if(convertView==null){
            button=new Button(context);
            button.setLayoutParams(new GridView.LayoutParams(85,85));

            button.setPadding(8,8,8,8);
            button.setBackgroundColor(Color.DKGRAY);
            button.setTextColor(Color.YELLOW);
            button.setText(String.valueOf(answerCharacter[i]));

        }
        else
            button=(Button)convertView;
            return button;

    }
}
