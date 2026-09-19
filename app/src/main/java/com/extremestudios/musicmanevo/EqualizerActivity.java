package com.extremestudios.musicmanevo;

import android.content.res.ColorStateList;
import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.extremestudios.musicmanevo.EqualizerActivity;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.jn;
import defpackage.th;
import defpackage.uh;
import defpackage.xs;
import defpackage.yd;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class EqualizerActivity extends AppCompatActivity {
    public static final /* synthetic */ int M = 0;
    public LinearLayout C;
    public Equalizer D;
    public SeekBar E;
    public TextView F;
    public Button H;
    public Button I;
    public final ArrayList J = new ArrayList();
    public final ArrayList K = new ArrayList();
    public final int L = 150;

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_equalizer);
        View viewFindViewById = findViewById(R.id.bands_layout);
        viewFindViewById.getClass();
        this.C = (LinearLayout) viewFindViewById;
        xs.ensureEqualizer();
        this.D = xs.b;
        View viewFindViewById2 = findViewById(R.id.seek_gain);
        viewFindViewById2.getClass();
        this.E = (SeekBar) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.text_gain_label);
        viewFindViewById3.getClass();
        this.F = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.btn_global_plus);
        viewFindViewById4.getClass();
        this.H = (Button) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.btn_global_minus);
        viewFindViewById5.getClass();
        this.I = (Button) viewFindViewById5;
        final int i = 0;
        findViewById(R.id.btn_back_eq).setOnClickListener(new View.OnClickListener() { // from class: rh
            public final /* synthetic */ EqualizerActivity g;

            {
                this.g = EqualizerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                EqualizerActivity equalizerActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = EqualizerActivity.M;
                        equalizerActivity.finish();
                        break;
                    case 1:
                        equalizerActivity.r(equalizerActivity.L);
                        break;
                    case 2:
                        equalizerActivity.r(-equalizerActivity.L);
                        break;
                    case 3:
                        int i4 = EqualizerActivity.M;
                        equalizerActivity.s("Jazz");
                        break;
                    case 4:
                        int i5 = EqualizerActivity.M;
                        equalizerActivity.s("Rock");
                        break;
                    default:
                        Equalizer equalizer = equalizerActivity.D;
                        if (equalizer != null) {
                            short numberOfBands = equalizer.getNumberOfBands();
                            for (int i6 = 0; i6 < numberOfBands; i6++) {
                                xs.f((short) i6, (short) 0);
                            }
                            equalizerActivity.u();
                            break;
                        }
                        break;
                }
            }
        });
        int i2 = xs.n;
        SeekBar seekBar = this.E;
        if (seekBar == null) {
            jn.k("gainSeekBar");
            throw null;
        }
        seekBar.setProgress(i2);
        TextView textView = this.F;
        if (textView == null) {
            jn.k("gainLabel");
            throw null;
        }
        textView.setText("Master Gain (" + (i2 / 100) + " dB)");
        SeekBar seekBar2 = this.E;
        if (seekBar2 == null) {
            jn.k("gainSeekBar");
            throw null;
        }
        seekBar2.setOnSeekBarChangeListener(new uh(this));
        Button button = (Button) findViewById(R.id.btn_preset_jazz);
        Button button2 = (Button) findViewById(R.id.btn_preset_rock);
        Button button3 = (Button) findViewById(R.id.btn_preset_reset);
        final int i3 = 3;
        button.setOnClickListener(new View.OnClickListener() { // from class: rh
            public final /* synthetic */ EqualizerActivity g;

            {
                this.g = EqualizerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                EqualizerActivity equalizerActivity = this.g;
                switch (i4) {
                    case 0:
                        int i5 = EqualizerActivity.M;
                        equalizerActivity.finish();
                        break;
                    case 1:
                        equalizerActivity.r(equalizerActivity.L);
                        break;
                    case 2:
                        equalizerActivity.r(-equalizerActivity.L);
                        break;
                    case 3:
                        int i6 = EqualizerActivity.M;
                        equalizerActivity.s("Jazz");
                        break;
                    case 4:
                        int i7 = EqualizerActivity.M;
                        equalizerActivity.s("Rock");
                        break;
                    default:
                        Equalizer equalizer = equalizerActivity.D;
                        if (equalizer != null) {
                            short numberOfBands = equalizer.getNumberOfBands();
                            for (int i8 = 0; i8 < numberOfBands; i8++) {
                                xs.f((short) i8, (short) 0);
                            }
                            equalizerActivity.u();
                            break;
                        }
                        break;
                }
            }
        });
        final int i4 = 4;
        button2.setOnClickListener(new View.OnClickListener() { // from class: rh
            public final /* synthetic */ EqualizerActivity g;

            {
                this.g = EqualizerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                EqualizerActivity equalizerActivity = this.g;
                switch (i5) {
                    case 0:
                        int i6 = EqualizerActivity.M;
                        equalizerActivity.finish();
                        break;
                    case 1:
                        equalizerActivity.r(equalizerActivity.L);
                        break;
                    case 2:
                        equalizerActivity.r(-equalizerActivity.L);
                        break;
                    case 3:
                        int i7 = EqualizerActivity.M;
                        equalizerActivity.s("Jazz");
                        break;
                    case 4:
                        int i8 = EqualizerActivity.M;
                        equalizerActivity.s("Rock");
                        break;
                    default:
                        Equalizer equalizer = equalizerActivity.D;
                        if (equalizer != null) {
                            short numberOfBands = equalizer.getNumberOfBands();
                            for (int i9 = 0; i9 < numberOfBands; i9++) {
                                xs.f((short) i9, (short) 0);
                            }
                            equalizerActivity.u();
                            break;
                        }
                        break;
                }
            }
        });
        final int i5 = 5;
        button3.setOnClickListener(new View.OnClickListener() { // from class: rh
            public final /* synthetic */ EqualizerActivity g;

            {
                this.g = EqualizerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i5;
                EqualizerActivity equalizerActivity = this.g;
                switch (i6) {
                    case 0:
                        int i7 = EqualizerActivity.M;
                        equalizerActivity.finish();
                        break;
                    case 1:
                        equalizerActivity.r(equalizerActivity.L);
                        break;
                    case 2:
                        equalizerActivity.r(-equalizerActivity.L);
                        break;
                    case 3:
                        int i8 = EqualizerActivity.M;
                        equalizerActivity.s("Jazz");
                        break;
                    case 4:
                        int i9 = EqualizerActivity.M;
                        equalizerActivity.s("Rock");
                        break;
                    default:
                        Equalizer equalizer = equalizerActivity.D;
                        if (equalizer != null) {
                            short numberOfBands = equalizer.getNumberOfBands();
                            for (int i10 = 0; i10 < numberOfBands; i10++) {
                                xs.f((short) i10, (short) 0);
                            }
                            equalizerActivity.u();
                            break;
                        }
                        break;
                }
            }
        });
        u();
        Button button4 = this.H;
        if (button4 == null) {
            jn.k("btnGlobalPlus");
            throw null;
        }
        final int i6 = 1;
        button4.setOnClickListener(new View.OnClickListener() { // from class: rh
            public final /* synthetic */ EqualizerActivity g;

            {
                this.g = EqualizerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                EqualizerActivity equalizerActivity = this.g;
                switch (i7) {
                    case 0:
                        int i8 = EqualizerActivity.M;
                        equalizerActivity.finish();
                        break;
                    case 1:
                        equalizerActivity.r(equalizerActivity.L);
                        break;
                    case 2:
                        equalizerActivity.r(-equalizerActivity.L);
                        break;
                    case 3:
                        int i9 = EqualizerActivity.M;
                        equalizerActivity.s("Jazz");
                        break;
                    case 4:
                        int i10 = EqualizerActivity.M;
                        equalizerActivity.s("Rock");
                        break;
                    default:
                        Equalizer equalizer = equalizerActivity.D;
                        if (equalizer != null) {
                            short numberOfBands = equalizer.getNumberOfBands();
                            for (int i11 = 0; i11 < numberOfBands; i11++) {
                                xs.f((short) i11, (short) 0);
                            }
                            equalizerActivity.u();
                            break;
                        }
                        break;
                }
            }
        });
        Button button5 = this.I;
        if (button5 == null) {
            jn.k("btnGlobalMinus");
            throw null;
        }
        final int i7 = 2;
        button5.setOnClickListener(new View.OnClickListener() { // from class: rh
            public final /* synthetic */ EqualizerActivity g;

            {
                this.g = EqualizerActivity.this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = i7;
                EqualizerActivity equalizerActivity = this.g;
                switch (i8) {
                    case 0:
                        int i9 = EqualizerActivity.M;
                        equalizerActivity.finish();
                        break;
                    case 1:
                        equalizerActivity.r(equalizerActivity.L);
                        break;
                    case 2:
                        equalizerActivity.r(-equalizerActivity.L);
                        break;
                    case 3:
                        int i10 = EqualizerActivity.M;
                        equalizerActivity.s("Jazz");
                        break;
                    case 4:
                        int i11 = EqualizerActivity.M;
                        equalizerActivity.s("Rock");
                        break;
                    default:
                        Equalizer equalizer = equalizerActivity.D;
                        if (equalizer != null) {
                            short numberOfBands = equalizer.getNumberOfBands();
                            for (int i12 = 0; i12 < numberOfBands; i12++) {
                                xs.f((short) i12, (short) 0);
                            }
                            equalizerActivity.u();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // defpackage.c4, android.app.Activity
    public final void onResume() {
        super.onResume();
        MediaPlayer mediaPlayer = xs.a;
        this.D = xs.b;
        u();
    }

    public final void r(int i) {
        int i2;
        StringBuilder sb;
        String str;
        Equalizer equalizer = this.D;
        if (equalizer == null) {
            return;
        }
        int i3 = 0;
        short s = equalizer.getBandLevelRange()[0];
        short s2 = equalizer.getBandLevelRange()[1];
        short numberOfBands = equalizer.getNumberOfBands();
        while (i3 < numberOfBands) {
            short s3 = (short) i3;
            short bandLevel = equalizer.getBandLevel(s3);
            // Global gain moves every band equally; per-band shaping belongs to the sliders.
            i2 = i;
            short sE = (short) yd.e(bandLevel + i2, s, s2);
            xs.f(s3, sE);
            ArrayList arrayList = this.J;
            if (i3 < arrayList.size()) {
                ((SeekBar) arrayList.get(i3)).setProgress(sE - s);
                int i4 = sE / 100;
                int centerFreq = equalizer.getCenterFreq(s3) / 1000;
                if (centerFreq < 1000) {
                    sb = new StringBuilder();
                    sb.append(centerFreq);
                    str = " Hz";
                } else {
                    sb = new StringBuilder();
                    sb.append(centerFreq / 1000);
                    str = " kHz";
                }
                sb.append(str);
                String string = sb.toString();
                ((TextView) this.K.get(i3)).setText(string + " (" + i4 + " dB)");
            }
            i3++;
        }
    }

    public final void s(String str) {
        short s;
        Equalizer equalizer = this.D;
        if (equalizer == null) {
            return;
        }
        short numberOfPresets = equalizer.getNumberOfPresets();
        int i = 0;
        while (true) {
            if (i >= numberOfPresets) {
                s = -1;
                break;
            }
            s = (short) i;
            String presetName = equalizer.getPresetName(s);
            if (presetName == null ? false : presetName.equalsIgnoreCase(str)) {
                break;
            } else {
                i++;
            }
        }
        if (s != -1) {
            equalizer.usePreset(s);
            Equalizer equalizer2 = xs.b;
            if (equalizer2 != null) {
                short numberOfBands = equalizer2.getNumberOfBands();
                for (int i2 = 0; i2 < numberOfBands; i2++) {
                    short s2 = (short) i2;
                    xs.o.put(Short.valueOf(s2), Short.valueOf(equalizer2.getBandLevel(s2)));
                }
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("rock")) {
                t(new int[]{650, 500, 150, -200, -350});
            } else if (lowerCase.equals("jazz")) {
                t(new int[]{450, 350, 100, -100, -200});
            }
        }
        u();
    }

    public final void t(int[] iArr) {
        Equalizer equalizer = this.D;
        if (equalizer == null) {
            return;
        }
        short numberOfBands = equalizer.getNumberOfBands();
        for (int i = 0; i < numberOfBands; i++) {
            if (i < iArr.length) {
                xs.f((short) i, (short) iArr[i]);
            }
        }
    }

    public final void u() {
        StringBuilder sb;
        String str;
        LinearLayout linearLayout = this.C;
        String str2 = "bandsLayout";
        if (linearLayout == null) {
            jn.k("bandsLayout");
            throw null;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = this.J;
        arrayList.clear();
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        Equalizer equalizer = this.D;
        if (equalizer == null) {
            return;
        }
        short numberOfBands = equalizer.getNumberOfBands();
        short s = equalizer.getBandLevelRange()[0];
        int i = 1;
        short s2 = equalizer.getBandLevelRange()[1];
        int color = getColor(R.color.neon_purple);
        int i2 = 0;
        while (i2 < numberOfBands) {
            short s3 = (short) i2;
            int centerFreq = equalizer.getCenterFreq(s3) / 1000;
            if (centerFreq < 1000) {
                sb = new StringBuilder();
                sb.append(centerFreq);
                str = " Hz";
            } else {
                sb = new StringBuilder();
                sb.append(centerFreq / 1000);
                str = " kHz";
            }
            sb.append(str);
            String string = sb.toString();
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 40);
            linearLayout2.setLayoutParams(layoutParams);
            TextView textView = new TextView(this);
            int bandLevel = equalizer.getBandLevel(s3) / 100;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            String str3 = str2;
            sb2.append(" (");
            sb2.append(bandLevel);
            sb2.append(" dB)");
            textView.setText(sb2.toString());
            textView.setTextColor(getColor(R.color.white));
            textView.setGravity(17);
            SeekBar seekBar = new SeekBar(this);
            seekBar.setMax(s2 - s);
            seekBar.setProgress(equalizer.getBandLevel(s3) - s);
            seekBar.setProgressTintList(ColorStateList.valueOf(color));
            seekBar.setThumbTintList(ColorStateList.valueOf(color));
            seekBar.setOnSeekBarChangeListener(new th(s, s3, textView, string));
            arrayList.add(seekBar);
            arrayList2.add(textView);
            linearLayout2.addView(textView);
            linearLayout2.addView(seekBar);
            LinearLayout linearLayout3 = this.C;
            if (linearLayout3 == null) {
                jn.k(str3);
                throw null;
            }
            linearLayout3.addView(linearLayout2);
            i2++;
            str2 = str3;
            i = 1;
        }
    }
}
