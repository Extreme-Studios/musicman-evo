package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.b42;
import defpackage.d60;
import defpackage.f0;
import defpackage.fa3;
import defpackage.hw1;
import defpackage.ib0;
import defpackage.ik1;
import defpackage.ix0;
import defpackage.j11;
import defpackage.j7;
import defpackage.ju;
import defpackage.k11;
import defpackage.k61;
import defpackage.lb3;
import defpackage.lx0;
import defpackage.md0;
import defpackage.md1;
import defpackage.nn1;
import defpackage.q83;
import defpackage.r91;
import defpackage.rt1;
import defpackage.s90;
import defpackage.sa3;
import defpackage.sd1;
import defpackage.tu0;
import defpackage.vc3;
import defpackage.yd1;
import defpackage.za1;
import defpackage.zm1;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new b42(17);
    public static final AtomicLong D = new AtomicLong(0);
    public static final ConcurrentHashMap E = new ConcurrentHashMap();
    public final k61 A;
    public final boolean B;
    public final long C;
    public final r91 f;
    public final ib0 g;
    public final lb3 h;
    public final md1 i;
    public final k11 j;
    public final String k;
    public final boolean l;
    public final String m;
    public final md0 n;
    public final int o;
    public final int p;
    public final String q;
    public final d60 r;
    public final String s;
    public final q83 t;
    public final j11 u;
    public final String v;
    public final String w;
    public final String x;
    public final ik1 y;
    public final zm1 z;

    public AdOverlayInfoParcel(r91 r91Var, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, d60 d60Var, String str4, q83 q83Var, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.f = r91Var;
        this.k = str;
        this.l = z;
        this.m = str2;
        this.o = i;
        this.p = i2;
        this.q = str3;
        this.r = d60Var;
        this.s = str4;
        this.t = q83Var;
        this.v = str5;
        this.w = str6;
        this.x = str7;
        this.B = z2;
        this.C = j;
        if (!((Boolean) tu0.e.c.a(lx0.Kd)).booleanValue()) {
            this.g = (ib0) ju.Z0(ju.O0(iBinder));
            this.h = (lb3) ju.Z0(ju.O0(iBinder2));
            this.i = (md1) ju.Z0(ju.O0(iBinder3));
            this.u = (j11) ju.Z0(ju.O0(iBinder6));
            this.j = (k11) ju.Z0(ju.O0(iBinder4));
            this.n = (md0) ju.Z0(ju.O0(iBinder5));
            this.y = (ik1) ju.Z0(ju.O0(iBinder7));
            this.z = (zm1) ju.Z0(ju.O0(iBinder8));
            this.A = (k61) ju.Z0(ju.O0(iBinder9));
            return;
        }
        fa3 fa3Var = (fa3) E.remove(Long.valueOf(j));
        if (fa3Var == null) {
            j7.l("AdOverlayObjects is null");
            throw null;
        }
        this.g = fa3Var.a;
        this.h = fa3Var.b;
        this.i = fa3Var.c;
        this.u = fa3Var.d;
        this.j = fa3Var.e;
        this.y = fa3Var.g;
        this.z = fa3Var.h;
        this.A = fa3Var.i;
        this.n = fa3Var.f;
        fa3Var.j.cancel(false);
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) tu0.e.c.a(lx0.Kd)).booleanValue()) {
                return null;
            }
            vc3.C.h.d("AdOverlayInfoParcel.getFromIntent", e);
            return null;
        }
    }

    public static final ju b(Object obj) {
        if (((Boolean) tu0.e.c.a(lx0.Kd)).booleanValue()) {
            return null;
        }
        return new ju(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.p(parcel, 2, this.f, i);
        ib0 ib0Var = this.g;
        s90.o(parcel, 3, b(ib0Var));
        lb3 lb3Var = this.h;
        s90.o(parcel, 4, b(lb3Var));
        md1 md1Var = this.i;
        s90.o(parcel, 5, b(md1Var));
        k11 k11Var = this.j;
        s90.o(parcel, 6, b(k11Var));
        s90.q(parcel, 7, this.k);
        s90.P(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        s90.q(parcel, 9, this.m);
        md0 md0Var = this.n;
        s90.o(parcel, 10, b(md0Var));
        s90.P(parcel, 11, 4);
        parcel.writeInt(this.o);
        s90.P(parcel, 12, 4);
        parcel.writeInt(this.p);
        s90.q(parcel, 13, this.q);
        s90.p(parcel, 14, this.r, i);
        s90.q(parcel, 16, this.s);
        s90.p(parcel, 17, this.t, i);
        j11 j11Var = this.u;
        s90.o(parcel, 18, b(j11Var));
        s90.q(parcel, 19, this.v);
        s90.q(parcel, 24, this.w);
        s90.q(parcel, 25, this.x);
        ik1 ik1Var = this.y;
        s90.o(parcel, 26, b(ik1Var));
        zm1 zm1Var = this.z;
        s90.o(parcel, 27, b(zm1Var));
        k61 k61Var = this.A;
        s90.o(parcel, 28, b(k61Var));
        s90.P(parcel, 29, 4);
        parcel.writeInt(this.B ? 1 : 0);
        s90.P(parcel, 30, 8);
        long j = this.C;
        parcel.writeLong(j);
        s90.J(parcel, iW);
        ix0 ix0Var = lx0.Kd;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            E.put(Long.valueOf(j), new fa3(ib0Var, lb3Var, md1Var, j11Var, k11Var, md0Var, ik1Var, zm1Var, k61Var, za1.d.schedule(new sa3(j), ((Integer) tu0Var.c.a(lx0.Md)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(ib0 ib0Var, sd1 sd1Var, j11 j11Var, k11 k11Var, md0 md0Var, yd1 yd1Var, boolean z, int i, String str, String str2, d60 d60Var, zm1 zm1Var, hw1 hw1Var) {
        this.f = null;
        this.g = ib0Var;
        this.h = sd1Var;
        this.i = yd1Var;
        this.u = j11Var;
        this.j = k11Var;
        this.k = str2;
        this.l = z;
        this.m = str;
        this.n = md0Var;
        this.o = i;
        this.p = 3;
        this.q = null;
        this.r = d60Var;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = zm1Var;
        this.A = hw1Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(ib0 ib0Var, lb3 lb3Var, md0 md0Var, yd1 yd1Var, boolean z, int i, d60 d60Var, zm1 zm1Var, hw1 hw1Var) {
        this.f = null;
        this.g = ib0Var;
        this.h = lb3Var;
        this.i = yd1Var;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = z;
        this.m = null;
        this.n = md0Var;
        this.o = i;
        this.p = 2;
        this.q = null;
        this.r = d60Var;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = zm1Var;
        this.A = hw1Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(ib0 ib0Var, sd1 sd1Var, j11 j11Var, k11 k11Var, md0 md0Var, yd1 yd1Var, boolean z, int i, String str, d60 d60Var, zm1 zm1Var, hw1 hw1Var, boolean z2) {
        this.f = null;
        this.g = ib0Var;
        this.h = sd1Var;
        this.i = yd1Var;
        this.u = j11Var;
        this.j = k11Var;
        this.k = null;
        this.l = z;
        this.m = null;
        this.n = md0Var;
        this.o = i;
        this.p = 3;
        this.q = str;
        this.r = d60Var;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = zm1Var;
        this.A = hw1Var;
        this.B = z2;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(r91 r91Var, ib0 ib0Var, lb3 lb3Var, md0 md0Var, d60 d60Var, yd1 yd1Var, zm1 zm1Var, String str) {
        this.f = r91Var;
        this.g = ib0Var;
        this.h = lb3Var;
        this.i = yd1Var;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = md0Var;
        this.o = -1;
        this.p = 4;
        this.q = null;
        this.r = d60Var;
        this.s = null;
        this.t = null;
        this.v = str;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = zm1Var;
        this.A = null;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(yd1 yd1Var, d60 d60Var, String str, String str2, k61 k61Var) {
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = yd1Var;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = null;
        this.o = 14;
        this.p = 5;
        this.q = null;
        this.r = d60Var;
        this.s = null;
        this.t = null;
        this.v = str;
        this.w = str2;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = k61Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(nn1 nn1Var, md1 md1Var, int i, d60 d60Var, String str, q83 q83Var, String str2, String str3, String str4, ik1 ik1Var, hw1 hw1Var, String str5) {
        this.f = null;
        this.g = null;
        this.h = nn1Var;
        this.i = md1Var;
        this.u = null;
        this.j = null;
        this.l = false;
        if (((Boolean) tu0.e.c.a(lx0.R0)).booleanValue()) {
            this.k = null;
            this.m = null;
        } else {
            this.k = str2;
            this.m = str3;
        }
        this.n = null;
        this.o = i;
        this.p = 1;
        this.q = null;
        this.r = d60Var;
        this.s = str;
        this.t = q83Var;
        this.v = str5;
        this.w = null;
        this.x = str4;
        this.y = ik1Var;
        this.z = null;
        this.A = hw1Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(rt1 rt1Var, md1 md1Var, d60 d60Var) {
        this.h = rt1Var;
        this.i = md1Var;
        this.o = 1;
        this.r = d60Var;
        this.f = null;
        this.g = null;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = null;
        this.p = 1;
        this.q = null;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = false;
        this.C = D.getAndIncrement();
    }
}
