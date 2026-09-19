package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s10 {
    public static final /* synthetic */ int a = 0;

    static {
        Object rxVar;
        Object rxVar2;
        Exception exc = new Exception();
        String simpleName = s90.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            rxVar = ac.class.getCanonicalName();
        } catch (Throwable th) {
            rxVar = new rx(th);
        }
        if (sx.a(rxVar) != null) {
            rxVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            rxVar2 = s10.class.getCanonicalName();
        } catch (Throwable th2) {
            rxVar2 = new rx(th2);
        }
        if (sx.a(rxVar2) != null) {
            rxVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
