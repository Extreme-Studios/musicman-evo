package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class lc2 {
    public static final String h = new UUID(0, 0).toString();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final z61 f;
    public final kc2 g;

    public lc2(Context context, String str, String str2, String str3) {
        if (z61.k == null) {
            z61.k = new z61(context);
        }
        this.f = z61.k;
        this.g = kc2.n(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    public final je0 a(String str, String str2, long j, boolean z) throws IOException {
        String str3 = this.b;
        z61 z61Var = this.f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(h)) {
                    String string = ((SharedPreferences) z61Var.h).getString(str3, null);
                    String string2 = ((SharedPreferences) z61Var.h).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null) {
                        if (!string.equals(e(str, str2, string2))) {
                            return b(str, str2);
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new je0(6);
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            j7.e(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str4 = this.c;
        String str5 = this.d;
        long j2 = ((SharedPreferences) z61Var.h).getLong(z2 ? str5 : str4, -1L);
        if (j2 != -1) {
            if (jCurrentTimeMillis < j2) {
                z61Var.F(Long.valueOf(jCurrentTimeMillis), z2 ? str5 : str4);
            } else if (jCurrentTimeMillis >= j2 + j) {
                return b(str, str2);
            }
        }
        if (!z2) {
            str3 = this.a;
        }
        String string3 = ((SharedPreferences) z61Var.h).getString(str3, null);
        if (string3 == null && !z) {
            return b(str, str2);
        }
        if (z2) {
            str4 = str5;
        }
        return new je0(string3, ((SharedPreferences) z61Var.h).getLong(str4, -1L));
    }

    public final je0 b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f.F(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z) throws IOException {
        String str = z ? this.d : this.c;
        z61 z61Var = this.f;
        z61Var.J(str);
        z61Var.J(z ? this.b : this.a);
    }

    public final je0 d(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            j7.e(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
            return null;
        }
        String str2 = z ? this.d : this.c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        z61 z61Var = this.f;
        z61Var.F(lValueOf, str2);
        z61Var.F(str, z ? this.b : this.a);
        return new je0(str, jCurrentTimeMillis);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(ec.n(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.e;
        int length = str4.length();
        String str5 = str2 == null ? "null" : "not null";
        StringBuilder sb = new StringBuilder("not null".length() + ec.f(str5, length + 88, 13));
        ec.x(sb, str4, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str5, ", hashKey is ");
        sb.append("not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
