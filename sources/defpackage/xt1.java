package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.extremestudios.musicmanevo.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends jt0 implements ls1 {
    public final HashMap f;
    public final Context g;
    public final WeakReference h;
    public final rt1 i;
    public final ya1 j;
    public qt1 k;

    public xt1(Context context, WeakReference weakReference, rt1 rt1Var, ya1 ya1Var) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f = new HashMap();
        this.g = context;
        this.h = weakReference;
        this.i = rt1Var;
        this.j = ya1Var;
    }

    public static String F3(Object obj) {
        qx qxVarC;
        lu1 lu1Var;
        if (obj instanceof np) {
            qxVarC = ((np) obj).k;
        } else {
            lu1 lu1VarM = null;
            if (obj instanceof hu0) {
                try {
                    lu1VarM = ((hu0) obj).a.e();
                } catch (RemoteException e) {
                    jn.Z("#007 Could not call remote method.", e);
                }
                qxVarC = new qx(lu1VarM);
            } else if (obj instanceof in) {
                try {
                    n71 n71Var = ((e31) ((in) obj)).c;
                    if (n71Var != null) {
                        lu1VarM = n71Var.M();
                    }
                } catch (RemoteException e2) {
                    jn.Z("#007 Could not call remote method.", e2);
                }
                qxVarC = new qx(lu1VarM);
            } else if (obj instanceof u81) {
                try {
                    l81 l81Var = ((u81) obj).a;
                    if (l81Var != null) {
                        lu1VarM = l81Var.m();
                    }
                } catch (RemoteException e3) {
                    jn.Z("#007 Could not call remote method.", e3);
                }
                qxVarC = new qx(lu1VarM);
            } else if (obj instanceof c91) {
                try {
                    l81 l81Var2 = ((c91) obj).a;
                    if (l81Var2 != null) {
                        lu1VarM = l81Var2.m();
                    }
                } catch (RemoteException e4) {
                    jn.Z("#007 Could not call remote method.", e4);
                }
                qxVarC = new qx(lu1VarM);
            } else if (obj instanceof AdView) {
                qxVarC = ((AdView) obj).getResponseInfo();
            } else {
                if (!(obj instanceof NativeAd)) {
                    return "";
                }
                qxVarC = ((NativeAd) obj).c();
            }
        }
        if (qxVarC == null || (lu1Var = qxVarC.a) == null) {
            return "";
        }
        try {
            return lu1Var.g();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // defpackage.ls1
    public final void A2(String str, rm rmVar, rm rmVar2) {
        Context context = (Context) ju.Z0(rmVar);
        ViewGroup viewGroup = (ViewGroup) ju.Z0(rmVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap map = this.f;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            w40.y0(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            gt gtVar = new gt(context);
            gtVar.setTag("ad_view_tag");
            w40.y0(gtVar, -1, -1);
            viewGroup.addView(gtVar);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            w40.y0(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            gtVar.addView(linearLayout2);
            Resources resourcesC = vc3.C.h.c();
            linearLayout2.addView(w40.t0(context, resourcesC == null ? "Headline" : resourcesC.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String strB = nativeAd.b();
            if (strB == null) {
                strB = "";
            }
            View viewT0 = w40.t0(context, strB, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            gtVar.setHeadlineView(viewT0);
            linearLayout2.addView(viewT0);
            linearLayout2.addView(w40.t0(context, resourcesC == null ? "Body" : resourcesC.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String strA = nativeAd.a();
            if (strA == null) {
                strA = "";
            }
            View viewT1 = w40.t0(context, strA, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            gtVar.setBodyView(viewT1);
            linearLayout2.addView(viewT1);
            linearLayout2.addView(w40.t0(context, resourcesC == null ? "Media View" : resourcesC.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            br brVar = new br(context);
            brVar.setTag("media_view_tag");
            gtVar.setMediaView(brVar);
            linearLayout2.addView(brVar);
            gtVar.setNativeAd(nativeAd);
        }
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        rm rmVarO0 = ju.O0(parcel.readStrongBinder());
        rm rmVarO1 = ju.O0(parcel.readStrongBinder());
        kt0.f(parcel);
        A2(string, rmVarO0, rmVarO1);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void B3(Object obj, String str) {
        this.f.put(str, obj);
        C3(F3(obj));
    }

    public final synchronized void C3(String str) {
        try {
            cb1 cb1VarD = this.k.d(str);
            zx zxVar = new zx(24, this);
            cb1VarD.a(new in2(cb1VarD, 0, zxVar), this.j);
        } catch (NullPointerException e) {
            vc3.C.h.d("OutOfContextTester.setAdAsOutOfContext", e);
            this.i.b();
        }
    }

    public final synchronized void D3(String str) {
        try {
            cb1 cb1VarD = this.k.d(str);
            s70 s70Var = new s70(29, this);
            cb1VarD.a(new in2(cb1VarD, 0, s70Var), this.j);
        } catch (NullPointerException e) {
            vc3.C.h.d("OutOfContextTester.setAdAsShown", e);
            this.i.b();
        }
    }

    public final Context E3() {
        Context context = (Context) this.h.get();
        return context == null ? this.g : context;
    }
}
