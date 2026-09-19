package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class re2 {
    public MessageDigest a;
    public final dh2 b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    public re2(dh2 dh2Var) {
        this.b = dh2Var;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0039: INVOKE (r1 I:ch2) VIRTUAL call: ch2.c():void A[Catch: all -> 0x0037, MD:():void (m), TRY_ENTER] (LINE:58), block:B:25:0x0039 */
    public final void a() {
        boolean z;
        ch2 ch2VarC;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            try {
                ch2 ch2VarA = this.b.a(202);
                try {
                    ch2VarA.a();
                    this.e = secureRandom;
                    this.a = MessageDigest.getInstance("MD5");
                    this.d = true;
                } catch (NoSuchAlgorithmException e) {
                    ch2VarA.b(e);
                } catch (Throwable th) {
                    ch2VarA.b(th);
                    throw th;
                }
                ch2VarA.c();
            } catch (Throwable th2) {
                ch2VarC.c();
                throw th2;
            }
        }
    }

    public final byte[] b(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        hn.v(length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.e.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        se2[] se2VarArr = (se2[]) new sq0(1).G2;
        int length2 = se2VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            se2VarArr[i3].a(bArrArray, bArr3);
        }
        if (!yd.v(str)) {
            j52 j52Var = new j52(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                byte[] bArr4 = (byte[]) j52Var.f;
                i4 = (i4 + 1) & 255;
                byte b = bArr4[i4];
                i5 = (i5 + b) & 255;
                bArr4[i4] = bArr4[i5];
                bArr4[i5] = b;
                bArr3[i6] = (byte) (bArr4[(bArr4[i4] + b) & 255] ^ bArr3[i6]);
            }
        }
        return bArr3;
    }

    public final byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    public final dq0 d(String str, byte[] bArr) {
        dq0 dq0VarZ = eq0.z();
        byte[] bArrC = c(bArr);
        l13 l13Var = n13.g;
        l13 l13VarN = n13.n(bArrC, 0, bArrC.length);
        dq0VarZ.b();
        ((eq0) dq0VarZ.g).B(l13VarN);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= ((length - 1) / 255) + 1) {
                break;
            }
            int i2 = i * 255;
            int i3 = i2 + 255;
            if (length > i3) {
                length = i3;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
            i++;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            l13 l13VarN2 = n13.n(b((byte[]) obj, str, false), 0, 256);
            dq0VarZ.b();
            ((eq0) dq0VarZ.g).A(l13VarN2);
        }
        return dq0VarZ;
    }
}
