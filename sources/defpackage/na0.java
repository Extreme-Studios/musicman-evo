package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class na0 extends qa0 {
    public final /* synthetic */ Intent f;
    public final /* synthetic */ GoogleApiActivity g;

    public na0(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f = intent;
        this.g = googleApiActivity;
    }

    @Override // defpackage.qa0
    public final void a() {
        Intent intent = this.f;
        if (intent != null) {
            this.g.startActivityForResult(intent, 2);
        }
    }
}
