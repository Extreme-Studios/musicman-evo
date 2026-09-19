package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mu extends zn implements cl {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu(int i, Object obj) {
        super(1);
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.cl
    public final Object h(Object obj) {
        Object obj2 = null;
        switch (this.g) {
            case 0:
                ((r7) obj).getClass();
                uu uuVar = (uu) this.h;
                f7 f7Var = uuVar.b;
                ListIterator listIterator = f7Var.listIterator(f7Var.h);
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((qj) objPrevious).a) {
                        obj2 = objPrevious;
                        uuVar.c = (qj) obj2;
                        return k50.a;
                    }
                }
                uuVar.c = (qj) obj2;
                return k50.a;
            case 1:
                ((r7) obj).getClass();
                f7 f7Var2 = ((uu) this.h).b;
                ListIterator listIterator2 = f7Var2.listIterator(f7Var2.h);
                while (listIterator2.hasPrevious()) {
                    Object objPrevious2 = listIterator2.previous();
                    if (((qj) objPrevious2).a) {
                        obj2 = objPrevious2;
                        return k50.a;
                    }
                }
                return k50.a;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((i10) this.h).e.c(new fi(th));
                }
                Object obj3 = i10.i;
                i10 i10Var = (i10) this.h;
                synchronized (obj3) {
                    i10.h.remove(i10Var.b().getAbsolutePath());
                }
                return k50.a;
        }
    }
}
