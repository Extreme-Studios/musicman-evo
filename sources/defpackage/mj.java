package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class mj extends i8 implements d70, mo, bz, bk {
    public final c4 C;
    public final c4 D;
    public final Handler E;
    public final xj F;
    public final /* synthetic */ c4 G;

    public mj(c4 c4Var) {
        this.G = c4Var;
        Handler handler = new Handler();
        this.F = new xj();
        this.C = c4Var;
        this.D = c4Var;
        this.E = handler;
    }

    @Override // defpackage.bz
    public final z61 b() {
        return (z61) this.G.j.h;
    }

    @Override // defpackage.d70
    public final c70 d() {
        return this.G.d();
    }

    @Override // defpackage.mo
    public final oo e() {
        return this.G.x;
    }

    @Override // defpackage.i8
    public final View p(int i) {
        return this.G.findViewById(i);
    }

    @Override // defpackage.i8
    public final boolean q() {
        Window window = this.G.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.bk
    public final void c() {
    }
}
