package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v81 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;

    public v81(Context context) {
        this.c = context;
    }

    public final void a() {
        ix0 ix0Var = lx0.ib;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            zb3 zb3Var = vc3.C.c;
            HashMap mapQ = zb3.Q((String) tu0Var.c.a(lx0.nb));
            for (String str : mapQ.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.a;
                        if (!map.containsKey(str)) {
                            boolean zEquals = Objects.equals(str, "__default__");
                            Context context = this.c;
                            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
                            a71 a71Var = new a71(this, str);
                            map.put(str, a71Var);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(a71Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            z71 z71Var = new z71(mapQ);
            synchronized (this) {
                this.b.add(z71Var);
            }
        }
    }
}
