package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zt1 {
    public final Context a;
    public final d60 b;
    public final Executor c;
    public final AtomicReference d = new AtomicReference("");

    public zt1(Context context, d60 d60Var, ya1 ya1Var) {
        this.a = context;
        this.b = d60Var;
        this.c = ya1Var;
    }

    public static final String c(String str) {
        return zb3.I(new String(Base64.decode(str, 0)), new String(Base64.decode((String) tu0.e.c.a(lx0.Se), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        ix0 ix0Var = lx0.Oe;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (!((Boolean) kx0Var.a(ix0Var)).booleanValue() || ((String) kx0Var2.a(lx0.Qe)).isEmpty() || ((String) kx0Var2.a(lx0.Re)).isEmpty() || ((String) kx0Var2.a(lx0.Se)).isEmpty()) {
            return null;
        }
        String str = (String) this.d.get();
        if (!str.isEmpty()) {
            return str;
        }
        this.c.execute(new va1(24, this));
        return null;
    }

    public final String b() {
        String name;
        d60 d60Var = this.b;
        String strC = null;
        if (d60Var.i) {
            name = he1.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) tu0.e.c.a(lx0.Qe))).get(Integer.toString(d60Var.h));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) tu0.e.c.a(lx0.Pe)).booleanValue()) {
                    vc3.C.h.d("SdkIE", e);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) tu0.e.c.a(lx0.Re));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) tu0.e.c.a(lx0.Pe)).booleanValue()) {
                vc3.C.h.d("SdkIE", e2);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
