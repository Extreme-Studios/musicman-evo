package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class og implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public og(List list, int i, Throwable th) {
        this.f = 0;
        a23.f(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        sp0 sp0VarZ;
        ?? r2 = 0;
        switch (this.f) {
            case 0:
                ?? r0 = (ArrayList) this.h;
                int size = r0.size();
                if (this.g != 1) {
                    while (r2 < size) {
                        ((ng) r0.get(r2)).a();
                        r2++;
                    }
                } else {
                    for (int i = 0; i < size; i++) {
                        ((ng) r0.get(i)).b();
                    }
                }
                break;
            case 1:
                ((SystemForegroundService) this.h).j.cancel(this.g);
                break;
            case 2:
                ((z90) this.h).f(this.g);
                break;
            case 3:
                int i2 = this.g;
                nr0 nr0Var = (nr0) this.h;
                if (i2 > 0) {
                    try {
                        Thread.sleep(i2 * 1000);
                        break;
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = nr0Var.a;
                    sp0VarZ = w40.Z(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    sp0VarZ = null;
                }
                nr0 nr0Var2 = (nr0) this.h;
                nr0Var2.h = sp0VarZ;
                int i3 = this.g;
                if (i3 < 4) {
                    if (sp0VarZ == null || !sp0VarZ.Z() || sp0VarZ.u0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !sp0VarZ.y0() || !sp0VarZ.z0().z() || sp0VarZ.z0().A() == -2) {
                        int i4 = i3 + 1;
                        if (nr0Var2.l) {
                            Future<?> futureSubmit = nr0Var2.b.submit(new og(i4, 3, nr0Var2));
                            if (i4 == 0) {
                                nr0Var2.i = futureSubmit;
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                wx0 wx0Var = (wx0) this.h;
                int i5 = this.g;
                es1 es1Var = wx0Var.d;
                if (es1Var != null) {
                    us2 us2VarA = es1Var.a();
                    us2VarA.s("action", "cct_nav");
                    us2VarA.s("cct_navs", String.valueOf(i5));
                    us2VarA.t();
                }
                break;
            case 5:
                ((a81) this.h).b.onAudioFocusChange(this.g);
                break;
            case 6:
                kb1 kb1Var = (kb1) this.h;
                int i6 = this.g;
                pb1 pb1Var = kb1Var.v;
                if (pb1Var != null) {
                    pb1Var.onWindowVisibilityChanged(i6);
                }
                break;
            case 7:
                bc1 bc1Var = (bc1) this.h;
                int i7 = this.g;
                pb1 pb1Var2 = bc1Var.l;
                if (pb1Var2 != null) {
                    pb1Var2.onWindowVisibilityChanged(i7);
                }
                break;
            case 8:
                b83 b83Var = (b83) this.h;
                int i8 = b83Var.f[this.g].a.g;
                z93 z93Var = b83Var.A;
                z93Var.s(z93Var.y(), 1033, new v33(19));
                break;
            default:
                un1 un1Var = (un1) this.h;
                int i9 = this.g;
                un1Var.getClass();
                String str = qz1.a;
                d73 d73Var = (d73) un1Var.h;
                c73 c73Var = new c73(i9);
                ts2 ts2Var = d73Var.f.G;
                hn.M(Looper.myLooper() == ((wx1) ts2Var.h).a.getLooper());
                ts2Var.f++;
                hb1 hb1Var = new hb1(ts2Var, c73Var, 9, r2);
                wx1 wx1Var = (wx1) ts2Var.g;
                if (wx1Var.a.getLooper().getThread().isAlive()) {
                    wx1Var.d(hb1Var);
                }
                ts2Var.n(Integer.valueOf(i9));
                break;
        }
    }

    public /* synthetic */ og(b83 b83Var, int i, boolean z) {
        this.f = 8;
        this.h = b83Var;
        this.g = i;
    }

    public /* synthetic */ og(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }
}
