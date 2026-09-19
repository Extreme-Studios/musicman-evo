package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x40 {
    public static final w40 a;
    public static final aq b;
    public static Paint c;

    static {
        jn.d("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new d50();
        } else if (i >= 29) {
            a = new c50();
        } else if (i >= 28) {
            a = new b50();
        } else if (i >= 26) {
            a = new a50();
        } else {
            Method method = z40.B;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new z40();
            } else {
                a = new y40();
            }
        }
        b = new aq(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, zi ziVar, Resources resources, int i, String str, int i2, int i3, d6 d6Var) {
        Typeface typefaceF;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 1;
        if (ziVar instanceof cj) {
            cj cjVar = (cj) ziVar;
            String str2 = cjVar.d;
            typefaceF = null;
            boolean z = false;
            Object[] objArr = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = cjVar.a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                int i6 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilderB = null;
                                while (true) {
                                    if (i6 < arrayList.size()) {
                                        si siVar = (si) arrayList.get(i6);
                                        if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(siVar.f)) {
                                            customFallbackBuilderB.setSystemFallback(siVar.e);
                                        } else {
                                            String str3 = siVar.e;
                                            String str4 = siVar.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + siVar.e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    try {
                                                        k0.k();
                                                        k0.v();
                                                        fontFamilyBuild = k0.f(ob.f(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                } else {
                                                    fontFamilyBuild = k0.t(fontD).build();
                                                }
                                                if (customFallbackBuilderB == null) {
                                                    customFallbackBuilderB = k0.b(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderB.addCustomFallback(fontFamilyBuild);
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderB.build();
                                    break;
                                }
                            }
                            if (c(((si) arrayList.get(i5)).e) != null) {
                                i5++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((si) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                new Handler(Looper.getMainLooper()).post(new m4(d6Var, 1, typefaceBuild));
                b.b(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr2 = cjVar.c == 0;
            int i7 = cjVar.b;
            Handler handler = new Handler(Looper.getMainLooper());
            zy1 zy1Var = new zy1(7, z);
            zy1Var.g = d6Var;
            ArrayList arrayList2 = cjVar.a;
            fx fxVar = new fx(handler, 0);
            z61 z61Var = new z61(zy1Var, 3, fxVar);
            int i8 = 5;
            if (objArr2 != true) {
                String strA = yi.a(i3, arrayList2);
                Typeface typeface = (Typeface) yi.a.a(strA);
                if (typeface != null) {
                    fxVar.execute(new in2(zy1Var, i8, typeface));
                    typefaceF = typeface;
                } else {
                    wi wiVar = new wi(objArr == true ? 1 : 0, z61Var);
                    synchronized (yi.c) {
                        try {
                            q00 q00Var = yi.d;
                            ArrayList arrayList3 = (ArrayList) q00Var.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(wiVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(wiVar);
                                q00Var.put(strA, arrayList4);
                                vi viVar = new vi(strA, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = yi.b;
                                wi wiVar2 = new wi(i4, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                ib ibVar = new ib(2);
                                ibVar.g = viVar;
                                ibVar.h = wiVar2;
                                ibVar.i = handler2;
                                threadPoolExecutor.execute(ibVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    j7.p("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                si siVar2 = (si) arrayList2.get(0);
                aq aqVar = yi.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{siVar2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = yi.a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) yi.a.a(strA2);
                if (typeface2 != null) {
                    fxVar.execute(new in2(zy1Var, i8, typeface2));
                    typefaceF = typeface2;
                } else if (i7 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{siVar2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    xi xiVarB = yi.b(strA2, context, Collections.unmodifiableList(arrayList6), i3);
                    z61Var.x(xiVarB);
                    typefaceF = xiVarB.a;
                } else {
                    try {
                        try {
                            try {
                                xi xiVar = (xi) yi.b.submit(new vi(strA2, context, siVar2, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                                z61Var.x(xiVar);
                                typefaceF = xiVar.a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((fx) z61Var.h).execute(new t8((zy1) z61Var.g, -3));
                    }
                }
            }
        } else {
            typefaceF = a.f(context, (aj) ziVar, resources, i3);
            if (typefaceF != null) {
                new Handler(Looper.getMainLooper()).post(new m4(d6Var, 1, typefaceF));
            } else {
                d6Var.a();
            }
        }
        if (typefaceF != null) {
            b.b(b(resources, i, str, i2, i3), typefaceF);
        }
        return typefaceF;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
