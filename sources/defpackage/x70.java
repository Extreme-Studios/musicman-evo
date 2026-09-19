package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x70 extends x3 {
    @Override // defpackage.y3
    public final boolean b() {
        if (!super.b() || !na1.k("MULTI_PROCESS")) {
            return false;
        }
        int i = v70.a;
        if (y70.c.b()) {
            return z70.a.getStatics().isMultiProcessEnabled();
        }
        throw y70.a();
    }
}
