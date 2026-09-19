package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ju extends x90 implements rm {
    public final Object g;

    public ju(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.g = obj;
    }

    public static rm O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof rm ? (rm) iInterfaceQueryLocalInterface : new qs0(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object Z0(rm rmVar) {
        if (rmVar instanceof ju) {
            return ((ju) rmVar).g;
        }
        IBinder iBinderAsBinder = rmVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            j7.p(ec.h("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
            return null;
        }
        dq.f(field);
        if (field.isAccessible()) {
            j7.p("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
