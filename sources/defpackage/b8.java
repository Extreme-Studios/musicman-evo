package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class b8 extends gb {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(jb jbVar, int i) {
        super(jbVar);
        this.e = i;
    }

    @Override // defpackage.gb
    public final boolean a(j90 j90Var) {
        switch (this.e) {
            case 0:
                return j90Var.j.b;
            case 1:
                return j90Var.j.d;
            case 2:
                return j90Var.j.a == 2;
            case 3:
                int i = j90Var.j.a;
                if (i != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i == 6;
                }
                return true;
            default:
                return j90Var.j.e;
        }
    }

    @Override // defpackage.gb
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.e) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                st stVar = (st) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    return (stVar.a && stVar.b) ? false : true;
                }
                return !stVar.a;
            case 3:
                st stVar2 = (st) obj;
                return !stVar2.a || stVar2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
