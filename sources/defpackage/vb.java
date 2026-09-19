package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vb implements hm0 {
    public volatile Object f;
    public final Object g;

    public vb() {
        this.g = new CopyOnWriteArraySet();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x012f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0130  */
    /* JADX WARN: Code duplicated, block: B:35:0x0134  */
    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0145 A[LOOP:1: B:39:0x0142->B:41:0x0145, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hm0
    public km0 d(mm0 mm0Var) throws qm0 {
        o21 o21Var;
        o21 o21Var2;
        String[] strArr;
        String[] strArr2;
        HashMap map;
        Map mapE = mm0Var.e();
        int size = mapE.size();
        String[] strArr3 = new String[size];
        String[] strArr4 = new String[size];
        Object[] objArr = 0;
        int i = 0;
        for (Map.Entry entry : mapE.entrySet()) {
            strArr3[i] = (String) entry.getKey();
            strArr4[i] = (String) entry.getValue();
            i++;
        }
        n21 n21Var = new n21(mm0Var.h, strArr3, strArr4);
        vc3 vc3Var = vc3.C;
        vc3Var.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            cb1 cb1Var = new cb1();
            vg2 vg2Var = new vg2((Object) this, (Object) cb1Var, 10, (boolean) (objArr == true ? 1 : 0));
            zy1 zy1Var = new zy1(this, 14, cb1Var);
            Context context = (Context) this.g;
            Looper looperC = vc3Var.t.c();
            int i2 = x30.b;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f = new vu0(context, looperC, 166, vg2Var, zy1Var);
            ((vu0) this.f).m();
            r21 r21Var = new r21(this, n21Var);
            ya1 ya1Var = za1.a;
            hp hpVarK = na1.K(na1.L(cb1Var, r21Var, ya1Var), ((Integer) tu0.e.c.a(lx0.R4)).intValue(), TimeUnit.MILLISECONDS, za1.d);
            hpVarK.a(new q7(29, this), ya1Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) hpVarK.get();
            vc3Var.k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            jn.p(sb.toString());
            Parcelable.Creator<o21> creator = o21.CREATOR;
            if (parcelFileDescriptor != null) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        int i3 = dataInputStream.readInt();
                        byte[] bArr = new byte[i3];
                        dataInputStream.readFully(bArr, 0, i3);
                        ar.b(dataInputStream);
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.unmarshall(bArr, 0, i3);
                            parcelObtain.setDataPosition(0);
                            o21 o21VarCreateFromParcel = creator.createFromParcel(parcelObtain);
                            parcelObtain.recycle();
                            o21Var = o21VarCreateFromParcel;
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            throw th;
                        }
                    } catch (IOException e) {
                        jn.P("Could not read from parcel file descriptor", e);
                        ar.b(dataInputStream);
                        o21Var = null;
                        o21Var2 = o21Var;
                        if (o21Var2 == null) {
                            return null;
                        }
                        if (o21Var2.f) {
                            throw new qm0(o21Var2.g);
                        }
                        strArr = o21Var2.j;
                        strArr2 = o21Var2.k;
                        if (strArr.length != strArr2.length) {
                            return null;
                        }
                        map = new HashMap();
                        for (int i4 = 0; i4 < strArr.length; i4++) {
                            map.put(strArr[i4], strArr2[i4]);
                        }
                        return new km0(o21Var2.h, o21Var2.i, map, km0.a(map), o21Var2.l);
                    }
                    o21Var2 = o21Var;
                    if (o21Var2 == null) {
                        return null;
                    }
                    if (o21Var2.f) {
                        throw new qm0(o21Var2.g);
                    }
                    strArr = o21Var2.j;
                    strArr2 = o21Var2.k;
                    if (strArr.length != strArr2.length) {
                        return null;
                    }
                    map = new HashMap();
                    while (i4 < strArr.length) {
                        map.put(strArr[i4], strArr2[i4]);
                    }
                    return new km0(o21Var2.h, o21Var2.i, map, km0.a(map), o21Var2.l);
                } catch (Throwable th2) {
                    ar.b(dataInputStream);
                    throw th2;
                }
            }
            jn.M("File descriptor is empty, returning null.");
            o21Var = null;
            o21Var2 = o21Var;
            if (o21Var2 == null) {
                return null;
            }
            if (o21Var2.f) {
                throw new qm0(o21Var2.g);
            }
            strArr = o21Var2.j;
            strArr2 = o21Var2.k;
            if (strArr.length != strArr2.length) {
                return null;
            }
            map = new HashMap();
            while (i4 < strArr.length) {
                map.put(strArr[i4], strArr2[i4]);
            }
            return new km0(o21Var2.h, o21Var2.i, map, km0.a(map), o21Var2.l);
        } catch (InterruptedException | ExecutionException unused) {
            vc3.C.k.getClass();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            jn.p(sb2.toString());
            return null;
        } catch (Throwable th3) {
            vc3.C.k.getClass();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            jn.p(sb3.toString());
            throw th3;
        }
    }

    public vb(Context context) {
        this.g = context;
    }
}
