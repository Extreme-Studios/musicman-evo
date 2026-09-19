package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ee {
    public static final /* synthetic */ int a = 0;

    static {
        String property;
        int i = a30.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            de deVar = de.n;
            return;
        }
        ke keVar = jf.a;
        im imVar = cq.a;
        im imVar2 = imVar.j;
        if (imVar == null) {
            de deVar2 = de.n;
        }
    }
}
