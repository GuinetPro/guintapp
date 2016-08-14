package cl.guinet.webapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cl.guinet.webapp.fragment.Contacto;
import cl.guinet.webapp.fragment.Nosotros;
import cl.guinet.webapp.fragment.Qhacemos;
import cl.guinet.webapp.fragment.Tweet;

/**
 * Created by ricardo.gutierrez on 11/08/2016.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Nosotros", "¿Que hacemos?", "Mis Tweets","Contacto" };

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return Nosotros.newInstance();
            case 1:
                return Qhacemos.newInstance();
            case 2:
                return Tweet.newInstance();
            case 3:
                return Contacto.newInstance();

        }
        return null;


    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
