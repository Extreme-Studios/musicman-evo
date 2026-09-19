package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j01 {
    public final String a;
    public String b;
    public final r71 d;
    public Bundle e;
    public final long g;
    public final long h;
    public String c = null;
    public final Bundle f = new Bundle();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public j01(JsonReader jsonReader, r71 r71Var) throws IOException {
        Bundle bundle;
        this.g = -1L;
        this.h = -1L;
        this.d = r71Var;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName = strNextName == null ? "" : strNextName;
            switch (strNextName.hashCode()) {
                case -1573145462:
                    if (strNextName.equals("start_time")) {
                        this.g = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -995427962:
                    if (strNextName.equals("params")) {
                        strNextString = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -271442291:
                    if (strNextName.equals("signal_dictionary")) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case 1725551537:
                    if (strNextName.equals("end_time")) {
                        this.h = jsonReader.nextLong();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() || r71Var == null || (bundle = r71Var.r) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.g);
        bundle.putLong("get-signals-sdkcore-end", this.h);
    }
}
