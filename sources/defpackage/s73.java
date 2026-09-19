package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s73 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s73(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                w83 w83Var = (w83) obj;
                try {
                    synchronized (w83Var) {
                    }
                    try {
                        w83Var.a.a(w83Var.c, w83Var.d);
                        return;
                    } finally {
                        w83Var.b(true);
                    }
                } catch (q43 e) {
                    s90.b0("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 1:
                z93 z93Var = (z93) obj;
                z93Var.s(z93Var.t(), 1028, new r53(23, (byte) 0));
                z93Var.k.e();
                return;
            case 2:
                qb3 qb3Var = (qb3) obj;
                if (qb3Var.Y >= 300000) {
                    ((rb3) qb3Var.n.f).O0 = true;
                    qb3Var.Y = 0L;
                    return;
                }
                return;
            case 3:
                kc3 kc3Var = (kc3) obj;
                Object obj2 = kc3Var.a;
                synchronized (obj2) {
                    try {
                        if (kc3Var.m) {
                            return;
                        }
                        long j = kc3Var.l - 1;
                        kc3Var.l = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            kc3Var.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (obj2) {
                            kc3Var.n = illegalStateException;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                ((ob0) obj).h.a();
                return;
        }
    }
}
