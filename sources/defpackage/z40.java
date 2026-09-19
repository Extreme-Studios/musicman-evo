package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z40 extends w40 {
    public static final Constructor A;
    public static final Method B;
    public static final Method C;
    public static final Class z;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        A = constructor;
        z = cls;
        B = method2;
        C = method;
    }

    public static boolean a1(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z2) {
        try {
            return ((Boolean) B.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface b1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) z, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) C.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.w40
    public final Typeface f(Context context, aj ajVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = A.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (bj bjVar : ajVar.a) {
                int i2 = bjVar.f;
                File fileG = s90.g(context);
                if (fileG != null) {
                    try {
                        if (s90.a(fileG, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileG);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileG.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileG.delete();
                        }
                        if (map != null && a1(objNewInstance, map, bjVar.e, bjVar.b, bjVar.c)) {
                        }
                    } catch (Throwable th3) {
                        fileG.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return b1(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.w40
    public final Typeface g(Context context, dj[] djVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = A.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            q00 q00Var = new q00(0);
            for (dj djVar : djVarArr) {
                Uri uri = djVar.a;
                ByteBuffer byteBufferI = (ByteBuffer) q00Var.get(uri);
                if (byteBufferI == null) {
                    byteBufferI = s90.i(context, uri);
                    q00Var.put(uri, byteBufferI);
                }
                if (byteBufferI != null && a1(objNewInstance, byteBufferI, djVar.b, djVar.c, djVar.d)) {
                }
            }
            Typeface typefaceB1 = b1(objNewInstance);
            if (typefaceB1 != null) {
                return Typeface.create(typefaceB1, i);
            }
        }
        return null;
    }
}
