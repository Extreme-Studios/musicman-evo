package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t9 {
    public static final t9 c = new t9();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap map, s9 s9Var, eo eoVar, Class cls) {
        eo eoVar2 = (eo) map.get(s9Var);
        if (eoVar2 == null || eoVar == eoVar2) {
            if (eoVar2 == null) {
                map.put(s9Var, eoVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + s9Var.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + eoVar2 + ", new value " + eoVar);
    }

    public final r9 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            r9 r9VarA = (r9) map2.get(superclass);
            if (r9VarA == null) {
                r9VarA = a(superclass, null);
            }
            map.putAll(r9VarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            r9 r9VarA2 = (r9) map2.get(cls2);
            if (r9VarA2 == null) {
                r9VarA2 = a(cls2, null);
            }
            for (Map.Entry entry : r9VarA2.b.entrySet()) {
                b(map, (s9) entry.getKey(), (eo) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            yu yuVar = (yu) method.getAnnotation(yu.class);
            if (yuVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!mo.class.isAssignableFrom(parameterTypes[0])) {
                        j7.p("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                eo eoVarValue = yuVar.value();
                if (parameterTypes.length > 1) {
                    if (!eo.class.isAssignableFrom(parameterTypes[1])) {
                        j7.p("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (eoVarValue != eo.ON_ANY) {
                        j7.p("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    j7.p("cannot have more than 2 params");
                    return null;
                }
                b(map, new s9(i, method), eoVarValue, cls);
                z = true;
            }
        }
        r9 r9Var = new r9(map);
        map2.put(cls, r9Var);
        this.b.put(cls, Boolean.valueOf(z));
        return r9Var;
    }
}
