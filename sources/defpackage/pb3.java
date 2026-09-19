package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes.dex */
public final class pb3 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ dy2 a;

    public pb3(dy2 dy2Var) {
        this.a = dy2Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        bz1 bz1Var;
        q73 q73Var;
        qb3 qb3Var = (qb3) this.a.f;
        if (audioTrack.equals(qb3Var.r) && (bz1Var = qb3Var.n) != null && qb3Var.P && (q73Var = ((rb3) bz1Var.f).L) != null) {
            q73Var.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        qb3 qb3Var = (qb3) this.a.f;
        if (audioTrack.equals(qb3Var.r)) {
            qb3Var.O = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        bz1 bz1Var;
        q73 q73Var;
        qb3 qb3Var = (qb3) this.a.f;
        if (audioTrack.equals(qb3Var.r) && (bz1Var = qb3Var.n) != null && qb3Var.P && (q73Var = ((rb3) bz1Var.f).L) != null) {
            q73Var.a();
        }
    }
}
