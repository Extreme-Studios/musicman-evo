package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qr1 {
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, s52 s52Var) {
        x51 x51VarG;
        if (this.a.containsKey(str)) {
            return;
        }
        x51 x51VarA3 = null;
        if (s52Var == null) {
            x51VarG = null;
        } else {
            try {
                x51VarG = s52Var.a.G();
            } catch (Throwable th) {
                try {
                    throw new l52(th);
                } catch (l52 unused) {
                }
            }
        }
        if (s52Var != null) {
            try {
                x51VarA3 = s52Var.a.a3();
            } catch (Throwable th2) {
                try {
                    throw new l52(th2);
                } catch (l52 unused2) {
                }
            }
        }
        boolean z = true;
        if (((Boolean) tu0.e.c.a(lx0.fa)).booleanValue()) {
            if (s52Var == null) {
                z = false;
            } else {
                try {
                    s52Var.a();
                } catch (l52 unused3) {
                    z = false;
                }
            }
        }
        this.a.put(str, new pr1(str, x51VarG, x51VarA3, z));
    }

    public final synchronized pr1 b(String str) {
        return (pr1) this.a.get(str);
    }
}
