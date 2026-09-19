package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la implements yb {
    public static final la g = new la(0);
    public static final la h = new la(1);
    public final /* synthetic */ int f;

    public /* synthetic */ la(int i) {
        this.f = i;
    }

    @Override // defpackage.yb
    public final void d(Object obj) {
        switch (this.f) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    @Override // defpackage.yb
    public final ic getContext() {
        switch (this.f) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return jh.f;
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
