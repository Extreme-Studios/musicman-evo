package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.extremestudios.musicmanevo.R;
import defpackage.ce0;
import defpackage.es0;
import defpackage.j41;
import defpackage.ju;
import defpackage.ls1;
import defpackage.ut0;

/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        es0 es0Var = ut0.f.b;
        j41 j41Var = new j41();
        es0Var.getClass();
        ls1 ls1Var = (ls1) new ce0(es0Var, this, j41Var).d(this, false);
        if (ls1Var == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            ls1Var.A2(stringExtra, new ju(this), new ju(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
