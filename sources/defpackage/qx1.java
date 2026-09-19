package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qx1 implements pn1 {
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public Object m;
    public Object n;
    public Object o;

    public qx1(Context context, gv1 gv1Var, qk1 qk1Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.h = gv1Var;
        this.o = qk1Var;
        this.n = audioDeviceInfo;
        String str = qz1.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.i = handler;
        this.j = new oa3(this);
        this.k = new y4(8, this);
        na3 na3Var = na3.c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.l = uriFor != null ? new pa3(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public void a(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, (AudioDeviceInfo) this.n)) {
            return;
        }
        this.n = audioDeviceInfo;
        b(na3.a((Context) this.g, (qk1) this.o, audioDeviceInfo));
    }

    public void b(na3 na3Var) {
        zf3 zf3Var;
        if (!this.f || na3Var.equals((na3) this.m)) {
            return;
        }
        this.m = na3Var;
        qb3 qb3Var = (qb3) ((gv1) this.h).g;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = qb3Var.W;
        String name = looperMyLooper == null ? "null" : looperMyLooper.getThread().getName();
        Looper looper2 = qb3Var.W;
        String name2 = looper2 == null ? "null" : looper2.getThread().getName();
        if (!(looper == looperMyLooper)) {
            j7.e(jn.E("Current looper (%s) is not the playback looper (%s)", name, name2));
            return;
        }
        na3 na3Var2 = qb3Var.s;
        if (na3Var2 == null || na3Var.equals(na3Var2)) {
            return;
        }
        qb3Var.s = na3Var;
        bz1 bz1Var = qb3Var.n;
        if (bz1Var != null) {
            rb3 rb3Var = (rb3) bz1Var.f;
            synchronized (rb3Var.f) {
                zf3Var = rb3Var.w;
            }
            if (zf3Var != null) {
                synchronized (zf3Var.c) {
                    zf3Var.e.getClass();
                }
            }
        }
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.j;
    }

    public void d(Runnable runnable) {
        ((Handler) ((ii2) this.h).a()).post(new sh2(this, runnable, 1));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) {
        boolean z2;
        float f;
        boolean z3;
        b21 b21Var = (b21) this.m;
        rf1 rf1Var = (rf1) na1.P((cb1) this.i);
        md1 md1Var = (md1) this.k;
        md1Var.O0(true);
        boolean z4 = this.f;
        boolean zA = z4 ? b21Var.a(false) : false;
        zb3 zb3Var = vc3.C.c;
        boolean zI = zb3.i((Context) this.g);
        if (z4) {
            synchronized (b21Var) {
                z3 = b21Var.b;
            }
            if (z3) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z4) {
            synchronized (b21Var) {
                f = b21Var.c;
            }
        } else {
            f = 0.0f;
        }
        float f2 = f;
        x42 x42Var = (x42) this.j;
        q83 q83Var = new q83(zA, zI, z2, f2, z, x42Var.O, false);
        if (ik1Var != null) {
            ik1Var.R1();
        }
        nn1 nn1Var = (nn1) rf1Var.g0.c();
        int i = x42Var.Q;
        d60 d60Var = (d60) this.h;
        String str = x42Var.B;
        b52 b52Var = x42Var.s;
        v33.a(context, new AdOverlayInfoParcel(nn1Var, md1Var, i, d60Var, str, q83Var, b52Var.b, b52Var.a, ((i52) this.l).g, ik1Var, x42Var.b() ? (hw1) this.n : null, md1Var.o()), true, (es1) this.o);
    }

    public qx1() {
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashMap();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashMap();
        this.n = new HashSet();
        this.o = new WeakHashMap();
    }

    public qx1(Context context, d60 d60Var, cb1 cb1Var, x42 x42Var, md1 md1Var, i52 i52Var, boolean z, b21 b21Var, hw1 hw1Var, es1 es1Var) {
        this.g = context;
        this.h = d60Var;
        this.i = cb1Var;
        this.j = x42Var;
        this.k = md1Var;
        this.l = i52Var;
        this.m = b21Var;
        this.f = z;
        this.n = hw1Var;
        this.o = es1Var;
    }

    public qx1(Context context, wo2 wo2Var, Intent intent) {
        this.k = new ArrayList();
        this.g = context;
        this.i = wo2Var;
        this.j = "OverlayDisplayService";
        this.l = intent;
        this.h = ar.t(new fl1(29));
        this.m = new IBinder.DeathRecipient() { // from class: qh2
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                qx1 qx1Var = this.a;
                ((wo2) qx1Var.i).d("%s : Binder has died.", (String) qx1Var.j);
                ArrayList arrayList = (ArrayList) qx1Var.k;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }
}
