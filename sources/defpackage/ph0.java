package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph0 implements ie0, gm1 {
    public static final ph0 h;
    public static final ph0 i;
    public final /* synthetic */ int f;
    public boolean g;

    static {
        int i2 = 0;
        h = new ph0(i2, true);
        i = new ph0(i2, false);
    }

    public /* synthetic */ ph0(int i2, boolean z) {
        this.f = i2;
        this.g = z;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        dm1 dm1Var = (dm1) obj;
        switch (this.f) {
            case 2:
                dm1Var.R(this.g);
                break;
            default:
                dm1Var.o0(this.g);
                break;
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                boolean z = !this.g;
                StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
