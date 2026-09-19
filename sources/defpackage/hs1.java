package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class hs1 {
    public final HashMap a;
    public final Context b;
    public final Executor c;
    public final id3 d;
    public final boolean e;
    public final wo2 f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public final AtomicReference j;

    public hs1(ya1 ya1Var, id3 id3Var, xc xcVar, wo2 wo2Var, Context context) {
        HashMap map = new HashMap();
        this.a = map;
        this.i = new AtomicBoolean();
        this.j = new AtomicReference(new Bundle());
        this.c = ya1Var;
        this.d = id3Var;
        ix0 ix0Var = lx0.f2;
        tu0 tu0Var = tu0.e;
        this.e = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        this.f = wo2Var;
        ix0 ix0Var2 = lx0.k2;
        kx0 kx0Var = tu0Var.c;
        this.g = ((Boolean) kx0Var.a(ix0Var2)).booleanValue();
        this.h = ((Boolean) kx0Var.a(lx0.o7)).booleanValue();
        this.b = context;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        sa1 sa1Var = vc3Var.h;
        map.put("device", zb3.P());
        map.put("app", xcVar.g);
        Context context2 = xcVar.f;
        map.put("is_lite_sdk", true != zb3.f(context2) ? "0" : "1");
        ArrayList arrayListQ = tu0Var.a.Q();
        if (((Boolean) kx0Var.a(lx0.j7)).booleanValue()) {
            arrayListQ.addAll(sa1Var.g().m().i);
        }
        map.put("e", TextUtils.join(",", arrayListQ));
        map.put("sdkVersion", xcVar.h);
        if (((Boolean) kx0Var.a(lx0.ec)).booleanValue()) {
            map.put("is_bstar", true != zb3.d(context2) ? "0" : "1");
        }
        if (((Boolean) kx0Var.a(lx0.ja)).booleanValue() && ((Boolean) kx0Var.a(lx0.z2)).booleanValue()) {
            String str = sa1Var.g;
            map.put("plugin", str == null ? "" : str);
        }
    }

    public final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            jn.F("Empty paramMap.");
            return;
        }
        b(map);
        String strC = this.f.c(map);
        jn.p(strC);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!z || this.g) {
                if (!z2 || this.h) {
                    this.c.execute(new is1(this, strC, 0));
                }
            }
        }
    }

    public final void b(Map map) {
        Bundle bundleH0;
        if (map == null || map.isEmpty()) {
            jn.F("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.i.getAndSet(true);
        AtomicReference atomicReference = this.j;
        if (!andSet) {
            String str = (String) tu0.e.c.a(lx0.ob);
            a71 a71Var = new a71(str, this);
            if (TextUtils.isEmpty(str)) {
                bundleH0 = Bundle.EMPTY;
            } else {
                Context context = this.b;
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(a71Var);
                bundleH0 = w40.h0(context, str);
            }
            atomicReference.set(bundleH0);
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }
}
