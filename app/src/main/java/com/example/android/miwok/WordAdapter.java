package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Vishal on 10-02-2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int color){

        super(context, 0, words);
        mColor = color;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Word w = getItem(position);

        TextView defaultWord = (TextView) listView.findViewById(R.id.end_word);
        defaultWord.setText(w.getDefaultTranslation());

        TextView miwokWord = (TextView) listView.findViewById(R.id.miwok_word);
        miwokWord.setText(w.getMiwokTranslation());

        ImageView imageView = (ImageView) listView.findViewById(R.id.image1);

        if(w.hasImage() == false) {
            imageView.setVisibility(View.GONE);
        }
        else {
            imageView.setImageResource(w.getResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        View contain = listView.findViewById(R.id.container);
        int color = ContextCompat.getColor(getContext(), mColor);
        contain.setBackgroundColor(color);


        return listView;

    }
}