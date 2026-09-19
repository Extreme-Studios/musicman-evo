package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class tb3 extends od1 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void o(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.cd1
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferI;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 21) {
            byteBufferI = i((i2 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferI);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferI = i(i2);
            while (iPosition < iLimit) {
                int i4 = byteBuffer.get(iPosition) & 255;
                int i5 = (byteBuffer.get(iPosition + 1) & 255) << 8;
                o(i4 | i5 | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferI);
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferI = i((i2 / 3) * 4);
            while (iPosition < iLimit) {
                o(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferI);
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                j7.a();
                return;
            }
            byteBufferI = i(i2);
            while (iPosition < iLimit) {
                int i6 = byteBuffer.get(iPosition + 3) & 255;
                int i7 = (byteBuffer.get(iPosition + 2) & 255) << 8;
                o(i6 | i7 | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferI);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferI.flip();
    }

    @Override // defpackage.od1
    public final nb1 k(nb1 nb1Var) throws jc1 {
        int i2 = nb1Var.c;
        String str = qz1.a;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736) {
            return new nb1(nb1Var.a, nb1Var.b, 4);
        }
        if (i2 == 4) {
            return nb1.e;
        }
        throw new jc1("Unhandled input format:", nb1Var);
    }
}
