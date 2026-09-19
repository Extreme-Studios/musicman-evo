package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf3 extends no0 {
    public final vj2 h;

    public hf3(String str, qk2 qk2Var) {
        super(str, null, false, 1);
        this.h = vj2.m(qk2Var);
    }

    @Override // defpackage.no0, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        vj2 vj2Var = this.h;
        if (vj2Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(vj2Var);
        return ec.n(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
