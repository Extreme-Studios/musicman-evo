package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class qg {
    public static final Object j = new Object();
    public static volatile qg k;
    public final ReentrantReadWriteLock a;
    public final n7 b;
    public volatile int c;
    public final Handler d;
    public final mg e;
    public final pg f;
    public final ig g;
    public final int h;
    public final fe i;

    public qg(ui uiVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        pg pgVar = uiVar.a;
        this.f = pgVar;
        int i = uiVar.b;
        this.h = i;
        this.i = uiVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new n7(0);
        this.g = new ig(12);
        mg mgVar = new mg(this);
        this.e = mgVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                pgVar.a(new lg(mgVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static qg a() {
        qg qgVar;
        synchronized (j) {
            try {
                qgVar = k;
                if (!(qgVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qgVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            j7.e("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            mg mgVar = this.e;
            qg qgVar = mgVar.a;
            try {
                qgVar.f.a(new lg(mgVar));
            } catch (Throwable th) {
                qgVar.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new og(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0097, B:57:0x00a7, B:58:0x00aa), top: B:107:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0097, B:57:0x00a7, B:58:0x00aa), top: B:107:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    public final CharSequence e(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        f50[] f50VarArr;
        int i5;
        int spanStart;
        boolean z = false;
        n50 n50Var = null;
        if (!(b() == 1)) {
            j7.e("Not initialized yet");
            return null;
        }
        if (i < 0) {
            j7.p("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            j7.p("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            j7.p("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            j7.p("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            j7.p("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        r52 r52Var = this.e.b;
        r52Var.getClass();
        boolean z2 = charSequence instanceof m10;
        if (z2) {
            ((m10) charSequence).a();
        }
        if (z2) {
            n50Var = new n50((Spannable) charSequence);
            if (n50Var != null) {
                for (f50 f50Var : f50VarArr) {
                    spanStart = n50Var.g.getSpanStart(f50Var);
                    int spanEnd = n50Var.g.getSpanEnd(f50Var);
                    if (spanStart != i2) {
                        n50Var.removeSpan(f50Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((m10) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    n50Var = new n50((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((m10) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, f50.class) <= i2) {
                n50Var = new n50();
                n50Var.f = false;
                n50Var.g = new SpannableString(charSequence);
            }
            if (n50Var != null && (f50VarArr = (f50[]) n50Var.g.getSpans(i, i2, f50.class)) != null && f50VarArr.length > 0) {
                while (i5 < r2) {
                    spanStart = n50Var.g.getSpanStart(f50Var);
                    int spanEnd2 = n50Var.g.getSpanEnd(f50Var);
                    if (spanStart != i2) {
                        n50Var.removeSpan(f50Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4 || i3 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        n50 n50Var2 = (n50) r52Var.w(charSequence2, i3, i4, Integer.MAX_VALUE, false, new us2(n50Var, (ig) r52Var.g, 3, z));
                        if (n50Var2 != null) {
                            Spannable spannable = n50Var2.g;
                            if (z2) {
                                ((m10) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z2) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z2) {
                            throw th;
                        }
                        ((m10) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((m10) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((m10) charSequence2).b();
        throw th;
    }

    public final void f(ng ngVar) {
        a23.f(ngVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new og(Arrays.asList(ngVar), this.c, (Throwable) null));
            } else {
                this.b.add(ngVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
