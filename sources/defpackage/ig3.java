package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ig3 implements fg3 {
    public int f;
    public int g;
    public int h = 0;
    public eg3[] i = new eg3[100];

    @Override // defpackage.fg3
    /* JADX INFO: renamed from: a */
    public final synchronized eg3 mo8a() {
        eg3 eg3Var;
        try {
            int i = this.g + 1;
            this.g = i;
            int i2 = this.h;
            if (i2 > 0) {
                eg3[] eg3VarArr = this.i;
                int i3 = i2 - 1;
                this.h = i3;
                eg3Var = eg3VarArr[i3];
                if (eg3Var == null) {
                    throw null;
                }
                eg3VarArr[i3] = null;
            } else {
                eg3Var = new eg3(new byte[65536]);
                eg3[] eg3VarArr2 = this.i;
                int length = eg3VarArr2.length;
                if (i > length) {
                    this.i = (eg3[]) Arrays.copyOf(eg3VarArr2, length + length);
                    return eg3Var;
                }
            }
            return eg3Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(int i) {
        int i2 = this.f;
        this.f = i;
        if (i < i2) {
            mo9l();
        }
    }

    @Override // defpackage.fg3
    public final synchronized void h(gh0 gh0Var) {
        while (gh0Var != null) {
            try {
                eg3[] eg3VarArr = this.i;
                int i = this.h;
                this.h = i + 1;
                eg3 eg3Var = (eg3) gh0Var.h;
                eg3Var.getClass();
                eg3VarArr[i] = eg3Var;
                this.g--;
                gh0Var = (gh0) gh0Var.i;
                if (gh0Var == null || ((eg3) gh0Var.h) == null) {
                    gh0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // defpackage.fg3
    /* JADX INFO: renamed from: l */
    public final synchronized void mo9l() {
        int i = this.f;
        String str = qz1.a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.g);
        int i2 = this.h;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.i, iMax, i2, (Object) null);
        this.h = iMax;
    }

    @Override // defpackage.fg3
    public final synchronized void m(eg3 eg3Var) {
        eg3[] eg3VarArr = this.i;
        int i = this.h;
        this.h = i + 1;
        eg3VarArr[i] = eg3Var;
        this.g--;
        notifyAll();
    }
}
