package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class gh0 implements gi0 {
    public long f;
    public long g;
    public Object h;
    public Object i;

    public gh0(long j) {
        hn.M(((eg3) this.h) == null);
        this.f = j;
        this.g = j + 65536;
    }

    public static gh0 a(mn0 mn0Var, byte[] bArr) throws in0, ln0 {
        mn0Var.a();
        ((ko0) mn0Var.g).c.h = xn0.e(bArr);
        List list = (List) mn0Var.f(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        mn0Var.g(jLongValue, Optional.empty());
        String strConcat = "3.".concat(new String(rs0.t(), StandardCharsets.UTF_8));
        gh0 gh0Var = new gh0();
        gh0Var.i = mn0Var;
        gh0Var.f = jLongValue2;
        gh0Var.g = jLongValue3;
        gh0Var.h = strConcat;
        return gh0Var;
    }

    @Override // defpackage.gi0
    public long d(od0 od0Var) {
        long j = this.g;
        if (j < 0) {
            return -1L;
        }
        this.g = -1L;
        return -(j + 2);
    }

    @Override // defpackage.gi0
    public ee0 h() {
        hn.M(this.f != -1);
        return new sd0((td0) this.h, this.f, 0);
    }

    @Override // defpackage.gi0
    public void j(long j) {
        long[] jArr = (long[]) ((vg2) this.i).g;
        this.g = jArr[qz1.p(jArr, j, true)];
    }

    public gh0(String str, byte[] bArr, long j, long j2) {
        this.h = str;
        this.i = bArr;
        this.f = j;
        this.g = j2;
    }
}
