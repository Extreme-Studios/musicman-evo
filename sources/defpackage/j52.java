package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j52 implements n62, xu, hi2, hp1 {
    public final Object f;

    public j52(byte[] bArr) {
        this.f = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.f)[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = (byte[]) this.f;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
    }

    public int a() {
        int iOptInt = ((JSONObject) this.f).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // defpackage.n62
    public /* synthetic */ Object b(Object obj) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            ((a72) this.f).a();
        }
        return obj;
    }

    @Override // defpackage.xu
    public /* synthetic */ void c(Exception exc) {
        y91 y91Var = (y91) this.f;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((ga2) y91Var.i).c(2025, -1L, exc);
    }

    public void d(int i, Object obj, j33 j33Var) {
        u13 u13Var = (u13) this.f;
        f13 f13Var = (f13) obj;
        u13Var.f(i, 2);
        u13Var.v(f13Var.d(j33Var));
        j33Var.f(f13Var, this);
    }

    @Override // defpackage.hi2
    public /* synthetic */ Iterator f(bz1 bz1Var, CharSequence charSequence) {
        return new di2(charSequence, (vh2) this.f, 0);
    }

    @Override // defpackage.hp1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo6b(Object obj) {
        ((r93) obj).j((q43) this.f);
    }

    public j52(u13 u13Var) {
        Charset charset = m23.a;
        if (u13Var == null) {
            j7.l("output");
            throw null;
        }
        this.f = u13Var;
        u13Var.a = this;
    }

    public /* synthetic */ j52(Object obj) {
        this.f = obj;
    }
}
