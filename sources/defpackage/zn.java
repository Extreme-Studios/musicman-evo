package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class zn implements pl, Serializable {
    public final int f;

    public zn(int i) {
        this.f = i;
    }

    @Override // defpackage.pl
    public final int b() {
        return this.f;
    }

    public final String toString() {
        tw.a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
