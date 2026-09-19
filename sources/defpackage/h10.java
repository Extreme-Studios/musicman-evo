package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends ac {
    public i10 i;
    public File j;
    public FileOutputStream k;
    public FileOutputStream l;
    public /* synthetic */ Object m;
    public final /* synthetic */ i10 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(i10 i10Var, ac acVar) {
        super(acVar);
        this.n = i10Var;
    }

    @Override // defpackage.ac
    public final Object m(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.j(null, this);
    }
}
