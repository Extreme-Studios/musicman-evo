package com.google.android.gms.ads.internal.adaptersettings;

import defpackage.hx0;
import defpackage.tu0;

/* JADX INFO: loaded from: classes.dex */
class AdapterSettings {
    private static volatile AdapterSettings instance;
    private final hx0 adapterSettingsInternal = tu0.e.d;

    private boolean getBoolean(String str, boolean z) {
        hx0 hx0Var = this.adapterSettingsInternal;
        hx0Var.getClass();
        return !str.startsWith("adapter:") ? z : hx0Var.c.optBoolean(str, z);
    }

    private float getFloat(String str, float f) {
        hx0 hx0Var = this.adapterSettingsInternal;
        hx0Var.getClass();
        return !str.startsWith("adapter:") ? f : (float) hx0Var.c.optDouble(str, f);
    }

    public static AdapterSettings getInstance() {
        if (instance == null) {
            synchronized (AdapterSettings.class) {
                try {
                    if (instance == null) {
                        instance = new AdapterSettings();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private int getInt(String str, int i) {
        hx0 hx0Var = this.adapterSettingsInternal;
        hx0Var.getClass();
        return !str.startsWith("adapter:") ? i : hx0Var.c.optInt(str, i);
    }

    private long getLong(String str, long j) {
        hx0 hx0Var = this.adapterSettingsInternal;
        hx0Var.getClass();
        return !str.startsWith("adapter:") ? j : hx0Var.c.optLong(str, j);
    }

    private String getString(String str, String str2) {
        hx0 hx0Var = this.adapterSettingsInternal;
        hx0Var.getClass();
        return !str.startsWith("adapter:") ? str2 : hx0Var.c.optString(str, str2);
    }
}
