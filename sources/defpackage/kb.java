package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class kb {
    public static final kb i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int a = 1;
    public long f = -1;
    public long g = -1;
    public ub h = new ub();

    static {
        ub ubVar = new ub();
        kb kbVar = new kb();
        kbVar.a = 1;
        kbVar.f = -1L;
        kbVar.g = -1L;
        new HashSet();
        kbVar.b = false;
        kbVar.c = false;
        kbVar.a = 1;
        kbVar.d = false;
        kbVar.e = false;
        kbVar.h = ubVar;
        kbVar.f = -1L;
        kbVar.g = -1L;
        i = kbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kb.class != obj.getClass()) {
            return false;
        }
        kb kbVar = (kb) obj;
        if (this.b == kbVar.b && this.c == kbVar.c && this.d == kbVar.d && this.e == kbVar.e && this.f == kbVar.f && this.g == kbVar.g && this.a == kbVar.a) {
            return this.h.equals(kbVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int iZ = ((((((((ec.z(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iZ + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
