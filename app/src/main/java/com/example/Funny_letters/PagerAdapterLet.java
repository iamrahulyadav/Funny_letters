package com.example.Funny_letters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.igortaran.R;

public class PagerAdapterLet extends PagerAdapter {

    private LayoutInflater inflater;
    private Context context;

    public int[] list_letter = {
            R.drawable.letter_a,
            R.drawable.letter_b,
            R.drawable.letter_v,
            R.drawable.letter_g,
            R.drawable.letter_d,
            R.drawable.letter_e,
            R.drawable.letter_ee,
            R.drawable.letter_zh,
            R.drawable.letter_z,
            R.drawable.letter_i,
            R.drawable.letter_ii,
            R.drawable.letter_k,
            R.drawable.letter_l,
            R.drawable.letter_m,
            R.drawable.letter_n,
            R.drawable.letter_o,
            R.drawable.letter_p,
            R.drawable.letter_r,
            R.drawable.letter_s,
            R.drawable.letter_t,
            R.drawable.letter_u,
            R.drawable.letter_f,
            R.drawable.letter_kh,
            R.drawable.letter_c,
            R.drawable.letter_ch,
            R.drawable.letter_sh,
            R.drawable.letter_shch,
            R.drawable.letter_tv_zn,
            R.drawable.letter_ij,
            R.drawable.letter_m_zn,
            R.drawable.letter_ej,
            R.drawable.letter_ju,
            R.drawable.letter_ja,
    };

    public String[] list_title = {
            "Арбуз",
            "Банан",
            "Вертолет",
            "Гриб",
            "Динозавр",
            "Енот",
            "Ёж",
            "Жираф",
            "Звезда",
            "Индюк",
            "Йогурт",
            "Кот",
            "Лиса",
            "Мяч",
            "Ножницы",
            "Осел",
            "Петух",
            "Рыба",
            "Слон",
            "Трактор",
            "Улитка",
            "Филин",
            "Хлеб",
            "Ципленок",
            "Часы",
            "Шар",
            "Щётка",
            "обЪявление",
            "сЫр",
            "обезЬяна",
            "Экскаватор",
            "Юла",
            "Яблоко",
    };

    public int[] list_picture = {
            R.drawable.watermelon,
            R.drawable.banan,
            R.drawable.helikopter,
            R.drawable.grib,
            R.drawable.dinosaur,
            R.drawable.racoon,
            R.drawable.hedgehog,
            R.drawable.giraffe,
            R.drawable.star,
            R.drawable.indyuk,
            R.drawable.yougurt,
            R.drawable.cat,
            R.drawable.fox,
            R.drawable.ball,
            R.drawable.scissors,
            R.drawable.donkey,
            R.drawable.cock,
            R.drawable.fish,
            R.drawable.elephant,
            R.drawable.traktor,
            R.drawable.snail,
            R.drawable.owl,
            R.drawable.bread,
            R.drawable.chick,
            R.drawable.clock,
            R.drawable.balloon,
            R.drawable.toothbrush,
            R.drawable.ad,
            R.drawable.cheese,
            R.drawable.monkey,
            R.drawable.ekskavator,
            R.drawable.whirligig,
            R.drawable.apple
    };

    public int[] list_background = {
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79),
            Color.rgb(151, 255, 255),
            Color.rgb(255, 160, 122),
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79),
            Color.rgb(151, 255, 255),
            Color.rgb(255, 160, 122),
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79),
            Color.rgb(151, 255, 255),
            Color.rgb(255, 160, 122),
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79),
            Color.rgb(151, 255, 255),
            Color.rgb(255, 160, 122),
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79),
            Color.rgb(151, 255, 255),
            Color.rgb(255, 160, 122),
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79),
            Color.rgb(151, 255, 255),
            Color.rgb(255, 160, 122),
            Color.rgb(152, 251, 152),
            Color.rgb(240, 128, 128),
            Color.rgb(255, 165, 79)
    };

    public PagerAdapterLet(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (RelativeLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        RelativeLayout layoutslide = view.findViewById(R.id.slideRelativeLayout);
        ImageView imgletter = (ImageView) view.findViewById(R.id.imgletter);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        ImageView imgobject = (ImageView) view.findViewById(R.id.imgobject);

        layoutslide.setBackgroundColor(list_background[position]);
        imgletter.setImageResource(list_letter[position]);
        txttitle.setText(list_title[position]);
        imgobject.setImageResource(list_picture[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}