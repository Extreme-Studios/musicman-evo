package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vd0 implements zh2 {
    public static final /* synthetic */ vd0 g = new vd0(0);
    public static final /* synthetic */ vd0 h = new vd0(1);
    public static final /* synthetic */ vd0 i = new vd0(2);
    public static final /* synthetic */ vd0 j = new vd0(3);
    public final /* synthetic */ int f;

    public /* synthetic */ vd0(int i2) {
        this.f = i2;
    }

    @Override // defpackage.zh2
    public final /* synthetic */ boolean b(Object obj) {
        switch (this.f) {
            case 0:
                dg0 dg0Var = (dg0) obj;
                return dg0Var.b.equals("com.apple.iTunes") && dg0Var.c.equals("iTunSMPB");
            case 1:
                return ((xf0) obj).c.equals("iTunSMPB");
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
