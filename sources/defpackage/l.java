package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l extends Throwable {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i) {
        super(str);
        this.f = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.f;
        synchronized (this) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    break;
                default:
                    break;
            }
            return this;
        }
    }
}
