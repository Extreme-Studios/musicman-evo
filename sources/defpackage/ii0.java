package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ii0 {
    public me0 b;
    public pd0 c;
    public gi0 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final ei0 a = new ei0();
    public z61 j = new z61(8);

    public void a(boolean z) {
        int i;
        if (z) {
            this.j = new z61(8);
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    public abstract long b(cw1 cw1Var);

    public abstract boolean c(cw1 cw1Var, long j, z61 z61Var);

    public void d(long j) {
        this.g = j;
    }
}
