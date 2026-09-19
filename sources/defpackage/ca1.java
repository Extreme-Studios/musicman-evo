package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ca1 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final z61 d;

    public ca1(Context context, z61 z61Var) {
        this.c = context;
        this.d = z61Var;
    }

    public final synchronized void a(String str) {
        try {
            HashMap map = this.a;
            if (map.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            a71 a71Var = new a71(this, str);
            map.put(str, a71Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(a71Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
