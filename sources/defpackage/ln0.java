package defpackage;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class ln0 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ln0(kn0 kn0Var, jn0 jn0Var, long j) {
        Locale locale = Locale.US;
        Long lValueOf = Long.valueOf(j);
        super(String.format(locale, wn0.a("bk3t6gFTc30="), Long.valueOf(kn0Var.f), Long.valueOf(jn0Var.f), lValueOf));
        Optional.of(jn0Var);
        Optional.of(lValueOf);
    }

    public ln0(kn0 kn0Var, Exception exc) {
        super(String.format(Locale.US, wn0.a("bk0="), Long.valueOf(kn0Var.f)), exc);
        Optional.empty();
        Optional.empty();
    }
}
