package com.tobishiba.circularviewpager.models;

import com.tobishiba.circularviewpager.R;

import java.util.ArrayList;
import java.util.List;

/**
 * User: tobiasbuchholz
 * Date: 18.09.14 | Time: 11:02
 */
public class Meme {
    public String   mTitle;
    public int      mImageResourceId;

    public static List<Meme> createSampleMemes() {
        final List<Meme> memes = new ArrayList<Meme>();
        memes.add(new Meme("This is App Icon", R.drawable.abcd_1));
        memes.add(new Meme("Crying icon", R.drawable.meme_crying));
        memes.add(new Meme("Add Icon", R.drawable.add_btn));
        memes.add(new Meme("Cancel Icon", R.drawable.appointment_cancelled));
        memes.add(new Meme("App Icon", R.drawable.app_icon));
        memes.add(new Meme("Appointment Upcoming", R.drawable.appointment_upcoming));
        return memes;
    }

    public Meme(final String title, final int imageResourceId) {
        mTitle = title;
        mImageResourceId = imageResourceId;
    }
}
