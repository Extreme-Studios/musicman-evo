package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.extremestudios.musicmanevo.R;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hw1 extends jt0 implements k61 {
    public static final /* synthetic */ int m = 0;
    public final HashMap f;
    public final Context g;
    public final es1 h;
    public final id3 i;
    public final bw1 j;
    public String k;
    public String l;

    public hw1(Context context, bw1 bw1Var, id3 id3Var, es1 es1Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f = new HashMap();
        this.g = context;
        this.h = es1Var;
        this.i = id3Var;
        this.j = bw1Var;
    }

    public static void C3(Context context, es1 es1Var, bw1 bw1Var, String str, String str2, Map map) {
        String strC;
        vc3 vc3Var = vc3.C;
        String str3 = true != vc3Var.h.i(context) ? "offline" : "online";
        if (es1Var != null) {
            us2 us2VarA = es1Var.a();
            us2VarA.s("gqi", str);
            us2VarA.s("action", str2);
            us2VarA.s("device_connectivity", str3);
            vc3Var.k.getClass();
            us2VarA.s("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                us2VarA.s((String) entry.getKey(), (String) entry.getValue());
            }
            strC = ((es1) us2VarA.h).a.f.c((ConcurrentHashMap) us2VarA.g);
        } else {
            strC = "";
        }
        String str4 = strC;
        vc3.C.k.getClass();
        ym0 ym0Var = new ym0(System.currentTimeMillis(), str, str4, 2);
        bw1Var.getClass();
        bw1Var.a(new z61(bw1Var, 20, ym0Var));
    }

    public static final PendingIntent D3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, eh2.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, eh2.a(intent, 201326592), 201326592);
    }

    public static String I3(String str, int i) {
        Resources resourcesC = vc3.C.h.c();
        if (resourcesC == null) {
            return str;
        }
        try {
            return resourcesC.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) kt0.b(parcel, Intent.CREATOR);
                kt0.f(parcel);
                t0(intent);
                break;
            case 2:
                rm rmVarO0 = ju.O0(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                kt0.f(parcel);
                E2(rmVarO0, new jb0(string, string2, ""));
                break;
            case 3:
                e();
                break;
            case 4:
                rm rmVarO1 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                R(rmVarO1);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                rm rmVarO2 = ju.O0(parcel.readStrongBinder());
                kt0.f(parcel);
                V2(strArrCreateStringArray, iArrCreateIntArray, rmVarO2);
                break;
            case 6:
                rm rmVarO3 = ju.O0(parcel.readStrongBinder());
                jb0 jb0Var = (jb0) kt0.b(parcel, jb0.CREATOR);
                kt0.f(parcel);
                E2(rmVarO3, jb0Var);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void B3(String str, ro1 ro1Var) {
        a01 a01Var;
        String string = "";
        String strF = ro1Var.f();
        String strA = ro1Var.a();
        if (TextUtils.isEmpty(strF)) {
            strF = strA != null ? strA : "";
        }
        a01 a01VarB = ro1Var.b();
        if (a01VarB != null) {
            try {
                string = a01VarB.h().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (ro1Var) {
            a01Var = ro1Var.s;
        }
        Drawable drawable = null;
        if (a01Var != null) {
            try {
                rm rmVarC = a01Var.c();
                if (rmVarC != null) {
                    drawable = (Drawable) ju.Z0(rmVarC);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f.put(str, new zv1(strF, string, drawable));
    }

    @Override // defpackage.k61
    public final void E2(rm rmVar, jb0 jb0Var) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ju.Z0(rmVar);
        String str2 = jb0Var.f;
        String str3 = jb0Var.g;
        String str4 = jb0Var.h;
        zv1 zv1Var = (zv1) this.f.get(this.k);
        String str5 = zv1Var == null ? "" : zv1Var.a;
        vc3.C.f.g(context);
        PendingIntent pendingIntentD3 = D3(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentD4 = D3(context, "offline_notification_dismissed", str3, str2);
        gu guVar = new gu(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str5)) {
            guVar.e = gu.c(I3("You are back online! Let's pick up where we left off", R.string.offline_notification_title));
        } else {
            guVar.e = gu.c(String.format(I3("You are back online! Continue learning about %s", R.string.offline_notification_title_with_advertiser), str5));
        }
        guVar.d(16, true);
        Notification notification = guVar.p;
        notification.deleteIntent = pendingIntentD4;
        guVar.g = pendingIntentD3;
        notification.icon = context.getApplicationInfo().icon;
        ix0 ix0Var = lx0.f9;
        tu0 tu0Var = tu0.e;
        guVar.i = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        if (!((Boolean) tu0Var.c.a(lx0.h9)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                guVar.e(bitmapDecodeStream);
                eu euVar = new eu();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.b = bitmapDecodeStream;
                euVar.h = iconCompat;
                euVar.i = null;
                euVar.j = true;
                guVar.f(euVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, guVar.b());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        H3(str3, str, map);
    }

    public final void E3(Activity activity, nf0 nf0Var) {
        zb3 zb3Var = vc3.C.c;
        if (new iu(activity).a.areNotificationsEnabled()) {
            F3();
            G3(activity, nf0Var);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        vk2 vk2Var = vk2.l;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            H3(this.k, "asnpdi", vk2Var);
            return;
        }
        AlertDialog.Builder builderK = zb3.k(activity);
        int i2 = 1;
        builderK.setTitle(I3("Allow app to send you notifications?", R.string.notifications_permission_title)).setPositiveButton(I3("Allow", R.string.notifications_permission_confirm), new gw1(this, activity, nf0Var, 0)).setNegativeButton(I3("Don't allow", R.string.notifications_permission_decline), new ew1(this, nf0Var, i2)).setOnCancelListener(new fw1(this, nf0Var, i2));
        builderK.create().show();
        H3(this.k, "rtsdi", vk2Var);
    }

    public final void F3() {
        boolean zZzg;
        boolean zZze;
        try {
            zb3 zb3Var = vc3.C.c;
            Context context = this.g;
            u21 u21VarB = zb3.b(context);
            ju juVar = new ju(context);
            String str = this.l;
            String str2 = this.k;
            zv1 zv1Var = (zv1) this.f.get(str2);
            zZzg = u21VarB.zzg(juVar, new jb0(str, str2, zv1Var == null ? "" : zv1Var.b));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = u21VarB.zze(new ju(context), this.l, this.k);
                } catch (RemoteException e) {
                    e = e;
                    jn.P("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.j.b(this.k);
        H3(this.k, "offline_notification_worker_not_scheduled", vk2.l);
    }

    public final void G3(Activity activity, nf0 nf0Var) {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        AlertDialog.Builder onCancelListener = zb3.k(activity).setOnCancelListener(new af(4, nf0Var));
        Resources resourcesC = vc3Var.h.c();
        if (resourcesC == null) {
            layout = null;
        } else {
            try {
                layout = resourcesC.getLayout(R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
                layout = null;
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(I3("Thanks for your interest.\nWe will share more once you're back online.", R.string.offline_dialog_text));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.k;
                HashMap map = this.f;
                zv1 zv1Var = (zv1) map.get(str);
                String str2 = zv1Var == null ? "" : zv1Var.a;
                if (!TextUtils.isEmpty(str2)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(str2);
                }
                zv1 zv1Var2 = (zv1) map.get(this.k);
                Drawable drawable = zv1Var2 != null ? zv1Var2.c : null;
                if (drawable != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(I3("Thanks for your interest.\nWe will share more once you're back online.", R.string.offline_dialog_text));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new dw1(this, alertDialogCreate, timer, nf0Var), 3000L);
    }

    public final void H3(String str, String str2, Map map) {
        C3(this.g, this.h, this.j, str, str2, map);
    }

    @Override // defpackage.k61
    public final void R(rm rmVar) {
        aw1 aw1Var = (aw1) ju.Z0(rmVar);
        Activity activity = aw1Var.a;
        nf0 nf0Var = aw1Var.b;
        this.k = aw1Var.c;
        this.l = aw1Var.d;
        if (((Boolean) tu0.e.c.a(lx0.e9)).booleanValue()) {
            E3(activity, nf0Var);
            return;
        }
        H3(this.k, "dialog_impression", vk2.l);
        zb3 zb3Var = vc3.C.c;
        AlertDialog.Builder builderK = zb3.k(activity);
        int i = 0;
        builderK.setTitle(I3("Open ad when you're back online.", R.string.offline_opt_in_title)).setMessage(I3("We'll send you a notification with a link to the advertiser site.", R.string.offline_opt_in_message)).setPositiveButton(I3("OK", R.string.offline_opt_in_confirm), new gw1(this, activity, nf0Var, 1)).setNegativeButton(I3("No thanks", R.string.offline_opt_in_decline), new ew1(this, nf0Var, i)).setOnCancelListener(new fw1(this, nf0Var, i));
        builderK.create().show();
    }

    @Override // defpackage.k61
    public final void V2(String[] strArr, int[] iArr, rm rmVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                aw1 aw1Var = (aw1) ju.Z0(rmVar);
                Activity activity = aw1Var.a;
                nf0 nf0Var = aw1Var.b;
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    F3();
                    G3(activity, nf0Var);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (nf0Var != null) {
                        nf0Var.y();
                    }
                }
                H3(this.k, "asnpdc", map);
                return;
            }
        }
    }

    @Override // defpackage.k61
    public final void e() {
        this.j.a(new zy1(28, this.i));
    }

    @Override // defpackage.k61
    public final void t0(Intent intent) {
        bw1 bw1Var = this.j;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                sa1 sa1Var = vc3.C.h;
                Context context = this.g;
                boolean zI = sa1Var.i(context);
                HashMap map = new HashMap();
                char c = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zI ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                H3(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = bw1Var.getWritableDatabase();
                    if (c == 1) {
                        bw1Var.g.execute(new ib(writableDatabase, stringExtra2, this.i, 14));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e) {
                    jn.M("Failed to get writable offline buffering database: ".concat(e.toString()));
                }
            }
        }
    }
}
