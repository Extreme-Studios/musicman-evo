package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends z4 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ c5 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(c5 c5Var, Context context) {
        super(c5Var);
        this.d = c5Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.z4
    public final IntentFilter d() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.z4
    public final int e() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return s4.a((PowerManager) obj) ? 2 : 1;
            default:
                p83 p83Var = (p83) obj;
                v40 v40Var = (v40) p83Var.i;
                LocationManager locationManager = (LocationManager) p83Var.h;
                if (v40Var.b <= System.currentTimeMillis()) {
                    Context context = (Context) p83Var.g;
                    Location lastKnownLocation2 = null;
                    if (na1.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (na1.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (cd0.e == null) {
                            cd0.e = new cd0();
                        }
                        cd0 cd0Var = cd0.e;
                        cd0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        cd0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = cd0Var.c == 1;
                        long j2 = cd0Var.b;
                        long j3 = cd0Var.a;
                        cd0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = cd0Var.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        v40Var.a = z;
                        v40Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = v40Var.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.z4
    public final void i() {
        int i = this.c;
        c5 c5Var = this.d;
        switch (i) {
            case 0:
                c5Var.l(true, true);
                break;
            default:
                c5Var.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(c5 c5Var, p83 p83Var) {
        super(c5Var);
        this.d = c5Var;
        this.e = p83Var;
    }
}
