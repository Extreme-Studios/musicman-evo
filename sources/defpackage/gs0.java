package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gs0 extends js0 {
    public final boolean h;

    public gs0(nr0 nr0Var, hp0 hp0Var, int i) {
        super(nr0Var, "i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", hp0Var, i, 61);
        this.h = nr0Var.o.a;
    }

    @Override // defpackage.js0
    public final void a() {
        long jLongValue = ((Long) this.e.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            hp0Var.b();
            ((sp0) hp0Var.g).a0(jLongValue);
        }
    }
}
