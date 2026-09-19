package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import com.extremestudios.musicmanevo.PlayerActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dalvik.system.DexClassLoader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements Runnable {
    public final /* synthetic */ int f;
    public final Object g;

    public q7(w90 w90Var, e3 e3Var) {
        this.f = 14;
        this.g = e3Var;
    }

    private final void a() {
        xt0 xt0Var = (xt0) this.g;
        synchronized (xt0Var.h) {
            if (xt0Var.i.get() && xt0Var.j) {
                xt0Var.i.set(false);
                jn.F("App went background");
                ArrayList arrayList = xt0Var.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((yt0) obj).T(false);
                    } catch (Exception e) {
                        jn.P("", e);
                    }
                }
            } else {
                jn.F("App is still foreground");
            }
        }
    }

    private final void b() {
        um0 um0Var = (um0) this.g;
        synchronized (um0Var) {
            try {
                qk qkVar = (qk) um0Var.h;
                if (qkVar.f) {
                    nt0 nt0Var = (nt0) qkVar.g;
                    byte[] bArr = (byte[]) um0Var.g;
                    lt0 lt0Var = (lt0) nt0Var;
                    Parcel parcelU = lt0Var.U();
                    parcelU.writeByteArray(bArr);
                    lt0Var.K0(parcelU, 5);
                    lt0 lt0Var2 = (lt0) ((nt0) qkVar.g);
                    Parcel parcelU2 = lt0Var2.U();
                    parcelU2.writeInt(0);
                    lt0Var2.K0(parcelU2, 6);
                    nt0 nt0Var2 = (nt0) qkVar.g;
                    int i = um0Var.f;
                    lt0 lt0Var3 = (lt0) nt0Var2;
                    Parcel parcelU3 = lt0Var3.U();
                    parcelU3.writeInt(i);
                    lt0Var3.K0(parcelU3, 7);
                    lt0 lt0Var4 = (lt0) ((nt0) qkVar.g);
                    Parcel parcelU4 = lt0Var4.U();
                    parcelU4.writeIntArray(null);
                    lt0Var4.K0(parcelU4, 4);
                    lt0 lt0Var5 = (lt0) ((nt0) qkVar.g);
                    lt0Var5.K0(lt0Var5.U(), 3);
                }
            } catch (RemoteException e) {
                jn.H("Clearcut log failed", e);
            }
        }
    }

    private final void c() {
        LinkedHashMap linkedHashMap;
        mx0 mx0Var = (mx0) this.g;
        mx0Var.getClass();
        while (true) {
            try {
                sx0 sx0Var = (sx0) ((ArrayBlockingQueue) mx0Var.b).take();
                z61 z61VarB = sx0Var.b();
                if (!TextUtils.isEmpty((String) z61VarB.g)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) mx0Var.c;
                    synchronized (sx0Var.c) {
                        vc3.C.h.a();
                        linkedHashMap = sx0Var.b;
                    }
                    mx0Var.d(mx0Var.b(linkedHashMap2, linkedHashMap), z61VarB);
                }
            } catch (InterruptedException e) {
                jn.V("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        r1 r1Var;
        boolean zBooleanValue;
        String strA;
        boolean z = false;
        switch (this.f) {
            case 0:
                gp gpVar = (gp) this.g;
                yf yfVar = gpVar.h;
                p7 p7Var = gpVar.f;
                if (gpVar.t) {
                    if (gpVar.r) {
                        gpVar.r = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        p7Var.e = jCurrentAnimationTimeMillis;
                        p7Var.g = -1L;
                        p7Var.f = jCurrentAnimationTimeMillis;
                        p7Var.h = 0.5f;
                    }
                    if ((p7Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > p7Var.g + ((long) p7Var.i)) || !gpVar.e()) {
                        gpVar.t = false;
                        return;
                    }
                    if (gpVar.s) {
                        gpVar.s = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        yfVar.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (p7Var.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = p7Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - p7Var.f;
                    p7Var.f = jCurrentAnimationTimeMillis2;
                    gpVar.v.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * p7Var.d));
                    WeakHashMap weakHashMap = w60.a;
                    yfVar.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((s70) this.g).g;
                int i = bottomSheetBehavior.C;
                if (i != 2 || i == 0) {
                    return;
                }
                bottomSheetBehavior.C = 0;
                return;
            case 2:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 3:
                df dfVar = (df) this.g;
                dfVar.X.onDismiss(dfVar.f0);
                return;
            case 4:
                yf yfVar2 = (yf) this.g;
                yfVar2.q = null;
                yfVar2.drawableStateChanged();
                return;
            case 5:
                ((xj) this.g).x(true);
                return;
            case 6:
                synchronized (((bt) this.g).a) {
                    obj = ((bt) this.g).f;
                    ((bt) this.g).f = bt.k;
                    break;
                }
                bt btVar = (bt) this.g;
                bt.a("setValue");
                btVar.g++;
                btVar.e = obj;
                btVar.c(null);
                return;
            case 7:
                PlayerActivity playerActivity = (PlayerActivity) this.g;
                MediaPlayer mediaPlayer = xs.a;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    if (xs.w) {
                        if (mediaPlayer.getCurrentPosition() >= xs.v) {
                            mediaPlayer.seekTo(xs.u);
                        } else {
                            int currentPosition = mediaPlayer.getCurrentPosition();
                            int i2 = xs.u;
                            if (currentPosition < i2) {
                                mediaPlayer.seekTo(i2);
                            }
                        }
                    }
                    SeekBar seekBar = playerActivity.E;
                    if (seekBar == null) {
                        jn.k("seekBar");
                        throw null;
                    }
                    seekBar.setProgress(mediaPlayer.getCurrentPosition());
                    TextView textView = playerActivity.F;
                    if (textView == null) {
                        jn.k("currentTimeTv");
                        throw null;
                    }
                    textView.setText(PlayerActivity.r(mediaPlayer.getCurrentPosition()));
                }
                playerActivity.W.postDelayed(this, 1000L);
                return;
            case 8:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.g;
                if (searchView$SearchAutoComplete.k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.k = false;
                    return;
                }
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.g).f;
                if (actionMenuView == null || (r1Var = actionMenuView.y) == null) {
                    return;
                }
                r1Var.l();
                return;
            case 10:
                Worker worker = (Worker) this.g;
                try {
                    worker.k.i(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.k.j(th);
                    return;
                }
            case 11:
                ((z90) this.g).e();
                return;
            case 12:
                t3 t3Var = ((z90) ((kc2) this.g).g).g;
                t3Var.c(t3Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 13:
                ((la0) this.g).m.a(new db(4));
                return;
            case 14:
                throw null;
            case 15:
                t33 t33Var = (t33) this.g;
                Thread.currentThread();
                t33Var.getClass();
                t33Var.m1();
                return;
            case 16:
                ((cc0) this.g).m--;
                return;
            case 17:
                uc0 uc0Var = (uc0) this.g;
                if (uc0Var.m) {
                    uc0Var.h.finish();
                    return;
                }
                return;
            case 18:
                tq0 tq0Var = (tq0) this.g;
                synchronized (tq0Var.t) {
                    if (tq0Var.u) {
                        return;
                    }
                    tq0Var.u = true;
                    try {
                        tq0Var.l();
                        break;
                    } catch (Exception e3) {
                        ((tq0) this.g).k.c(2023, -1L, e3);
                    }
                    tq0 tq0Var2 = (tq0) this.g;
                    synchronized (tq0Var2.t) {
                        tq0Var2.u = false;
                        break;
                    }
                    return;
                }
            case 19:
                uq0 uq0Var = (uq0) this.g;
                if (uq0Var.b != null) {
                    return;
                }
                synchronized (uq0.c) {
                    if (uq0Var.b != null) {
                        return;
                    }
                    try {
                        zBooleanValue = ((Boolean) lx0.L2.u()).booleanValue();
                        break;
                    } catch (IllegalStateException unused) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        try {
                            uq0.d = hb2.a(((uq0) this.g).a.a, "ADSHIELD");
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    z = zBooleanValue;
                    ((uq0) this.g).b = Boolean.valueOf(z);
                    uq0.c.open();
                    return;
                }
            case 20:
                ((rr0) this.g).c();
                return;
            case zw0.zzm /* 21 */:
                is0 is0Var = (is0) this.g;
                is0Var.getClass();
                try {
                    nr0 nr0Var = is0Var.a;
                    DexClassLoader dexClassLoader = nr0Var.c;
                    byte[] bArr = nr0Var.e;
                    String str = is0Var.b;
                    nr0Var.d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(gm.m(str, bArr), "UTF-8"));
                    if (clsLoadClass != null) {
                        byte[] bArr2 = nr0Var.e;
                        String str2 = is0Var.c;
                        is0Var.a.d.getClass();
                        is0Var.d = clsLoadClass.getMethod(new String(gm.m(str2, bArr2), "UTF-8"), is0Var.e);
                    }
                    break;
                } catch (er0 | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused3) {
                } finally {
                    is0Var.f.countDown();
                }
                return;
            case 22:
                ((rt0) this.g).d(3);
                return;
            case 23:
                a();
                return;
            case 24:
                ((es0) this.g).w();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                wx0 wx0Var = (wx0) this.g;
                Context context = wx0Var.c;
                if (wx0Var.f != null || context == null || (strA = nd.a(context)) == null || strA.equals(context.getPackageName())) {
                    return;
                }
                wx0Var.a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context.bindService(intent, wx0Var, 33);
                return;
            case 28:
                ((ay0) this.g).d();
                return;
            default:
                vb vbVar = (vb) this.g;
                if (((vu0) vbVar.f) == null) {
                    return;
                }
                ((vu0) vbVar.f).o();
                Binder.flushPendingCommands();
                return;
        }
    }

    public /* synthetic */ q7(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
