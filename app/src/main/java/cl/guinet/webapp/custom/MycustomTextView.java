package cl.guinet.webapp.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ricardo.gutierrez on 11/08/2016.
 */
public class MycustomTextView extends TextView {

    public MycustomTextView(Context c , AttributeSet attrs){
        super(c,attrs);
        this.setTypeface(Typeface.createFromAsset(c.getAssets(),"fonts/ubuntu/Ubuntu-R.ttf"));
    }

}
