package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class rf2 {
    public final Context a;
    public final dh2 b;
    public final re2 c;
    public final String d;

    public rf2(Context context, dh2 dh2Var, re2 re2Var, vc2 vc2Var) {
        this.a = context;
        this.b = dh2Var;
        this.c = re2Var;
        this.d = vc2Var.D();
    }

    public final String a(long j) {
        String string;
        boolean z;
        ch2 ch2VarA = this.b.a(55);
        try {
            try {
                ch2VarA.a();
                zp0 zp0VarZ = aq0.z();
                String str = this.d;
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).B(str);
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).A("0.808261137");
                Context context = this.a;
                String packageName = context.getPackageName();
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).D(packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).C(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
                zp0VarZ.b();
                ((aq0) zp0VarZ.g).F(jCurrentTimeMillis2);
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    zp0VarZ.b();
                    ((aq0) zp0VarZ.g).E(j2);
                } catch (PackageManager.NameNotFoundException unused) {
                    zp0VarZ.b();
                    ((aq0) zp0VarZ.g).E(-1L);
                }
                re2 re2Var = this.c;
                synchronized (re2Var) {
                    z = re2Var.d;
                }
                if (!z) {
                    re2Var.a();
                }
                dq0 dq0VarD = re2Var.d(null, ((aq0) zp0VarZ.c()).b());
                dq0VarD.b();
                ((eq0) dq0VarD.g).C(5);
                dq0VarD.b();
                ((eq0) dq0VarD.g).D(2);
                byte[] bArrB = ((eq0) dq0VarD.c()).b();
                gl2 gl2Var = il2.e;
                if (gl2Var.b != null) {
                    gl2Var = new gl2(gl2Var.a, (Character) null);
                }
                string = gl2Var.g(bArrB.length, bArrB);
            } catch (Throwable th) {
                ch2VarA.c();
                throw th;
            }
        } catch (UnsupportedEncodingException e) {
            ch2VarA.b(e);
            string = Integer.toString(7);
        } catch (Throwable th2) {
            ch2VarA.b(th2);
            throw th2;
        }
        ch2VarA.c();
        return string;
    }
}
