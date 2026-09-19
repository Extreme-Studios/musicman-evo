package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gd2 {
    public final ExecutorService a;
    public final String b;
    public final long c;

    public gd2(ExecutorService executorService, String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }

    public final s8 a(String str, boolean z, byte[] bArr, String str2) {
        q8 q8Var = new q8();
        q8Var.c = new ix();
        s8 s8Var = new s8(q8Var);
        q8Var.b = s8Var;
        q8Var.a = dq.class;
        try {
            this.a.execute(new ed2(this, str, q8Var, z, str2, bArr));
            q8Var.a = "";
            return s8Var;
        } catch (Exception e) {
            s8Var.g.i(e);
            return s8Var;
        }
    }
}
