package defpackage;

import android.content.Context;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yi1 implements r63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final yj1 c;
    public final v63 d;

    public yi1(yj1 yj1Var, q63 q63Var, ve1 ve1Var) {
        this.a = 2;
        this.c = yj1Var;
        this.b = q63Var;
        this.d = ve1Var;
    }

    public a02 a() {
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new a02(ya1Var, (ur1) this.b.c(), this.c.a(), (String) this.d.c(), 3);
    }

    public a02 b() {
        Context contextA = ((xe1) this.b).a();
        ya1 ya1Var = za1.a;
        dq.D(ya1Var);
        return new a02(contextA, ya1Var, this.c.a(), ((ef1) this.d).a());
    }

    @Override // defpackage.v63
    public final Object c() {
        String string;
        switch (this.a) {
            case 0:
                ae aeVar = (ae) this.b.c();
                ua1 ua1VarC = ((ff1) this.d).c();
                String str = this.c.a().g;
                un1 un1Var = ua1VarC.h;
                synchronized (un1Var) {
                    string = ((BigInteger) un1Var.g).toString();
                    un1Var.g = ((BigInteger) un1Var.g).add(BigInteger.ONE);
                    un1Var.h = string;
                }
                return new pa1(aeVar, ua1VarC, string, str);
            case 1:
                return a();
            case 2:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new a02((Object) ya1Var, this.c.a(), this.b.c(), (Object) ((ve1) this.d).c(), 5);
            default:
                return b();
        }
    }

    public yi1(q63 q63Var, ff1 ff1Var, yj1 yj1Var) {
        this.a = 0;
        this.b = q63Var;
        this.d = ff1Var;
        this.c = yj1Var;
    }

    public /* synthetic */ yi1(v63 v63Var, yj1 yj1Var, v63 v63Var2, int i) {
        this.a = i;
        this.b = v63Var;
        this.c = yj1Var;
        this.d = v63Var2;
    }
}
