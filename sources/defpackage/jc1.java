package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jc1 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public jc1(String str, nb1 nb1Var) {
        String strValueOf = String.valueOf(nb1Var);
        super(ec.n(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
