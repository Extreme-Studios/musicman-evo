package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class g81 extends f0 {
    public static final Parcelable.Creator<g81> CREATOR = new os0(20);
    public final String f;
    public final int g;

    public g81(String str, int i) {
        this.f = str;
        this.g = i;
    }

    public static g81 a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new g81(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g81)) {
            return false;
        }
        g81 g81Var = (g81) obj;
        return s90.d(this.f, g81Var.f) && s90.d(Integer.valueOf(this.g), Integer.valueOf(g81Var.g));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 2, this.f);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.g);
        s90.J(parcel, iW);
    }
}
