package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class nn2 {
    public final o8 a = new o8();
    public final String b;
    public volatile Logger c;

    public nn2(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
