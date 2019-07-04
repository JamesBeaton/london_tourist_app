package com.example.android.tourist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity1 extends Activity {
    TextView mTextview;
    ImageView mImageview;
    TextView mTextviewTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        mTextview = (TextView) findViewById(R.id.detailtextview);
        mImageview = (ImageView) findViewById(R.id.backdrop);
        mTextviewTitle = (TextView) findViewById(R.id.detailheader);
        //retrieve from the intent by using the hasExtra method inside an if statement
        Intent intent = getIntent();
        if (intent.hasExtra(getResources().getString(R.string.bigben_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.bigben_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.big_ben_sq));
            mTextviewTitle.setText(getResources().getString(R.string.big_ben_title));
        } else if (intent.hasExtra(getResources().getString(R.string.nelson_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.nelson_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.nelsons_column));
            mTextviewTitle.setText(getResources().getString(R.string.nelsons_column_title));
        } else if (intent.hasExtra(getResources().getString(R.string.tower_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.tower_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.tower_bridge));
            mTextviewTitle.setText(getResources().getString(R.string.tower_bridge_title));
        } else if (intent.hasExtra(getResources().getString(R.string.zoo_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.zoo_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.londonzoo));
            mTextviewTitle.setText(getResources().getString(R.string.london_zoo_title));
        } else if (intent.hasExtra(getResources().getString(R.string.madam_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.madam_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.madam));
            mTextviewTitle.setText(getResources().getString(R.string.madam_tussauds_title));
        } else if (intent.hasExtra(getResources().getString(R.string.natural_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.natural_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.natural));
            mTextviewTitle.setText(getResources().getString(R.string.natural_history_title));
        } else if (intent.hasExtra(getResources().getString(R.string.queens_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.queens_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.queens));
            mTextviewTitle.setText(getResources().getString(R.string.queens_theatre_title));
        } else if (intent.hasExtra(getResources().getString(R.string.lyceum_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.lyceum_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.lyceum));
            mTextviewTitle.setText(getResources().getString(R.string.lyceum_theatre_title));
        } else if (intent.hasExtra(getResources().getString(R.string.vic_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.vic_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.oldvic));
            mTextviewTitle.setText(getResources().getString(R.string.old_vic_title));
        } else if (intent.hasExtra(getResources().getString(R.string.royal_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.royal_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.theatreroyal));
            mTextviewTitle.setText(getResources().getString(R.string.theatre_royal_title));
        } else if (intent.hasExtra(getResources().getString(R.string.prince_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.prince_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.princeedward));
            mTextviewTitle.setText(getResources().getString(R.string.prince_edward_title));
        } else if (intent.hasExtra(getResources().getString(R.string.gielgud_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.gielgud_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.gielgud));
            mTextviewTitle.setText(getResources().getString(R.string.gielgud_theatre_title));
        } else if (intent.hasExtra(getResources().getString(R.string.belgo_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.belgo_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.belgo));
            mTextviewTitle.setText(getResources().getString(R.string.belgo_title));
        } else if (intent.hasExtra(getResources().getString(R.string.bubba_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.bubba_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.bubba));
            mTextviewTitle.setText(getResources().getString(R.string.bubba_gumps));
        } else if (intent.hasExtra(getResources().getString(R.string.thai_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.thai_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.thaisquare));
            mTextviewTitle.setText(getResources().getString(R.string.thai_square));
        } else if (intent.hasExtra(getResources().getString(R.string.tgi_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.tgi_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.tgi));
            mTextviewTitle.setText(getResources().getString(R.string.tgi_fridays));
        } else if (intent.hasExtra(getResources().getString(R.string.shake_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.shake_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.shakeshack));
            mTextviewTitle.setText(getResources().getString(R.string.shake_shack));
        } else if (intent.hasExtra(getResources().getString(R.string.five_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.five_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.fiveguys));
            mTextviewTitle.setText(getResources().getString(R.string.five_guys));
        } else if (intent.hasExtra(getResources().getString(R.string.piccadilly_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.piccadilly_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.piccadilly_institute));
            mTextviewTitle.setText(getResources().getString(R.string.piccadilly));
        } else if (intent.hasExtra(getResources().getString(R.string.cafe_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.cafe_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.cafedeparis));
            mTextviewTitle.setText(getResources().getString(R.string.cafe));
        } else if (intent.hasExtra(getResources().getString(R.string.rumba_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.rumba_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.barrumba));
            mTextviewTitle.setText(getResources().getString(R.string.bar_rumba));
        } else if (intent.hasExtra(getResources().getString(R.string.cirque_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.cirque_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.cirque));
            mTextviewTitle.setText(getResources().getString(R.string.cirque_du_soleil));
        } else if (intent.hasExtra(getResources().getString(R.string.hippodrome_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.hippodrome_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.hippodrome));
            mTextviewTitle.setText(getResources().getString(R.string.hippodrome));
        } else if (intent.hasExtra(getResources().getString(R.string.zoobar_extra))) {
            mTextview.setText(intent.getStringExtra(getResources().getString(R.string.zoobar_extra)));
            mImageview.setImageDrawable(getResources().getDrawable(R.drawable.zoobar));
            mTextviewTitle.setText(getResources().getString(R.string.zoobar));
        }
    }
}