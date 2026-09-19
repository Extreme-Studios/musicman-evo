package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m12 implements j22 {
    public final boolean a;

    public m12(boolean z) {
        this.a = z;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((rj1) obj).a.putBoolean("is_gbid", this.a);
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        ((rj1) obj).b.putBoolean("is_gbid", this.a);
    }
}
