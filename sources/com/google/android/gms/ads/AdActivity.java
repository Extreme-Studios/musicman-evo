package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.es0;
import defpackage.jn;
import defpackage.ju;
import defpackage.q61;
import defpackage.ut0;
import defpackage.wc0;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {
    public q61 f;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.W1(i, i2, intent);
            }
        } catch (Exception e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            q61 q61Var = this.f;
            if (q61Var != null && !q61Var.e()) {
                return;
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            q61 q61Var2 = this.f;
            if (q61Var2 != null) {
                q61Var2.b();
            }
        } catch (RemoteException e2) {
            jn.Z("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.C(new ju(configuration));
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jn.F("AdActivity onCreate");
        es0 es0Var = ut0.f.b;
        es0Var.getClass();
        wc0 wc0Var = new wc0(es0Var, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            jn.M("useClientJar flag not found in activity intent extras.");
        }
        q61 q61Var = (q61) wc0Var.d(this, booleanExtra);
        this.f = q61Var;
        if (q61Var == null) {
            jn.Z("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            q61Var.Y2(bundle);
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        jn.F("AdActivity onDestroy");
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.x();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        jn.F("AdActivity onPause");
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.i();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.P1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        jn.F("AdActivity onRestart");
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.j();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        jn.F("AdActivity onResume");
        super.onResume();
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.k();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.c0(bundle);
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        jn.F("AdActivity onStart");
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.g();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        jn.F("AdActivity onStop");
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.S();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            q61 q61Var = this.f;
            if (q61Var != null) {
                q61Var.d();
            }
        } catch (RemoteException e) {
            jn.Z("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        q61 q61Var = this.f;
        if (q61Var != null) {
            try {
                q61Var.u();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        q61 q61Var = this.f;
        if (q61Var != null) {
            try {
                q61Var.u();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        q61 q61Var = this.f;
        if (q61Var != null) {
            try {
                q61Var.u();
            } catch (RemoteException e) {
                jn.Z("#007 Could not call remote method.", e);
            }
        }
    }
}
