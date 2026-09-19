package defpackage;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w81 {
    public final AudioManager.OnAudioFocusChangeListener a;
    public final Handler b;
    public final qk1 c;
    public final Object d;

    public w81(ay2 ay2Var, Handler handler, qk1 qk1Var) {
        this.b = handler;
        this.c = qk1Var;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            this.a = new a81(ay2Var, handler);
        } else {
            this.a = ay2Var;
        }
        this.d = i >= 26 ? o0.g().setAudioAttributes(qk1Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(ay2Var, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w81)) {
            return false;
        }
        w81 w81Var = (w81) obj;
        return Objects.equals(this.a, w81Var.a) && Objects.equals(this.b, w81Var.b) && Objects.equals(this.c, w81Var.c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.a, this.b, this.c, Boolean.FALSE);
    }
}
