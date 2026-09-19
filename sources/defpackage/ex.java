package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class ex implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ex(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new dx(runnable);
            default:
                String str = qz1.a;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }
}
