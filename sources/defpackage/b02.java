package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b02 implements j22 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ b02(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[Catch: JSONException -> 0x0063, TryCatch #0 {JSONException -> 0x0063, blocks: (B:5:0x000f, B:7:0x0019, B:9:0x0021, B:15:0x0047, B:16:0x0052, B:18:0x0056), top: B:46:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[Catch: JSONException -> 0x0063, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0063, blocks: (B:5:0x000f, B:7:0x0019, B:9:0x0021, B:15:0x0047, B:16:0x0052, B:18:0x0056), top: B:46:0x000f }] */
    @Override // defpackage.j22
    public final void b(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        String str;
        int i = this.a;
        Object obj2 = this.c;
        boolean z = false;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                rj1 rj1Var = (rj1) obj;
                if (((Boolean) uy0.a.u()).booleanValue()) {
                    Bundle bundle = new Bundle();
                    zb3 zb3Var = vc3.C.c;
                    String className = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) obj4).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                            className = runningTaskInfo.topActivity.getClassName();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    bundle.putString("activity", className);
                    Bundle bundle2 = new Bundle();
                    kb3 kb3Var = (kb3) obj2;
                    bundle2.putInt("width", kb3Var.j);
                    bundle2.putInt("height", kb3Var.g);
                    bundle.putBundle("size", bundle2);
                    ArrayList arrayList = (ArrayList) obj3;
                    if (!arrayList.isEmpty()) {
                        bundle.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    rj1Var.a.putBundle("view_hierarchy", bundle);
                    break;
                }
                break;
            default:
                try {
                    JSONObject jSONObjectG0 = w40.G0("pii", (JSONObject) obj);
                    w2 w2Var = (w2) obj4;
                    if (w2Var != null) {
                        String str2 = w2Var.a;
                        if (TextUtils.isEmpty(str2)) {
                            str = (String) obj2;
                            if (str != null) {
                                jSONObjectG0.put("pdid", str);
                                jSONObjectG0.put("pdidtype", "ssaid");
                            }
                        } else {
                            jSONObjectG0.put("rdid", str2);
                            jSONObjectG0.put("is_lat", w2Var.b);
                            jSONObjectG0.put("idtype", "adid");
                            je0 je0Var = (je0) obj3;
                            long j = je0Var.f;
                            String str3 = (String) je0Var.g;
                            if (str3 != null && j > 0) {
                                z = true;
                            }
                            if (z) {
                                jSONObjectG0.put("paidv1_id_android_3p", str3);
                                jSONObjectG0.put("paidv1_creation_time_android_3p", j);
                            }
                        }
                    } else {
                        str = (String) obj2;
                        if (str != null) {
                            jSONObjectG0.put("pdid", str);
                            jSONObjectG0.put("pdidtype", "ssaid");
                        }
                    }
                } catch (JSONException e) {
                    jn.w("Failed putting Ad ID.", e);
                    return;
                }
                break;
        }
    }
}
