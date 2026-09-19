package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class af0 implements nd0 {
    public final /* synthetic */ int a;
    public final cw1 b;
    public final ge0 c;

    public af0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new cw1(4);
                this.c = new ge0("image/heif", -1, -1);
                break;
            case 2:
                this.b = new cw1(4);
                this.c = new ge0("image/webp", -1, -1);
                break;
            default:
                this.b = new cw1(4);
                this.c = new ge0("image/avif", -1, -1);
                break;
        }
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        int i = this.a;
        cw1 cw1Var = this.b;
        switch (i) {
            case 0:
                fd0 fd0Var = (fd0) od0Var;
                fd0Var.e(4, false);
                cw1Var.y(4);
                fd0Var.B(cw1Var.a, 0, 4, false);
                if (cw1Var.P() == 1718909296) {
                    cw1Var.y(4);
                    fd0Var.B(cw1Var.a, 0, 4, false);
                    if (cw1Var.P() == 1635150182) {
                        return true;
                    }
                }
                return false;
            case 1:
                fd0 fd0Var2 = (fd0) od0Var;
                fd0Var2.e(4, false);
                cw1Var.y(4);
                fd0Var2.B(cw1Var.a, 0, 4, false);
                if (cw1Var.P() == 1718909296) {
                    cw1Var.y(4);
                    fd0Var2.B(cw1Var.a, 0, 4, false);
                    if (cw1Var.P() == 1751476579) {
                        return true;
                    }
                }
                return false;
            default:
                cw1Var.y(4);
                fd0 fd0Var3 = (fd0) od0Var;
                fd0Var3.B(cw1Var.a, 0, 4, false);
                if (cw1Var.P() == 1380533830) {
                    fd0Var3.e(4, false);
                    cw1Var.y(4);
                    fd0Var3.B(cw1Var.a, 0, 4, false);
                    if (cw1Var.P() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c.e(od0Var, rd0Var);
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.f(j, j2);
                break;
            case 1:
                this.c.f(j, j2);
                break;
            default:
                this.c.f(j, j2);
                break;
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        int i = this.a;
        ge0 ge0Var = this.c;
        switch (i) {
            case 0:
                ge0Var.g(pd0Var);
                break;
            case 1:
                ge0Var.g(pd0Var);
                break;
            default:
                ge0Var.g(pd0Var);
                break;
        }
    }
}
