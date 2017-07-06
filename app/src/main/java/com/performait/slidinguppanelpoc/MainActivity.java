package com.performait.slidinguppanelpoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton btnHeaderIco = (ImageButton) findViewById(R.id.btn_header_ico);

        SlidingUpPanelLayout suplContainer = (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
        //suplContainer.setTouchEnabled(false);
        suplContainer.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                switch (newState) {
                    case EXPANDED:
                        btnHeaderIco.setImageResource(R.drawable.ic_expand_more_black_24dp);
                        break;
                    case COLLAPSED:
                        btnHeaderIco.setImageResource(R.drawable.ic_expand_less_black_24dp);
                        break;
                    case ANCHORED:
                        break;
                    case HIDDEN:
                        break;
                    case DRAGGING:
                        break;
                }
            }
        });
    }
}
