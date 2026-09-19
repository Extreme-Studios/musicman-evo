package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pv1 extends jt0 implements l71 {
    public final Context f;
    public final ya1 g;
    public final oc2 h;
    public final if1 i;
    public final ArrayDeque j;
    public final e72 k;

    public pv1(Context context, ya1 ya1Var, zf0 zf0Var, if1 if1Var, oc2 oc2Var, ArrayDeque arrayDeque, e72 e72Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        lx0.a(context);
        this.f = context;
        this.g = ya1Var;
        this.h = oc2Var;
        this.i = if1Var;
        this.j = arrayDeque;
        this.k = e72Var;
    }

    public static p62 F3(p62 p62Var, u62 u62Var, a41 a41Var, d72 d72Var, a72 a72Var) {
        c41 c41VarA = a41Var.a("AFMA_getAdDictionary", z31.b, el1.y);
        i8.z(p62Var, a72Var);
        p62 p62VarY = u62Var.a(p62Var, r62.l).q(c41VarA).y();
        if (!((Boolean) my0.c.u()).booleanValue()) {
            return p62VarY;
        }
        fn2 fn2VarR = fn2.r(p62VarY);
        z61 z61Var = new z61(d72Var, 22, a72Var);
        fn2VarR.a(new in2(fn2VarR, 0, z61Var), za1.g);
        return p62VarY;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 0;
        p71 m71Var = null;
        q71 q71Var = null;
        p71 m71Var2 = null;
        p71 m71Var3 = null;
        p71 m71Var4 = null;
        switch (i) {
            case 1:
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                kt0.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                r71 r71Var = (r71) kt0.b(parcel, r71.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    m71Var = iInterfaceQueryLocalInterface instanceof p71 ? (p71) iInterfaceQueryLocalInterface : new m71(strongBinder2);
                }
                kt0.f(parcel);
                m1(r71Var, m71Var);
                parcel2.writeNoException();
                return true;
            case 5:
                r71 r71Var2 = (r71) kt0.b(parcel, r71.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    m71Var4 = iInterfaceQueryLocalInterface2 instanceof p71 ? (p71) iInterfaceQueryLocalInterface2 : new m71(strongBinder3);
                }
                kt0.f(parcel);
                y0(r71Var2, m71Var4);
                parcel2.writeNoException();
                return true;
            case 6:
                r71 r71Var3 = (r71) kt0.b(parcel, r71.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    m71Var3 = iInterfaceQueryLocalInterface3 instanceof p71 ? (p71) iInterfaceQueryLocalInterface3 : new m71(strongBinder4);
                }
                kt0.f(parcel);
                R2(r71Var3, m71Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    m71Var2 = iInterfaceQueryLocalInterface4 instanceof p71 ? (p71) iInterfaceQueryLocalInterface4 : new m71(strongBinder5);
                }
                kt0.f(parcel);
                n3(string, m71Var2);
                parcel2.writeNoException();
                return true;
            case 8:
                j71 j71Var = (j71) kt0.b(parcel, j71.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    q71Var = iInterfaceQueryLocalInterface5 instanceof q71 ? (q71) iInterfaceQueryLocalInterface5 : new q71(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 2);
                }
                kt0.f(parcel);
                if (!((Boolean) iz0.a.u()).booleanValue()) {
                    try {
                        Parcel parcelU = q71Var.U();
                        parcelU.writeString("");
                        kt0.c(parcelU, j71Var);
                        q71Var.K0(parcelU, 1);
                    } catch (RemoteException e) {
                        jn.w("Service can't call client", e);
                    }
                    break;
                } else {
                    this.i.getClass();
                    String str = j71Var.f;
                    kn2 kn2Var = kn2.g;
                    kn2Var.a(new in2(kn2Var, i2, new un1(this, q71Var, j71Var)), za1.g);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                kt0.f(parcel);
                r0(string2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final p62 B3(r71 r71Var, int i) {
        kv1 kv1VarH3;
        boolean z;
        p62 p62VarY;
        gx0 gx0Var = gx0.f;
        u40 u40Var = vc3.C.r;
        d60 d60VarA = d60.a();
        e72 e72Var = this.k;
        Context context = this.f;
        a41 a41VarI = u40Var.i(context, d60VarA, e72Var);
        if1 if1Var = this.i;
        if1Var.getClass();
        y91 y91Var = new y91(if1Var.b, new e3(i, 11, r71Var));
        c41 c41VarA = a41VarI.a("google.afma.response.normalize", lv1.d, z31.c);
        if (((Boolean) bz0.a.u()).booleanValue()) {
            kv1VarH3 = H3(r71Var.m);
            if (kv1VarH3 == null) {
                jn.p("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = r71Var.o;
            if (str != null && !str.isEmpty()) {
                jn.p("Request contained a PoolKey but split request is disabled.");
            }
            kv1VarH3 = null;
        }
        int i2 = 9;
        a72 a72VarJ = kv1VarH3 == null ? a72.j(context, 9) : kv1VarH3.d;
        d72 d72Var = (d72) ((q63) y91Var.h).c();
        d72Var.b(r71Var.f.getStringArrayList("ad_types"));
        tv1 tv1Var = new tv1(r71Var.l, d72Var, a72VarJ);
        xc xcVar = new xc(context, r71Var.g.f, null);
        u62 u62Var = (u62) ((q63) y91Var.i).c();
        a72 a72VarJ2 = a72.j(context, 11);
        r62 r62Var = r62.n;
        r62 r62Var2 = r62.m;
        int i3 = 10;
        if (kv1VarH3 == null) {
            yy0 yy0Var = new yy0(y91Var, i2, r71Var);
            fl1 fl1Var = fl1.w;
            es0 es0VarA = u62Var.a(na1.t(r71Var.f), r62.k);
            ya1 ya1Var = u62Var.a;
            p62 p62VarY2 = es0VarA.q(yy0Var).o(fl1Var).y();
            p62 p62VarF3 = F3(p62VarY2, u62Var, a41VarI, d72Var, a72VarJ);
            a72 a72VarJ3 = a72.j(context, 10);
            List listAsList = Arrays.asList(p62VarF3, p62VarY2);
            ch0 ch0Var = new ch0(p62VarF3, r71Var, p62VarY2, 3);
            tj2 tj2Var = vj2.g;
            listAsList.getClass();
            vj2 vj2VarM = vj2.m(listAsList);
            ya1 ya1Var2 = za1.g;
            bn2 bn2Var = new bn2(vj2VarM, true, false);
            bn2Var.u = new an2(bn2Var, gx0Var, ya1Var2);
            bn2Var.v();
            bn2 bn2Var2 = new bn2(vj2VarM, true, false);
            bn2Var2.u = new an2(bn2Var2, ch0Var, ya1Var);
            bn2Var2.v();
            p62 p62VarY3 = new es0(u62Var, r62Var2, null, bn2Var, listAsList, bn2Var2).o(tv1Var).o(new j52(a72VarJ3)).o(xcVar).y();
            i8.M(p62VarY3, d72Var, a72VarJ3, false);
            i8.z(p62VarY3, a72VarJ2);
            List listAsList2 = Arrays.asList(p62VarY2, p62VarF3, p62VarY3);
            wp1 wp1Var = new wp1(r71Var, p62VarY3, p62VarY2, p62VarF3, 1);
            tj2 tj2Var2 = vj2.g;
            listAsList2.getClass();
            vj2 vj2VarM2 = vj2.m(listAsList2);
            ya1 ya1Var3 = za1.g;
            bn2 bn2Var3 = new bn2(vj2VarM2, true, false);
            bn2Var3.u = new an2(bn2Var3, gx0Var, ya1Var3);
            bn2Var3.v();
            bn2 bn2Var4 = new bn2(vj2VarM2, true, false);
            bn2Var4.u = new an2(bn2Var4, wp1Var, ya1Var);
            bn2Var4.v();
            p62VarY = new es0(u62Var, r62Var, null, bn2Var3, listAsList2, bn2Var4).q(c41VarA).y();
            z = false;
        } else {
            sv1 sv1Var = new sv1(kv1VarH3.b, kv1VarH3.a);
            a72 a72VarJ4 = a72.j(context, 10);
            p62 p62VarY4 = u62Var.a(na1.t(sv1Var), r62Var2).o(tv1Var).o(new j52(a72VarJ4)).o(xcVar).y();
            z = false;
            i8.M(p62VarY4, d72Var, a72VarJ4, false);
            kn2 kn2VarT = na1.t(kv1VarH3);
            i8.z(p62VarY4, a72VarJ2);
            List listAsList3 = Arrays.asList(p62VarY4, kn2VarT);
            hq0 hq0Var = new hq0(p62VarY4, i3, kn2VarT);
            tj2 tj2Var3 = vj2.g;
            listAsList3.getClass();
            vj2 vj2VarM3 = vj2.m(listAsList3);
            ya1 ya1Var4 = za1.g;
            bn2 bn2Var5 = new bn2(vj2VarM3, true, false);
            bn2Var5.u = new an2(bn2Var5, gx0Var, ya1Var4);
            bn2Var5.v();
            ya1 ya1Var5 = u62Var.a;
            bn2 bn2Var6 = new bn2(vj2VarM3, true, false);
            bn2Var6.u = new an2(bn2Var6, hq0Var, ya1Var5);
            bn2Var6.v();
            p62VarY = new es0(u62Var, r62Var, null, bn2Var5, listAsList3, bn2Var6).q(c41VarA).y();
        }
        i8.M(p62VarY, d72Var, a72VarJ2, z);
        return p62VarY;
    }

    public final hp C3(final r71 r71Var, int i) {
        if (!((Boolean) bz0.a.u()).booleanValue()) {
            return na1.C(new Exception("Split request is disabled."));
        }
        c62 c62Var = r71Var.n;
        if (c62Var == null) {
            return na1.C(new Exception("Pool configuration missing from request."));
        }
        if (c62Var.i == 0 || c62Var.j == 0) {
            return na1.C(new Exception("Caching is disabled."));
        }
        u40 u40Var = vc3.C.r;
        d60 d60VarA = d60.a();
        Context context = this.f;
        a41 a41VarI = u40Var.i(context, d60VarA, this.k);
        if1 if1Var = this.i;
        if1Var.getClass();
        y91 y91Var = new y91(if1Var.b, new e3(i, 11, r71Var));
        u62 u62Var = (u62) ((q63) y91Var.i).c();
        final p62 p62VarY = u62Var.a(na1.t(r71Var.f), r62.k).q(new yy0(y91Var, 9, r71Var)).o(fl1.w).y();
        d72 d72Var = (d72) ((q63) y91Var.h).c();
        final a72 a72VarJ = a72.j(context, 9);
        final p62 p62VarF3 = F3(p62VarY, u62Var, a41VarI, d72Var, a72VarJ);
        List listAsList = Arrays.asList(p62VarY, p62VarF3);
        Callable callable = new Callable() { // from class: jv1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pv1 pv1Var = this.a;
                p62 p62Var = p62VarF3;
                p62 p62Var2 = p62VarY;
                r71 r71Var2 = r71Var;
                a72 a72Var = a72VarJ;
                String str = ((s71) p62Var.h.get()).i;
                kv1 kv1Var = new kv1((s71) p62Var.h.get(), (JSONObject) p62Var2.h.get(), r71Var2.m, a72Var);
                synchronized (pv1Var) {
                    synchronized (pv1Var) {
                        int iIntValue = ((Long) bz0.b.u()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = pv1Var.j;
                            if (arrayDeque.size() >= iIntValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                pv1Var.j.addLast(kv1Var);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        tj2 tj2Var = vj2.g;
        listAsList.getClass();
        vj2 vj2VarM = vj2.m(listAsList);
        gx0 gx0Var = gx0.f;
        ya1 ya1Var = za1.g;
        bn2 bn2Var = new bn2(vj2VarM, true, false);
        bn2Var.u = new an2(bn2Var, gx0Var, ya1Var);
        bn2Var.v();
        ya1 ya1Var2 = u62Var.a;
        bn2 bn2Var2 = new bn2(vj2VarM, true, false);
        bn2Var2.u = new an2(bn2Var2, callable, ya1Var2);
        bn2Var2.v();
        return new es0(u62Var, r62.B, null, bn2Var, listAsList, bn2Var2).y();
    }

    public final hp D3(String str) {
        if (((Boolean) bz0.a.u()).booleanValue()) {
            return H3(str) == null ? na1.C(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : na1.t(new iv1());
        }
        return na1.C(new Exception("Split request is disabled."));
    }

    public final hp E3(r71 r71Var, int i) {
        u40 u40Var = vc3.C.r;
        d60 d60VarA = d60.a();
        e72 e72Var = this.k;
        Context context = this.f;
        a41 a41VarI = u40Var.i(context, d60VarA, e72Var);
        if (!((Boolean) gz0.a.u()).booleanValue()) {
            return na1.C(new Exception("Signal collection disabled."));
        }
        if1 if1Var = this.i;
        if1Var.getClass();
        e3 e3Var = new e3(i, 11, r71Var);
        if1 if1Var2 = if1Var.b;
        q63 q63VarA = q63.a(new q12(if1Var2.t, 9));
        j32 j32Var = new j32(e3Var, 1);
        j32 j32Var2 = new j32(e3Var, 2);
        j32 j32Var3 = new j32(e3Var, 3);
        xe1 xe1Var = if1Var2.g;
        q63 q63Var = if1Var2.d;
        u91 u91Var = new u91(xe1Var, q63Var, j32Var, j32Var2, j32Var3, 17);
        q12 q12Var = new q12(xe1Var, 5);
        int i2 = 0;
        j32 j32Var4 = new j32(e3Var, i2);
        tz0 tz0Var = new tz0(22, j32Var4);
        zh1 zh1Var = new zh1(q63Var, xe1Var, 10);
        l32 l32Var = new l32(i2);
        j32 j32Var5 = new j32(e3Var, 5);
        j32 j32Var6 = new j32(e3Var, 6);
        q63 q63Var2 = if1Var2.U;
        yn1 yn1Var = new yn1(q63Var2, j32Var3, j32Var4, q63Var, j32Var5, j32Var6);
        i91 i91Var = new i91(j32Var4, q63Var2, q63Var, 28);
        j32 j32Var7 = new j32(e3Var, 4);
        q63 q63VarA2 = q63.a(na1.m);
        q63 q63VarA3 = q63.a(v51.k);
        q63 q63VarA4 = q63.a(ej1.l);
        q63 q63VarA5 = q63.a(dq.s);
        int i3 = t63.b;
        LinkedHashMap linkedHashMapX = ej1.x(4);
        linkedHashMapX.put(r62.k, q63VarA2);
        linkedHashMapX.put(r62.l, q63VarA3);
        linkedHashMapX.put(r62.m, q63VarA4);
        linkedHashMapX.put(r62.n, q63VarA5);
        q63 q63VarA6 = q63.a(new i91(j32Var7, if1Var2.g, new t63(linkedHashMapX), 10));
        int i4 = w63.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(q63VarA6);
        q63 q63VarA7 = q63.a(new g12(if1Var2.d, new bk1(new w63(list, arrayList), 25)));
        q63 q63Var3 = if1Var2.O0;
        Context context2 = if1Var2.a.b;
        dq.D(context2);
        Object objC = q63Var3.c();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        String string = ((r71) e3Var.h).f.getString("ms");
        if (string == null) {
            string = "";
        }
        c02 c02Var = new c02(ya1Var, 7, string);
        ya1 ya1Var2 = za1.a;
        dq.D(ya1Var2);
        List list2 = r71Var.j;
        dq.D(list2);
        c02 c02Var2 = new c02(ya1Var2, 8, list2);
        o63 o63VarB = q63.b(u91Var);
        o63 o63VarB2 = q63.b(q12Var);
        q63.b(tz0Var);
        o63 o63VarB3 = q63.b(zh1Var);
        o63 o63VarB4 = q63.b(l32Var);
        q63.b(yn1Var);
        o63 o63VarB5 = q63.b(i91Var);
        dq.D(ya1Var2);
        d72 d72Var = (d72) q63VarA.c();
        es1 es1Var = (es1) if1Var2.j.c();
        HashSet hashSet = new HashSet();
        hashSet.add((a32) objC);
        hashSet.add(c02Var);
        hashSet.add(c02Var2);
        ix0 ix0Var = lx0.i6;
        kx0 kx0Var = tu0.e.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            hashSet.add((m22) o63VarB.c());
        }
        if (((Boolean) kx0Var.a(lx0.j6)).booleanValue()) {
            hashSet.add((m22) o63VarB2.c());
        }
        if (((Boolean) kx0Var.a(lx0.l6)).booleanValue()) {
            hashSet.add((m22) o63VarB3.c());
        }
        if (((Boolean) kx0Var.a(lx0.m6)).booleanValue()) {
            hashSet.add((m22) o63VarB4.c());
        }
        if (((Boolean) kx0Var.a(lx0.q3)).booleanValue()) {
            hashSet.add((m22) o63VarB5.c());
        }
        o22 o22Var = new o22(context2, ya1Var2, hashSet, d72Var, es1Var);
        c41 c41VarA = a41VarI.a("google.afma.request.getSignals", z31.b, z31.c);
        a72 a72VarJ = a72.j(context, 22);
        u62 u62Var = (u62) q63VarA7.c();
        Bundle bundle = r71Var.f;
        es0 es0VarQ = u62Var.a(na1.t(bundle), r62.o).o(new j52(a72VarJ)).q(new yy0(o22Var, 10, r71Var));
        p62 p62VarY = ((u62) es0VarQ.k).a(es0VarQ.y(), r62.p).q(c41VarA).y();
        d72 d72Var2 = (d72) q63VarA.c();
        d72Var2.b(bundle.getStringArrayList("ad_types"));
        d72Var2.d(bundle.getBundle("extras"));
        i8.M(p62VarY, d72Var2, a72VarJ, true);
        if (((Boolean) ry0.h.u()).booleanValue()) {
            oc2 oc2Var = this.h;
            Objects.requireNonNull(oc2Var);
            p62VarY.a(new mv1(oc2Var, 0), this.g);
        }
        return p62VarY;
    }

    public final void G3(hp hpVar, p71 p71Var, r71 r71Var) {
        pm2 pm2VarL = na1.L(hpVar, new kg0(8), za1.a);
        vg2 vg2Var = new vg2(this, r71Var, p71Var, 16);
        pm2VarL.a(new in2(pm2VarL, 0, vg2Var), za1.g);
    }

    public final synchronized kv1 H3(String str) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            kv1 kv1Var = (kv1) it.next();
            if (kv1Var.c.equals(str)) {
                it.remove();
                return kv1Var;
            }
        }
        return null;
    }

    @Override // defpackage.l71
    public final void R2(r71 r71Var, p71 p71Var) {
        G3(C3(r71Var, Binder.getCallingUid()), p71Var, r71Var);
    }

    @Override // defpackage.l71
    public final void m1(r71 r71Var, p71 p71Var) {
        Bundle bundle;
        if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() && (bundle = r71Var.r) != null) {
            ec.q(vc3.C.k, bundle, "service-connected");
        }
        p62 p62VarB3 = B3(r71Var, Binder.getCallingUid());
        G3(p62VarB3, p71Var, r71Var);
        if (((Boolean) ry0.g.u()).booleanValue()) {
            oc2 oc2Var = this.h;
            Objects.requireNonNull(oc2Var);
            p62VarB3.a(new mv1(oc2Var, 1), this.g);
        }
    }

    @Override // defpackage.l71
    public final void n3(String str, p71 p71Var) {
        G3(D3(str), p71Var, null);
    }

    @Override // defpackage.l71
    public final void r0(String str) {
        rv1 rv1VarA;
        Binder.getCallingUid();
        ix0 ix0Var = lx0.Ee;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            String str2 = (String) tu0Var.c.a(lx0.Fe);
            if (str2.isEmpty()) {
                return;
            }
            bz1 bz1VarC = bz1.c(new vh2(','));
            jn.p("AdRequestServiceImpl: Preconnecting");
            Iterator itF = ((hi2) bz1VarC.f).f(bz1VarC, str2);
            do {
                gi2 gi2Var = (gi2) itF;
                if (!gi2Var.hasNext()) {
                    return;
                }
                String str3 = (String) gi2Var.next();
                Context context = this.f;
                xc xcVar = new xc(context, str, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", vc3.C.c.E(context, str));
                try {
                    rv1VarA = xcVar.b(new qv1(str3, 30000, map, new byte[0], ""));
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            } while (rv1VarA.a == 200);
            int i = rv1VarA.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i);
            throw new RemoteException(sb.toString());
        }
    }

    @Override // defpackage.l71
    public final void y0(r71 r71Var, p71 p71Var) {
        Bundle bundle;
        if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() && (bundle = r71Var.r) != null) {
            ec.q(vc3.C.k, bundle, "service-connected");
        }
        G3(E3(r71Var, Binder.getCallingUid()), p71Var, r71Var);
    }
}
