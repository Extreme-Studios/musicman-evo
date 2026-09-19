package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uk1 {
    public SharedPreferences a;
    public SharedPreferences.Editor b;
    public final Context c;
    public final Object d = new Object();

    public uk1(Context context) {
        this.c = context;
    }

    public final String a(String str) {
        String string;
        e();
        synchronized (this.d) {
            string = this.a.getString(str, null);
            this.b.remove(str).commit();
        }
        return string;
    }

    public final void b(String str, int i, int i2) {
        String str2 = Build.MODEL;
        e();
        synchronized (this.d) {
            this.b.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i2).commit();
        }
    }

    public final void c() {
        e();
        synchronized (this.d) {
            this.b.clear().commit();
        }
    }

    public final HashMap d() {
        HashMap map;
        e();
        synchronized (this.d) {
            try {
                Map<String, ?> all = this.a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public final void e() {
        synchronized (this.d) {
            try {
                if (this.a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.c.getSharedPreferences("query_info_shared_prefs", 0);
                this.a = sharedPreferences;
                this.b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
