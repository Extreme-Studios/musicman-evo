package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class y52 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final l62 d = new l62();

    public y52(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                return;
            }
            d62 d62Var = (d62) linkedList.getFirst();
            vc3.C.k.getClass();
            if (System.currentTimeMillis() - d62Var.d < this.c) {
                return;
            }
            l62 l62Var = this.d;
            l62Var.f++;
            l62Var.b.g++;
            linkedList.remove();
        }
    }
}
