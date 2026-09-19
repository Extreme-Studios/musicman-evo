package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class vr0 extends js0 {
    public static final kc2 i = new kc2(14);
    public final Context h;

    public vr0(nr0 nr0Var, hp0 hp0Var, int i2, Context context) {
        super(nr0Var, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", hp0Var, i2, 29);
        this.h = context;
    }

    @Override // defpackage.js0
    public final void a() {
        hp0 hp0Var = this.d;
        hp0Var.b();
        ((sp0) hp0Var.g).z("E");
        Context context = this.h;
        AtomicReference atomicReferenceK = i.k(context.getPackageName());
        if (atomicReferenceK.get() == null) {
            synchronized (atomicReferenceK) {
                try {
                    if (atomicReferenceK.get() == null) {
                        atomicReferenceK.set((String) this.e.invoke(null, context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = (String) atomicReferenceK.get();
        hp0 hp0Var2 = this.d;
        synchronized (hp0Var2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            hp0Var2.b();
            ((sp0) hp0Var2.g).z(strEncodeToString);
        }
    }
}
