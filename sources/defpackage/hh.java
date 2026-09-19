package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hh implements wm {
    public final boolean a;

    public hh(boolean z) {
        this.a = z;
    }

    @Override // defpackage.wm
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.wm
    public final vt d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
