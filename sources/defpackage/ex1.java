package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ex1 implements zw1 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Executor c;
    public final Object d;

    public /* synthetic */ ex1(Context context, Object obj, Executor executor, int i) {
        this.a = i;
        this.b = context;
        this.d = obj;
        this.c = executor;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0527  */
    /* JADX WARN: Code duplicated, block: B:93:0x053f  */
    private final Object c(e52 e52Var, x42 x42Var, ww1 ww1Var) throws ky1, l52 {
        s52 s52Var;
        s41 s41Var;
        v41 v41Var;
        t41 t41Var;
        ro1 ro1VarM;
        t41 t41Var2;
        s52 s52Var2 = (s52) ww1Var.b;
        n41 n41Var = s52Var2.a;
        try {
            s41 s41VarV = n41Var.V();
            try {
                t41 t41VarE0 = n41Var.e0();
                try {
                    v41 v41VarE = n41Var.E();
                    if (v41VarE == null || !d(e52Var, 6)) {
                        if (s41VarV != null && d(e52Var, 6)) {
                            try {
                                Parcel parcelY = s41VarV.Y(s41VarV.U(), 17);
                                hv1 hv1VarB3 = yu1.B3(parcelY.readStrongBinder());
                                parcelY.recycle();
                                qo1 qo1Var = hv1VarB3 == null ? null : new qo1(hv1VarB3, null);
                                Parcel parcelY2 = s41VarV.Y(s41VarV.U(), 19);
                                wz0 wz0VarB3 = vz0.B3(parcelY2.readStrongBinder());
                                parcelY2.recycle();
                                Parcel parcelY3 = s41VarV.Y(s41VarV.U(), 18);
                                rm rmVarO0 = ju.O0(parcelY3.readStrongBinder());
                                parcelY3.recycle();
                                View view = (View) ro1.n(rmVarO0);
                                Parcel parcelY4 = s41VarV.Y(s41VarV.U(), 2);
                                String string = parcelY4.readString();
                                parcelY4.recycle();
                                Parcel parcelY5 = s41VarV.Y(s41VarV.U(), 3);
                                ArrayList arrayList = parcelY5.readArrayList(kt0.a);
                                parcelY5.recycle();
                                Parcel parcelY6 = s41VarV.Y(s41VarV.U(), 4);
                                String string2 = parcelY6.readString();
                                parcelY6.recycle();
                                Parcel parcelY7 = s41VarV.Y(s41VarV.U(), 15);
                                Bundle bundle = (Bundle) kt0.b(parcelY7, Bundle.CREATOR);
                                parcelY7.recycle();
                                Parcel parcelY8 = s41VarV.Y(s41VarV.U(), 6);
                                String string3 = parcelY8.readString();
                                parcelY8.recycle();
                                View view2 = (View) ro1.n(s41VarV.Z0());
                                Parcel parcelY9 = s41VarV.Y(s41VarV.U(), 21);
                                rm rmVarO1 = ju.O0(parcelY9.readStrongBinder());
                                parcelY9.recycle();
                                Parcel parcelY10 = s41VarV.Y(s41VarV.U(), 8);
                                String string4 = parcelY10.readString();
                                parcelY10.recycle();
                                Parcel parcelY11 = s41VarV.Y(s41VarV.U(), 9);
                                String string5 = parcelY11.readString();
                                parcelY11.recycle();
                                Parcel parcelY12 = s41VarV.Y(s41VarV.U(), 7);
                                double d = parcelY12.readDouble();
                                parcelY12.recycle();
                                Parcel parcelY13 = s41VarV.Y(s41VarV.U(), 5);
                                a01 a01VarB3 = oz0.B3(parcelY13.readStrongBinder());
                                parcelY13.recycle();
                                ro1VarM = ro1.m(qo1Var, wz0VarB3, view, string, arrayList, string2, bundle, string3, view2, rmVarO1, string4, string5, d, a01VarB3, null, 0.0f);
                            } catch (RemoteException e) {
                                jn.V("Failed to get native ad assets from app install ad mapper", e);
                                ro1VarM = null;
                            }
                        } else if (s41VarV == null || !d(e52Var, 2)) {
                            s52Var = s52Var2;
                            s41Var = s41VarV;
                            v41Var = v41VarE;
                            if (t41VarE0 != null && d(e52Var, 6)) {
                                try {
                                    t41Var2 = t41VarE0;
                                    try {
                                        Parcel parcelY14 = t41Var2.Y(t41VarE0.U(), 16);
                                        hv1 hv1VarB4 = yu1.B3(parcelY14.readStrongBinder());
                                        parcelY14.recycle();
                                        qo1 qo1Var2 = hv1VarB4 == null ? null : new qo1(hv1VarB4, null);
                                        Parcel parcelY15 = t41Var2.Y(t41Var2.U(), 19);
                                        wz0 wz0VarB4 = vz0.B3(parcelY15.readStrongBinder());
                                        parcelY15.recycle();
                                        Parcel parcelY16 = t41Var2.Y(t41Var2.U(), 15);
                                        rm rmVarO2 = ju.O0(parcelY16.readStrongBinder());
                                        parcelY16.recycle();
                                        View view3 = (View) ro1.n(rmVarO2);
                                        Parcel parcelY17 = t41Var2.Y(t41Var2.U(), 2);
                                        String string6 = parcelY17.readString();
                                        parcelY17.recycle();
                                        Parcel parcelY18 = t41Var2.Y(t41Var2.U(), 3);
                                        ArrayList arrayList2 = parcelY18.readArrayList(kt0.a);
                                        parcelY18.recycle();
                                        Parcel parcelY19 = t41Var2.Y(t41Var2.U(), 4);
                                        String string7 = parcelY19.readString();
                                        parcelY19.recycle();
                                        Parcel parcelY20 = t41Var2.Y(t41Var2.U(), 13);
                                        Bundle bundle2 = (Bundle) kt0.b(parcelY20, Bundle.CREATOR);
                                        parcelY20.recycle();
                                        Parcel parcelY21 = t41Var2.Y(t41Var2.U(), 6);
                                        String string8 = parcelY21.readString();
                                        parcelY21.recycle();
                                        View view4 = (View) ro1.n(t41Var2.v());
                                        Parcel parcelY22 = t41Var2.Y(t41Var2.U(), 21);
                                        rm rmVarO3 = ju.O0(parcelY22.readStrongBinder());
                                        parcelY22.recycle();
                                        Parcel parcelY23 = t41Var2.Y(t41Var2.U(), 5);
                                        a01 a01VarB4 = oz0.B3(parcelY23.readStrongBinder());
                                        parcelY23.recycle();
                                        Parcel parcelY24 = t41Var2.Y(t41Var2.U(), 7);
                                        String string9 = parcelY24.readString();
                                        parcelY24.recycle();
                                        ro1VarM = ro1.m(qo1Var2, wz0VarB4, view3, string6, arrayList2, string7, bundle2, string8, view4, rmVarO3, null, null, -1.0d, a01VarB4, string9, 0.0f);
                                    } catch (RemoteException e2) {
                                        e = e2;
                                        jn.V("Failed to get native ad assets from content ad mapper", e);
                                        ro1VarM = null;
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    t41Var2 = t41VarE0;
                                }
                                t41Var = t41Var2;
                            } else {
                                if (t41VarE0 == null || !d(e52Var, 1)) {
                                    throw new ky1("No native ad mappers", 1);
                                }
                                try {
                                    Parcel parcelY25 = t41VarE0.Y(t41VarE0.U(), 16);
                                    hv1 hv1VarB5 = yu1.B3(parcelY25.readStrongBinder());
                                    parcelY25.recycle();
                                    qo1 qo1Var3 = hv1VarB5 == null ? null : new qo1(hv1VarB5, null);
                                    Parcel parcelY26 = t41VarE0.Y(t41VarE0.U(), 19);
                                    wz0 wz0VarB5 = vz0.B3(parcelY26.readStrongBinder());
                                    parcelY26.recycle();
                                    Parcel parcelY27 = t41VarE0.Y(t41VarE0.U(), 15);
                                    rm rmVarO4 = ju.O0(parcelY27.readStrongBinder());
                                    parcelY27.recycle();
                                    View view5 = (View) ro1.n(rmVarO4);
                                    Parcel parcelY28 = t41VarE0.Y(t41VarE0.U(), 2);
                                    String string10 = parcelY28.readString();
                                    parcelY28.recycle();
                                    Parcel parcelY29 = t41VarE0.Y(t41VarE0.U(), 3);
                                    ArrayList arrayList3 = parcelY29.readArrayList(kt0.a);
                                    parcelY29.recycle();
                                    Parcel parcelY30 = t41VarE0.Y(t41VarE0.U(), 4);
                                    String string11 = parcelY30.readString();
                                    parcelY30.recycle();
                                    Parcel parcelY31 = t41VarE0.Y(t41VarE0.U(), 13);
                                    Bundle bundle3 = (Bundle) kt0.b(parcelY31, Bundle.CREATOR);
                                    parcelY31.recycle();
                                    Parcel parcelY32 = t41VarE0.Y(t41VarE0.U(), 6);
                                    String string12 = parcelY32.readString();
                                    parcelY32.recycle();
                                    View view6 = (View) ro1.n(t41VarE0.v());
                                    Parcel parcelY33 = t41VarE0.Y(t41VarE0.U(), 21);
                                    rm rmVarO5 = ju.O0(parcelY33.readStrongBinder());
                                    parcelY33.recycle();
                                    Parcel parcelY34 = t41VarE0.Y(t41VarE0.U(), 7);
                                    String string13 = parcelY34.readString();
                                    parcelY34.recycle();
                                    Parcel parcelY35 = t41VarE0.Y(t41VarE0.U(), 5);
                                    a01 a01VarB5 = oz0.B3(parcelY35.readStrongBinder());
                                    parcelY35.recycle();
                                    ro1 ro1Var = new ro1();
                                    t41Var = t41VarE0;
                                    try {
                                        ro1Var.a = 1;
                                        ro1Var.b = qo1Var3;
                                        ro1Var.c = wz0VarB5;
                                        ro1Var.d = view5;
                                        ro1Var.o("headline", string10);
                                        ro1Var.e = arrayList3;
                                        ro1Var.o("body", string11);
                                        ro1Var.h = bundle3;
                                        ro1Var.o("call_to_action", string12);
                                        ro1Var.o = view6;
                                        ro1Var.q = rmVarO5;
                                        ro1Var.o("advertiser", string13);
                                        ro1Var.t = a01VarB5;
                                        ro1VarM = ro1Var;
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        jn.V("Failed to get native ad from content ad mapper", e);
                                        ro1VarM = null;
                                    }
                                } catch (RemoteException e5) {
                                    e = e5;
                                    t41Var = t41VarE0;
                                }
                            }
                        } else {
                            try {
                                Parcel parcelY36 = s41VarV.Y(s41VarV.U(), 17);
                                hv1 hv1VarB6 = yu1.B3(parcelY36.readStrongBinder());
                                parcelY36.recycle();
                                qo1 qo1Var4 = hv1VarB6 == null ? null : new qo1(hv1VarB6, null);
                                Parcel parcelY37 = s41VarV.Y(s41VarV.U(), 19);
                                wz0 wz0VarB6 = vz0.B3(parcelY37.readStrongBinder());
                                parcelY37.recycle();
                                Parcel parcelY38 = s41VarV.Y(s41VarV.U(), 18);
                                rm rmVarO6 = ju.O0(parcelY38.readStrongBinder());
                                parcelY38.recycle();
                                View view7 = (View) ro1.n(rmVarO6);
                                Parcel parcelY39 = s41VarV.Y(s41VarV.U(), 2);
                                String string14 = parcelY39.readString();
                                parcelY39.recycle();
                                Parcel parcelY40 = s41VarV.Y(s41VarV.U(), 3);
                                ArrayList arrayList4 = parcelY40.readArrayList(kt0.a);
                                parcelY40.recycle();
                                s52Var = s52Var2;
                                try {
                                    Parcel parcelY41 = s41VarV.Y(s41VarV.U(), 4);
                                    String string15 = parcelY41.readString();
                                    parcelY41.recycle();
                                    v41Var = v41VarE;
                                    try {
                                        Parcel parcelY42 = s41VarV.Y(s41VarV.U(), 15);
                                        Bundle bundle4 = (Bundle) kt0.b(parcelY42, Bundle.CREATOR);
                                        parcelY42.recycle();
                                        Parcel parcelY43 = s41VarV.Y(s41VarV.U(), 6);
                                        String string16 = parcelY43.readString();
                                        parcelY43.recycle();
                                        View view8 = (View) ro1.n(s41VarV.Z0());
                                        t41Var = t41VarE0;
                                        try {
                                            Parcel parcelY44 = s41VarV.Y(s41VarV.U(), 21);
                                            rm rmVarO7 = ju.O0(parcelY44.readStrongBinder());
                                            parcelY44.recycle();
                                            Parcel parcelY45 = s41VarV.Y(s41VarV.U(), 8);
                                            String string17 = parcelY45.readString();
                                            parcelY45.recycle();
                                            Parcel parcelY46 = s41VarV.Y(s41VarV.U(), 9);
                                            String string18 = parcelY46.readString();
                                            parcelY46.recycle();
                                            Parcel parcelY47 = s41VarV.Y(s41VarV.U(), 7);
                                            double d2 = parcelY47.readDouble();
                                            parcelY47.recycle();
                                            Parcel parcelY48 = s41VarV.Y(s41VarV.U(), 5);
                                            a01 a01VarB6 = oz0.B3(parcelY48.readStrongBinder());
                                            parcelY48.recycle();
                                            ro1 ro1Var2 = new ro1();
                                            s41Var = s41VarV;
                                            try {
                                                ro1Var2.a = 2;
                                                ro1Var2.b = qo1Var4;
                                                ro1Var2.c = wz0VarB6;
                                                ro1Var2.d = view7;
                                                ro1Var2.o("headline", string14);
                                                ro1Var2.e = arrayList4;
                                                ro1Var2.o("body", string15);
                                                ro1Var2.h = bundle4;
                                                ro1Var2.o("call_to_action", string16);
                                                ro1Var2.o = view8;
                                                ro1Var2.q = rmVarO7;
                                                ro1Var2.o("store", string17);
                                                ro1Var2.o("price", string18);
                                                ro1Var2.r = d2;
                                                ro1Var2.s = a01VarB6;
                                                ro1VarM = ro1Var2;
                                            } catch (RemoteException e6) {
                                                e = e6;
                                                jn.V("Failed to get native ad from app install ad mapper", e);
                                                ro1VarM = null;
                                            }
                                        } catch (RemoteException e7) {
                                            e = e7;
                                            s41Var = s41VarV;
                                        }
                                    } catch (RemoteException e8) {
                                        e = e8;
                                        s41Var = s41VarV;
                                        t41Var = t41VarE0;
                                    }
                                } catch (RemoteException e9) {
                                    e = e9;
                                    s41Var = s41VarV;
                                    t41Var = t41VarE0;
                                    v41Var = v41VarE;
                                    jn.V("Failed to get native ad from app install ad mapper", e);
                                    ro1VarM = null;
                                    if (ro1VarM != null) {
                                        if (((i52) e52Var.a.g).h.contains(Integer.toString(ro1VarM.q()))) {
                                            hf1 hf1Var = (hf1) this.d;
                                            p83 p83Var = new p83(e52Var, x42Var, ww1Var.a);
                                            kc2 kc2Var = new kc2(23, ro1VarM);
                                            r52 r52Var = new r52(t41Var, s41Var, v41Var);
                                            if1 if1Var = hf1Var.b;
                                            hf1 hf1Var2 = hf1Var.c;
                                            ti1 ti1Var = new ti1(p83Var, 0);
                                            q63 q63Var = hf1Var2.g;
                                            tt0 tt0Var = if1Var.F0;
                                            q63 q63VarA = q63.a(new vg1(q63Var, ti1Var, 1));
                                            q63 q63VarA2 = q63.a(new hj1(q63VarA, 7));
                                            int i = w63.c;
                                            ArrayList arrayList5 = new ArrayList(1);
                                            ArrayList arrayList6 = new ArrayList(2);
                                            arrayList6.add(hf1Var2.o);
                                            arrayList6.add(hf1Var2.p);
                                            arrayList5.add(q63VarA2);
                                            q63 q63VarA3 = q63.a(new bk1(new w63(arrayList5, arrayList6), 3));
                                            q63 q63VarA4 = q63.a(v51.j);
                                            q63 q63Var2 = if1Var.c;
                                            q63 q63VarA5 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 4));
                                            ti1 ti1Var2 = new ti1(p83Var, 3);
                                            ti1 ti1Var3 = new ti1(p83Var, 2);
                                            xe1 xe1Var = if1Var.g;
                                            q63 q63VarA6 = q63.a(new yn1(if1Var.I, if1Var.H, ti1Var, ti1Var3, q63.a(new tg1(xe1Var, if1Var.X, q63.a(new eg1(xe1Var, 20)), q63.a(ar.j), if1Var.D0, if1Var.d)), hf1Var2.e));
                                            xn1 xn1Var = new xn1(4);
                                            xn1 xn1Var2 = new xn1(2);
                                            q63 q63VarA7 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 9));
                                            q63 q63VarA8 = q63.a(hn.p);
                                            eo1 eo1Var = new eo1(q63VarA8, 2);
                                            ArrayList arrayList7 = new ArrayList(2);
                                            ArrayList arrayList8 = new ArrayList(1);
                                            arrayList8.add(hf1Var2.u);
                                            arrayList7.add(q63VarA7);
                                            arrayList7.add(eo1Var);
                                            q63 q63VarA9 = q63.a(new i91(new w63(arrayList7, arrayList8), ti1Var, ti1Var2, 5));
                                            q63 q63VarA10 = q63.a(new tz0(9, ti1Var2));
                                            q63 q63VarA11 = q63.a(new ah1(if1Var.g, if1Var.c, if1Var.d, ti1Var2, ti1Var, hf1Var2.k, q63VarA6, xn1Var, xn1Var2, if1Var.E, hf1Var2.l, hf1Var2.e, hf1Var2.t, q63VarA9, q63VarA10));
                                            bf1 bf1Var = new bf1(q63VarA11, 24);
                                            hj1 hj1Var = new hj1(q63.a(new vg1(ti1Var, if1Var.V, 0)), 11);
                                            ArrayList arrayList9 = new ArrayList(4);
                                            ArrayList arrayList10 = new ArrayList(2);
                                            arrayList9.add(hf1Var2.q);
                                            arrayList10.add(hf1Var2.r);
                                            arrayList10.add(hf1Var2.s);
                                            arrayList9.add(q63VarA5);
                                            arrayList9.add(bf1Var);
                                            arrayList9.add(hj1Var);
                                            q63 q63VarA12 = q63.a(new bk1(new w63(arrayList9, arrayList10), 4));
                                            q63 q63VarA13 = q63.a(new jj1(if1Var.g, if1Var.C0, if1Var.j, ti1Var2, ti1Var, if1Var.G, yd.l));
                                            q63 q63VarA14 = q63.a(new hj1(q63VarA13, 5));
                                            q63 q63VarA15 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 3));
                                            q63 q63Var3 = if1Var.y0;
                                            yj1 yj1Var = hf1Var2.d;
                                            q63 q63VarA16 = q63.a(new hj1(q63.a(new zh1(q63Var3, yj1Var, 1)), 3));
                                            bf1 bf1Var2 = new bf1(q63VarA11, 23);
                                            ArrayList arrayList11 = new ArrayList(5);
                                            ArrayList arrayList12 = new ArrayList(3);
                                            arrayList11.add(hf1Var2.v);
                                            arrayList11.add(hf1Var2.w);
                                            arrayList12.add(hf1Var2.x);
                                            arrayList12.add(hf1Var2.y);
                                            arrayList11.add(q63VarA14);
                                            arrayList11.add(q63VarA15);
                                            arrayList12.add(q63VarA16);
                                            arrayList11.add(bf1Var2);
                                            q63 q63VarA17 = q63.a(new bk1(new w63(arrayList11, arrayList12), 0));
                                            q63 q63VarA18 = q63.a(new hj1(q63VarA13, 6));
                                            q63 q63VarA19 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 6));
                                            bf1 bf1Var3 = new bf1(q63VarA9, 12);
                                            bf1 bf1Var4 = new bf1(q63VarA11, 26);
                                            ArrayList arrayList13 = new ArrayList(6);
                                            ArrayList arrayList14 = new ArrayList(2);
                                            arrayList13.add(hf1Var2.z);
                                            arrayList13.add(hf1Var2.A);
                                            arrayList14.add(hf1Var2.B);
                                            arrayList14.add(hf1Var2.C);
                                            arrayList13.add(q63VarA18);
                                            arrayList13.add(q63VarA19);
                                            arrayList13.add(bf1Var3);
                                            arrayList13.add(bf1Var4);
                                            q63 q63VarA20 = q63.a(new bk1(new w63(arrayList13, arrayList14), 2));
                                            bf1 bf1Var5 = new bf1(q63VarA11, 29);
                                            ArrayList arrayList15 = new ArrayList(1);
                                            ArrayList arrayList16 = new ArrayList(1);
                                            arrayList16.add(hf1Var2.D);
                                            arrayList15.add(bf1Var5);
                                            q63 q63VarA21 = q63.a(new bk1(new w63(arrayList15, arrayList16), 19));
                                            bf1 bf1Var6 = new bf1(q63.a(new vg1(ti1Var, if1Var.I, 2)), 22);
                                            ArrayList arrayList17 = new ArrayList(1);
                                            new ArrayList(1).add(hf1Var2.E);
                                            arrayList17.add(bf1Var6);
                                            q63 q63VarA22 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 10));
                                            ArrayList arrayList18 = new ArrayList(1);
                                            ArrayList arrayList19 = new ArrayList(1);
                                            arrayList19.add(hf1Var2.F);
                                            arrayList18.add(q63VarA22);
                                            q63 q63VarA23 = q63.a(new bk1(new w63(arrayList18, arrayList19), 20));
                                            q63 q63VarA24 = q63.a(new hj1(q63VarA, 8));
                                            bf1 bf1Var7 = new bf1(q63VarA11, 27);
                                            ArrayList arrayList20 = new ArrayList(7);
                                            ArrayList arrayList21 = new ArrayList(4);
                                            arrayList20.add(hf1Var2.G);
                                            arrayList21.add(hf1Var2.H);
                                            arrayList20.add(hf1Var2.I);
                                            arrayList20.add(hf1Var2.J);
                                            arrayList21.add(hf1Var2.K);
                                            arrayList21.add(hf1Var2.L);
                                            arrayList21.add(hf1Var2.M);
                                            arrayList20.add(hf1Var2.N);
                                            arrayList20.add(hf1Var2.O);
                                            arrayList20.add(q63VarA24);
                                            arrayList20.add(bf1Var7);
                                            q63 q63VarA25 = q63.a(new bk1(new w63(arrayList20, arrayList21), 5));
                                            hj1 hj1Var2 = new hj1(q63.a(new bf1(q63VarA12, 11)), 1);
                                            q63 q63VarA26 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 8));
                                            ArrayList arrayList22 = new ArrayList(2);
                                            ArrayList arrayList23 = new ArrayList(1);
                                            arrayList23.add(hf1Var2.Q);
                                            arrayList22.add(hj1Var2);
                                            arrayList22.add(q63VarA26);
                                            q63 q63VarA27 = q63.a(new bk1(new w63(arrayList22, arrayList23), 9));
                                            tz0 tz0Var = new tz0(14, kc2Var);
                                            da1 da1Var = new da1(new ho1(tz0Var, 1), q63Var2, 15);
                                            ArrayList arrayList24 = new ArrayList(1);
                                            ArrayList arrayList25 = new ArrayList(1);
                                            arrayList25.add(hf1Var2.R);
                                            arrayList24.add(da1Var);
                                            q63 q63VarA28 = q63.a(new bk1(new w63(arrayList24, arrayList25), 24));
                                            q63 q63VarA29 = q63.a(new hj1(q63VarA13, 4));
                                            qp1 qp1Var = new qp1(r52Var, 0);
                                            qp1 qp1Var2 = new qp1(r52Var, 1);
                                            qp1 qp1Var3 = new qp1(r52Var, 2);
                                            q63 q63VarA30 = q63.a(new hj1(q63VarA13, 2));
                                            bf1 bf1Var8 = new bf1(q63VarA11, 28);
                                            ArrayList arrayList26 = new ArrayList(2);
                                            ArrayList arrayList27 = new ArrayList(1);
                                            arrayList27.add(hf1Var2.Y);
                                            arrayList26.add(q63VarA30);
                                            arrayList26.add(bf1Var8);
                                            q63 q63VarA31 = q63.a(new wi1(qp1Var, qp1Var2, qp1Var3, q63VarA20, q63.a(new bk1(new w63(arrayList26, arrayList27), 10)), q63VarA17, q63VarA23, hf1Var2.g, ti1Var, if1Var.h, yj1Var));
                                            eo1 eo1Var2 = new eo1(q63VarA31, 5);
                                            ArrayList arrayList28 = new ArrayList(1);
                                            ArrayList arrayList29 = new ArrayList(1);
                                            arrayList28.add(q63VarA29);
                                            arrayList29.add(eo1Var2);
                                            q63 q63VarA32 = q63.a(new bk1(new w63(arrayList28, arrayList29), 13));
                                            q63 q63VarA33 = q63.a(new eh1(q63VarA4, (v63) q63Var2, 5));
                                            bf1 bf1Var9 = new bf1(q63VarA11, 25);
                                            ArrayList arrayList30 = new ArrayList(2);
                                            ArrayList arrayList31 = new ArrayList(1);
                                            arrayList31.add(hf1Var2.S);
                                            arrayList30.add(q63VarA33);
                                            arrayList30.add(bf1Var9);
                                            bk1 bk1Var = new bk1(new w63(arrayList30, arrayList31), 1);
                                            q63 q63VarA34 = q63.a(new hj1(q63VarA13, 0));
                                            ArrayList arrayList32 = new ArrayList(1);
                                            List list = Collections.EMPTY_LIST;
                                            arrayList32.add(q63VarA34);
                                            q63 q63VarA35 = q63.a(new i91(bk1Var, new w63(arrayList32, list), if1Var.d, 4));
                                            ti1 ti1Var4 = new ti1(p83Var, 1);
                                            u91 u91Var = new u91(ti1Var, ti1Var4, hf1Var2.h, ti1Var3, hf1Var2.f, 4);
                                            ArrayList arrayList33 = new ArrayList(1);
                                            ArrayList arrayList34 = new ArrayList(1);
                                            arrayList34.add(hf1Var2.U);
                                            arrayList33.add(hf1Var2.V);
                                            wi1 wi1Var = new wi1(ti1Var2, ti1Var, q63VarA3, q63VarA25, hf1Var2.T, u91Var, q63VarA4, new bk1(new w63(arrayList33, arrayList34), 6), q63VarA21, q63VarA10, if1Var.n0);
                                            eo1 eo1Var3 = new eo1(q63VarA31, 4);
                                            q63 q63VarA36 = q63.a(new lh1(ti1Var, 1));
                                            xn1 xn1Var3 = new xn1(5);
                                            xn1 xn1Var4 = new xn1(6);
                                            q63 q63VarA37 = q63.a(new tz0(13, new ho1(tz0Var, 0)));
                                            ve1 ve1Var = if1Var.X;
                                            q63 q63Var4 = if1Var.c;
                                            bp1 bp1Var = new bp1(ve1Var, yj1Var, q63VarA36, tz0Var, xn1Var3, xn1Var4, q63Var4, q63VarA37);
                                            q12 q12Var = new q12();
                                            q63 q63VarA38 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 1));
                                            q63 q63VarA39 = q63.a(new mq1(ti1Var4, q12Var, tz0Var, 0));
                                            q63 q63VarA40 = q63.a(new dy0((v63) ti1Var4, (v63) q12Var, (v63) tz0Var, (v63) if1Var.j, 8));
                                            q63 q63VarA41 = q63.a(new da1(q12Var, tz0Var, 17));
                                            xe1 xe1Var2 = if1Var.g;
                                            q12.a(q12Var, q63.a(new oo1(wi1Var, q63Var4, tz0Var, eo1Var3, bp1Var, q63VarA36, hf1Var2.i, q63VarA38, q63VarA39, q63VarA40, q63VarA41, q63.a(new dy0(xe1Var2, tz0Var, bp1Var, q12Var, 7)), new xo1(xe1Var2, yj1Var, 0), if1Var.E, if1Var.h, xe1Var2, q63VarA37, q63VarA8, if1Var.M0)));
                                            ((nx1) ww1Var.c).C3(new wy1((ak1) q63VarA17.c(), (ym1) q63VarA23.c(), (kk1) q63VarA20.c(), (ok1) q63VarA12.c(), (xk1) q63VarA25.c(), (zl1) hf1Var2.P.c(), (gl1) q63VarA27.c(), (gn1) q63VarA28.c(), (wl1) q63VarA32.c(), (ik1) q63VarA35.c()));
                                            ((nk1) q63VarA3.c()).I1(new og1(0, s52Var), this.c);
                                            return (no1) q12Var.c();
                                        }
                                    }
                                    throw new ky1("No corresponding native ad listener", 1);
                                }
                            } catch (RemoteException e10) {
                                e = e10;
                                s52Var = s52Var2;
                            }
                        }
                        if (ro1VarM != null) {
                            if (((i52) e52Var.a.g).h.contains(Integer.toString(ro1VarM.q()))) {
                                hf1 hf1Var3 = (hf1) this.d;
                                p83 p83Var2 = new p83(e52Var, x42Var, ww1Var.a);
                                kc2 kc2Var2 = new kc2(23, ro1VarM);
                                r52 r52Var2 = new r52(t41Var, s41Var, v41Var);
                                if1 if1Var2 = hf1Var3.b;
                                hf1 hf1Var4 = hf1Var3.c;
                                ti1 ti1Var5 = new ti1(p83Var2, 0);
                                q63 q63Var5 = hf1Var4.g;
                                tt0 tt0Var2 = if1Var2.F0;
                                q63 q63VarA42 = q63.a(new vg1(q63Var5, ti1Var5, 1));
                                q63 q63VarA43 = q63.a(new hj1(q63VarA42, 7));
                                int i2 = w63.c;
                                ArrayList arrayList35 = new ArrayList(1);
                                ArrayList arrayList36 = new ArrayList(2);
                                arrayList36.add(hf1Var4.o);
                                arrayList36.add(hf1Var4.p);
                                arrayList35.add(q63VarA43);
                                q63 q63VarA44 = q63.a(new bk1(new w63(arrayList35, arrayList36), 3));
                                q63 q63VarA45 = q63.a(v51.j);
                                q63 q63Var6 = if1Var2.c;
                                q63 q63VarA46 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 4));
                                ti1 ti1Var6 = new ti1(p83Var2, 3);
                                ti1 ti1Var7 = new ti1(p83Var2, 2);
                                xe1 xe1Var3 = if1Var2.g;
                                q63 q63VarA47 = q63.a(new yn1(if1Var2.I, if1Var2.H, ti1Var5, ti1Var7, q63.a(new tg1(xe1Var3, if1Var2.X, q63.a(new eg1(xe1Var3, 20)), q63.a(ar.j), if1Var2.D0, if1Var2.d)), hf1Var4.e));
                                xn1 xn1Var5 = new xn1(4);
                                xn1 xn1Var6 = new xn1(2);
                                q63 q63VarA48 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 9));
                                q63 q63VarA49 = q63.a(hn.p);
                                eo1 eo1Var4 = new eo1(q63VarA49, 2);
                                ArrayList arrayList37 = new ArrayList(2);
                                ArrayList arrayList38 = new ArrayList(1);
                                arrayList38.add(hf1Var4.u);
                                arrayList37.add(q63VarA48);
                                arrayList37.add(eo1Var4);
                                q63 q63VarA50 = q63.a(new i91(new w63(arrayList37, arrayList38), ti1Var5, ti1Var6, 5));
                                q63 q63VarA110 = q63.a(new tz0(9, ti1Var6));
                                q63 q63VarA111 = q63.a(new ah1(if1Var2.g, if1Var2.c, if1Var2.d, ti1Var6, ti1Var5, hf1Var4.k, q63VarA47, xn1Var5, xn1Var6, if1Var2.E, hf1Var4.l, hf1Var4.e, hf1Var4.t, q63VarA50, q63VarA110));
                                bf1 bf1Var10 = new bf1(q63VarA111, 24);
                                hj1 hj1Var3 = new hj1(q63.a(new vg1(ti1Var5, if1Var2.V, 0)), 11);
                                ArrayList arrayList39 = new ArrayList(4);
                                ArrayList arrayList110 = new ArrayList(2);
                                arrayList39.add(hf1Var4.q);
                                arrayList110.add(hf1Var4.r);
                                arrayList110.add(hf1Var4.s);
                                arrayList39.add(q63VarA46);
                                arrayList39.add(bf1Var10);
                                arrayList39.add(hj1Var3);
                                q63 q63VarA112 = q63.a(new bk1(new w63(arrayList39, arrayList110), 4));
                                q63 q63VarA113 = q63.a(new jj1(if1Var2.g, if1Var2.C0, if1Var2.j, ti1Var6, ti1Var5, if1Var2.G, yd.l));
                                q63 q63VarA114 = q63.a(new hj1(q63VarA113, 5));
                                q63 q63VarA115 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 3));
                                q63 q63Var7 = if1Var2.y0;
                                yj1 yj1Var2 = hf1Var4.d;
                                q63 q63VarA116 = q63.a(new hj1(q63.a(new zh1(q63Var7, yj1Var2, 1)), 3));
                                bf1 bf1Var11 = new bf1(q63VarA111, 23);
                                ArrayList arrayList111 = new ArrayList(5);
                                ArrayList arrayList112 = new ArrayList(3);
                                arrayList111.add(hf1Var4.v);
                                arrayList111.add(hf1Var4.w);
                                arrayList112.add(hf1Var4.x);
                                arrayList112.add(hf1Var4.y);
                                arrayList111.add(q63VarA114);
                                arrayList111.add(q63VarA115);
                                arrayList112.add(q63VarA116);
                                arrayList111.add(bf1Var11);
                                q63 q63VarA117 = q63.a(new bk1(new w63(arrayList111, arrayList112), 0));
                                q63 q63VarA118 = q63.a(new hj1(q63VarA113, 6));
                                q63 q63VarA119 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 6));
                                bf1 bf1Var12 = new bf1(q63VarA50, 12);
                                bf1 bf1Var13 = new bf1(q63VarA111, 26);
                                ArrayList arrayList113 = new ArrayList(6);
                                ArrayList arrayList114 = new ArrayList(2);
                                arrayList113.add(hf1Var4.z);
                                arrayList113.add(hf1Var4.A);
                                arrayList114.add(hf1Var4.B);
                                arrayList114.add(hf1Var4.C);
                                arrayList113.add(q63VarA118);
                                arrayList113.add(q63VarA119);
                                arrayList113.add(bf1Var12);
                                arrayList113.add(bf1Var13);
                                q63 q63VarA210 = q63.a(new bk1(new w63(arrayList113, arrayList114), 2));
                                bf1 bf1Var14 = new bf1(q63VarA111, 29);
                                ArrayList arrayList115 = new ArrayList(1);
                                ArrayList arrayList116 = new ArrayList(1);
                                arrayList116.add(hf1Var4.D);
                                arrayList115.add(bf1Var14);
                                q63 q63VarA211 = q63.a(new bk1(new w63(arrayList115, arrayList116), 19));
                                bf1 bf1Var15 = new bf1(q63.a(new vg1(ti1Var5, if1Var2.I, 2)), 22);
                                ArrayList arrayList117 = new ArrayList(1);
                                new ArrayList(1).add(hf1Var4.E);
                                arrayList117.add(bf1Var15);
                                q63 q63VarA212 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 10));
                                ArrayList arrayList118 = new ArrayList(1);
                                ArrayList arrayList119 = new ArrayList(1);
                                arrayList119.add(hf1Var4.F);
                                arrayList118.add(q63VarA212);
                                q63 q63VarA213 = q63.a(new bk1(new w63(arrayList118, arrayList119), 20));
                                q63 q63VarA214 = q63.a(new hj1(q63VarA42, 8));
                                bf1 bf1Var16 = new bf1(q63VarA111, 27);
                                ArrayList arrayList210 = new ArrayList(7);
                                ArrayList arrayList211 = new ArrayList(4);
                                arrayList210.add(hf1Var4.G);
                                arrayList211.add(hf1Var4.H);
                                arrayList210.add(hf1Var4.I);
                                arrayList210.add(hf1Var4.J);
                                arrayList211.add(hf1Var4.K);
                                arrayList211.add(hf1Var4.L);
                                arrayList211.add(hf1Var4.M);
                                arrayList210.add(hf1Var4.N);
                                arrayList210.add(hf1Var4.O);
                                arrayList210.add(q63VarA214);
                                arrayList210.add(bf1Var16);
                                q63 q63VarA215 = q63.a(new bk1(new w63(arrayList210, arrayList211), 5));
                                hj1 hj1Var4 = new hj1(q63.a(new bf1(q63VarA112, 11)), 1);
                                q63 q63VarA216 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 8));
                                ArrayList arrayList212 = new ArrayList(2);
                                ArrayList arrayList213 = new ArrayList(1);
                                arrayList213.add(hf1Var4.Q);
                                arrayList212.add(hj1Var4);
                                arrayList212.add(q63VarA216);
                                q63 q63VarA217 = q63.a(new bk1(new w63(arrayList212, arrayList213), 9));
                                tz0 tz0Var2 = new tz0(14, kc2Var2);
                                da1 da1Var2 = new da1(new ho1(tz0Var2, 1), q63Var6, 15);
                                ArrayList arrayList214 = new ArrayList(1);
                                ArrayList arrayList215 = new ArrayList(1);
                                arrayList215.add(hf1Var4.R);
                                arrayList214.add(da1Var2);
                                q63 q63VarA218 = q63.a(new bk1(new w63(arrayList214, arrayList215), 24));
                                q63 q63VarA219 = q63.a(new hj1(q63VarA113, 4));
                                qp1 qp1Var4 = new qp1(r52Var2, 0);
                                qp1 qp1Var5 = new qp1(r52Var2, 1);
                                qp1 qp1Var6 = new qp1(r52Var2, 2);
                                q63 q63VarA310 = q63.a(new hj1(q63VarA113, 2));
                                bf1 bf1Var17 = new bf1(q63VarA111, 28);
                                ArrayList arrayList216 = new ArrayList(2);
                                ArrayList arrayList217 = new ArrayList(1);
                                arrayList217.add(hf1Var4.Y);
                                arrayList216.add(q63VarA310);
                                arrayList216.add(bf1Var17);
                                q63 q63VarA311 = q63.a(new wi1(qp1Var4, qp1Var5, qp1Var6, q63VarA210, q63.a(new bk1(new w63(arrayList216, arrayList217), 10)), q63VarA117, q63VarA213, hf1Var4.g, ti1Var5, if1Var2.h, yj1Var2));
                                eo1 eo1Var5 = new eo1(q63VarA311, 5);
                                ArrayList arrayList218 = new ArrayList(1);
                                ArrayList arrayList219 = new ArrayList(1);
                                arrayList218.add(q63VarA219);
                                arrayList219.add(eo1Var5);
                                q63 q63VarA312 = q63.a(new bk1(new w63(arrayList218, arrayList219), 13));
                                q63 q63VarA313 = q63.a(new eh1(q63VarA45, (v63) q63Var6, 5));
                                bf1 bf1Var18 = new bf1(q63VarA111, 25);
                                ArrayList arrayList310 = new ArrayList(2);
                                ArrayList arrayList311 = new ArrayList(1);
                                arrayList311.add(hf1Var4.S);
                                arrayList310.add(q63VarA313);
                                arrayList310.add(bf1Var18);
                                bk1 bk1Var2 = new bk1(new w63(arrayList310, arrayList311), 1);
                                q63 q63VarA314 = q63.a(new hj1(q63VarA113, 0));
                                ArrayList arrayList312 = new ArrayList(1);
                                List list2 = Collections.EMPTY_LIST;
                                arrayList312.add(q63VarA314);
                                q63 q63VarA315 = q63.a(new i91(bk1Var2, new w63(arrayList312, list2), if1Var2.d, 4));
                                ti1 ti1Var8 = new ti1(p83Var2, 1);
                                u91 u91Var2 = new u91(ti1Var5, ti1Var8, hf1Var4.h, ti1Var7, hf1Var4.f, 4);
                                ArrayList arrayList313 = new ArrayList(1);
                                ArrayList arrayList314 = new ArrayList(1);
                                arrayList314.add(hf1Var4.U);
                                arrayList313.add(hf1Var4.V);
                                wi1 wi1Var2 = new wi1(ti1Var6, ti1Var5, q63VarA44, q63VarA215, hf1Var4.T, u91Var2, q63VarA45, new bk1(new w63(arrayList313, arrayList314), 6), q63VarA211, q63VarA110, if1Var2.n0);
                                eo1 eo1Var6 = new eo1(q63VarA311, 4);
                                q63 q63VarA316 = q63.a(new lh1(ti1Var5, 1));
                                xn1 xn1Var7 = new xn1(5);
                                xn1 xn1Var8 = new xn1(6);
                                q63 q63VarA317 = q63.a(new tz0(13, new ho1(tz0Var2, 0)));
                                ve1 ve1Var2 = if1Var2.X;
                                q63 q63Var8 = if1Var2.c;
                                bp1 bp1Var2 = new bp1(ve1Var2, yj1Var2, q63VarA316, tz0Var2, xn1Var7, xn1Var8, q63Var8, q63VarA317);
                                q12 q12Var2 = new q12();
                                q63 q63VarA318 = q63.a(new mq1(ti1Var8, q12Var2, tz0Var2, 1));
                                q63 q63VarA319 = q63.a(new mq1(ti1Var8, q12Var2, tz0Var2, 0));
                                q63 q63VarA410 = q63.a(new dy0((v63) ti1Var8, (v63) q12Var2, (v63) tz0Var2, (v63) if1Var2.j, 8));
                                q63 q63VarA411 = q63.a(new da1(q12Var2, tz0Var2, 17));
                                xe1 xe1Var4 = if1Var2.g;
                                q12.a(q12Var2, q63.a(new oo1(wi1Var2, q63Var8, tz0Var2, eo1Var6, bp1Var2, q63VarA316, hf1Var4.i, q63VarA318, q63VarA319, q63VarA410, q63VarA411, q63.a(new dy0(xe1Var4, tz0Var2, bp1Var2, q12Var2, 7)), new xo1(xe1Var4, yj1Var2, 0), if1Var2.E, if1Var2.h, xe1Var4, q63VarA317, q63VarA49, if1Var2.M0)));
                                ((nx1) ww1Var.c).C3(new wy1((ak1) q63VarA117.c(), (ym1) q63VarA213.c(), (kk1) q63VarA210.c(), (ok1) q63VarA112.c(), (xk1) q63VarA215.c(), (zl1) hf1Var4.P.c(), (gl1) q63VarA217.c(), (gn1) q63VarA218.c(), (wl1) q63VarA312.c(), (ik1) q63VarA315.c()));
                                ((nk1) q63VarA44.c()).I1(new og1(0, s52Var), this.c);
                                return (no1) q12Var2.c();
                            }
                        }
                        throw new ky1("No corresponding native ad listener", 1);
                    }
                    ro1VarM = ro1.l(v41VarE);
                    s52Var = s52Var2;
                    s41Var = s41VarV;
                    t41Var = t41VarE0;
                    v41Var = v41VarE;
                    if (ro1VarM != null) {
                        if (((i52) e52Var.a.g).h.contains(Integer.toString(ro1VarM.q()))) {
                            hf1 hf1Var5 = (hf1) this.d;
                            p83 p83Var3 = new p83(e52Var, x42Var, ww1Var.a);
                            kc2 kc2Var3 = new kc2(23, ro1VarM);
                            r52 r52Var3 = new r52(t41Var, s41Var, v41Var);
                            if1 if1Var3 = hf1Var5.b;
                            hf1 hf1Var6 = hf1Var5.c;
                            ti1 ti1Var9 = new ti1(p83Var3, 0);
                            q63 q63Var9 = hf1Var6.g;
                            tt0 tt0Var3 = if1Var3.F0;
                            q63 q63VarA412 = q63.a(new vg1(q63Var9, ti1Var9, 1));
                            q63 q63VarA413 = q63.a(new hj1(q63VarA412, 7));
                            int i3 = w63.c;
                            ArrayList arrayList315 = new ArrayList(1);
                            ArrayList arrayList316 = new ArrayList(2);
                            arrayList316.add(hf1Var6.o);
                            arrayList316.add(hf1Var6.p);
                            arrayList315.add(q63VarA413);
                            q63 q63VarA414 = q63.a(new bk1(new w63(arrayList315, arrayList316), 3));
                            q63 q63VarA415 = q63.a(v51.j);
                            q63 q63Var10 = if1Var3.c;
                            q63 q63VarA416 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 4));
                            ti1 ti1Var10 = new ti1(p83Var3, 3);
                            ti1 ti1Var11 = new ti1(p83Var3, 2);
                            xe1 xe1Var5 = if1Var3.g;
                            q63 q63VarA417 = q63.a(new yn1(if1Var3.I, if1Var3.H, ti1Var9, ti1Var11, q63.a(new tg1(xe1Var5, if1Var3.X, q63.a(new eg1(xe1Var5, 20)), q63.a(ar.j), if1Var3.D0, if1Var3.d)), hf1Var6.e));
                            xn1 xn1Var9 = new xn1(4);
                            xn1 xn1Var10 = new xn1(2);
                            q63 q63VarA418 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 9));
                            q63 q63VarA419 = q63.a(hn.p);
                            eo1 eo1Var7 = new eo1(q63VarA419, 2);
                            ArrayList arrayList317 = new ArrayList(2);
                            ArrayList arrayList318 = new ArrayList(1);
                            arrayList318.add(hf1Var6.u);
                            arrayList317.add(q63VarA418);
                            arrayList317.add(eo1Var7);
                            q63 q63VarA51 = q63.a(new i91(new w63(arrayList317, arrayList318), ti1Var9, ti1Var10, 5));
                            q63 q63VarA1110 = q63.a(new tz0(9, ti1Var10));
                            q63 q63VarA1111 = q63.a(new ah1(if1Var3.g, if1Var3.c, if1Var3.d, ti1Var10, ti1Var9, hf1Var6.k, q63VarA417, xn1Var9, xn1Var10, if1Var3.E, hf1Var6.l, hf1Var6.e, hf1Var6.t, q63VarA51, q63VarA1110));
                            bf1 bf1Var19 = new bf1(q63VarA1111, 24);
                            hj1 hj1Var5 = new hj1(q63.a(new vg1(ti1Var9, if1Var3.V, 0)), 11);
                            ArrayList arrayList319 = new ArrayList(4);
                            ArrayList arrayList1110 = new ArrayList(2);
                            arrayList319.add(hf1Var6.q);
                            arrayList1110.add(hf1Var6.r);
                            arrayList1110.add(hf1Var6.s);
                            arrayList319.add(q63VarA416);
                            arrayList319.add(bf1Var19);
                            arrayList319.add(hj1Var5);
                            q63 q63VarA1112 = q63.a(new bk1(new w63(arrayList319, arrayList1110), 4));
                            q63 q63VarA1113 = q63.a(new jj1(if1Var3.g, if1Var3.C0, if1Var3.j, ti1Var10, ti1Var9, if1Var3.G, yd.l));
                            q63 q63VarA1114 = q63.a(new hj1(q63VarA1113, 5));
                            q63 q63VarA1115 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 3));
                            q63 q63Var11 = if1Var3.y0;
                            yj1 yj1Var3 = hf1Var6.d;
                            q63 q63VarA1116 = q63.a(new hj1(q63.a(new zh1(q63Var11, yj1Var3, 1)), 3));
                            bf1 bf1Var110 = new bf1(q63VarA1111, 23);
                            ArrayList arrayList1111 = new ArrayList(5);
                            ArrayList arrayList1112 = new ArrayList(3);
                            arrayList1111.add(hf1Var6.v);
                            arrayList1111.add(hf1Var6.w);
                            arrayList1112.add(hf1Var6.x);
                            arrayList1112.add(hf1Var6.y);
                            arrayList1111.add(q63VarA1114);
                            arrayList1111.add(q63VarA1115);
                            arrayList1112.add(q63VarA1116);
                            arrayList1111.add(bf1Var110);
                            q63 q63VarA1117 = q63.a(new bk1(new w63(arrayList1111, arrayList1112), 0));
                            q63 q63VarA1118 = q63.a(new hj1(q63VarA1113, 6));
                            q63 q63VarA1119 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 6));
                            bf1 bf1Var111 = new bf1(q63VarA51, 12);
                            bf1 bf1Var112 = new bf1(q63VarA1111, 26);
                            ArrayList arrayList1113 = new ArrayList(6);
                            ArrayList arrayList1114 = new ArrayList(2);
                            arrayList1113.add(hf1Var6.z);
                            arrayList1113.add(hf1Var6.A);
                            arrayList1114.add(hf1Var6.B);
                            arrayList1114.add(hf1Var6.C);
                            arrayList1113.add(q63VarA1118);
                            arrayList1113.add(q63VarA1119);
                            arrayList1113.add(bf1Var111);
                            arrayList1113.add(bf1Var112);
                            q63 q63VarA2110 = q63.a(new bk1(new w63(arrayList1113, arrayList1114), 2));
                            bf1 bf1Var113 = new bf1(q63VarA1111, 29);
                            ArrayList arrayList1115 = new ArrayList(1);
                            ArrayList arrayList1116 = new ArrayList(1);
                            arrayList1116.add(hf1Var6.D);
                            arrayList1115.add(bf1Var113);
                            q63 q63VarA2111 = q63.a(new bk1(new w63(arrayList1115, arrayList1116), 19));
                            bf1 bf1Var114 = new bf1(q63.a(new vg1(ti1Var9, if1Var3.I, 2)), 22);
                            ArrayList arrayList1117 = new ArrayList(1);
                            new ArrayList(1).add(hf1Var6.E);
                            arrayList1117.add(bf1Var114);
                            q63 q63VarA2112 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 10));
                            ArrayList arrayList1118 = new ArrayList(1);
                            ArrayList arrayList1119 = new ArrayList(1);
                            arrayList1119.add(hf1Var6.F);
                            arrayList1118.add(q63VarA2112);
                            q63 q63VarA2113 = q63.a(new bk1(new w63(arrayList1118, arrayList1119), 20));
                            q63 q63VarA2114 = q63.a(new hj1(q63VarA412, 8));
                            bf1 bf1Var115 = new bf1(q63VarA1111, 27);
                            ArrayList arrayList2110 = new ArrayList(7);
                            ArrayList arrayList2111 = new ArrayList(4);
                            arrayList2110.add(hf1Var6.G);
                            arrayList2111.add(hf1Var6.H);
                            arrayList2110.add(hf1Var6.I);
                            arrayList2110.add(hf1Var6.J);
                            arrayList2111.add(hf1Var6.K);
                            arrayList2111.add(hf1Var6.L);
                            arrayList2111.add(hf1Var6.M);
                            arrayList2110.add(hf1Var6.N);
                            arrayList2110.add(hf1Var6.O);
                            arrayList2110.add(q63VarA2114);
                            arrayList2110.add(bf1Var115);
                            q63 q63VarA2115 = q63.a(new bk1(new w63(arrayList2110, arrayList2111), 5));
                            hj1 hj1Var6 = new hj1(q63.a(new bf1(q63VarA1112, 11)), 1);
                            q63 q63VarA2116 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 8));
                            ArrayList arrayList2112 = new ArrayList(2);
                            ArrayList arrayList2113 = new ArrayList(1);
                            arrayList2113.add(hf1Var6.Q);
                            arrayList2112.add(hj1Var6);
                            arrayList2112.add(q63VarA2116);
                            q63 q63VarA2117 = q63.a(new bk1(new w63(arrayList2112, arrayList2113), 9));
                            tz0 tz0Var3 = new tz0(14, kc2Var3);
                            da1 da1Var3 = new da1(new ho1(tz0Var3, 1), q63Var10, 15);
                            ArrayList arrayList2114 = new ArrayList(1);
                            ArrayList arrayList2115 = new ArrayList(1);
                            arrayList2115.add(hf1Var6.R);
                            arrayList2114.add(da1Var3);
                            q63 q63VarA2118 = q63.a(new bk1(new w63(arrayList2114, arrayList2115), 24));
                            q63 q63VarA2119 = q63.a(new hj1(q63VarA1113, 4));
                            qp1 qp1Var7 = new qp1(r52Var3, 0);
                            qp1 qp1Var8 = new qp1(r52Var3, 1);
                            qp1 qp1Var9 = new qp1(r52Var3, 2);
                            q63 q63VarA3110 = q63.a(new hj1(q63VarA1113, 2));
                            bf1 bf1Var116 = new bf1(q63VarA1111, 28);
                            ArrayList arrayList2116 = new ArrayList(2);
                            ArrayList arrayList2117 = new ArrayList(1);
                            arrayList2117.add(hf1Var6.Y);
                            arrayList2116.add(q63VarA3110);
                            arrayList2116.add(bf1Var116);
                            q63 q63VarA3111 = q63.a(new wi1(qp1Var7, qp1Var8, qp1Var9, q63VarA2110, q63.a(new bk1(new w63(arrayList2116, arrayList2117), 10)), q63VarA1117, q63VarA2113, hf1Var6.g, ti1Var9, if1Var3.h, yj1Var3));
                            eo1 eo1Var8 = new eo1(q63VarA3111, 5);
                            ArrayList arrayList2118 = new ArrayList(1);
                            ArrayList arrayList2119 = new ArrayList(1);
                            arrayList2118.add(q63VarA2119);
                            arrayList2119.add(eo1Var8);
                            q63 q63VarA3112 = q63.a(new bk1(new w63(arrayList2118, arrayList2119), 13));
                            q63 q63VarA3113 = q63.a(new eh1(q63VarA415, (v63) q63Var10, 5));
                            bf1 bf1Var117 = new bf1(q63VarA1111, 25);
                            ArrayList arrayList3110 = new ArrayList(2);
                            ArrayList arrayList3111 = new ArrayList(1);
                            arrayList3111.add(hf1Var6.S);
                            arrayList3110.add(q63VarA3113);
                            arrayList3110.add(bf1Var117);
                            bk1 bk1Var3 = new bk1(new w63(arrayList3110, arrayList3111), 1);
                            q63 q63VarA3114 = q63.a(new hj1(q63VarA1113, 0));
                            ArrayList arrayList3112 = new ArrayList(1);
                            List list3 = Collections.EMPTY_LIST;
                            arrayList3112.add(q63VarA3114);
                            q63 q63VarA3115 = q63.a(new i91(bk1Var3, new w63(arrayList3112, list3), if1Var3.d, 4));
                            ti1 ti1Var12 = new ti1(p83Var3, 1);
                            u91 u91Var3 = new u91(ti1Var9, ti1Var12, hf1Var6.h, ti1Var11, hf1Var6.f, 4);
                            ArrayList arrayList3113 = new ArrayList(1);
                            ArrayList arrayList3114 = new ArrayList(1);
                            arrayList3114.add(hf1Var6.U);
                            arrayList3113.add(hf1Var6.V);
                            wi1 wi1Var3 = new wi1(ti1Var10, ti1Var9, q63VarA414, q63VarA2115, hf1Var6.T, u91Var3, q63VarA415, new bk1(new w63(arrayList3113, arrayList3114), 6), q63VarA2111, q63VarA1110, if1Var3.n0);
                            eo1 eo1Var9 = new eo1(q63VarA3111, 4);
                            q63 q63VarA3116 = q63.a(new lh1(ti1Var9, 1));
                            xn1 xn1Var11 = new xn1(5);
                            xn1 xn1Var12 = new xn1(6);
                            q63 q63VarA3117 = q63.a(new tz0(13, new ho1(tz0Var3, 0)));
                            ve1 ve1Var3 = if1Var3.X;
                            q63 q63Var12 = if1Var3.c;
                            bp1 bp1Var3 = new bp1(ve1Var3, yj1Var3, q63VarA3116, tz0Var3, xn1Var11, xn1Var12, q63Var12, q63VarA3117);
                            q12 q12Var3 = new q12();
                            q63 q63VarA3118 = q63.a(new mq1(ti1Var12, q12Var3, tz0Var3, 1));
                            q63 q63VarA3119 = q63.a(new mq1(ti1Var12, q12Var3, tz0Var3, 0));
                            q63 q63VarA4110 = q63.a(new dy0((v63) ti1Var12, (v63) q12Var3, (v63) tz0Var3, (v63) if1Var3.j, 8));
                            q63 q63VarA4111 = q63.a(new da1(q12Var3, tz0Var3, 17));
                            xe1 xe1Var6 = if1Var3.g;
                            q12.a(q12Var3, q63.a(new oo1(wi1Var3, q63Var12, tz0Var3, eo1Var9, bp1Var3, q63VarA3116, hf1Var6.i, q63VarA3118, q63VarA3119, q63VarA4110, q63VarA4111, q63.a(new dy0(xe1Var6, tz0Var3, bp1Var3, q12Var3, 7)), new xo1(xe1Var6, yj1Var3, 0), if1Var3.E, if1Var3.h, xe1Var6, q63VarA3117, q63VarA419, if1Var3.M0)));
                            ((nx1) ww1Var.c).C3(new wy1((ak1) q63VarA1117.c(), (ym1) q63VarA2113.c(), (kk1) q63VarA2110.c(), (ok1) q63VarA1112.c(), (xk1) q63VarA2115.c(), (zl1) hf1Var6.P.c(), (gl1) q63VarA2117.c(), (gn1) q63VarA2118.c(), (wl1) q63VarA3112.c(), (ik1) q63VarA3115.c()));
                            ((nk1) q63VarA414.c()).I1(new og1(0, s52Var), this.c);
                            return (no1) q12Var3.c();
                        }
                    }
                    throw new ky1("No corresponding native ad listener", 1);
                } catch (Throwable th) {
                    throw new l52(th);
                }
            } catch (Throwable th2) {
                throw new l52(th2);
            }
        } catch (Throwable th3) {
            throw new l52(th3);
        }
    }

    public static final boolean d(e52 e52Var, int i) {
        return ((i52) e52Var.a.g).h.contains(Integer.toString(i));
    }

    @Override // defpackage.zw1
    public final Object a(e52 e52Var, x42 x42Var, ww1 ww1Var) throws l52 {
        View view;
        int i = this.a;
        Executor executor = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                p83 p83Var = new p83(e52Var, x42Var, ww1Var.a);
                us2 us2Var = new us2(new vg2(this, ww1Var, x42Var, 17), null, 16, false);
                yp ypVar = new yp(x42Var.a0, 1);
                nf1 nf1Var = (nf1) obj;
                if1 if1Var = nf1Var.c;
                nf1 nf1Var2 = nf1Var.d;
                lf1 lf1Var = new lf1(if1Var, nf1Var2, p83Var, us2Var, ypVar);
                ((nk1) lf1Var.O.c()).I1(new og1(0, (s52) ww1Var.b), executor);
                ((nx1) ww1Var.c).C3(new wy1((ak1) lf1Var.W.c(), (ym1) lf1Var.Y.c(), (kk1) lf1Var.S.c(), (ok1) lf1Var.V.c(), (xk1) lf1Var.Z.c(), (zl1) nf1Var2.Q.c(), (gl1) lf1Var.a0.c(), (gn1) lf1Var.b0.c(), (wl1) lf1Var.c0.c(), (ik1) lf1Var.e0.c()));
                return lf1Var.I();
            case 1:
                Object obj2 = ww1Var.b;
                if (!((Boolean) tu0.e.c.a(lx0.z8)).booleanValue() || !x42Var.g0) {
                    try {
                        view = (View) ju.Z0(((s52) obj2).a.d());
                    } catch (Throwable th) {
                        throw new l52(th);
                    }
                    break;
                } else {
                    try {
                        r41 r41VarA0 = ((s52) obj2).a.a0();
                        if (r41VarA0 == null) {
                            jn.M("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new l52(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            view = (View) ju.Z0(r41VarA0.Z0());
                            boolean zD = r41VarA0.d();
                            if (view == null) {
                                throw new l52(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (zD) {
                                try {
                                    view = (View) na1.L(kn2.g, new qn0(this, view, x42Var, 6), za1.f).get();
                                } catch (InterruptedException | ExecutionException e) {
                                    throw new l52(e);
                                }
                            }
                        } catch (RemoteException e2) {
                            throw new l52(e2);
                        }
                    } catch (Throwable th2) {
                        throw new l52(th2);
                    }
                    break;
                }
                pf1 pf1Var = (pf1) obj;
                p83 p83Var2 = new p83(e52Var, x42Var, ww1Var.a);
                s52 s52Var = (s52) obj2;
                y91 y91Var = new y91(view, (md1) null, new gv1(2, s52Var), (y42) x42Var.u.get(0));
                if1 if1Var2 = pf1Var.d;
                pf1 pf1Var2 = pf1Var.e;
                of1 of1Var = new of1(if1Var2, pf1Var2, p83Var2, y91Var);
                ((xm1) of1Var.h0.c()).R1(view);
                ((nk1) of1Var.O.c()).I1(new og1(0, s52Var), executor);
                ((nx1) ww1Var.c).C3(new wy1((ak1) of1Var.T.c(), (ym1) of1Var.Z.c(), (kk1) of1Var.W.c(), (ok1) of1Var.S.c(), of1Var.I(), (zl1) pf1Var2.S.c(), (gl1) of1Var.c0.c(), (gn1) of1Var.d0.c(), (wl1) of1Var.e0.c(), (ik1) of1Var.f0.c()));
                return of1Var.J();
            default:
                return c(e52Var, x42Var, ww1Var);
        }
    }

    @Override // defpackage.zw1
    public final void b(e52 e52Var, x42 x42Var, ww1 ww1Var) throws l52 {
        kb3 kb3VarU;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                s52 s52Var = (s52) ww1Var.b;
                i52 i52Var = (i52) e52Var.a.g;
                String string = x42Var.v.toString();
                q41 q41Var = (q41) ww1Var.c;
                try {
                    s52Var.a.U0(new ju(context), i52Var.d, string, q41Var);
                    return;
                } catch (Throwable th) {
                    throw new l52(th);
                }
            case 1:
                b52 b52Var = x42Var.s;
                JSONObject jSONObject = x42Var.v;
                boolean z = x42Var.g0;
                pk1 pk1Var = ww1Var.c;
                Object obj = ww1Var.b;
                i52 i52Var2 = (i52) e52Var.a.g;
                kb3 kb3Var = i52Var2.f;
                boolean z2 = kb3Var.s;
                int i2 = kb3Var.g;
                int i3 = kb3Var.j;
                if (z2) {
                    s2 s2Var = new s2(i3, i2);
                    s2Var.d = true;
                    s2Var.e = i2;
                    kb3VarU = new kb3(context, s2Var);
                } else {
                    if (((Boolean) tu0.e.c.a(lx0.z8)).booleanValue() && z) {
                        s2 s2Var2 = new s2(i3, i2);
                        s2Var2.f = true;
                        s2Var2.g = i2;
                        kb3VarU = new kb3(context, s2Var2);
                    } else {
                        kb3VarU = na1.u(context, x42Var.u);
                    }
                }
                kb3 kb3Var2 = kb3VarU;
                if (((Boolean) tu0.e.c.a(lx0.z8)).booleanValue() && z) {
                    s52 s52Var2 = (s52) obj;
                    try {
                        s52Var2.a.s2(new ju(context), kb3Var2, i52Var2.d, jSONObject.toString(), w40.S0(b52Var), (q41) pk1Var);
                        return;
                    } catch (Throwable th2) {
                        throw new l52(th2);
                    }
                }
                s52 s52Var3 = (s52) obj;
                try {
                    s52Var3.a.R0(new ju(context), kb3Var2, i52Var2.d, jSONObject.toString(), w40.S0(b52Var), (q41) pk1Var);
                    return;
                } catch (Throwable th3) {
                    throw new l52(th3);
                }
            default:
                s52 s52Var4 = (s52) ww1Var.b;
                i52 i52Var3 = (i52) e52Var.a.g;
                String string2 = x42Var.v.toString();
                String strS0 = w40.S0(x42Var.s);
                q41 q41Var2 = (q41) ww1Var.c;
                qz0 qz0Var = i52Var3.j;
                ArrayList arrayList = i52Var3.h;
                try {
                    s52Var4.a.l3(new ju(context), i52Var3.d, string2, strS0, q41Var2, qz0Var, arrayList);
                    return;
                } catch (Throwable th4) {
                    throw new l52(th4);
                }
        }
    }
}
