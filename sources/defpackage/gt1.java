package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class gt1 extends ob2 {
    public final SensorManager a;
    public final Sensor b;
    public float c = 0.0f;
    public Float d = Float.valueOf(0.0f);
    public long e;
    public int f;
    public boolean g;
    public boolean h;
    public qt1 i;
    public boolean j;

    public gt1(Context context) {
        vc3.C.k.getClass();
        this.e = System.currentTimeMillis();
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.a = sensorManager;
        if (sensorManager != null) {
            this.b = sensorManager.getDefaultSensor(4);
        } else {
            this.b = null;
        }
    }

    @Override // defpackage.ob2
    public final void a(SensorEvent sensorEvent) {
        ix0 ix0Var = lx0.R9;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            vc3.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.e + ((long) ((Integer) kx0Var2.a(lx0.T9)).intValue()) < jCurrentTimeMillis) {
                this.f = 0;
                this.e = jCurrentTimeMillis;
                this.g = false;
                this.h = false;
                this.c = this.d.floatValue();
            }
            float fFloatValue = this.d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.d = Float.valueOf(fFloatValue);
            float f = this.c;
            ix0 ix0Var2 = lx0.S9;
            float fFloatValue2 = ((Float) kx0Var2.a(ix0Var2)).floatValue() + f;
            Float f2 = this.d;
            if (fFloatValue > fFloatValue2) {
                this.c = f2.floatValue();
                this.h = true;
            } else if (f2.floatValue() < this.c - ((Float) kx0Var2.a(ix0Var2)).floatValue()) {
                this.c = this.d.floatValue();
                this.g = true;
            }
            if (this.d.isInfinite()) {
                this.d = Float.valueOf(0.0f);
                this.c = 0.0f;
            }
            if (this.g && this.h) {
                jn.p("Flick detected.");
                this.e = jCurrentTimeMillis;
                int i = this.f + 1;
                this.f = i;
                this.g = false;
                this.h = false;
                qt1 qt1Var = this.i;
                if (qt1Var == null || i != ((Integer) kx0Var2.a(lx0.U9)).intValue()) {
                    return;
                }
                qt1Var.e(new ot1(1), pt1.h);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) tu0.e.c.a(lx0.R9)).booleanValue()) {
                    if (!this.j && (sensorManager = this.a) != null && (sensor = this.b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.j = true;
                        jn.p("Listening for flick gestures.");
                    }
                    if (this.a == null || this.b == null) {
                        jn.T("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
