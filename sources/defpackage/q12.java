package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class q12 implements r63 {
    public final /* synthetic */ int a;
    public v63 b;

    public /* synthetic */ q12() {
        this.a = 18;
    }

    public static void a(q12 q12Var, v63 v63Var) {
        if (q12Var.b == null) {
            q12Var.b = v63Var;
        } else {
            j7.a();
        }
    }

    @Override // defpackage.v63
    public final Object c() {
        switch (this.a) {
            case 0:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new c02(ya1Var, 5, (qt1) this.b.c());
            case 1:
                return new xz1(4, (w42) this.b.c());
            case 2:
                ya1 ya1Var2 = za1.a;
                dq.D(ya1Var2);
                return new c12(((xe1) this.b).a(), ya1Var2);
            case 3:
                ya1 ya1Var3 = za1.a;
                dq.D(ya1Var3);
                return new c02(ya1Var3, 6, (os1) this.b.c());
            case 4:
                ya1 ya1Var4 = za1.a;
                dq.D(ya1Var4);
                return new k02(ya1Var4, ((xe1) this.b).a(), 5);
            case 5:
                ya1 ya1Var5 = za1.a;
                dq.D(ya1Var5);
                ((xe1) this.b).a();
                return new c12(ya1Var5, 4);
            case 6:
                return new o32((w52) this.b.c());
            case 7:
                return new p42((w52) this.b.c());
            case 8:
                return new d72((e72) this.b.c());
            case 9:
                return new d72((e72) this.b.c());
            case 10:
                return new File(new File((File) this.b.c(), "dgd"), "pmtd");
            case 11:
                return new File(new File((File) this.b.c(), "dgd"), "pcopt");
            case 12:
                return new File(new File((File) this.b.c(), "dgd"), "pcbc");
            case 13:
                return new File(new File((File) this.b.c(), "dgd"), "pcam.jar.tmp");
            case 14:
                return new File(new File((File) this.b.c(), "dgd"), "pcam.jar");
            case 15:
                return new File(new File((File) this.b.c(), "ocs"), "pmtd");
            case 16:
                return new File(new File((File) this.b.c(), "ocs"), "pcbc");
            case 17:
                return new File(new File((File) this.b.c(), "ocs"), "pcam.jar");
            default:
                v63 v63Var = this.b;
                if (v63Var != null) {
                    return v63Var.c();
                }
                j7.a();
                return null;
        }
    }

    public /* synthetic */ q12(v63 v63Var, int i) {
        this.a = i;
        this.b = v63Var;
    }
}
