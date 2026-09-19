package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.mo;
import defpackage.oo;
import defpackage.qg;
import defpackage.r52;
import defpackage.rg;
import defpackage.s70;
import defpackage.ui;
import defpackage.zm;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements zm {
    @Override // defpackage.zm
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.zm
    public final Object b(Context context) {
        Object objH;
        ui uiVar = new ui(new s70(context));
        uiVar.b = 1;
        if (qg.k == null) {
            synchronized (qg.j) {
                try {
                    if (qg.k == null) {
                        qg.k = new qg(uiVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r52 r52VarN = r52.n(context);
        r52VarN.getClass();
        synchronized (r52.l) {
            try {
                objH = ((HashMap) r52VarN.h).get(ProcessLifecycleInitializer.class);
                if (objH == null) {
                    objH = r52VarN.h(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        oo ooVarE = ((mo) objH).e();
        ooVarE.a(new rg(this, ooVarE));
        return Boolean.TRUE;
    }
}
