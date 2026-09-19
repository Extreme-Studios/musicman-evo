package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ha1 extends jt0 implements ia1 {
    public static final /* synthetic */ int f = 0;

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        ju juVar;
        int i2 = 1;
        fa1 ea1Var = null;
        switch (i) {
            case 1:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                ma1 ma1Var = (ma1) kt0.b(parcel, ma1.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    ea1Var = iInterfaceQueryLocalInterface instanceof fa1 ? (fa1) iInterfaceQueryLocalInterface : new ea1(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 2);
                }
                kt0.f(parcel);
                ((ep0) this).f2(rmVarO0, ma1Var, ea1Var);
                parcel2.writeNoException();
                return true;
            case 2:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                ep0 ep0Var = (ep0) this;
                if (((Boolean) tu0.e.c.a(lx0.b8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) ju.Z0(rmVarO1);
                    c71 c71Var = ep0Var.n;
                    View view = c71Var != null ? c71Var.f : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    ep0Var.o = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        ep0Var.p = ep0Var.o;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = ep0Var.o;
                    motionEventObtain.setLocation(point.x, point.y);
                    ep0Var.i.b.f(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                ju.O0(parcel.readStrongBinder());
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                x61 x61VarB3 = w61.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                ((ep0) this).B3(arrayListCreateTypedArrayList, rmVarO2, x61VarB3, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                x61 x61VarB4 = w61.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                ((ep0) this).C3(arrayListCreateTypedArrayList2, rmVarO3, x61VarB4, false);
                parcel2.writeNoException();
                return true;
            case 7:
                c71 c71Var2 = (c71) kt0.b(parcel, c71.CREATOR);
                kt0.f(parcel);
                ep0 ep0Var2 = (ep0) this;
                ep0Var2.n = c71Var2;
                ep0Var2.k.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                rm rmVarO4 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                ep0 ep0Var3 = (ep0) this;
                ix0 ix0Var = lx0.qa;
                kx0 kx0Var = tu0.e.c;
                if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                    ix0 ix0Var2 = lx0.S7;
                    if (!((Boolean) kx0Var.a(ix0Var2)).booleanValue()) {
                        ep0Var3.D3();
                    }
                    WebView webView = (WebView) ju.Z0(rmVarO4);
                    if (webView == null) {
                        jn.M("The webView cannot be null.");
                    } else {
                        g32 g32Var = ep0Var3.L;
                        i73 i73Var = new i73(webView, g32Var, za1.f);
                        webView.addJavascriptInterface(new h30(webView, ep0Var3.i, ep0Var3.q, ep0Var3.r, ep0Var3.j, ep0Var3.K, g32Var, i73Var), "gmaSdk");
                        if (((Boolean) kx0Var.a(lx0.Aa)).booleanValue()) {
                            vc3.C.h.l.incrementAndGet();
                        }
                        if (((Boolean) wy0.c.u()).booleanValue()) {
                            g32Var.a(webView);
                            if (((Boolean) wy0.d.u()).booleanValue()) {
                                za1.d.scheduleWithFixedDelay(new aq2(i73Var, i2), 0L, ((Integer) kx0Var.a(lx0.Ba)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) kx0Var.a(ix0Var2)).booleanValue()) {
                            ep0Var3.D3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                rm rmVarO5 = ju.O0(parcel.readStrongBinder());
                x61 x61VarB5 = w61.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                ((ep0) this).B3(arrayListCreateTypedArrayList3, rmVarO5, x61VarB5, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                rm rmVarO6 = ju.O0(parcel.readStrongBinder());
                x61 x61VarB6 = w61.B3(parcel.readStrongBinder());
                kt0.f(parcel);
                ((ep0) this).C3(arrayListCreateTypedArrayList4, rmVarO6, x61VarB6, true);
                parcel2.writeNoException();
                return true;
            case 11:
                rm rmVarO7 = ju.O0(parcel.readStrongBinder());
                rm rmVarO8 = ju.O0(parcel.readStrongBinder());
                String string = parcel.readString();
                rm rmVarO9 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                ep0 ep0Var4 = (ep0) this;
                if (((Boolean) tu0.e.c.a(lx0.Ea)).booleanValue()) {
                    Context context = (Context) ju.Z0(rmVarO7);
                    nd ndVar = (nd) ju.Z0(rmVarO8);
                    dd ddVar = (dd) ju.Z0(rmVarO9);
                    ay0 ay0Var = ep0Var4.J;
                    ay0Var.getClass();
                    if (context == null) {
                        j7.p("App Context parameter is null");
                        return false;
                    }
                    if (TextUtils.isEmpty(string)) {
                        j7.p("Origin parameter is empty or null");
                        return false;
                    }
                    if (ndVar == null) {
                        j7.p("CustomTabsClient parameter is null");
                        return false;
                    }
                    ay0Var.l = context;
                    ay0Var.h = string;
                    hs1 hs1Var = ay0Var.d;
                    yx0 yx0Var = new yx0(ay0Var, ddVar, hs1Var);
                    ay0Var.f = yx0Var;
                    u40 u40VarB = ndVar.b(yx0Var);
                    ay0Var.g = u40VarB;
                    if (u40VarB == null) {
                        jn.M("CustomTabsClient failed to create new session.");
                    }
                    jn.I(hs1Var, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) wy0.e.u()).booleanValue()) {
                        x93 x93Var = ep0Var4.K;
                        synchronized (x93Var) {
                            x93Var.c(true);
                            x93Var.c(false);
                        }
                    }
                    if (((Boolean) wy0.c.u()).booleanValue()) {
                        ep0Var4.L.a(null);
                    }
                    juVar = new ju(ay0Var.g);
                } else {
                    juVar = new ju(null);
                }
                parcel2.writeNoException();
                kt0.e(parcel2, juVar);
                return true;
            default:
                return false;
        }
    }
}
