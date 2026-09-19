package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.gm;
import defpackage.p3;
import defpackage.zm;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements zm {
    @Override // defpackage.zm
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.zm
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new p3(this, context.getApplicationContext()));
        return new gm();
    }
}
