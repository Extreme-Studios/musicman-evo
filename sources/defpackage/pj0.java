package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class pj0 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public kj0 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final String a() {
        return this.t;
    }

    public final String b() {
        return this.u;
    }

    public final void c(pj0 pj0Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (pj0Var != null) {
            if (!this.c && pj0Var.c) {
                this.b = pj0Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = pj0Var.h;
            }
            if (this.i == -1) {
                this.i = pj0Var.i;
            }
            if (this.a == null && (str = pj0Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = pj0Var.f;
            }
            if (this.g == -1) {
                this.g = pj0Var.g;
            }
            if (this.n == -1) {
                this.n = pj0Var.n;
            }
            if (this.o == null && (alignment2 = pj0Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = pj0Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = pj0Var.q;
            }
            if (this.j == -1) {
                this.j = pj0Var.j;
                this.k = pj0Var.k;
            }
            if (this.r == null) {
                this.r = pj0Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = pj0Var.s;
            }
            if (this.t == null) {
                this.t = pj0Var.t;
            }
            if (this.u == null) {
                this.u = pj0Var.u;
            }
            if (!this.e && pj0Var.e) {
                this.d = pj0Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = pj0Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }

    public final String d() {
        return this.l;
    }
}
