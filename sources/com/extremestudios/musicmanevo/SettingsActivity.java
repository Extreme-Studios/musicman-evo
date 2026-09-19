package com.extremestudios.musicmanevo;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import defpackage.c4;
import defpackage.jn;
import defpackage.mi;
import defpackage.ni;
import defpackage.oi;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsActivity extends c4 {
    public static final /* synthetic */ int E = 0;
    public ListView C;
    public final String[] D = {"Equalizer"};

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        View viewFindViewById = findViewById(R.id.settings_list);
        viewFindViewById.getClass();
        this.C = (ListView) viewFindViewById;
        oi oiVar = new oi(this, this.D);
        ListView listView = this.C;
        if (listView == null) {
            jn.k("settingsList");
            throw null;
        }
        listView.setAdapter((ListAdapter) oiVar);
        findViewById(R.id.btn_back_settings).setOnClickListener(new mi(this, 1));
        ListView listView2 = this.C;
        if (listView2 != null) {
            listView2.setOnItemClickListener(new ni(this, 2));
        } else {
            jn.k("settingsList");
            throw null;
        }
    }
}
