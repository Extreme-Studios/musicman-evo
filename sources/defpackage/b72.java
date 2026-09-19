package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b72 implements a72 {
    public final Context a;
    public final int p;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int q = 2;
    public int r = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public int j = 2;
    public String k = "";
    public String l = "";
    public String m = "";
    public boolean n = false;
    public boolean o = false;

    public b72(Context context, int i) {
        this.a = context;
        this.p = i;
    }

    @Override // defpackage.a72
    public final a72 F(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // defpackage.a72
    public final /* bridge */ /* synthetic */ a72 a() {
        n();
        return this;
    }

    @Override // defpackage.a72
    public final a72 b(boolean z) {
        synchronized (this) {
            this.d = z;
        }
        return this;
    }

    @Override // defpackage.a72
    public final synchronized boolean c() {
        return this.o;
    }

    @Override // defpackage.a72
    public final a72 d(int i) {
        synchronized (this) {
            this.q = i;
        }
        return this;
    }

    @Override // defpackage.a72
    public final a72 f(Throwable th) {
        synchronized (this) {
            if (((Boolean) tu0.e.c.a(lx0.x9)).booleanValue()) {
                String strD = f32.d(e71.e(th), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                this.l = strD;
                String strE = e71.e(th);
                bz1 bz1VarC = bz1.c(new vh2('\n'));
                strE.getClass();
                this.k = (String) ((gi2) ((hi2) bz1VarC.f).f(bz1VarC, strE)).next();
            }
        }
        return this;
    }

    @Override // defpackage.a72
    public final a72 g(fu1 fu1Var) {
        synchronized (this) {
            try {
                IBinder iBinder = fu1Var.j;
                if (iBinder != null) {
                    zj1 zj1Var = (zj1) iBinder;
                    String str = zj1Var.i;
                    if (!TextUtils.isEmpty(str)) {
                        this.f = str;
                    }
                    String str2 = zj1Var.g;
                    if (!TextUtils.isEmpty(str2)) {
                        this.g = str2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // defpackage.a72
    public final /* bridge */ /* synthetic */ a72 h() {
        o();
        return this;
    }

    @Override // defpackage.a72
    public final boolean i() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // defpackage.a72
    public final a72 k(String str) {
        synchronized (this) {
            if (((Boolean) tu0.e.c.a(lx0.x9)).booleanValue()) {
                this.m = str;
            }
        }
        return this;
    }

    @Override // defpackage.a72
    public final a72 l(y91 y91Var) {
        synchronized (this) {
            try {
                String str = ((z42) y91Var.h).b;
                if (!TextUtils.isEmpty(str)) {
                    this.f = str;
                }
                Iterator it = ((List) y91Var.g).iterator();
                while (it.hasNext()) {
                    String str2 = ((x42) it.next()).b0;
                    if (!TextUtils.isEmpty(str2)) {
                        this.g = str2;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // defpackage.a72
    public final synchronized c72 m() {
        try {
            if (this.n) {
                return null;
            }
            this.n = true;
            if (!this.o) {
                n();
            }
            if (this.c < 0) {
                o();
            }
            return new c72(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        Configuration configuration;
        vc3 vc3Var = vc3.C;
        r53 r53Var = vc3Var.f;
        Context context = this.a;
        this.e = r53Var.l(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.r = i;
        vc3Var.k.getClass();
        this.b = SystemClock.elapsedRealtime();
        this.o = true;
    }

    public final synchronized void o() {
        vc3.C.k.getClass();
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.a72
    public final a72 r0(String str) {
        synchronized (this) {
            this.h = str;
        }
        return this;
    }

    @Override // defpackage.a72
    public final a72 t(int i) {
        synchronized (this) {
            this.j = i;
        }
        return this;
    }
}
