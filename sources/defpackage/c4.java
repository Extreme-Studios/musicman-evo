package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c4 extends xa implements f4 {
    public c5 B;
    public boolean y;
    public boolean z;
    public final oc2 w = new oc2(3, new mj(this));
    public final oo x = new oo(this);
    public boolean A = true;

    public c4() {
        ((z61) this.j.h).y("android:support:lifecycle", new pa(1, this));
        final int i = 0;
        g(new mb(this) { // from class: lj
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // defpackage.mb
            public final void accept(Object obj) {
                int i2 = i;
                c4 c4Var = this.b;
                switch (i2) {
                    case 0:
                        c4Var.w.n();
                        break;
                    default:
                        c4Var.w.n();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.r.add(new mb(this) { // from class: lj
            public final /* synthetic */ c4 b;

            {
                this.b = this;
            }

            @Override // defpackage.mb
            public final void accept(Object obj) {
                int i3 = i2;
                c4 c4Var = this.b;
                switch (i3) {
                    case 0:
                        c4Var.w.n();
                        break;
                    default:
                        c4Var.w.n();
                        break;
                }
            }
        });
        h(new qa(this, 1));
        ((z61) this.j.h).y("androidx:appcompat", new a4(this));
        h(new b4(this));
    }

    public static boolean l(xj xjVar) {
        boolean zL = false;
        for (kj kjVar : xjVar.c.k()) {
            if (kjVar != null) {
                mj mjVar = kjVar.x;
                if ((mjVar == null ? null : mjVar.G) != null) {
                    zL |= l(kjVar.g());
                }
                if (kjVar.Q.c.compareTo(fo.i) >= 0) {
                    oo ooVar = kjVar.Q;
                    ooVar.c("setCurrentState");
                    ooVar.e(fo.h);
                    zL = true;
                }
            }
        }
        return zL;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        c5 c5Var = (c5) k();
        c5Var.v();
        ((ViewGroup) c5Var.E.findViewById(R.id.content)).addView(view, layoutParams);
        c5Var.r.a(c5Var.q.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x0208  */
    /* JADX WARN: Code duplicated, block: B:127:0x020c  */
    /* JADX WARN: Code duplicated, block: B:138:0x022d A[Catch: all -> 0x0221, TRY_LEAVE, TryCatch #0 {, blocks: (B:129:0x020f, B:131:0x0213, B:137:0x022b, B:138:0x022d, B:140:0x0231, B:146:0x0241, B:145:0x0238, B:136:0x0224), top: B:156:0x020f, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        xb xbVar;
        Resources.Theme theme;
        Method method;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        c5 c5Var = (c5) k();
        c5Var.S = true;
        int i37 = c5Var.W;
        if (i37 == -100) {
            i37 = p4.g;
        }
        int iB = c5Var.B(context, i37);
        if (p4.b(context) && p4.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p4.n) {
                    try {
                        qp qpVar = p4.h;
                        if (qpVar == null) {
                            if (p4.i == null) {
                                p4.i = qp.a(yd.k(context));
                            }
                            if (!p4.i.a.a.isEmpty()) {
                                p4.h = p4.i;
                            }
                        } else if (!qpVar.equals(p4.i)) {
                            qp qpVar2 = p4.h;
                            p4.i = qpVar2;
                            yd.j(context, qpVar2.a.a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!p4.k) {
                p4.f.execute(new j4(context, 0));
            }
        }
        qp qpVarO = c5.o(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(c5.s(context, iB, qpVarO, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof xb) {
                    try {
                        ((xb) context).a(c5.s(context, iB, qpVarO, null, false));
                    } catch (IllegalStateException unused2) {
                        if (c5.n0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    t4.a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i25 = configuration.uiMode & 15;
                                    i26 = configuration2.uiMode & 15;
                                    if (i25 != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode & 48;
                                    i28 = configuration2.uiMode & 48;
                                    if (i27 != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationS = c5.s(context, iB, qpVarO, configuration3, true);
                            xbVar = new xb(context, com.extremestudios.musicmanevo.R.style.Theme_AppCompat_Empty);
                            xbVar.a(configurationS);
                            try {
                                if (context.getTheme() != null) {
                                    theme = xbVar.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        z6.c(theme);
                                    } else {
                                        synchronized (rs0.k) {
                                            if (rs0.m) {
                                                method = rs0.l;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    rs0.l = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                                }
                                                rs0.m = true;
                                                method = rs0.l;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                                        rs0.l = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = xbVar;
                        }
                    }
                } else if (c5.n0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            t4.a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i25 = configuration.uiMode & 15;
                            i26 = configuration2.uiMode & 15;
                            if (i25 != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode & 48;
                            i28 = configuration2.uiMode & 48;
                            if (i27 != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationS2 = c5.s(context, iB, qpVarO, configuration3, true);
                    xbVar = new xb(context, com.extremestudios.musicmanevo.R.style.Theme_AppCompat_Empty);
                    xbVar.a(configurationS2);
                    if (context.getTheme() != null) {
                        theme = xbVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            z6.c(theme);
                        } else {
                            synchronized (rs0.k) {
                                if (rs0.m) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    rs0.l = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    rs0.m = true;
                                    method = rs0.l;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = rs0.l;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = xbVar;
                }
            }
        } else if (context instanceof xb) {
            ((xb) context).a(c5.s(context, iB, qpVarO, null, false));
        } else if (c5.n0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    t4.a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i25 = configuration.uiMode & 15;
                    i26 = configuration2.uiMode & 15;
                    if (i25 != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode & 48;
                    i28 = configuration2.uiMode & 48;
                    if (i27 != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationS3 = c5.s(context, iB, qpVarO, configuration3, true);
            xbVar = new xb(context, com.extremestudios.musicmanevo.R.style.Theme_AppCompat_Empty);
            xbVar.a(configurationS3);
            if (context.getTheme() != null) {
                theme = xbVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    z6.c(theme);
                } else {
                    synchronized (rs0.k) {
                        if (rs0.m) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            rs0.l = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            rs0.m = true;
                            method = rs0.l;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = rs0.l;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = xbVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((c5) k()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.wa, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((c5) k()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.y);
        printWriter.print(" mResumed=");
        printWriter.print(this.z);
        printWriter.print(" mStopped=");
        printWriter.print(this.A);
        if (getApplication() != null) {
            n10 n10Var = ((op) new s70(d(), op.c).l(op.class)).b;
            if (n10Var.h > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (n10Var.h > 0) {
                    if (n10Var.g[0] != null) {
                        j7.j();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(n10Var.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((mj) this.w.g).F.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        c5 c5Var = (c5) k();
        c5Var.v();
        return c5Var.q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        c5 c5Var = (c5) k();
        if (c5Var.t == null) {
            c5Var.z();
            g80 g80Var = c5Var.s;
            c5Var.t = new n20(g80Var != null ? g80Var.b() : c5Var.p);
        }
        return c5Var.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = z50.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        c5 c5Var = (c5) k();
        if (c5Var.s != null) {
            c5Var.z();
            c5Var.s.getClass();
            c5Var.A(0);
        }
    }

    public final p4 k() {
        if (this.B == null) {
            n4 n4Var = p4.f;
            this.B = new c5(this, null, this, this);
        }
        return this.B;
    }

    public final void m() {
        super.onDestroy();
        ((mj) this.w.g).F.k();
        this.x.d(eo.ON_DESTROY);
    }

    public final boolean n(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((mj) this.w.g).F.i();
        }
        return false;
    }

    public final void o() {
        super.onPostResume();
        this.x.d(eo.ON_RESUME);
        xj xjVar = ((mj) this.w.g).F;
        xjVar.E = false;
        xjVar.F = false;
        xjVar.L.g = false;
        xjVar.t(7);
    }

    @Override // defpackage.xa, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.w.n();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.xa, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c5 c5Var = (c5) k();
        if (c5Var.J && c5Var.D) {
            c5Var.z();
            g80 g80Var = c5Var.s;
            if (g80Var != null) {
                g80Var.e(g80Var.a.getResources().getBoolean(com.extremestudios.musicmanevo.R.bool.abc_action_bar_embed_tabs));
            }
        }
        e5 e5VarA = e5.a();
        Context context = c5Var.p;
        synchronized (e5VarA) {
            kx kxVar = e5VarA.a;
            synchronized (kxVar) {
                zp zpVar = (zp) kxVar.b.get(context);
                if (zpVar != null) {
                    int i = zpVar.i;
                    Object[] objArr = zpVar.h;
                    for (int i2 = 0; i2 < i; i2++) {
                        objArr[i2] = null;
                    }
                    zpVar.i = 0;
                    zpVar.f = false;
                }
            }
        }
        c5Var.V = new Configuration(c5Var.p.getResources().getConfiguration());
        c5Var.l(false, false);
    }

    @Override // defpackage.xa, defpackage.wa, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.d(eo.ON_CREATE);
        xj xjVar = ((mj) this.w.g).F;
        xjVar.E = false;
        xjVar.F = false;
        xjVar.L.g = false;
        xjVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        nj njVar = (nj) ((mj) this.w.g).F.f.onCreateView(null, str, context, attributeSet);
        return njVar == null ? super.onCreateView(str, context, attributeSet) : njVar;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m();
        k().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.xa, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentT;
        if (!n(i, menuItem)) {
            c5 c5Var = (c5) k();
            c5Var.z();
            g80 g80Var = c5Var.s;
            if (menuItem.getItemId() != 16908332 || g80Var == null || (((i40) g80Var.e).b & 4) == 0 || (intentT = w40.t(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentT)) {
                navigateUpTo(intentT);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentT2 = w40.t(this);
            if (intentT2 == null) {
                intentT2 = w40.t(this);
            }
            if (intentT2 != null) {
                ComponentName component = intentT2.getComponent();
                if (component == null) {
                    component = intentT2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentU = w40.u(this, component);
                    while (intentU != null) {
                        arrayList.add(size, intentU);
                        intentU = w40.u(this, intentU.getComponent());
                    }
                    arrayList.add(intentT2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                j7.e("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.z = false;
        ((mj) this.w.g).F.t(5);
        this.x.d(eo.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((c5) k()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        o();
        c5 c5Var = (c5) k();
        c5Var.z();
        g80 g80Var = c5Var.s;
        if (g80Var != null) {
            g80Var.t = true;
        }
    }

    @Override // defpackage.xa, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.w.n();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        oc2 oc2Var = this.w;
        oc2Var.n();
        super.onResume();
        this.z = true;
        ((mj) oc2Var.g).F.x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        p();
        ((c5) k()).l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.w.n();
    }

    @Override // android.app.Activity
    public void onStop() {
        q();
        c5 c5Var = (c5) k();
        c5Var.z();
        g80 g80Var = c5Var.s;
        if (g80Var != null) {
            g80Var.t = false;
            i70 i70Var = g80Var.s;
            if (i70Var != null) {
                i70Var.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((c5) k()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        oc2 oc2Var = this.w;
        oc2Var.n();
        mj mjVar = (mj) oc2Var.g;
        super.onStart();
        this.A = false;
        if (!this.y) {
            this.y = true;
            xj xjVar = mjVar.F;
            xjVar.E = false;
            xjVar.F = false;
            xjVar.L.g = false;
            xjVar.t(4);
        }
        mjVar.F.x(true);
        this.x.d(eo.ON_START);
        xj xjVar2 = mjVar.F;
        xjVar2.E = false;
        xjVar2.F = false;
        xjVar2.L.g = false;
        xjVar2.t(5);
    }

    public final void q() {
        oc2 oc2Var;
        super.onStop();
        this.A = true;
        do {
            oc2Var = this.w;
        } while (l(((mj) oc2Var.g).F));
        xj xjVar = ((mj) oc2Var.g).F;
        xjVar.F = true;
        xjVar.L.g = true;
        xjVar.t(4);
        this.x.d(eo.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        j();
        k().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((c5) k()).X = i;
    }

    @Override // defpackage.xa, android.app.Activity
    public void setContentView(View view) {
        j();
        k().h(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        k().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        nj njVar = (nj) ((mj) this.w.g).F.f.onCreateView(view, str, context, attributeSet);
        return njVar == null ? super.onCreateView(view, str, context, attributeSet) : njVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
