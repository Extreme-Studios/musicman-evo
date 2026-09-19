package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yu0 extends cb1 {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public yu0(qk qkVar) {
        this.h = qkVar;
    }

    @Override // defpackage.cb1, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        switch (this.g) {
            case 0:
                ((qk) this.h).c();
                return this.f.cancel(z);
            default:
                return super.cancel(z);
        }
    }

    public void d() {
        b(this.h);
    }

    public yu0(Object obj) {
        this.h = obj;
    }
}
