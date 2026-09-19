package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ac1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ac1(Object obj, boolean z, long j, int i) {
        this.f = i;
        this.i = obj;
        this.g = z;
        this.h = j;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        long j = this.h;
        boolean z = this.g;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((bc1) obj).h.z(j, z);
                break;
            default:
                ((md1) obj).z(j, z);
                break;
        }
    }
}
