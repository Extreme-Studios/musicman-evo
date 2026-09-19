package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class od1 implements cd1 {
    public nb1 b;
    public nb1 c;
    public nb1 d;
    public nb1 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public od1() {
        ByteBuffer byteBuffer = cd1.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        nb1 nb1Var = nb1.e;
        this.d = nb1Var;
        this.e = nb1Var;
        this.b = nb1Var;
        this.c = nb1Var;
    }

    @Override // defpackage.cd1
    public final nb1 a(nb1 nb1Var) {
        this.d = nb1Var;
        this.e = k(nb1Var);
        return h() ? this.e : nb1.e;
    }

    @Override // defpackage.cd1
    public final void b() {
        this.h = true;
        l();
    }

    @Override // defpackage.cd1
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = cd1.a;
        return byteBuffer;
    }

    @Override // defpackage.cd1
    public boolean e() {
        return this.h && this.g == cd1.a;
    }

    @Override // defpackage.cd1
    public final void g() {
        ByteBuffer byteBuffer = cd1.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        nb1 nb1Var = nb1.e;
        this.d = nb1Var;
        this.e = nb1Var;
        this.b = nb1Var;
        this.c = nb1Var;
        n();
    }

    @Override // defpackage.cd1
    public boolean h() {
        return this.e != nb1.e;
    }

    public final ByteBuffer i(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.cd1
    public final void j() {
        this.g = cd1.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        m();
    }

    public abstract nb1 k(nb1 nb1Var);

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }
}
