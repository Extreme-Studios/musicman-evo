package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class a81 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final ay2 b;

    public a81(ay2 ay2Var, Handler handler) {
        this.b = ay2Var;
        Looper looper = handler.getLooper();
        String str = qz1.a;
        this.a = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        og ogVar = new og(i, 5, this);
        String str = qz1.a;
        Handler handler = this.a;
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                ogVar.run();
            } else {
                handler.post(ogVar);
            }
        }
    }
}
