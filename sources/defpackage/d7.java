package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends i8 {
    public static volatile d7 D;
    public static final c7 E = new c7(0);
    public final qe C = new qe();

    public static d7 Q() {
        if (D != null) {
            return D;
        }
        synchronized (d7.class) {
            try {
                if (D == null) {
                    D = new d7();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return D;
    }
}
