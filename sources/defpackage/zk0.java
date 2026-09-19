package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zk0 {
    public boolean a;
    public int b;
    public boolean c;
    public int d;
    public Object e;

    public zk0(int i) {
        this.b = i;
        byte[] bArr = new byte[131];
        this.e = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.a = false;
        this.c = false;
    }

    public void b(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.b += i;
    }

    public void c(int i) {
        hn.M(!this.a);
        boolean z = i == this.b;
        this.a = z;
        if (z) {
            this.d = 3;
            this.c = false;
        }
    }

    public void d(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.d + i3;
            if (length < i4) {
                this.e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, (byte[]) this.e, this.d, i3);
            this.d += i3;
        }
    }

    public boolean e(int i) {
        if (!this.a) {
            return false;
        }
        this.d -= i;
        this.a = false;
        this.c = true;
        return true;
    }

    public zk0(u83 u83Var) {
        this.e = u83Var;
    }
}
