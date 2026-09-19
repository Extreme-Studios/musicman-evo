package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p3 implements Choreographer.FrameCallback {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new j4((Context) obj, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ p3(Runnable runnable) {
        this.g = runnable;
    }
}
