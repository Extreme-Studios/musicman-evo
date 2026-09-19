package defpackage;

import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class t91 extends Thread {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t91(pe1 pe1Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.g = runnable2;
        this.h = pe1Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                new id3((Context) this.g, null).a((String) this.h, null);
                break;
            default:
                Process.setThreadPriority(((pe1) this.h).b);
                ((Runnable) this.g).run();
                break;
        }
    }

    public t91(f32 f32Var, Context context, String str) {
        this.g = context;
        this.h = str;
    }
}
