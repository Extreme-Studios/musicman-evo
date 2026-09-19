package defpackage;

import java.util.concurrent.ThreadFactory;

public class cb0 implements ThreadFactory {
    public cb0(String name, int i) {}
    @Override
    public Thread newThread(Runnable r) { return new Thread(r); }
}
