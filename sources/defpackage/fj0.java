package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fj0 extends bt0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ kb3 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ l41 e;
    public final /* synthetic */ es0 f;

    public fj0(es0 es0Var, Context context, kb3 kb3Var, String str, l41 l41Var) {
        this.b = context;
        this.c = kb3Var;
        this.d = str;
        this.e = l41Var;
        Objects.requireNonNull(es0Var);
        this.f = es0Var;
    }

    @Override // defpackage.bt0
    public final Object a() {
        es0.D(this.b, "banner");
        return new q62();
    }

    @Override // defpackage.bt0
    public final /* synthetic */ Object b() {
        return ((e11) this.f.f).p(this.b, this.c, this.d, this.e, 1);
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.U1(new ju(this.b), this.c, this.d, this.e, ModuleDescriptor.MODULE_VERSION);
    }
}
