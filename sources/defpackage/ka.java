package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ka {
    public final Object a;
    public final mf b;
    public final hl c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ ka(Object obj, mf mfVar, hl hlVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : mfVar, (i & 4) != 0 ? null : hlVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    public static ka a(ka kaVar, mf mfVar, CancellationException cancellationException, int i) {
        Object obj = kaVar.a;
        if ((i & 2) != 0) {
            mfVar = kaVar.b;
        }
        mf mfVar2 = mfVar;
        hl hlVar = kaVar.c;
        Object obj2 = kaVar.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = kaVar.e;
        }
        return new ka(obj, mfVar2, hlVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return jn.b(this.a, kaVar.a) && jn.b(this.b, kaVar.b) && jn.b(this.c, kaVar.c) && jn.b(this.d, kaVar.d) && jn.b(this.e, kaVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        mf mfVar = this.b;
        int iHashCode2 = (iHashCode + (mfVar == null ? 0 : mfVar.hashCode())) * 31;
        hl hlVar = this.c;
        int iHashCode3 = (iHashCode2 + (hlVar == null ? 0 : hlVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public ka(Object obj, mf mfVar, hl hlVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = mfVar;
        this.c = hlVar;
        this.d = obj2;
        this.e = th;
    }
}
