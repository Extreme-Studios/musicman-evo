package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class yt1 extends ob2 {
    public final Context a;
    public SensorManager b;
    public Sensor c;
    public long d;
    public int e;
    public qt1 f;
    public boolean g;

    public yt1(Context context) {
        this.a = context;
    }

    @Override // defpackage.ob2
    public final void a(SensorEvent sensorEvent) {
        ix0 ix0Var = lx0.M9;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) >= ((Float) kx0Var2.a(lx0.N9)).floatValue()) {
                vc3.C.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.d + ((long) ((Integer) kx0Var2.a(lx0.O9)).intValue()) <= jCurrentTimeMillis) {
                    if (this.d + ((long) ((Integer) kx0Var2.a(lx0.P9)).intValue()) < jCurrentTimeMillis) {
                        this.e = 0;
                    }
                    jn.p("Shake detected.");
                    this.d = jCurrentTimeMillis;
                    int i = this.e + 1;
                    this.e = i;
                    qt1 qt1Var = this.f;
                    if (qt1Var == null || i != ((Integer) kx0Var2.a(lx0.Q9)).intValue()) {
                        return;
                    }
                    qt1Var.e(new ot1(0), pt1.h);
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                ix0 ix0Var = lx0.M9;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    if (this.b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.a.getSystemService("sensor");
                        this.b = sensorManager2;
                        if (sensorManager2 == null) {
                            jn.T("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.g && (sensorManager = this.b) != null && (sensor = this.c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        vc3.C.k.getClass();
                        this.d = System.currentTimeMillis() - ((long) ((Integer) tu0Var.c.a(lx0.O9)).intValue());
                        this.g = true;
                        jn.p("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
