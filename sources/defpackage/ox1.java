package defpackage;

import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class ox1 {
    public Message a;

    public final void a() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a = null;
        wx1.e(this);
    }
}
