package com.example.Funny_letters;

import android.content.Context;
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
    private Context context;

    private int[] list_letter = {
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

    private String[] list_title = {
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
            "Машина",
            "Ножницы",
            "Осел",
            "Петух",
            "Рыба",
            "Слон",
            "Трактор",
            "Улитка",
            "Филин",
            "Хомяк",
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

    private int[] list_picture = {
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
            R.drawable.car,
            R.drawable.scissors,
            R.drawable.donkey,
            R.drawable.cock,
            R.drawable.fish,
            R.drawable.elephant,
            R.drawable.traktor,
            R.drawable.snail,
            R.drawable.owl,
            R.drawable.hamster,
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

    PagerAdapterLet(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        View view = inflater.inflate(R.layout.slide, container, false);
        ImageView img_letter = view.findViewById(R.id.img_letter);
        TextView txt_title = view.findViewById(R.id.txt_title);
        ImageView img_object = view.findViewById(R.id.img_object);

        img_letter.setImageResource(list_letter[position]);
        txt_title.setText(list_title[position]);
        img_object.setImageResource(list_picture[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}