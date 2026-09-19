package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s63 implements r63, o63 {
    public static final s63 b = new s63(null);
    public final Object a;

    public s63(Object obj) {
        this.a = obj;
    }

    public static s63 a(Object obj) {
        if (obj != null) {
            return new s63(obj);
        }
        j7.l("instance cannot be null");
        return null;
    }

    public static s63 b(Object obj) {
        return obj == null ? b : new s63(obj);
    }

    @Override // defpackage.v63
    public final Object c() {
        return this.a;
    }
}
