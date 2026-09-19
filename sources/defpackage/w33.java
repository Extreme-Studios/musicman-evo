package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w33 extends IllegalArgumentException {
    public w33(int i, int i2) {
        super(ec.l(new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(i2).length()), "Unpaired surrogate at index ", i, " of ", i2));
    }
}
