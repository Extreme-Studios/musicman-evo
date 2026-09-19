package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b12 implements m22 {
    public final AtomicReference a = new AtomicReference();
    public final AtomicReference b = new AtomicReference(Boolean.FALSE);
    public final ae c;
    public final Executor d;
    public final m22 e;
    public final long f;
    public final es1 g;

    public b12(m22 m22Var, long j, ae aeVar, ya1 ya1Var, es1 es1Var) {
        this.c = aeVar;
        this.e = m22Var;
        this.f = j;
        this.d = ya1Var;
        this.g = es1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0106  */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    @Override // defpackage.m22
    public final hp a() {
        z02 z02Var;
        ix0 ix0Var = lx0.Bc;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            if (((Boolean) tu0Var.c.a(lx0.Ac)).booleanValue() && !((Boolean) this.b.getAndSet(Boolean.TRUE)).booleanValue()) {
                xa1 xa1Var = za1.d;
                a12 a12Var = new a12(this, 1);
                long j = this.f;
                xa1Var.scheduleWithFixedDelay(a12Var, j, j, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.a;
                    z02 z02Var2 = (z02) atomicReference.get();
                    if (z02Var2 == null) {
                        hp hpVarA = this.e.a();
                        atomicReference.set(new z02(hpVarA, this.f, this.c));
                        return hpVarA;
                    }
                    if (((Boolean) this.b.get()).booleanValue()) {
                        z02Var = z02Var2;
                    } else {
                        ae aeVar = z02Var2.c;
                        long j2 = z02Var2.b;
                        aeVar.getClass();
                        if (j2 < SystemClock.elapsedRealtime()) {
                            hp hpVar = z02Var2.a;
                            m22 m22Var = this.e;
                            z02 z02Var3 = new z02(m22Var.a(), this.f, this.c);
                            this.a.set(z02Var3);
                            if (((Boolean) tu0Var.c.a(lx0.Cc)).booleanValue()) {
                                if (((Boolean) tu0Var.c.a(lx0.Dc)).booleanValue()) {
                                    us2 us2VarA = this.g.a();
                                    us2VarA.s("action", "scs");
                                    us2VarA.s("sid", String.valueOf(m22Var.c()));
                                    us2VarA.t();
                                }
                                return hpVar;
                            }
                            z02Var = z02Var3;
                        } else {
                            z02Var = z02Var2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.a;
            z02Var = (z02) atomicReference2.get();
            if (z02Var != null) {
                ae aeVar2 = z02Var.c;
                long j3 = z02Var.b;
                aeVar2.getClass();
                if (j3 < SystemClock.elapsedRealtime()) {
                    m22 m22Var2 = this.e;
                    z02 z02Var4 = new z02(m22Var2.a(), this.f, this.c);
                    atomicReference2.set(z02Var4);
                    z02Var = z02Var4;
                }
            } else {
                m22 m22Var3 = this.e;
                z02 z02Var5 = new z02(m22Var3.a(), this.f, this.c);
                atomicReference2.set(z02Var5);
                z02Var = z02Var5;
            }
        }
        return z02Var.a;
    }

    @Override // defpackage.m22
    public final int c() {
        return this.e.c();
    }
}
