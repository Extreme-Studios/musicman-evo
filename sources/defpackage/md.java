package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class md implements pd0, vf3 {
    public boolean f;
    public final Object g;
    public final Object h;
    public Object i;

    public md(Context context, zf3 zf3Var, Boolean bool) {
        AudioManager audioManagerO = context == null ? null : na1.o(context);
        if (audioManagerO == null || (bool != null && bool.booleanValue())) {
            this.g = null;
            this.f = false;
            this.h = null;
            this.i = null;
            return;
        }
        Spatializer spatializer = audioManagerO.getSpatializer();
        this.g = spatializer;
        this.f = spatializer.getImmersiveAudioLevel() != 0;
        tf3 tf3Var = new tf3(this, zf3Var);
        this.i = tf3Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.h = handler;
        spatializer.addOnSpatializerStateChangedListener(new fx(handler, 4), tf3Var);
    }

    public un1 a() {
        Intent intent = (Intent) this.g;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f);
        ((gm) this.h).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String strA = kd.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (((ActivityOptions) this.i) == null) {
                this.i = jd.a();
            }
            ld.a((ActivityOptions) this.i, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.i;
        return new un1(intent, 3, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // defpackage.vf3
    public qk2 c(int i, cy0 cy0Var, int[] iArr) {
        zf3 zf3Var = (zf3) this.g;
        sf3 sf3Var = (sf3) this.h;
        of3 of3Var = new of3(zf3Var, sf3Var);
        int i2 = ((int[]) this.i)[i];
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < cy0Var.a) {
            int i5 = i;
            cy0 cy0Var2 = cy0Var;
            nf3 nf3Var = new nf3(i5, cy0Var2, i3, sf3Var, iArr[i3], this.f, of3Var);
            int length = objArrCopyOf.length;
            int i6 = i4 + 1;
            int iD = pj2.d(length, i6);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i4] = nf3Var;
            i3++;
            i4 = i6;
            i = i5;
            cy0Var = cy0Var2;
        }
        return vj2.o(objArrCopyOf, i4);
    }

    @Override // defpackage.pd0
    public void s() {
        ((pd0) this.g).s();
        if (!this.f) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.i;
            if (i >= sparseArray.size()) {
                return;
            }
            ((si0) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // defpackage.pd0
    public void v(ee0 ee0Var) {
        ((pd0) this.g).v(ee0Var);
    }

    @Override // defpackage.pd0
    public me0 z(int i, int i2) {
        pd0 pd0Var = (pd0) this.g;
        if (i2 != 3) {
            this.f = true;
            return pd0Var.z(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.i;
        si0 si0Var = (si0) sparseArray.get(i);
        if (si0Var != null) {
            return si0Var;
        }
        si0 si0Var2 = new si0(pd0Var.z(i, 3), (pi0) this.h);
        sparseArray.put(i, si0Var2);
        return si0Var2;
    }

    public md(qm0 qm0Var) {
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = qm0Var;
    }

    public /* synthetic */ md(zf3 zf3Var, sf3 sf3Var, boolean z, int[] iArr) {
        this.g = zf3Var;
        this.h = sf3Var;
        this.f = z;
        this.i = iArr;
    }

    public md(pd0 pd0Var, pi0 pi0Var) {
        this.g = pd0Var;
        this.h = pi0Var;
        this.i = new SparseArray();
    }

    public md(Object obj, dm0 dm0Var) {
        this.f = false;
        this.g = obj;
        this.h = dm0Var;
        this.i = null;
    }

    public md(Context context, String str, us2 us2Var, boolean z) {
        this.g = context;
        this.h = str;
        this.i = us2Var;
        this.f = z;
    }

    public md() {
        this.g = new Intent("android.intent.action.VIEW");
        this.h = new gm();
        this.f = true;
    }

    public md(u40 u40Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.g = intent;
        this.h = new gm();
        this.f = true;
        if (u40Var != null) {
            intent.setPackage(((ComponentName) u40Var.j).getPackageName());
            id idVar = (id) u40Var.i;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", idVar);
            intent.putExtras(bundle);
        }
    }
}
