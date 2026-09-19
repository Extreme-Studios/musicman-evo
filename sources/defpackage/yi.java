package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class yi {
    public static final aq a = new aq(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final q00 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ex(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new q00(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((si) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static xi b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceG;
        aq aqVar = a;
        jn.d("getFontSync");
        try {
            Typeface typeface = (Typeface) aqVar.a(str);
            if (typeface != null) {
                xi xiVar = new xi(typeface);
                Trace.endSection();
                return xiVar;
            }
            try {
                e3 e3VarA = ri.a(context, list);
                List list2 = (List) e3VarA.h;
                int i3 = e3VarA.g;
                if (i3 == 0) {
                    dj[] djVarArr = (dj[]) list2.get(0);
                    if (djVarArr == null || djVarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = djVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = djVarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    xi xiVar2 = new xi(i2);
                    Trace.endSection();
                    return xiVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    dj[] djVarArr2 = (dj[]) list2.get(0);
                    w40 w40Var = x40.a;
                    jn.d("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceG = x40.a.g(context, djVarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    w40 w40Var2 = x40.a;
                    jn.d("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceG = x40.a.h(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceG == null) {
                    xi xiVar3 = new xi(-3);
                    Trace.endSection();
                    return xiVar3;
                }
                aqVar.b(str, typefaceG);
                xi xiVar4 = new xi(typefaceG);
                Trace.endSection();
                return xiVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                xi xiVar5 = new xi(-1);
                Trace.endSection();
                return xiVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
