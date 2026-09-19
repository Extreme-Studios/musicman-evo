package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a02 implements m22 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public a02(Context context, ya1 ya1Var, i52 i52Var, d60 d60Var) {
        this.a = 6;
        this.c = context;
        this.d = ya1Var;
        this.b = i52Var;
        this.e = d60Var;
    }

    @Override // defpackage.m22
    public final hp a() {
        i02 i02Var;
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                lx0.a((Context) this.c);
                return ((ya1) obj).b(new br0(8, this));
            case 1:
                return na1.M(((b12) obj).a(), new zl0(4, this), za1.g);
            case 2:
                j02 j02Var = (j02) this.e;
                ix0 ix0Var = lx0.tc;
                tu0 tu0Var = tu0.e;
                kx0 kx0Var = tu0Var.c;
                kx0 kx0Var2 = tu0Var.c;
                if (((Boolean) kx0Var.a(ix0Var)).booleanValue() && (i02Var = j02Var.b) != null) {
                    return na1.t(i02Var);
                }
                if (yd.v((String) kx0Var2.a(lx0.z1)) || (!((Boolean) kx0Var2.a(ix0Var)).booleanValue() && (j02Var.a.get() || !((dt1) this.b).b))) {
                    return na1.t(new i02(0, new Bundle()));
                }
                j02Var.a.set(true);
                return ((ya1) obj).b(new br0(10, this));
            case 3:
                return ((ya1) obj).b(new br0(16, this));
            case 4:
                return ((ya1) obj).b(new br0(20, this));
            case 5:
                return ((ya1) obj).b(new br0(22, this));
            case 6:
                return ((ya1) obj).b(new br0(24, this));
            default:
                return ((ya1) obj).b(new br0(26, this));
        }
    }

    public gn b(float f) {
        Window window;
        View decorView;
        gn gnVarF = gn.e;
        if (f == 0.0f) {
            return gnVarF;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) ((Context) this.c).getSystemService("window");
            if (windowManager != null) {
                gnVarF = gn.b(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity activityI = vc3.C.g.i();
            if (activityI != null && (window = activityI.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                WeakHashMap weakHashMap = w60.a;
                y80 y80VarA = q60.a(decorView);
                if (y80VarA != null) {
                    gnVarF = y80VarA.a.f(647);
                }
            }
        }
        return gn.a((int) Math.ceil(gnVarF.a / f), (int) Math.ceil(gnVarF.b / f), (int) Math.ceil(gnVarF.c / f), (int) Math.ceil(gnVarF.d / f));
    }

    @Override // defpackage.m22
    public final int c() {
        switch (this.a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    public /* synthetic */ a02(Object obj, i52 i52Var, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = i52Var;
        this.c = obj2;
        this.e = obj3;
    }

    public a02(ya1 ya1Var, ViewGroup viewGroup, Context context, Set set) {
        this.a = 4;
        this.d = ya1Var;
        this.b = set;
        this.e = viewGroup;
        this.c = context;
    }

    public /* synthetic */ a02(ya1 ya1Var, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = ya1Var;
        this.c = obj;
        this.b = obj2;
        this.e = obj3;
    }
}
