package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new i3()).iterator();
            it.getClass();
            a = sz.H(new fb(new uz(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
