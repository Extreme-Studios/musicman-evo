package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes.dex */
public abstract class z4 {
    public Object a;
    public Object b;

    public z4() {
        cb1 cb1Var = new cb1();
        this.a = cb1Var;
        this.b = new AtomicInteger(0);
        zy1 zy1Var = new zy1(18, this);
        cb1Var.a(new in2(cb1Var, 0, zy1Var), za1.g);
    }

    public void c() {
        y4 y4Var = (y4) this.a;
        if (y4Var != null) {
            try {
                ((c5) this.b).p.unregisterReceiver(y4Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof o20)) {
            return menuItem;
        }
        o20 o20Var = (o20) menuItem;
        if (((q00) this.b) == null) {
            this.b = new q00(0);
        }
        MenuItem menuItem2 = (MenuItem) ((q00) this.b).get(o20Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        yr yrVar = new yr((Context) this.a, o20Var);
        ((q00) this.b).put(o20Var, yrVar);
        return yrVar;
    }

    public abstract Object g(IBinder iBinder);

    public Object h(Context context) throws xw {
        Context contextCreatePackageContext;
        if (this.b == null) {
            dq.f(context);
            int i = fm.c;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new xw("Could not get remote context.");
            }
            try {
                this.b = g((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new xw("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new xw("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new xw("Could not instantiate creator.", e3);
            }
        }
        return this.b;
    }

    public abstract void i();

    public void j() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((y4) this.a) == null) {
            this.a = new y4(0, this);
        }
        ((c5) this.b).p.registerReceiver((y4) this.a, intentFilterD);
    }

    public abstract uq2 k(int i, byte[] bArr);

    public byte[] l(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            j7.r("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((uq2) this.b).b(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i3 = iRemaining % 16;
            int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i2);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i4);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(hn.w(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            uq2 uq2Var = (uq2) this.a;
            uq2Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != uq2Var.a()) {
                int iA = uq2Var.a();
                throw new GeneralSecurityException(ec.j(new StringBuilder(String.valueOf(iA).length() + 36), "The nonce length (in bytes) must be ", iA));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i5 = iRemaining2 / 64;
            for (int i6 = 0; i6 < i5 + 1; i6++) {
                ByteBuffer byteBufferB = uq2Var.b(uq2Var.b + i6, bArr);
                if (i6 == i5) {
                    na1.D(byteBufferAllocate, byteBuffer, byteBufferB, iRemaining2 % 64);
                } else {
                    na1.D(byteBufferAllocate, byteBuffer, byteBufferB, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void m(eb1 eb1Var, db1 db1Var) {
        vg2 vg2Var = new vg2(this, eb1Var, db1Var, 11);
        cb1 cb1Var = (cb1) this.a;
        cb1Var.a(new in2(cb1Var, 0, vg2Var), za1.g);
    }

    public void n() {
        ((cb1) this.a).c(new Exception());
    }

    public void o(String str, Throwable th) {
        ((cb1) this.a).c(th);
        if (((Boolean) tu0.e.c.a(lx0.g8)).booleanValue()) {
            vc3.C.h.e(str, th);
        }
    }

    public z4(us2 us2Var, h73 h73Var) {
        this.b = us2Var;
        this.a = h73Var;
    }

    public /* synthetic */ z4(Object obj) {
        this.a = obj;
    }

    public z4(c5 c5Var) {
        this.b = c5Var;
    }
}
