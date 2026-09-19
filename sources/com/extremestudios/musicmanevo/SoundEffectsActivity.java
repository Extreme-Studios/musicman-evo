package com.extremestudios.musicmanevo;

import android.media.audiofx.Virtualizer;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import com.extremestudios.musicmanevo.SoundEffectsActivity;
import defpackage.c4;
import defpackage.mi;
import defpackage.o7;
import defpackage.sh;
import defpackage.sv;
import defpackage.xs;
import defpackage.yo;

/* JADX INFO: loaded from: classes.dex */
public final class SoundEffectsActivity extends c4 {
    public static final /* synthetic */ int E = 0;
    public final String[] C = {"None", "Small Room", "Medium Room", "Large Room", "Medium Hall", "Large Hall", "Plate"};
    public final Short[] D = {0, 1, 2, 3, 4, 5, 6};

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sound_effects);
        Switch r6 = (Switch) findViewById(R.id.switch_mega_bass);
        Switch r0 = (Switch) findViewById(R.id.switch_surround);
        final SeekBar seekBar = (SeekBar) findViewById(R.id.seek_surround);
        Spinner spinner = (Spinner) findViewById(R.id.spinner_reverb);
        r6.setChecked(xs.j);
        r6.setOnCheckedChangeListener(new sh(1));
        r0.setChecked(xs.k);
        seekBar.setMax(1000);
        seekBar.setProgress(xs.l);
        seekBar.setEnabled(r0.isChecked());
        r0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = SoundEffectsActivity.E;
                compoundButton.getClass();
                xs.k = z;
                try {
                    Virtualizer virtualizer = xs.d;
                    if (virtualizer != null) {
                        virtualizer.setEnabled(z);
                        if (z && virtualizer.getStrengthSupported()) {
                            virtualizer.setStrength((short) 1000);
                        }
                    }
                } catch (Exception unused) {
                }
                seekBar.setEnabled(z);
            }
        });
        seekBar.setOnSeekBarChangeListener(new sv(1));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.C);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        short s = xs.m;
        int iD1 = o7.d1(Short.valueOf(s), this.D);
        if (iD1 >= 0) {
            spinner.setSelection(iD1);
        }
        spinner.setOnItemSelectedListener(new yo(1, this));
        findViewById(R.id.btn_back_fx).setOnClickListener(new mi(this, 3));
    }
}
