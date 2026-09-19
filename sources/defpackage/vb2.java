package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb2 implements rk {
    public final /* synthetic */ Context f;

    @Override // defpackage.rk
    public final Object a() {
        Context context = this.f;
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/ad_quality_data.pb");
    }
}
