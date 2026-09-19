package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x83 extends od3 {
    public final /* synthetic */ int c = 1;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x83(y83 y83Var, ox0 ox0Var) {
        super(ox0Var);
        Objects.requireNonNull(y83Var);
        this.d = new ex0();
    }

    @Override // defpackage.od3, defpackage.ox0
    public ex0 b(int i, ex0 ex0Var, long j) {
        switch (this.c) {
            case 1:
                this.b.b(i, ex0Var, j);
                li0 li0Var = (li0) this.d;
                ex0Var.b = li0Var;
                of0 of0Var = li0Var.b;
                return ex0Var;
            default:
                return super.b(i, ex0Var, j);
        }
    }

    @Override // defpackage.od3, defpackage.ox0
    public su0 d(int i, su0 su0Var, boolean z) {
        switch (this.c) {
            case 0:
                ox0 ox0Var = this.b;
                su0 su0VarD = ox0Var.d(i, su0Var, z);
                if (ox0Var.b(su0VarD.c, (ex0) this.d, 0L).b()) {
                    Object obj = su0Var.a;
                    Object obj2 = su0Var.b;
                    int i2 = su0Var.c;
                    long j = su0Var.d;
                    l91 l91Var = l91.b;
                    su0VarD.a(obj, obj2, i2, j, true);
                } else {
                    su0VarD.e = true;
                }
                return su0VarD;
            default:
                return super.d(i, su0Var, z);
        }
    }

    public x83(ox0 ox0Var, li0 li0Var) {
        super(ox0Var);
        this.d = li0Var;
    }
}
