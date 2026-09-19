package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d6 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public d6() {
        this.c = new long[10];
        this.d = new Object[10];
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new nx());
    }

    public void b(Typeface typeface) {
        int i;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = h6.a(typeface, i, (this.b & 2) != 0);
        }
        i6 i6Var = (i6) this.d;
        WeakReference weakReference = (WeakReference) this.c;
        if (i6Var.b) {
            i6Var.m = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i3 = i6Var.a;
                if (zIsAttachedToWindow) {
                    textView.post(new e6(textView, typeface, i3, i2));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }

    public synchronized void c() {
        try {
            hb2 hb2Var = (hb2) this.d;
            if (hb2Var.b) {
                jb2 jb2Var = hb2Var.a;
                jb2Var.u0((byte[]) this.c);
                jb2Var.z(this.a);
                jb2Var.A(this.b);
                jb2Var.H2();
                jb2Var.b();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }

    public synchronized void d(long j, Object obj) {
        try {
            int i = this.b;
            if (i > 0) {
                if (j <= ((long[]) this.c)[((this.a + i) - 1) % ((Object[]) this.d).length]) {
                    synchronized (this) {
                        this.a = 0;
                        this.b = 0;
                        Arrays.fill((Object[]) this.d, (Object) null);
                    }
                }
            }
            int length = ((Object[]) this.d).length;
            if (this.b >= length) {
                int i2 = length + length;
                long[] jArr = new long[i2];
                Object[] objArr = new Object[i2];
                int i3 = this.a;
                int i4 = length - i3;
                System.arraycopy((long[]) this.c, i3, jArr, 0, i4);
                System.arraycopy((Object[]) this.d, this.a, objArr, 0, i4);
                int i5 = this.a;
                if (i5 > 0) {
                    System.arraycopy((long[]) this.c, 0, jArr, i4, i5);
                    System.arraycopy((Object[]) this.d, 0, objArr, i4, this.a);
                }
                this.c = jArr;
                this.d = objArr;
                this.a = 0;
            }
            int i6 = this.a;
            int i7 = this.b;
            Object[] objArr2 = (Object[]) this.d;
            int length2 = (i6 + i7) % objArr2.length;
            ((long[]) this.c)[length2] = j;
            objArr2[length2] = obj;
            this.b = i7 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int e() {
        return this.b;
    }

    public synchronized Object f() {
        if (this.b == 0) {
            return null;
        }
        return h();
    }

    public synchronized Object g(long j) {
        Object objH;
        objH = null;
        while (this.b > 0 && j - ((long[]) this.c)[this.a] >= 0) {
            objH = h();
        }
        return objH;
    }

    public Object h() {
        hn.M(this.b > 0);
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = (i + 1) % objArr.length;
        this.b--;
        return obj;
    }

    public d6(int i, ArrayList arrayList, int i2, zm0 zm0Var) {
        this.a = i;
        this.c = arrayList;
        this.b = i2;
        this.d = zm0Var;
    }

    public /* synthetic */ d6(hb2 hb2Var, byte[] bArr) {
        this.d = hb2Var;
        this.c = bArr;
    }
}
