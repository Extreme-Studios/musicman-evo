package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Base64;
import android.view.ContentInfo;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qb implements pb, rb {
    public final /* synthetic */ int f;
    public Object g;
    public int h;
    public int i;
    public Parcelable j;
    public Object k;

    public qb(qb qbVar) {
        this.f = 1;
        ClipData clipData = (ClipData) qbVar.g;
        clipData.getClass();
        this.g = clipData;
        int i = qbVar.h;
        if (i < 0) {
            Locale locale = Locale.US;
            j7.p("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            j7.p("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.h = i;
        int i2 = qbVar.i;
        if ((i2 & 1) == i2) {
            this.i = i2;
            this.j = (Uri) qbVar.j;
            this.k = (Bundle) qbVar.k;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    public JSONObject a() throws JSONException {
        String strN;
        String strEncodeToString;
        int i = this.i;
        int i2 = this.h;
        ApplicationInfo applicationInfo = (ApplicationInfo) this.j;
        Context context = (Context) this.g;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = applicationInfo.packageName;
            e32 e32Var = zb3.l;
            Context context2 = q90.a(context).f;
            jSONObject.put("name", context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", applicationInfo.packageName);
        zb3 zb3Var = vc3.C.c;
        Drawable applicationIcon = null;
        try {
            strN = zb3.N(context);
        } catch (RemoteException unused2) {
            strN = null;
        }
        jSONObject.put("adMobAppId", strN);
        if (((String) this.k).isEmpty()) {
            try {
                iv ivVarA = q90.a(context);
                String str2 = applicationInfo.packageName;
                Context context3 = ivVarA.f;
                ApplicationInfo applicationInfo2 = context3.getPackageManager().getApplicationInfo(str2, 0);
                context3.getPackageManager().getApplicationLabel(applicationInfo2);
                applicationIcon = context3.getPackageManager().getApplicationIcon(applicationInfo2);
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (applicationIcon == null) {
                strEncodeToString = "";
            } else {
                applicationIcon.setBounds(0, 0, i2, i);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.k = strEncodeToString;
        }
        if (!((String) this.k).isEmpty()) {
            jSONObject.put("icon", (String) this.k);
            jSONObject.put("iconWidthPx", i2);
            jSONObject.put("iconHeightPx", i);
        }
        return jSONObject;
    }

    @Override // defpackage.pb
    public sb build() {
        return new sb(new qb(this));
    }

    @Override // defpackage.rb
    public ClipData d() {
        return (ClipData) this.g;
    }

    @Override // defpackage.rb
    public int e() {
        return this.i;
    }

    @Override // defpackage.rb
    public ContentInfo f() {
        return null;
    }

    @Override // defpackage.pb
    public void g(Uri uri) {
        this.j = uri;
    }

    @Override // defpackage.rb
    public int h() {
        return this.h;
    }

    @Override // defpackage.pb
    public void j(int i) {
        this.i = i;
    }

    @Override // defpackage.pb
    public void setExtras(Bundle bundle) {
        this.k = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f) {
            case 1:
                Uri uri = (Uri) this.j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.g).getDescription());
                sb.append(", source=");
                int i = this.h;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return ec.m(sb, ((Bundle) this.k) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public qb(Context context) {
        this.f = 2;
        this.k = "";
        this.g = context;
        this.j = context.getApplicationInfo();
        ix0 ix0Var = lx0.V9;
        tu0 tu0Var = tu0.e;
        this.h = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        this.i = ((Integer) tu0Var.c.a(lx0.W9)).intValue();
    }

    public /* synthetic */ qb() {
        this.f = 0;
    }
}
