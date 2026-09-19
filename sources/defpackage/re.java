package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class re extends h {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re(ic icVar, boolean z, int i) {
        super(icVar, z);
        this.i = i;
    }

    @Override // defpackage.wn
    public boolean w(Throwable th) {
        switch (this.i) {
            case 1:
                ss0.o(this.h, th);
                return true;
            default:
                return super.w(th);
        }
    }
}
