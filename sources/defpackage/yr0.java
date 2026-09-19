package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr0 extends js0 {
    public final long h;

    public yr0(nr0 nr0Var, hp0 hp0Var, long j, int i) {
        super(nr0Var, "6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", hp0Var, i, 25);
        this.h = j;
    }

    @Override // defpackage.js0
    public final void a() {
        long jLongValue = ((Long) this.e.invoke(null, null)).longValue();
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            hp0Var.b();
            ((sp0) hp0Var.g).m0(jLongValue);
            long j = this.h;
            if (j != 0) {
                hp0Var.b();
                ((sp0) hp0Var.g).N0(jLongValue - j);
                hp0Var.b();
                ((sp0) hp0Var.g).Q0(j);
            }
        }
    }
}
