package defpackage;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class lr0 extends z61 {
    public final Context l;

    public lr0(Context context, zf0 zf0Var) {
        super(zf0Var);
        this.l = context;
    }

    public static nm0 L(Context context) {
        nm0 nm0Var = new nm0(new ym0(new File(new File(context.getCacheDir(), "admob_volley").getPath())), new lr0(context, new zf0(2)));
        nm0Var.a();
        return nm0Var;
    }

    @Override // defpackage.z61, defpackage.hm0
    public final km0 d(mm0 mm0Var) throws qm0 {
        int i = mm0Var.g;
        String str = mm0Var.h;
        if (i == 0) {
            if (Pattern.matches((String) tu0.e.c.a(lx0.Q4), str)) {
                f32 f32Var = ut0.f.a;
                am amVar = am.b;
                Context context = this.l;
                if (amVar.c(context, 13400000) == 0) {
                    km0 km0VarD = new vb(context).d(mm0Var);
                    if (km0VarD != null) {
                        jn.p("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return km0VarD;
                    }
                    jn.p("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.d(mm0Var);
    }
}
