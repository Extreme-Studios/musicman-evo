package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay2 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ iz2 a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        iz2 iz2Var = this.a;
        iz2Var.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                iz2Var.e(4);
                return;
            }
            b83 b83Var = iz2Var.c;
            if (b83Var != null) {
                Handler handler = b83Var.m.a;
                ox1 ox1VarF = wx1.f();
                ox1VarF.a = handler.obtainMessage(33, 0, 0);
                ox1VarF.a();
            }
            iz2Var.e(3);
            return;
        }
        if (i == -1) {
            b83 b83Var2 = iz2Var.c;
            if (b83Var2 != null) {
                Handler handler2 = b83Var2.m.a;
                ox1 ox1VarF2 = wx1.f();
                ox1VarF2.a = handler2.obtainMessage(33, -1, 0);
                ox1VarF2.a();
            }
            iz2Var.d();
            iz2Var.e(1);
            return;
        }
        if (i != 1) {
            ec.u(new StringBuilder(String.valueOf(i).length() + 27), "Unknown focus change type: ", i, "AudioFocusManager");
            return;
        }
        iz2Var.e(2);
        b83 b83Var3 = iz2Var.c;
        if (b83Var3 != null) {
            Handler handler3 = b83Var3.m.a;
            ox1 ox1VarF3 = wx1.f();
            ox1VarF3.a = handler3.obtainMessage(33, 1, 0);
            ox1VarF3.a();
        }
    }
}
