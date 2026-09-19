package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends od1 {
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // defpackage.cd1
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            j7.a();
                            return;
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i += i;
        }
        ByteBuffer byteBufferI = i(i);
        int i3 = this.b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferI.put((byte) 0);
                byteBufferI.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                float f = byteBuffer.getFloat(iPosition);
                String str = qz1.a;
                short sMax = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                byteBufferI.put((byte) (sMax & 255));
                byteBufferI.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferI.put(byteBuffer.get(iPosition + 1));
                byteBufferI.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferI.put(byteBuffer.get(iPosition + 2));
                byteBufferI.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferI.put(byteBuffer.get(iPosition + 1));
                byteBufferI.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferI.put(byteBuffer.get(iPosition + 1));
                byteBufferI.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                j7.a();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferI.put(byteBuffer.get(iPosition + 1));
                byteBufferI.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferI.flip();
    }

    @Override // defpackage.od1
    public final nb1 k(nb1 nb1Var) throws jc1 {
        int i = nb1Var.c;
        if (i != 3) {
            if (i == 2) {
                return nb1.e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new jc1("Unhandled input format:", nb1Var);
            }
        }
        return new nb1(nb1Var.a, nb1Var.b, 2);
    }
}
