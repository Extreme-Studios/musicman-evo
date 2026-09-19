package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c12 implements m22 {
    public static String c;
    public final /* synthetic */ int a;
    public final ya1 b;

    public c12(Context context, ya1 ya1Var) {
        this.a = 3;
        this.b = ya1Var;
    }

    @Override // defpackage.m22
    public final hp a() {
        int i = this.a;
        ya1 ya1Var = this.b;
        switch (i) {
            case 0:
                return ya1Var.b(new gx0(1));
            case 1:
                return ya1Var.b(gx0.c);
            case 2:
                return ya1Var.b(gx0.d);
            case 3:
                return ya1Var.b(new gx0(this));
            case 4:
                return ya1Var.b(new gx0(5));
            default:
                return ya1Var.b(gx0.e);
        }
    }

    @Override // defpackage.m22
    public final int c() {
        switch (this.a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ c12(ya1 ya1Var, int i) {
        this.a = i;
        this.b = ya1Var;
    }
}
