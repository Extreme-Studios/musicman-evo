package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);
    public final int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        return new t91(this, runnable, ec.j(new StringBuilder(String.valueOf(andIncrement).length() + 26), "AdWorker(WebViewStartup) #", andIncrement), runnable);
    }
}
