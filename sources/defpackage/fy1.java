package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class fy1 implements hn2 {
    public final /* synthetic */ long f;
    public final /* synthetic */ z42 g;
    public final /* synthetic */ x42 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ e82 j;
    public final /* synthetic */ e52 k;
    public final /* synthetic */ hy1 l;

    public fy1(hy1 hy1Var, long j, z42 z42Var, x42 x42Var, String str, e82 e82Var, e52 e52Var) {
        this.f = j;
        this.g = z42Var;
        this.h = x42Var;
        this.i = str;
        this.j = e82Var;
        this.k = e52Var;
        Objects.requireNonNull(hy1Var);
        this.l = hy1Var;
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public final void mo5e(Object obj) {
        long j;
        hy1 hy1Var = this.l;
        hy1Var.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        synchronized (hy1Var) {
            try {
                if (hy1Var.e) {
                    hy1Var.b.D(this.g, this.h, 0, null, jElapsedRealtime);
                    j = jElapsedRealtime;
                } else {
                    j = jElapsedRealtime;
                }
                if (hy1Var.g) {
                    return;
                }
                x42 x42Var = this.h;
                synchronized (hy1Var) {
                    gy1 gy1Var = (gy1) hy1Var.d.get(x42Var);
                    boolean z = false;
                    if (gy1Var != null && gy1Var.c == 8) {
                        z = true;
                    }
                    LinkedHashMap linkedHashMap = hy1Var.d;
                    if (z) {
                        ((gy1) linkedHashMap.get(x42Var)).d = j;
                    } else {
                        linkedHashMap.put(x42Var, new gy1(this.i, x42Var.f0, 0, j, null));
                    }
                    hy1Var.f.c(x42Var, j, null, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0065 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:30:0x0061, B:32:0x0065, B:34:0x0070, B:38:0x007b, B:40:0x0082, B:42:0x0094, B:43:0x00a7, B:45:0x00ab, B:47:0x00ad, B:55:0x00e3, B:56:0x00ec, B:50:0x00c8, B:52:0x00cc, B:54:0x00d6), top: B:60:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:30:0x0061, B:32:0x0065, B:34:0x0070, B:38:0x007b, B:40:0x0082, B:42:0x0094, B:43:0x00a7, B:45:0x00ab, B:47:0x00ad, B:55:0x00e3, B:56:0x00ec, B:50:0x00c8, B:52:0x00cc, B:54:0x00d6), top: B:60:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:30:0x0061, B:32:0x0065, B:34:0x0070, B:38:0x007b, B:40:0x0082, B:42:0x0094, B:43:0x00a7, B:45:0x00ab, B:47:0x00ad, B:55:0x00e3, B:56:0x00ec, B:50:0x00c8, B:52:0x00cc, B:54:0x00d6), top: B:60:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: all -> 0x0077, DONT_GENERATE, TryCatch #0 {all -> 0x0077, blocks: (B:30:0x0061, B:32:0x0065, B:34:0x0070, B:38:0x007b, B:40:0x0082, B:42:0x0094, B:43:0x00a7, B:45:0x00ab, B:47:0x00ad, B:55:0x00e3, B:56:0x00ec, B:50:0x00c8, B:52:0x00cc, B:54:0x00d6), top: B:60:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:30:0x0061, B:32:0x0065, B:34:0x0070, B:38:0x007b, B:40:0x0082, B:42:0x0094, B:43:0x00a7, B:45:0x00ab, B:47:0x00ad, B:55:0x00e3, B:56:0x00ec, B:50:0x00c8, B:52:0x00cc, B:54:0x00d6), top: B:60:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.hn2
    public final void w(Throwable th) {
        int i;
        fu1 fu1Var;
        Integer numValueOf;
        long j;
        int i2;
        fu1 fu1VarS;
        int i3;
        fu1 fu1Var2;
        hy1 hy1Var = this.l;
        hy1Var.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zx1) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof l52) {
            i = 5;
        } else {
            if (th instanceof au1) {
                i = a23.s(th).f == 3 ? 1 : 6;
                if (((Boolean) tu0.e.c.a(lx0.K1)).booleanValue() && (th instanceof xw1) && (fu1Var = ((xw1) th).g) != null) {
                    numValueOf = Integer.valueOf(fu1Var.f);
                }
                synchronized (hy1Var) {
                    try {
                        if (hy1Var.e) {
                            i2 = i;
                            hy1Var.b.D(this.g, this.h, i2, th instanceof xw1 ? (xw1) th : null, jElapsedRealtime);
                            j = jElapsedRealtime;
                        } else {
                            j = jElapsedRealtime;
                            i2 = i;
                        }
                        if (((Boolean) tu0.e.c.a(lx0.Y8)).booleanValue()) {
                            f82 f82Var = hy1Var.c;
                            e82 e82Var = this.j;
                            e52 e52Var = this.k;
                            x42 x42Var = this.h;
                            f82Var.a(e82Var.a(e52Var, x42Var, x42Var.n), x42Var.x0);
                        }
                        if (hy1Var.g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = hy1Var.d;
                        x42 x42Var2 = this.h;
                        linkedHashMap.put(x42Var2, new gy1(this.i, x42Var2.f0, i2, j, numValueOf));
                        fu1VarS = a23.s(th);
                        i3 = fu1VarS.f;
                        if ((i3 != 3 || i3 == 0) && (fu1Var2 = fu1VarS.i) != null && !fu1Var2.h.equals("com.google.android.gms.ads")) {
                        }
                        hy1Var.f.c(x42Var2, j, fu1VarS, false);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            i = 6;
        }
        numValueOf = null;
        synchronized (hy1Var) {
            if (hy1Var.e) {
                i2 = i;
                hy1Var.b.D(this.g, this.h, i2, th instanceof xw1 ? (xw1) th : null, jElapsedRealtime);
                j = jElapsedRealtime;
            } else {
                j = jElapsedRealtime;
                i2 = i;
            }
            if (((Boolean) tu0.e.c.a(lx0.Y8)).booleanValue()) {
                f82 f82Var2 = hy1Var.c;
                e82 e82Var2 = this.j;
                e52 e52Var2 = this.k;
                x42 x42Var3 = this.h;
                f82Var2.a(e82Var2.a(e52Var2, x42Var3, x42Var3.n), x42Var3.x0);
            }
            if (hy1Var.g) {
                return;
            }
            LinkedHashMap linkedHashMap2 = hy1Var.d;
            x42 x42Var4 = this.h;
            linkedHashMap2.put(x42Var4, new gy1(this.i, x42Var4.f0, i2, j, numValueOf));
            fu1VarS = a23.s(th);
            i3 = fu1VarS.f;
            fu1VarS = i3 != 3 ? a23.s(new xw1(13, fu1VarS.i)) : a23.s(new xw1(13, fu1VarS.i));
            hy1Var.f.c(x42Var4, j, fu1VarS, false);
        }
    }
}
