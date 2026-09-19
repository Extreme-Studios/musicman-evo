package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class cc1 implements oe2 {
    public final Context f;
    public final yh2 g;
    public final String h;
    public final int i;
    public final boolean j;
    public InputStream k;
    public boolean l;
    public Uri m;
    public volatile wu0 n;
    public boolean o = false;
    public boolean p = false;
    public eg2 q;

    public cc1(Context context, yh2 yh2Var, String str, int i) {
        this.f = context;
        this.g = yh2Var;
        this.h = str;
        this.i = i;
        new AtomicLong(-1L);
        this.j = ((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue();
    }

    @Override // defpackage.oe2
    public final long a(eg2 eg2Var) throws IOException {
        if (this.l) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.l = true;
        Uri uri = eg2Var.a;
        this.m = uri;
        this.q = eg2Var;
        this.n = wu0.a(uri);
        ix0 ix0Var = lx0.J4;
        tu0 tu0Var = tu0.e;
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        wu0 wu0Var = this.n;
        uu0 uu0VarR = null;
        if (!zBooleanValue) {
            if (wu0Var != null) {
                this.n.m = eg2Var.c;
                wu0 wu0Var2 = this.n;
                String str = this.h;
                wu0Var2.n = str != null ? str : "";
                this.n.o = this.i;
                uu0VarR = vc3.C.j.r(this.n);
            }
            if (uu0VarR != null && uu0VarR.a()) {
                this.o = uu0VarR.d();
                this.p = uu0VarR.c();
                if (!b()) {
                    this.k = uu0VarR.b();
                    return -1L;
                }
            }
        } else if (wu0Var != null) {
            this.n.m = eg2Var.c;
            wu0 wu0Var3 = this.n;
            String str2 = this.h;
            wu0Var3.n = str2 != null ? str2 : "";
            this.n.o = this.i;
            long jLongValue = (this.n.l ? (Long) tu0Var.c.a(lx0.L4) : (Long) tu0Var.c.a(lx0.K4)).longValue();
            vc3.C.k.getClass();
            SystemClock.elapsedRealtime();
            yu0 yu0VarD = zf0.d(this.f, this.n);
            try {
                try {
                    try {
                        av0 av0Var = (av0) yu0VarD.f.get(jLongValue, TimeUnit.MILLISECONDS);
                        av0Var.getClass();
                        this.o = av0Var.c;
                        this.p = av0Var.e;
                        if (!b()) {
                            this.k = av0Var.a;
                        }
                    } catch (InterruptedException unused) {
                        yu0VarD.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    yu0VarD.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            vc3.C.k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.n != null) {
            Map map = eg2Var.b;
            long j = eg2Var.c;
            long j2 = eg2Var.d;
            int i = eg2Var.e;
            Uri uri2 = Uri.parse(this.n.f);
            hn.O(uri2, "The uri must be set.");
            this.q = new eg2(uri2, map, j, j2, i);
        }
        return this.g.a(this.q);
    }

    public final boolean b() {
        if (!this.j) {
            return false;
        }
        ix0 ix0Var = lx0.M4;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() || this.o) {
            return ((Boolean) tu0Var.c.a(lx0.N4)).booleanValue() && !this.p;
        }
        return true;
    }

    @Override // defpackage.k73
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.l) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.k;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.g.d(bArr, i, i2);
    }

    @Override // defpackage.oe2
    public final Uri h() {
        return this.m;
    }

    @Override // defpackage.oe2
    public final void l() throws IOException {
        if (!this.l) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.l = false;
        this.m = null;
        InputStream inputStream = this.k;
        if (inputStream == null) {
            this.g.l();
        } else {
            ar.b(inputStream);
            this.k = null;
        }
    }

    @Override // defpackage.oe2
    public final void c(qp2 qp2Var) {
    }
}
