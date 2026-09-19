package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zu0 extends PushbackInputStream {
    public final /* synthetic */ r52 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(r52 r52Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f = r52Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((qk) this.f.i).c();
        super.close();
    }
}
