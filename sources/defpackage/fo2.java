package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class fo2 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static void a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
