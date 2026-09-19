package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lj1 implements wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lj1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.wh2
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                x42 x42Var = (x42) obj;
                oo0 oo0Var = new oo0((Context) obj4);
                oo0Var.c = x42Var.B;
                oo0Var.f = x42Var.C.toString();
                oo0Var.e = ((d60) obj3).f;
                oo0Var.d = ((i52) obj2).g;
                return oo0Var;
            case 1:
                md1 md1Var = (md1) obj4;
                if (((x42) obj3).M) {
                    md1Var.F0();
                }
                md1Var.J0();
                md1Var.onPause();
                return ((lf1) obj2).I();
            case 2:
                md1 md1Var2 = (md1) obj4;
                if (((x42) obj3).M) {
                    md1Var2.F0();
                }
                md1Var2.J0();
                md1Var2.onPause();
                return ((rf1) obj2).I();
            default:
                md1 md1Var3 = (md1) obj4;
                if (((x42) obj3).M) {
                    md1Var3.F0();
                }
                md1Var3.J0();
                md1Var3.onPause();
                return ((vf1) obj2).I();
        }
    }
}
