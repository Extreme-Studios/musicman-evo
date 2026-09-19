package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vk0 extends bt0 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ kb3 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ es0 e;

    public vk0(es0 es0Var, Context context, kb3 kb3Var, String str) {
        this.b = context;
        this.c = kb3Var;
        this.d = str;
        Objects.requireNonNull(es0Var);
        this.e = es0Var;
    }

    @Override // defpackage.bt0
    public final Object a() {
        es0.D(this.b, "search");
        return new q62();
    }

    @Override // defpackage.bt0
    public final /* synthetic */ Object b() {
        return ((e11) this.e.f).p(this.b, this.c, this.d, null, 3);
    }

    @Override // defpackage.bt0
    public final Object c(oh1 oh1Var) {
        return oh1Var.d1(new ju(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }
}
