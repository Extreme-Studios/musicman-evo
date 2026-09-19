package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class lr2 {
    public static final Logger c = Logger.getLogger(lr2.class.getName());
    public static final lr2 d = new lr2();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public final synchronized void a(sr2 sr2Var, boolean z) {
        c(sr2Var, 1, z);
    }

    public final sr2 b(Class cls, String str) throws GeneralSecurityException {
        sr2 sr2VarD = d(str);
        if (sr2VarD.b.equals(cls)) {
            return sr2VarD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(sr2VarD.getClass());
        String string = sr2VarD.b.toString();
        StringBuilder sb = new StringBuilder(ec.f(strValueOf, name.length() + 53, 23) + string.length());
        ec.x(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(ec.m(sb, ", which only supports: ", string));
    }

    public final synchronized void c(sr2 sr2Var, int i, boolean z) {
        if (!jn.r(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(sr2Var, z);
    }

    public final synchronized sr2 d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (sr2) concurrentHashMap.get(str);
    }

    public final synchronized void e(sr2 sr2Var, boolean z) {
        try {
            String str = sr2Var.a;
            if (z) {
                ConcurrentHashMap concurrentHashMap = this.b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.a;
            sr2 sr2Var2 = (sr2) concurrentHashMap2.get(str);
            if (sr2Var2 != null && !sr2Var2.getClass().equals(sr2Var.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + sr2Var2.getClass().getName() + ", cannot be re-registered with " + sr2Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, sr2Var);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }
}
