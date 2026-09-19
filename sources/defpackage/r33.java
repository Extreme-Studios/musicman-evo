package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class r33 extends t33 {
    @Override // defpackage.t33
    public final void A1(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.t33
    public final void n1(Object obj, long j, byte b) {
        if (u33.h) {
            u33.d(obj, j, b);
        } else {
            u33.e(obj, j, b);
        }
    }

    @Override // defpackage.t33
    public final boolean q1(long j, Object obj) {
        return u33.h ? u33.q(j, obj) : u33.r(j, obj);
    }

    @Override // defpackage.t33
    public final void s1(Object obj, long j, boolean z) {
        if (u33.h) {
            u33.d(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            u33.e(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.t33
    public final float t1(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f).getInt(obj, j));
    }

    @Override // defpackage.t33
    public final void u1(Object obj, long j, float f) {
        ((Unsafe) this.f).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.t33
    public final double v1(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f).getLong(obj, j));
    }

    @Override // defpackage.t33
    public final void w1(Object obj, long j, double d) {
        ((Unsafe) this.f).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.t33
    public final byte x1(long j) {
        return Memory.peekByte((int) j);
    }
}
