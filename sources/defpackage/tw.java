package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tw {
    public static final uw a;

    static {
        uw uwVar = null;
        try {
            uwVar = (uw) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uwVar == null) {
            uwVar = new uw();
        }
        a = uwVar;
    }

    public static q9 a(Class cls) {
        a.getClass();
        return new q9(cls);
    }
}
