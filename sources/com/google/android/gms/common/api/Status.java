package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.db;
import defpackage.ec;
import defpackage.f0;
import defpackage.os0;
import defpackage.s90;
import defpackage.vg2;
import defpackage.zw0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends f0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new os0(0);
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final db i;

    public Status(int i, String str, PendingIntent pendingIntent, db dbVar) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = dbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && s90.d(this.g, status.g) && s90.d(this.h, status.h) && s90.d(this.i, status.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        vg2 vg2Var = new vg2(this);
        String strH = this.g;
        if (strH == null) {
            int i = this.f;
            switch (i) {
                case -1:
                    strH = "SUCCESS_CACHE";
                    break;
                case 0:
                    strH = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strH = ec.h("unknown status code: ", i);
                    break;
                case 2:
                    strH = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strH = "SERVICE_DISABLED";
                    break;
                case 4:
                    strH = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strH = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strH = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strH = "NETWORK_ERROR";
                    break;
                case 8:
                    strH = "INTERNAL_ERROR";
                    break;
                case 10:
                    strH = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strH = "ERROR";
                    break;
                case 14:
                    strH = "INTERRUPTED";
                    break;
                case 15:
                    strH = "TIMEOUT";
                    break;
                case 16:
                    strH = "CANCELED";
                    break;
                case 17:
                    strH = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strH = "DEAD_CLIENT";
                    break;
                case 19:
                    strH = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strH = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case zw0.zzm /* 21 */:
                    strH = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strH = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        vg2Var.b(strH, "statusCode");
        vg2Var.b(this.h, "resolution");
        return vg2Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.P(parcel, 1, 4);
        parcel.writeInt(this.f);
        s90.q(parcel, 2, this.g);
        s90.p(parcel, 3, this.h, i);
        s90.p(parcel, 4, this.i, i);
        s90.J(parcel, iW);
    }
}
