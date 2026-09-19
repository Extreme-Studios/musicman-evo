package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class e3 implements ie0, hn2, zb, t73 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;

    public e3(int i, int i2, int[] iArr) {
        sl2 sl2Var;
        this.f = i2;
        switch (i2) {
            case 6:
                int length = iArr.length;
                if (length == 4) {
                    this.g = i;
                    this.h = iArr;
                    return;
                }
                StringBuilder sb = new StringBuilder(g72.a(length, 44));
                String strA = wn0.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k");
                String strA2 = wn0.a("a0CvvBEaN339T0zNlXk=");
                sb.append(strA);
                sb.append(length);
                sb.append(strA2);
                throw new IllegalArgumentException(sb.toString());
            default:
                this.g = i;
                if (iArr != null) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                    sl2Var = new sl2(iArrCopyOf, iArrCopyOf.length);
                } else {
                    sl2Var = sl2.h;
                }
                this.h = sl2Var;
                return;
        }
    }

    public f3 a() {
        a3 a3Var = (a3) this.h;
        f3 f3Var = new f3(a3Var.a, this.g);
        View view = a3Var.e;
        d3 d3Var = f3Var.k;
        if (view != null) {
            d3Var.n = view;
        } else {
            CharSequence charSequence = a3Var.d;
            if (charSequence != null) {
                d3Var.d = charSequence;
                TextView textView = d3Var.l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = a3Var.c;
            if (drawable != null) {
                d3Var.j = drawable;
                ImageView imageView = d3Var.k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    d3Var.k.setImageDrawable(drawable);
                }
            }
        }
        if (a3Var.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) a3Var.b.inflate(d3Var.r, (ViewGroup) null);
            int i = a3Var.i ? d3Var.s : d3Var.t;
            ListAdapter c3Var = a3Var.g;
            if (c3Var == null) {
                c3Var = new c3(a3Var.a, i, R.id.text1, null);
            }
            d3Var.o = c3Var;
            d3Var.p = a3Var.j;
            if (a3Var.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new z2(a3Var, d3Var));
            }
            if (a3Var.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            d3Var.e = alertController$RecycleListView;
        }
        f3Var.setCancelable(true);
        f3Var.setCanceledOnTouchOutside(true);
        f3Var.setOnCancelListener(null);
        f3Var.setOnDismissListener(null);
        sr srVar = a3Var.f;
        if (srVar != null) {
            f3Var.setOnKeyListener(srVar);
        }
        return f3Var;
    }

    @Override // defpackage.t73
    public /* synthetic */ void b(JsonWriter jsonWriter) throws IOException {
        int i = this.g;
        Map map = (Map) this.h;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        o83.d(jsonWriter, map);
        jsonWriter.endObject();
    }

    @Override // defpackage.zb
    public Object c(ve3 ve3Var) {
        if (!ve3Var.c()) {
            return Boolean.FALSE;
        }
        int i = this.g;
        wo0 wo0Var = (wo0) this.h;
        hb2 hb2Var = (hb2) ve3Var.b();
        byte[] bArrB = ((zo0) wo0Var.c()).b();
        hb2Var.getClass();
        d6 d6Var = new d6(hb2Var, bArrB);
        d6Var.b = i;
        d6Var.c();
        return Boolean.TRUE;
    }

    public int d(long j) throws go0 {
        long j2;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iE = ec.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 438792350;
        if (j >= 0) {
            j2 = ((long) (this.g + (iE ^ i9))) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.g) {
            throw new go0();
        }
        return (int) j2;
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        switch (this.f) {
            case 9:
                int i = this.g;
                ec.q(vc3.C.k, ((cs1) ((y91) this.h).j).e, ec.a(i));
                break;
            default:
                o52 o52Var = (o52) this.h;
                String str = (String) obj;
                int i2 = this.g;
                x42 x42Var = o52Var.a;
                if (!x42Var.i0) {
                    o52Var.c.b(str, x42Var.x0, o52Var.e, null);
                } else {
                    c82 c82Var = o52Var.d;
                    String str2 = o52Var.b.b;
                    c82Var.getClass();
                    vc3.C.k.getClass();
                    ym0 ym0Var = new ym0(System.currentTimeMillis(), str2, str, i2);
                    bw1 bw1Var = c82Var.a;
                    bw1Var.getClass();
                    bw1Var.a(new z61(bw1Var, 20, ym0Var));
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String f(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        int i2 = this.g;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new ts(5));
        int i3 = 0;
        while (i3 < strArrSplit.length) {
            String[] strArrE = dq.E(strArrSplit[i3], r3);
            if (strArrE.length != 0) {
                int length = strArrE.length;
                if (length < 6) {
                    a23.z(i2, a23.G(strArrE, length), a23.B(strArrE, r3, length), length, priorityQueue);
                } else {
                    long jG = a23.G(strArrE, 6);
                    a23.z(i2, jG, a23.B(strArrE, r3, 6), 6, priorityQueue);
                    int i4 = 1;
                    while (true) {
                        int length2 = strArrE.length;
                        if (i4 < length2 - 5) {
                            int iT = dq.t(strArrE[i4 - 1]);
                            int iT2 = dq.t(strArrE[i4 + 5]);
                            String[] strArr = strArrSplit;
                            long j = iT;
                            int i5 = i4;
                            String strB = a23.B(strArrE, i5, 6);
                            jG = (((((long) iT2) + 2147483647L) % 1073807359) + (((((jG + 1073807359) - ((((j + 2147483647L) % 1073807359) * a23.D(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            a23.z(i2, jG, strB, length2, priorityQueue);
                            i4 = i5 + 1;
                            strArrSplit = strArr;
                            byteArrayOutputStream = byteArrayOutputStream;
                        }
                    }
                }
            }
            i3++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r3 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((du0) this.h).R1(((eu0) it.next()).b));
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
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toString();
        } catch (IOException e3) {
            jn.P("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }

    public void g() {
        int i = this.g;
        long[] jArr = (long[]) this.h;
        if (i == jArr.length) {
            this.h = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.h;
        int i2 = this.g;
        this.g = i2 + 1;
        jArr2[i2] = 0;
    }

    public void h(int i, byte[] bArr) {
        int i2 = 1777080124;
        int i3 = 1777080124;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        int i16 = 0;
        char c2 = 0;
        char c3 = 0;
        while (true) {
            if (i3 == 719824015) {
                int i17 = (-235787554) + i3;
                i3 += 799411447;
                if (i4 == i5) {
                    i3 = i17;
                }
            } else if (i3 == 1519235462) {
                int[] iArr = (int[]) this.h;
                i6 += (((i7 << i8) ^ (i7 >>> i9)) + i7) ^ (i4 + iArr[i4 & i10]);
                i4 += i11;
                i7 += (iArr[(i4 >>> i12) & i10] + i4) ^ (((i6 << i8) ^ (i6 >>> i9)) + i6);
                i3 -= 799411447;
            } else {
                if (i3 != i2) {
                    bArr[0] = (byte) (i6 >> i13);
                    bArr[1] = (byte) ((((i6 >> i14) & i15) << i13) >> i13);
                    bArr[c] = (byte) ((((i6 >> i16) & i15) << i13) >> i13);
                    bArr[i10] = (byte) (((i6 & i15) << i13) >> i13);
                    bArr[i8] = (byte) (i7 >> i13);
                    bArr[i9] = (byte) ((((i7 >> i14) & i15) << i13) >> i13);
                    bArr[c2] = (byte) ((((i7 >> i16) & i15) << i13) >> i13);
                    bArr[c3] = (byte) (((i7 & i15) << i13) >> i13);
                    return;
                }
                i6 = this.g;
                i3 -= 1057256109;
                i10 = 3;
                i15 = 255;
                c3 = 7;
                c2 = 6;
                c = 2;
                i13 = 24;
                i12 = 11;
                i11 = 1340169305;
                i9 = 5;
                i8 = 4;
                i5 = -64255200;
                i14 = 16;
                i16 = 8;
                i7 = i;
                i4 = 0;
            }
            i2 = 1777080124;
        }
    }

    public long j(fd0 fd0Var) {
        int i;
        cw1 cw1Var = (cw1) this.h;
        int i2 = 0;
        fd0Var.B(cw1Var.a, 0, 1, false);
        int i3 = cw1Var.a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        fd0Var.B(cw1Var.a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (cw1Var.a[i2] & 255) + (i6 << 8);
        }
        this.g += i;
        return i6;
    }

    public void k(qo0 qo0Var) {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iE = ec.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = this.g;
        if (i9 >= ((i8 % 937558955) ^ iE)) {
            throw new ho0();
        }
        ArrayList arrayList = (ArrayList) this.h;
        if (i9 == arrayList.size()) {
            arrayList.add(qo0Var);
        } else {
            arrayList.set(this.g, qo0Var);
        }
        this.g++;
    }

    public void l(long[] jArr) {
        int i = this.g;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.h;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.h = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, (long[]) this.h, this.g, length);
        this.g = i2;
    }

    public long m(int i) {
        if (i >= 0 && i < this.g) {
            return ((long[]) this.h)[i];
        }
        int i2 = this.g;
        throw new IndexOutOfBoundsException(ec.l(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i2).length()), "Invalid index ", i, ", size is ", i2));
    }

    public qo0 n() {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iE = ec.e((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i9 = i8 % 459541652;
        int i10 = this.g;
        if (i10 <= 0) {
            throw new go0();
        }
        int i11 = i9 ^ iE;
        ArrayList arrayList = (ArrayList) this.h;
        qo0 qo0Var = (qo0) arrayList.get(i10 + i11);
        arrayList.set(this.g + i11, null);
        this.g += i11;
        return qo0Var;
    }

    public qo0 o(long j) {
        return (qo0) ((ArrayList) this.h).get(d(j));
    }

    public String toString() {
        switch (this.f) {
            case 5:
                sl2 sl2Var = (sl2) this.h;
                ArrayList arrayList = new ArrayList(sl2Var.g);
                int i = 0;
                while (true) {
                    int i2 = sl2Var.g;
                    if (i >= i2) {
                        String strX = qz1.x(this.g);
                        String string = arrayList.toString();
                        StringBuilder sb = new StringBuilder(ec.f(string, strX.length() + 37, 1));
                        sb.append("UnsupportedBrands{major=");
                        sb.append(strX);
                        sb.append(", compatible=");
                        sb.append(string);
                        sb.append("}");
                        return sb.toString();
                    }
                    hn.P(i, i2);
                    arrayList.add(qz1.x(sl2Var.f[i]));
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 9:
                break;
            default:
                vc3.C.h.d("BufferingUrlPinger.attributionReportingManager", th);
                break;
        }
    }

    private final void i(Throwable th) {
    }

    public /* synthetic */ e3(int i, Serializable serializable) {
        this.f = i;
        this.g = 0;
        this.h = serializable;
    }

    public /* synthetic */ e3(int i, Map map) {
        this.f = 14;
        this.g = i;
        this.h = map;
    }

    public e3(boolean z, boolean z2, boolean z3) {
        this.f = 15;
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.g = i;
    }

    public e3(int i, int i2) {
        this.f = i2;
        switch (i2) {
            case 10:
                this.h = new long[i];
                break;
            default:
                this.h = new du0(5);
                this.g = i;
                break;
        }
    }

    public /* synthetic */ e3(int i, int i2, Object obj) {
        this.f = i2;
        this.g = i;
        this.h = obj;
    }

    public e3(db dbVar, int i) {
        this.f = 3;
        dq.f(dbVar);
        this.h = dbVar;
        this.g = i;
    }

    public e3(byte[] bArr) {
        this.f = 2;
        Objects.requireNonNull(bArr);
        this.h = null;
        this.g = 1;
    }

    public e3(Context context) {
        this.f = 0;
        int iG = f3.g(context, 0);
        this.h = new a3(new ContextThemeWrapper(context, f3.g(context, iG)));
        this.g = iG;
    }

    public e3(int i, byte b) {
        this.f = i;
        switch (i) {
            case 4:
                this.h = new cw1(8);
                break;
            case 7:
                this.h = new ArrayList();
                this.g = 0;
                break;
            default:
                this.g = 1;
                this.h = Collections.singletonList(null);
                break;
        }
    }
}
