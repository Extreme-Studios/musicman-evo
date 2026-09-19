package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.eo;
import defpackage.ho;
import defpackage.io;
import defpackage.j7;
import defpackage.lh;
import defpackage.r52;
import defpackage.vv;
import defpackage.wv;
import defpackage.zm;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements zm {
    @Override // defpackage.zm
    public final List a() {
        return lh.f;
    }

    @Override // defpackage.zm
    public final Object b(Context context) {
        context.getClass();
        r52 r52VarN = r52.n(context);
        r52VarN.getClass();
        if (!((HashSet) r52VarN.i).contains(ProcessLifecycleInitializer.class)) {
            j7.e("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!io.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ho());
        }
        wv wvVar = wv.n;
        wvVar.getClass();
        wvVar.j = new Handler();
        wvVar.k.d(eo.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new vv(wvVar));
        return wvVar;
    }
}
