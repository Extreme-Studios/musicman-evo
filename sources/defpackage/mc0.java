package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ z61 g;

    public /* synthetic */ mc0(int i, long j, z61 z61Var) {
        this.f = 1;
        this.g = z61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        z61 z61Var = this.g;
        z61Var.getClass();
        switch (i) {
            case 0:
                String str = qz1.a;
                z93 z93Var = ((d73) z61Var.h).f.x;
                z93Var.s(z93Var.y(), 1016, new v33(10));
                break;
            case 1:
                String str2 = qz1.a;
                z93 z93Var2 = ((d73) z61Var.h).f.x;
                z93Var2.s(z93Var2.x((yd3) z93Var2.i.j), 1021, new r53(11, (byte) 0));
                break;
            case 2:
                String str3 = qz1.a;
                z93 z93Var3 = ((d73) z61Var.h).f.x;
                z93Var3.s(z93Var3.y(), 1019, new r53(10, (byte) 0));
                break;
            case 3:
                String str4 = qz1.a;
                z93 z93Var4 = ((d73) z61Var.h).f.x;
                z93Var4.s(z93Var4.y(), 1030, new v33(12));
                break;
            default:
                String str5 = qz1.a;
                z93 z93Var5 = ((d73) z61Var.h).f.x;
                z93Var5.s(z93Var5.y(), 1015, new r53(9, (byte) 0));
                break;
        }
    }

    public /* synthetic */ mc0(z61 z61Var, Object obj, int i) {
        this.f = i;
        this.g = z61Var;
    }

    public /* synthetic */ mc0(z61 z61Var, String str, long j, long j2) {
        this.f = 0;
        this.g = z61Var;
    }
}
