package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class na3 {
    public static final na3 c = new na3(vj2.i(ma3.d));
    public static final qk2 d;
    public static final vk2 e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object[] objArr = {2, 5, 6};
        dq.y(objArr, 3);
        d = vj2.o(objArr, 3);
        um0 um0Var = new um0(4);
        um0Var.m(5, 6);
        um0Var.m(17, 6);
        um0Var.m(7, 6);
        um0Var.m(30, 10);
        um0Var.m(18, 6);
        um0Var.m(6, 8);
        um0Var.m(8, 8);
        um0Var.m(14, 8);
        e = um0Var.s();
    }

    public na3(qk2 qk2Var) {
        for (int i = 0; i < qk2Var.i; i++) {
            ma3 ma3Var = (ma3) qk2Var.get(i);
            this.a.put(ma3Var.a, ma3Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((ma3) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
    }

    public static na3 a(Context context, qk1 qk1Var, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), qk1Var, audioDeviceInfo);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x026b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    public static na3 b(Context context, Intent intent, qk1 qk1Var, AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        AudioManager audioManagerO = na1.o(context);
        int i = 0;
        if (audioDeviceInfo != null) {
            audioDeviceInfo2 = audioDeviceInfo;
        } else {
            audioDeviceInfo2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                List audioDevicesForAttributes = audioManagerO.getAudioDevicesForAttributes(qk1Var.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        vk2 vk2Var = e;
        if (i2 >= 33 && (qz1.h(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            List directProfilesForAttributes = audioManagerO.getDirectProfilesForAttributes(qk1Var.a());
            HashMap map = new HashMap();
            map.put(2, new HashSet(w40.B0(12)));
            for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
                AudioProfile audioProfileD = da3.d(directProfilesForAttributes.get(i3));
                if (audioProfileD.getEncapsulationType() != 1) {
                    int format = audioProfileD.getFormat();
                    if (qz1.a(format) || vk2Var.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(w40.B0(audioProfileD.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(w40.B0(audioProfileD.getChannelMasks())));
                        }
                    }
                }
            }
            tj2 tj2Var = vj2.g;
            w40.k0("initialCapacity", 4);
            Object[] objArrCopyOf = new Object[4];
            for (Map.Entry entry : map.entrySet()) {
                ma3 ma3Var = new ma3(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
                int length = objArrCopyOf.length;
                int i4 = i + 1;
                int iD = pj2.d(length, i4);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i] = ma3Var;
                i = i4;
            }
            return new na3(vj2.o(objArrCopyOf, i));
        }
        AudioDeviceInfo[] devices = audioDeviceInfo2 == null ? audioManagerO.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo2};
        ak2 ak2Var = new ak2(4);
        Integer[] numArr = {8, 7};
        if (ak2Var.d != null) {
            for (int i5 = 0; i5 < 2; i5++) {
                ak2Var.f(numArr[i5]);
            }
        } else {
            dq.y(numArr, 2);
            ak2Var.e(2);
            System.arraycopy(numArr, 0, ak2Var.a, ak2Var.b, 2);
            ak2Var.b += 2;
        }
        if (i2 >= 31) {
            Integer[] numArr2 = {26, 27};
            if (ak2Var.d != null) {
                for (int i6 = 0; i6 < 2; i6++) {
                    ak2Var.f(numArr2[i6]);
                }
            } else {
                dq.y(numArr2, 2);
                ak2Var.e(2);
                System.arraycopy(numArr2, 0, ak2Var.a, ak2Var.b, 2);
                ak2Var.b += 2;
            }
        }
        if (i2 >= 33) {
            ak2Var.f(30);
        }
        bk2 bk2VarH = ak2Var.h();
        for (AudioDeviceInfo audioDeviceInfo3 : devices) {
            if (bk2VarH.contains(Integer.valueOf(audioDeviceInfo3.getType()))) {
                return c;
            }
        }
        ak2 ak2Var2 = new ak2(4);
        ak2Var2.f(2);
        if (Build.VERSION.SDK_INT >= 29 && (qz1.h(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            tj2 tj2Var2 = vj2.g;
            sj2 sj2Var = new sj2(4);
            tk2 tk2Var = vk2Var.g;
            if (tk2Var == null) {
                tk2Var = new tk2(vk2Var, new uk2(vk2Var.j, 0, vk2Var.k));
                vk2Var.g = tk2Var;
            }
            dl2 dl2VarA = tk2Var.a();
            while (dl2VarA.hasNext()) {
                Integer num = (Integer) dl2VarA.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= qz1.c(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), qk1Var.a())) {
                    sj2Var.a(num);
                }
            }
            sj2Var.a(2);
            ak2Var2.g(sj2Var.f());
            return new na3(d(w40.z0(ak2Var2.h()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    ak2Var2.g(d);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            ak2Var2.g(d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new na3(d(w40.z0(ak2Var2.h()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            ak2Var2.g(w40.B0(intArrayExtra));
        }
        return new na3(d(w40.z0(ak2Var2.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static qk2 d(int[] iArr, int i) {
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            ma3 ma3Var = new ma3(iArr[i2], i);
            int length = objArrCopyOf.length;
            int i4 = i3 + 1;
            int iD = pj2.d(length, i4);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i3] = ma3Var;
            i2++;
            i3 = i4;
        }
        return vj2.o(objArrCopyOf, i3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d A[PHI: r2
  0x003d: PHI (r2v3 int) = (r2v2 int), (r2v6 int) binds: [B:11:0x0031, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    public final Pair c(de3 de3Var, qk1 qk1Var) {
        String str = de3Var.m;
        str.getClass();
        int iH = rn0.h(str, de3Var.j);
        Integer numValueOf = Integer.valueOf(iH);
        vk2 vk2Var = e;
        if (!vk2Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 8;
        SparseArray sparseArray = this.a;
        if (iH != 18) {
            if (iH != 8) {
                if (iH == 30 && sparseArray.indexOfKey(30) < 0) {
                    iH = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iH = 8;
                if (iH == 30) {
                    iH = 7;
                }
            } else {
                iH = 7;
            }
        } else if (sparseArray.indexOfKey(18) >= 0) {
            iH = 18;
            if (iH != 8) {
                if (iH == 30) {
                    iH = 7;
                }
            } else if (sparseArray.indexOfKey(8) >= 0) {
                iH = 8;
                if (iH == 30) {
                    iH = 7;
                }
            } else {
                iH = 7;
            }
        } else {
            iH = 6;
        }
        if (sparseArray.indexOfKey(iH) < 0) {
            return null;
        }
        ma3 ma3Var = (ma3) sparseArray.get(iH);
        ma3Var.getClass();
        int iIntValue = ma3Var.b;
        bk2 bk2Var = ma3Var.c;
        int i2 = de3Var.E;
        boolean zContains = false;
        if (i2 == -1 || iH == 18) {
            int i3 = de3Var.F;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (bk2Var == null) {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = ma3Var.a;
                if (i4 >= 29) {
                    iIntValue = 10;
                    while (true) {
                        if (iIntValue <= 0) {
                            iIntValue = 0;
                            break;
                        }
                        int iB = qz1.b(iIntValue);
                        if (iB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i3).setChannelMask(iB).build(), qk1Var.a())) {
                            break;
                        }
                        iIntValue--;
                    }
                } else {
                    Object obj = vk2Var.get(Integer.valueOf(i5));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (bk2Var != null) {
                int iB2 = qz1.b(i2);
                if (iB2 != 0) {
                    zContains = bk2Var.contains(Integer.valueOf(iB2));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 > 28) {
            i = i2;
        } else if (i2 != 7) {
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                i = 6;
            } else {
                i = i2;
            }
        }
        if (i6 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iB3 = qz1.b(i);
        if (iB3 != 0) {
            return Pair.create(Integer.valueOf(iH), Integer.valueOf(iB3));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[ORIG_RETURN, RETURN] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof na3) {
            na3 na3Var = (na3) obj;
            SparseArray sparseArray = na3Var.a;
            String str = qz1.a;
            int i = Build.VERSION.SDK_INT;
            SparseArray sparseArray2 = this.a;
            if (i < 31) {
                int size = sparseArray2.size();
                if (size == sparseArray.size()) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (Objects.equals(sparseArray2.valueAt(i2), sparseArray.get(sparseArray2.keyAt(i2)))) {
                        }
                    }
                    if (this.b == na3Var.b) {
                        return true;
                    }
                }
            } else if (sparseArray2.contentEquals(sparseArray)) {
                if (this.b == na3Var.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = qz1.a;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.a;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.b;
    }

    public final String toString() {
        String string = this.a.toString();
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 50 + string.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
