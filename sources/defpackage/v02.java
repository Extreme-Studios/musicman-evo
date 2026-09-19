package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v02 implements il0 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[PHI: r8
  0x003c: PHI (r8v13 int) = (r8v0 int), (r8v16 int) binds: [B:17:0x0032, B:21:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public v02(String str, byte[] bArr, int i, int i2) {
        byte b;
        boolean z = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    if (i2 != 23) {
                        z = false;
                    } else if (bArr.length == 4) {
                        i2 = 23;
                    } else {
                        i2 = 23;
                        z = false;
                    }
                    hn.v(z);
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    if (i2 != 75) {
                        z = false;
                    } else if (bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                        i2 = 75;
                    } else {
                        i2 = 75;
                        z = false;
                    }
                    hn.v(z);
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    if (i2 != 78) {
                        z = false;
                    } else if (bArr.length == 8) {
                        i2 = 78;
                    } else {
                        i2 = 78;
                        z = false;
                    }
                    hn.v(z);
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    if (i2 != 78) {
                        z = false;
                    } else if (bArr.length == 8) {
                        i2 = 78;
                    } else {
                        i2 = 78;
                        z = false;
                    }
                    hn.v(z);
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    hn.v(i2 == 0);
                }
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v02.class == obj.getClass()) {
            v02 v02Var = (v02) obj;
            if (this.a.equals(v02Var.a) && Arrays.equals(this.b, v02Var.b) && this.c == v02Var.c && this.d == v02Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + ((this.a.hashCode() + 527) * 31)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[LOOP:0: B:40:0x00ec->B:42:0x00ef, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.a;
        int i = 0;
        byte[] bArr = this.b;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 == 1) {
                String str2 = qz1.a;
                string = new String(bArr, StandardCharsets.UTF_8);
            } else if (i2 == 23) {
                int length = bArr.length;
                if (!(length >= 4)) {
                    j7.p(jn.E("array too small: %s < %s", Integer.valueOf(length), 4));
                    return null;
                }
                string = String.valueOf(Float.intBitsToFloat(w40.r0(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i2 == 67) {
                int length2 = bArr.length;
                if (!(length2 >= 4)) {
                    j7.p(jn.E("array too small: %s < %s", Integer.valueOf(length2), 4));
                    return null;
                }
                string = String.valueOf(w40.r0(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i2 == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i2 != 78) {
                String str3 = qz1.a;
                int length3 = bArr.length;
                sb = new StringBuilder(length3 + length3);
                while (i < bArr.length) {
                    sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i] & 15, 16));
                    i++;
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new cw1(bArr).j());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            hn.N("Metadata is not an auxiliary tracks map", str.equals("auxiliary.tracks.map"));
            byte b = bArr[1];
            ArrayList arrayList = new ArrayList();
            while (i < b) {
                arrayList.add(Integer.valueOf(bArr[i + 2]));
                i++;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            i8.D(sb2, arrayList.iterator(), ",");
            string = sb2.toString();
        } else {
            String str4 = qz1.a;
            int length4 = bArr.length;
            sb = new StringBuilder(length4 + length4);
            while (i < bArr.length) {
                sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i] & 15, 16));
                i++;
            }
            string = sb.toString();
        }
        return ec.o(new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(string).length()), "mdta: key=", str, ", value=", string);
    }
}
