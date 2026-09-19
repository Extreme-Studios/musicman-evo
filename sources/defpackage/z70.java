package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class z70 {
    public static final a80 a;

    static {
        a80 igVar;
        try {
            igVar = new zx(8, (WebViewProviderFactoryBoundaryInterface) i8.f(WebViewProviderFactoryBoundaryInterface.class, ej1.h()));
        } catch (ClassNotFoundException unused) {
            igVar = new ig(2);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        a = igVar;
    }
}
