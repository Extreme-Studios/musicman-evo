package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class eb3 extends od1 {
    public int[] i;
    public int[] j;

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    @Override // defpackage.cd1
    public final void c(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferI = i(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i6 : iArr) {
                int iD = (qz1.d(this.b.c) * i6) + iPosition;
                int i7 = this.b.c;
                if (i7 == 2) {
                    byteBufferI.putShort(byteBuffer.getShort(iD));
                } else if (i7 == 3) {
                    byteBufferI.put(byteBuffer.get(iD));
                } else if (i7 == 4) {
                    byteBufferI.putFloat(byteBuffer.getFloat(iD));
                } else if (i7 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iD;
                    } else {
                        i = iD + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iD + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iD += 2;
                    }
                    i2 = ((b << 24) & (-16777216)) | ((b2 << 16) & 16711680) | ((byteBuffer.get(iD) << 8) & 65280);
                    i3 = i2 >> 8;
                    if ((i3 & (-16777216)) != 0 || (i3 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hn.K(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                    hn.v(byteBufferI.remaining() >= 3);
                    if (byteBufferI.order() == byteOrder) {
                        i4 = (i2 >> 24) & 255;
                    } else {
                        i4 = i3 & 255;
                    }
                    byte b3 = (byte) i4;
                    int i8 = (i2 >> 16) & 255;
                    if (byteBufferI.order() == byteOrder) {
                        i5 = i3 & 255;
                    } else {
                        i5 = (i2 >> 24) & 255;
                    }
                    byteBufferI.put(b3).put((byte) i8).put((byte) i5);
                } else {
                    if (i7 != 22) {
                        if (i7 == 268435456) {
                            byteBufferI.putShort(byteBuffer.getShort(iD));
                        } else if (i7 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iD;
                            } else {
                                i = iD + 2;
                            }
                            byte b4 = byteBuffer.get(i);
                            byte b5 = byteBuffer.get(iD + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iD += 2;
                            }
                            i2 = ((b4 << 24) & (-16777216)) | ((b5 << 16) & 16711680) | ((byteBuffer.get(iD) << 8) & 65280);
                            i3 = i2 >> 8;
                            if ((i3 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            hn.K(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                            hn.v(byteBufferI.remaining() >= 3);
                            if (byteBufferI.order() == byteOrder) {
                                i4 = (i2 >> 24) & 255;
                            } else {
                                i4 = i3 & 255;
                            }
                            byte b6 = (byte) i4;
                            int i9 = (i2 >> 16) & 255;
                            if (byteBufferI.order() == byteOrder) {
                                i5 = i3 & 255;
                            } else {
                                i5 = (i2 >> 24) & 255;
                            }
                            byteBufferI.put(b6).put((byte) i9).put((byte) i5);
                        } else if (i7 != 1610612736) {
                            j7.e(ec.j(new StringBuilder(String.valueOf(i7).length() + 21), "Unexpected encoding: ", i7));
                            return;
                        }
                    }
                    byteBufferI.putInt(byteBuffer.getInt(iD));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferI.flip();
    }

    @Override // defpackage.od1
    public final nb1 k(nb1 nb1Var) throws jc1 {
        int[] iArr = this.i;
        if (iArr == null) {
            return nb1.e;
        }
        int i = nb1Var.c;
        if (!qz1.a(i)) {
            throw new jc1("Unhandled input format:", nb1Var);
        }
        int i2 = nb1Var.b;
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            if (i3 >= length) {
                return z ? new nb1(nb1Var.a, length, i) : nb1.e;
            }
            int i4 = iArr[i3];
            if (i4 >= i2) {
                String string = Arrays.toString(iArr);
                throw new jc1(ec.n(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), nb1Var);
            }
            z |= i4 != i3;
            i3++;
        }
    }

    @Override // defpackage.od1
    public final void m() {
        this.j = this.i;
    }

    @Override // defpackage.od1
    public final void n() {
        this.j = null;
        this.i = null;
    }
}
