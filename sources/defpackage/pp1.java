package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements uo1, xl1 {
    public final v41 f;
    public final kk1 g;
    public final kl1 h;
    public final ak1 i;
    public final ym1 j;
    public final Context k;
    public final x42 l;
    public final d60 m;
    public final i52 n;
    public boolean o = false;
    public boolean p = false;
    public boolean q = true;
    public final s41 r;
    public final t41 s;

    public pp1(s41 s41Var, t41 t41Var, v41 v41Var, kk1 kk1Var, kl1 kl1Var, ak1 ak1Var, ym1 ym1Var, Context context, x42 x42Var, d60 d60Var, i52 i52Var) {
        this.r = s41Var;
        this.s = t41Var;
        this.f = v41Var;
        this.g = kk1Var;
        this.h = kl1Var;
        this.i = ak1Var;
        this.j = ym1Var;
        this.k = context;
        this.l = x42Var;
        this.m = d60Var;
        this.n = i52Var;
    }

    public static final HashMap y(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // defpackage.uo1
    public final void K() {
        try {
            v41 v41Var = this.f;
            if (v41Var != null) {
                v41Var.E();
            }
        } catch (RemoteException e) {
            jn.V("Failed to call destroy", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[Catch: JSONException -> 0x0051, RemoteException -> 0x0153, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0051, blocks: (B:44:0x00b8, B:46:0x00d1), top: B:65:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00cf A[SYNTHETIC] */
    @Override // defpackage.uo1
    public final void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ArrayList arrayList;
        ClassLoader classLoader;
        int size;
        int i;
        Object obj2;
        rm rmVarN;
        try {
            ju juVar = new ju(view);
            JSONObject jSONObject = this.l.j0;
            boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.F1)).booleanValue();
            t41 t41Var = this.s;
            s41 s41Var = this.r;
            v41 v41Var = this.f;
            boolean z = true;
            if (zBooleanValue && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) tu0.e.c.a(lx0.G1)).booleanValue() && next.equals("3010")) {
                                Object objZ0 = null;
                                if (v41Var != null) {
                                    try {
                                        rmVarN = v41Var.n();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else if (s41Var != null) {
                                    rmVarN = s41Var.Z0();
                                } else {
                                    rmVarN = t41Var != null ? t41Var.v() : null;
                                }
                                if (rmVarN != null) {
                                    objZ0 = ju.Z0(rmVarN);
                                }
                                if (objZ0 != null) {
                                    cls = objZ0.getClass();
                                    arrayList = new ArrayList();
                                    w40.X(jSONArrayOptJSONArray, arrayList);
                                    zb3 zb3Var = vc3.C.c;
                                    classLoader = this.k.getClassLoader();
                                    size = arrayList.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            obj2 = arrayList.get(i);
                                            i++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    arrayList = new ArrayList();
                                    w40.X(jSONArrayOptJSONArray, arrayList);
                                    zb3 zb3Var2 = vc3.C.c;
                                    classLoader = this.k.getClassLoader();
                                    size = arrayList.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            obj2 = arrayList.get(i);
                                            i++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.q = z;
            HashMap mapY = y(map);
            HashMap mapY2 = y(map2);
            if (v41Var != null) {
                v41Var.o1(juVar, new ju(mapY), new ju(mapY2));
                return;
            }
            if (s41Var != null) {
                ju juVar2 = new ju(mapY);
                ju juVar3 = new ju(mapY2);
                Parcel parcelU = s41Var.U();
                kt0.e(parcelU, juVar);
                kt0.e(parcelU, juVar2);
                kt0.e(parcelU, juVar3);
                s41Var.K0(parcelU, 22);
                Parcel parcelU2 = s41Var.U();
                kt0.e(parcelU2, juVar);
                s41Var.K0(parcelU2, 12);
                return;
            }
            if (t41Var != null) {
                ju juVar4 = new ju(mapY);
                ju juVar5 = new ju(mapY2);
                Parcel parcelU3 = t41Var.U();
                kt0.e(parcelU3, juVar);
                kt0.e(parcelU3, juVar4);
                kt0.e(parcelU3, juVar5);
                t41Var.K0(parcelU3, 22);
                Parcel parcelU4 = t41Var.U();
                kt0.e(parcelU4, juVar);
                t41Var.K0(parcelU4, 10);
            }
        } catch (RemoteException e) {
            jn.V("Failed to call trackView", e);
        }
    }

    @Override // defpackage.uo1
    public final void b(sl1 sl1Var) {
        jn.T("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.uo1
    public final void d(View view) {
        try {
            ju juVar = new ju(view);
            v41 v41Var = this.f;
            if (v41Var != null) {
                v41Var.Y0(juVar);
                return;
            }
            s41 s41Var = this.r;
            if (s41Var != null) {
                Parcel parcelU = s41Var.U();
                kt0.e(parcelU, juVar);
                s41Var.K0(parcelU, 16);
            } else {
                t41 t41Var = this.s;
                if (t41Var != null) {
                    Parcel parcelU2 = t41Var.U();
                    kt0.e(parcelU2, juVar);
                    t41Var.K0(parcelU2, 14);
                }
            }
        } catch (RemoteException e) {
            jn.V("Failed to call untrackView", e);
        }
    }

    @Override // defpackage.uo1
    public final void e() {
        this.p = true;
    }

    @Override // defpackage.uo1
    public final boolean f() {
        return this.l.L;
    }

    @Override // defpackage.uo1
    public final JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.uo1
    public final void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.p) {
            jn.T("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.l.L) {
            z(view2);
        } else {
            jn.T("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // defpackage.uo1
    public final void l(mn1 mn1Var) {
        jn.T("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // defpackage.uo1
    public final JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // defpackage.xl1
    public final void p() {
        try {
            v41 v41Var = this.f;
            if (v41Var == null || !v41Var.M()) {
                return;
            }
            x42 x42Var = this.l;
            if (x42Var.e == 4 || x42Var.D0) {
                v41Var.s();
                this.g.a();
            }
        } catch (RemoteException e) {
            jn.V("Failed to report impression from an adapter", e);
        }
    }

    @Override // defpackage.uo1
    public final void q(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.p && this.l.L) {
            return;
        }
        z(view);
    }

    @Override // defpackage.uo1
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z = this.o;
            x42 x42Var = this.l;
            if (!z) {
                this.o = vc3.C.o.d(this.k, this.m.f, x42Var.C.toString(), this.n.g);
            }
            if (this.q) {
                v41 v41Var = this.f;
                kk1 kk1Var = this.g;
                if (v41Var != null) {
                    if (x42Var.D0) {
                        if (v41Var.M()) {
                            return;
                        }
                        v41Var.s();
                        kk1Var.a();
                        return;
                    }
                    if (v41Var.M() && x42Var.e == 4) {
                        this.h.a();
                        return;
                    } else {
                        v41Var.s();
                        kk1Var.a();
                        return;
                    }
                }
                s41 s41Var = this.r;
                if (s41Var != null) {
                    Parcel parcelY = s41Var.Y(s41Var.U(), 13);
                    ClassLoader classLoader = kt0.a;
                    boolean z2 = parcelY.readInt() != 0;
                    parcelY.recycle();
                    if (!z2) {
                        s41Var.K0(s41Var.U(), 10);
                        kk1Var.a();
                        return;
                    }
                }
                t41 t41Var = this.s;
                if (t41Var != null) {
                    Parcel parcelY2 = t41Var.Y(t41Var.U(), 11);
                    ClassLoader classLoader2 = kt0.a;
                    boolean z3 = parcelY2.readInt() != 0;
                    parcelY2.recycle();
                    if (z3) {
                        return;
                    }
                    t41Var.K0(t41Var.U(), 8);
                    kk1Var.a();
                }
            }
        } catch (RemoteException e) {
            jn.V("Failed to call recordImpression", e);
        }
    }

    @Override // defpackage.uo1
    public final boolean s() {
        return true;
    }

    @Override // defpackage.uo1
    public final boolean t(Bundle bundle) {
        return false;
    }

    @Override // defpackage.uo1
    public final int v() {
        return 0;
    }

    public final void z(View view) {
        try {
            v41 v41Var = this.f;
            ym1 ym1Var = this.j;
            ak1 ak1Var = this.i;
            if (v41Var != null && !v41Var.h0()) {
                v41Var.l0(new ju(view));
                ak1Var.B();
                if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue()) {
                    ym1Var.q0();
                    return;
                }
                return;
            }
            s41 s41Var = this.r;
            if (s41Var != null) {
                Parcel parcelY = s41Var.Y(s41Var.U(), 14);
                ClassLoader classLoader = kt0.a;
                boolean z = parcelY.readInt() != 0;
                parcelY.recycle();
                if (!z) {
                    ju juVar = new ju(view);
                    Parcel parcelU = s41Var.U();
                    kt0.e(parcelU, juVar);
                    s41Var.K0(parcelU, 11);
                    ak1Var.B();
                    if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue()) {
                        ym1Var.q0();
                        return;
                    }
                    return;
                }
            }
            t41 t41Var = this.s;
            if (t41Var != null) {
                Parcel parcelY2 = t41Var.Y(t41Var.U(), 12);
                ClassLoader classLoader2 = kt0.a;
                boolean z2 = parcelY2.readInt() != 0;
                parcelY2.recycle();
                if (z2) {
                    return;
                }
                ju juVar2 = new ju(view);
                Parcel parcelU2 = t41Var.U();
                kt0.e(parcelU2, juVar2);
                t41Var.K0(parcelU2, 9);
                ak1Var.B();
                if (((Boolean) tu0.e.c.a(lx0.Ab)).booleanValue()) {
                    ym1Var.q0();
                }
            }
        } catch (RemoteException e) {
            jn.V("Failed to call handleClick", e);
        }
    }

    @Override // defpackage.uo1
    public final void c() {
    }

    @Override // defpackage.uo1
    public final void j0() {
    }

    @Override // defpackage.xl1
    public final void w() {
    }

    @Override // defpackage.uo1
    public final void x() {
    }

    @Override // defpackage.uo1
    public final void I(String str) {
    }

    @Override // defpackage.uo1
    public final void g(View view) {
    }

    @Override // defpackage.uo1
    public final void i(y01 y01Var) {
    }

    @Override // defpackage.uo1
    public final void k(Bundle bundle) {
    }

    @Override // defpackage.uo1
    public final void n(Bundle bundle) {
    }

    @Override // defpackage.uo1
    public final void u(View view, MotionEvent motionEvent) {
    }

    @Override // defpackage.uo1
    public final void o(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
