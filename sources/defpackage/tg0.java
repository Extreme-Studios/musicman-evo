package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class tg0 implements hh0, de2 {
    public static final long[] i = {128, 64, 32, 16, 8, 4, 2, 1};
    public static final byte[] j = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] k = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public int f;
    public int g;
    public Object h;

    public tg0(int i2) {
        switch (i2) {
            case 5:
                this.h = new us2(25);
                this.f = 8000;
                this.g = 8000;
                break;
            default:
                this.h = new byte[8];
                break;
        }
    }

    public static final void f(ByteBuffer byteBuffer, long j2, int i2, int i3, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i2);
        byteBuffer.putInt(0);
        byteBuffer.put(rs0.l(i3));
    }

    public static long g(int i2, boolean z, byte[] bArr) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            j2 &= ~i[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (((long) bArr[i3]) & 255);
        }
        return j2;
    }

    @Override // defpackage.de2
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public oe2 mo12a() {
        return new yh2(null, this.f, this.g, false, (us2) this.h);
    }

    public String b(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int i2 = this.f;
        Collections.sort(arrayList2, new ts(6));
        HashSet hashSet = new HashSet();
        loop0: for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((bu0) arrayList2.get(i3)).e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    String str = strArrSplit[i4];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i5 = 1;
                        boolean z2 = false;
                        while (true) {
                            int i6 = i5 + 2;
                            if (i6 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i5) == '\'') {
                                char c = ' ';
                                if (sb.charAt(i5 - 1) != ' ') {
                                    int i7 = i5 + 1;
                                    if (sb.charAt(i7) == 's' || sb.charAt(i7) == 'S') {
                                        if (i6 != sb.length()) {
                                            c = ' ';
                                            if (sb.charAt(i6) == ' ') {
                                            }
                                        } else {
                                            c = ' ';
                                        }
                                        sb.insert(i5, c);
                                        i5 = i6;
                                    } else {
                                        c = ' ';
                                    }
                                    sb.setCharAt(i5, c);
                                } else {
                                    sb.setCharAt(i5, c);
                                }
                                z2 = true;
                            }
                            i5++;
                        }
                        z = true;
                        String string = z2 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z = true;
                    }
                    String[] strArrE = dq.E(str, z);
                    int length = strArrE.length;
                    int i8 = this.g;
                    if (length >= i8) {
                        for (int i9 = 0; i9 < strArrE.length; i9++) {
                            String strConcat = "";
                            for (int i10 = 0; i10 < i8; i10++) {
                                int i11 = i9 + i10;
                                if (i11 >= strArrE.length) {
                                    break;
                                }
                                if (i10 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrE[i11]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i2) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= i2) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((fu0) this.h).R1((String) it.next()));
            } catch (IOException e) {
                jn.P("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e2) {
            jn.P("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e3) {
            jn.P("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }

    @Override // defpackage.hh0
    public int c() {
        return this.f;
    }

    public void d(lt2 lt2Var, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = lt2Var.d;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - lt2Var.d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = lt2Var.d;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i3 = iLimit - iPosition;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.f == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i5 += length + 44;
        } else {
            length = 0;
        }
        if (((ByteBuffer) this.h).capacity() < i5) {
            this.h = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.h).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.h;
        if (this.f == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                f(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(rs0.l(length2));
                byteBuffer.put(bArr);
                int i6 = length2 + 28;
                byteBuffer.putInt(22, qz1.f(byteBuffer.arrayOffset(), i6, 0, byteBuffer.array()));
                byteBuffer.position(i6);
            } else {
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(j);
            }
            byteBuffer.put(k);
        } else {
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int iH = this.g + ((int) ((na1.H(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.g = iH;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        f(byteBuffer5, iH, this.f, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f == 2) {
            byteBuffer5.putInt(length + 66, qz1.f(byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i7, qz1.f(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f++;
        this.h = byteBuffer5;
        lt2Var.a();
        lt2Var.d(((ByteBuffer) this.h).remaining());
        lt2Var.d.put((ByteBuffer) this.h);
        lt2Var.f();
    }

    public long e(od0 od0Var, boolean z, boolean z2, int i2) {
        int i3;
        byte[] bArr = (byte[]) this.h;
        if (this.f == 0) {
            if (!od0Var.w(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i3 = -1;
                    break;
                }
                i3 = i5 + 1;
                if ((i[i5] & ((long) i4)) != 0) {
                    break;
                }
                i5 = i3;
            }
            this.g = i3;
            if (i3 == -1) {
                j7.e("No valid varint length mask found");
                return 0L;
            }
            this.f = 1;
        }
        int i6 = this.g;
        if (i6 > i2) {
            this.f = 0;
            return -2L;
        }
        if (i6 != 1) {
            od0Var.x(bArr, 1, i6 - 1);
        }
        this.f = 0;
        return g(this.g, z2, bArr);
    }

    @Override // defpackage.hh0
    public int h() {
        int i2 = this.f;
        return i2 == -1 ? ((cw1) this.h).h() : i2;
    }

    @Override // defpackage.hh0
    public int a() {
        return this.g;
    }
}
