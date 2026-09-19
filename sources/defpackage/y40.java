package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class y40 extends w40 {
    public static Constructor A = null;
    public static Method B = null;
    public static Method C = null;
    public static boolean D = false;
    public static Class z;

    public static boolean a1(Object obj, String str, int i, boolean z2) throws NoSuchMethodException {
        b1();
        try {
            return ((Boolean) B.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void b1() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (D) {
            return;
        }
        D = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        A = constructor;
        z = cls;
        B = method2;
        C = method;
    }

    @Override // defpackage.w40
    public Typeface f(Context context, aj ajVar, Resources resources, int i) throws NoSuchMethodException {
        b1();
        try {
            Object objNewInstance = A.newInstance(null);
            for (bj bjVar : ajVar.a) {
                File fileG = s90.g(context);
                if (fileG == null) {
                    return null;
                }
                try {
                    if (!s90.a(fileG, resources, bjVar.f)) {
                        return null;
                    }
                    if (!a1(objNewInstance, fileG.getPath(), bjVar.b, bjVar.c)) {
                        return null;
                    }
                    fileG.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileG.delete();
                }
            }
            b1();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) z, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) C.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.w40
    public Typeface g(Context context, dj[] djVarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (djVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(w40.q(djVarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileG = s90.g(context);
                        if (fileG == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (s90.b(fileG, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileG.getPath());
                                    fileG.delete();
                                } else {
                                    fileG.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileG.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
