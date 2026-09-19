package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.extremestudios.musicmanevo.R;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c21 implements v11 {
    public static final Map i;
    public final vs0 f;
    public final d61 g;
    public final dr0 h;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        m7 m7Var = new m7(7);
        for (int i2 = 0; i2 < 7; i2++) {
            m7Var.put(strArr[i2], numArr[i2]);
        }
        i = Collections.unmodifiableMap(m7Var);
    }

    public c21(vs0 vs0Var, d61 d61Var, dr0 dr0Var) {
        this.f = vs0Var;
        this.g = d61Var;
        this.h = dr0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:211:0x042d A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0434 A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x045d A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0469 A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x049a A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x050b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0513 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x051c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0524 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x052d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0535 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x053c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0544 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x054b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0553 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x055a  */
    /* JADX WARN: Code duplicated, block: B:246:0x0562  */
    /* JADX WARN: Code duplicated, block: B:248:0x0568 A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x05b3 A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0628 A[Catch: all -> 0x01c4, TryCatch #1 {all -> 0x01c4, blocks: (B:92:0x01b9, B:94:0x01bd, B:95:0x01c2, B:99:0x01c7, B:101:0x01cf, B:102:0x01d4, B:104:0x01d6, B:106:0x01e0, B:107:0x01e5, B:109:0x01e7, B:111:0x01ed, B:112:0x01f2, B:114:0x01f4, B:116:0x0202, B:117:0x0214, B:119:0x0222, B:120:0x0234, B:122:0x0242, B:123:0x0254, B:125:0x0262, B:126:0x0274, B:128:0x0282, B:129:0x0290, B:131:0x029e, B:132:0x02a0, B:134:0x02a4, B:136:0x02a8, B:138:0x02ae, B:141:0x02b6, B:145:0x02e8, B:151:0x02f6, B:211:0x042d, B:212:0x0432, B:214:0x0434, B:216:0x045d, B:218:0x0469, B:220:0x049d, B:226:0x0513, B:249:0x056e, B:250:0x0586, B:251:0x05ab, B:253:0x05b3, B:254:0x05be, B:255:0x05e3, B:258:0x05e6, B:260:0x0614, B:261:0x0626, B:230:0x0524, B:234:0x0535, B:238:0x0544, B:242:0x0553, B:247:0x0564, B:248:0x0568, B:219:0x049a, B:263:0x0628, B:264:0x062d, B:153:0x0300, B:155:0x0304, B:184:0x03a4, B:185:0x03ae, B:187:0x03b3, B:189:0x03b7, B:191:0x03bb, B:194:0x03c3, B:160:0x0319, B:164:0x0335, B:165:0x0340, B:170:0x0356, B:174:0x036b, B:178:0x037d, B:183:0x0391, B:195:0x03d2, B:201:0x0408, B:207:0x0418, B:204:0x040e, B:206:0x0416, B:198:0x0400, B:200:0x0406, B:208:0x041d, B:209:0x0424, B:266:0x062f, B:267:0x0634, B:269:0x0636, B:270:0x063b), top: B:298:0x01b9, inners: #0 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        int i2;
        int[] iArr;
        int iN;
        int iN2;
        ViewParent parent;
        ViewGroup viewGroup;
        PopupWindow popupWindow;
        RelativeLayout.LayoutParams layoutParams;
        String str;
        dr0 dr0Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        md1 md1Var = (md1) obj;
        int iIntValue = ((Integer) i.get((String) map.get("a"))).intValue();
        int i9 = -1;
        int i10 = 1;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                vs0 vs0Var = this.f;
                if (!vs0Var.a()) {
                    vs0Var.b(null);
                    return;
                }
                int i11 = 0;
                if (iIntValue == 1) {
                    d61 d61Var = this.g;
                    synchronized (d61Var.q) {
                        try {
                            Activity activity = d61Var.s;
                            if (activity == null) {
                                d61Var.z("Not an activity context. Cannot resize.");
                                return;
                            }
                            md1 md1Var2 = d61Var.r;
                            if (md1Var2.x() == null) {
                                d61Var.z("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (md1Var2.x().b()) {
                                d61Var.z("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (md1Var2.X0()) {
                                d61Var.z("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                zb3 zb3Var = vc3.C.c;
                                d61Var.p = zb3.n((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                zb3 zb3Var2 = vc3.C.c;
                                d61Var.m = zb3.n((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                zb3 zb3Var3 = vc3.C.c;
                                d61Var.n = zb3.n((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                zb3 zb3Var4 = vc3.C.c;
                                d61Var.o = zb3.n((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                d61Var.j = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str2 = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str2)) {
                                d61Var.i = str2;
                            }
                            if (d61Var.p < 0 || d61Var.m < 0) {
                                d61Var.z("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                zb3 zb3Var5 = vc3.C.c;
                                int[] iArrP = zb3.p(activity);
                                ut0 ut0Var = ut0.f;
                                int[] iArr2 = {ut0Var.a.i(activity, iArrP[0]), ut0Var.a.i(activity, iArrP[1])};
                                int[] iArrQ = zb3.q(activity);
                                int i12 = iArr2[0];
                                int i13 = iArr2[1];
                                int i14 = d61Var.p;
                                if (i14 < 50 || i14 > i12) {
                                    i2 = 50;
                                    jn.T("Width is too small or too large.");
                                } else {
                                    int i15 = d61Var.m;
                                    if (i15 < 50 || i15 > i13) {
                                        i2 = 50;
                                        jn.T("Height is too small or too large.");
                                    } else {
                                        if (i15 != i13 || i14 != i12) {
                                            if (d61Var.j) {
                                                String str3 = d61Var.i;
                                                switch (str3.hashCode()) {
                                                    case -1364013995:
                                                        i2 = 50;
                                                        if (str3.equals("center")) {
                                                            i3 = ((d61Var.k + d61Var.n) + (i14 >> 1)) - 25;
                                                            i4 = ((d61Var.l + d61Var.o) + (i15 >> 1)) - 25;
                                                            int i16 = i3;
                                                            i8 = i4;
                                                            i5 = i16;
                                                        }
                                                        i5 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                        i6 = d61Var.l;
                                                        i8 = i6 + d61Var.o;
                                                        break;
                                                    case -1012429441:
                                                        i2 = 50;
                                                        if (str3.equals("top-left")) {
                                                            i5 = d61Var.k + d61Var.n;
                                                            i6 = d61Var.l;
                                                        } else {
                                                            i5 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                            i6 = d61Var.l;
                                                        }
                                                        i8 = i6 + d61Var.o;
                                                        break;
                                                    case -655373719:
                                                        i2 = 50;
                                                        if (str3.equals("bottom-left")) {
                                                            i3 = d61Var.k + d61Var.n;
                                                            i7 = d61Var.l;
                                                            i4 = ((i7 + d61Var.o) + i15) - 50;
                                                            int i17 = i3;
                                                            i8 = i4;
                                                            i5 = i17;
                                                        }
                                                        i5 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                        i6 = d61Var.l;
                                                        i8 = i6 + d61Var.o;
                                                        break;
                                                    case 1163912186:
                                                        i2 = 50;
                                                        if (str3.equals("bottom-right")) {
                                                            i3 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                            i7 = d61Var.l;
                                                            i4 = ((i7 + d61Var.o) + i15) - 50;
                                                            int i18 = i3;
                                                            i8 = i4;
                                                            i5 = i18;
                                                        }
                                                        i5 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                        i6 = d61Var.l;
                                                        i8 = i6 + d61Var.o;
                                                        break;
                                                    case 1288627767:
                                                        i2 = 50;
                                                        if (str3.equals("bottom-center")) {
                                                            i3 = ((d61Var.k + d61Var.n) + (i14 >> 1)) - 25;
                                                            i7 = d61Var.l;
                                                            i4 = ((i7 + d61Var.o) + i15) - 50;
                                                            int i19 = i3;
                                                            i8 = i4;
                                                            i5 = i19;
                                                        }
                                                        i5 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                        i6 = d61Var.l;
                                                        i8 = i6 + d61Var.o;
                                                        break;
                                                    case 1755462605:
                                                        if (str3.equals("top-center")) {
                                                            i5 = ((d61Var.k + d61Var.n) + (i14 >> 1)) - 25;
                                                            i8 = d61Var.l + d61Var.o;
                                                            i2 = 50;
                                                            break;
                                                        }
                                                    default:
                                                        i2 = 50;
                                                        i5 = ((d61Var.k + d61Var.n) + i14) - 50;
                                                        i6 = d61Var.l;
                                                        i8 = i6 + d61Var.o;
                                                        break;
                                                }
                                                if (i5 >= 0 && i5 + 50 <= i12 && i8 >= iArrQ[0] && i8 + 50 <= iArrQ[1]) {
                                                    iArr = new int[]{d61Var.k + d61Var.n, d61Var.l + d61Var.o};
                                                }
                                            } else {
                                                i2 = 50;
                                                int[] iArrP2 = zb3.p(activity);
                                                int[] iArr3 = {ut0Var.a.i(activity, iArrP2[0]), ut0Var.a.i(activity, iArrP2[1])};
                                                int[] iArrQ2 = zb3.q(activity);
                                                int i20 = iArr3[0];
                                                int i21 = d61Var.k + d61Var.n;
                                                int i22 = d61Var.l + d61Var.o;
                                                if (i21 < 0) {
                                                    i21 = 0;
                                                } else {
                                                    int i23 = d61Var.p;
                                                    if (i21 + i23 > i20) {
                                                        i21 = i20 - i23;
                                                    }
                                                }
                                                int i24 = iArrQ2[0];
                                                if (i22 < i24) {
                                                    i22 = i24;
                                                } else {
                                                    int i25 = d61Var.m;
                                                    int i26 = i22 + i25;
                                                    int i27 = iArrQ2[1];
                                                    if (i26 > i27) {
                                                        i22 = i27 - i25;
                                                    }
                                                }
                                                iArr = new int[]{i21, i22};
                                            }
                                            if (iArr == null) {
                                                d61Var.z("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            f32 f32Var = ut0Var.a;
                                            iN = f32.n(activity.getResources().getDisplayMetrics(), d61Var.p);
                                            iN2 = f32.n(activity.getResources().getDisplayMetrics(), d61Var.m);
                                            parent = ((View) md1Var2).getParent();
                                            if (parent instanceof ViewGroup) {
                                                d61Var.z("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView((View) md1Var2);
                                            popupWindow = d61Var.x;
                                            if (popupWindow == null) {
                                                d61Var.z = viewGroup;
                                                ((View) md1Var2).setDrawingCacheEnabled(true);
                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) md1Var2).getDrawingCache());
                                                ((View) md1Var2).setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(activity);
                                                d61Var.u = imageView;
                                                imageView.setImageBitmap(bitmapCreateBitmap);
                                                d61Var.t = md1Var2.x();
                                                d61Var.z.addView(d61Var.u);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                                            d61Var.y = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            d61Var.y.setLayoutParams(new ViewGroup.LayoutParams(iN, iN2));
                                            PopupWindow popupWindow2 = new PopupWindow((View) d61Var.y, iN, iN2, false);
                                            d61Var.x = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            d61Var.x.setTouchable(true);
                                            d61Var.x.setClippingEnabled(!d61Var.j);
                                            d61Var.y.addView((View) md1Var2, -1, -1);
                                            d61Var.v = new LinearLayout(activity);
                                            int i28 = i2;
                                            layoutParams = new RelativeLayout.LayoutParams(f32.n(activity.getResources().getDisplayMetrics(), i28), f32.n(activity.getResources().getDisplayMetrics(), i28));
                                            str = d61Var.i;
                                            switch (str.hashCode()) {
                                                case -1364013995:
                                                    if (str.equals("center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(13);
                                                    }
                                                    break;
                                                case -1012429441:
                                                    if (str.equals("top-left")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(9);
                                                    }
                                                    break;
                                                case -655373719:
                                                    if (str.equals("bottom-left")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(9);
                                                    }
                                                    break;
                                                case 1163912186:
                                                    if (str.equals("bottom-right")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(11);
                                                    }
                                                    break;
                                                case 1288627767:
                                                    if (str.equals("bottom-center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(14);
                                                    }
                                                    break;
                                                case 1755462605:
                                                    if (str.equals("top-center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(14);
                                                    }
                                                    break;
                                                default:
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                            }
                                            d61Var.v.setOnClickListener(new f1(d61Var));
                                            d61Var.v.setContentDescription("Close button");
                                            d61Var.y.addView(d61Var.v, layoutParams);
                                            try {
                                                d61Var.x.showAtLocation(window.getDecorView(), 0, f32.n(activity.getResources().getDisplayMetrics(), iArr[0]), f32.n(activity.getResources().getDisplayMetrics(), iArr[1]));
                                                int i29 = iArr[0];
                                                int i30 = iArr[1];
                                                dr0Var = d61Var.w;
                                                if (dr0Var != null) {
                                                    ((ir1) dr0Var.g).c.L1(ue0.j);
                                                }
                                                d61Var.r.W(new eg(1, iN, iN2));
                                                d61Var.B(iArr[0], iArr[1] - zb3.q(d61Var.s)[0], d61Var.p, d61Var.m);
                                                d61Var.C("resized");
                                                return;
                                            } catch (RuntimeException e) {
                                                String message = e.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                sb.append("Cannot show popup window: ");
                                                sb.append(message);
                                                d61Var.z(sb.toString());
                                                RelativeLayout relativeLayout2 = d61Var.y;
                                                md1 md1Var3 = d61Var.r;
                                                relativeLayout2.removeView((View) md1Var3);
                                                ViewGroup viewGroup2 = d61Var.z;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(d61Var.u);
                                                    d61Var.z.addView((View) md1Var3);
                                                    md1Var3.W(d61Var.t);
                                                }
                                                return;
                                            }
                                        }
                                        jn.T("Cannot resize to a full-screen ad.");
                                        i2 = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr == null) {
                                    d61Var.z("Resize location out of screen or close button is not visible.");
                                    return;
                                }
                                f32 f32Var2 = ut0Var.a;
                                iN = f32.n(activity.getResources().getDisplayMetrics(), d61Var.p);
                                iN2 = f32.n(activity.getResources().getDisplayMetrics(), d61Var.m);
                                parent = ((View) md1Var2).getParent();
                                if (parent instanceof ViewGroup) {
                                    d61Var.z("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                viewGroup = (ViewGroup) parent;
                                viewGroup.removeView((View) md1Var2);
                                popupWindow = d61Var.x;
                                if (popupWindow == null) {
                                    d61Var.z = viewGroup;
                                    ((View) md1Var2).setDrawingCacheEnabled(true);
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(((View) md1Var2).getDrawingCache());
                                    ((View) md1Var2).setDrawingCacheEnabled(false);
                                    ImageView imageView2 = new ImageView(activity);
                                    d61Var.u = imageView2;
                                    imageView2.setImageBitmap(bitmapCreateBitmap2);
                                    d61Var.t = md1Var2.x();
                                    d61Var.z.addView(d61Var.u);
                                } else {
                                    popupWindow.dismiss();
                                }
                                RelativeLayout relativeLayout3 = new RelativeLayout(activity);
                                d61Var.y = relativeLayout3;
                                relativeLayout3.setBackgroundColor(0);
                                d61Var.y.setLayoutParams(new ViewGroup.LayoutParams(iN, iN2));
                                PopupWindow popupWindow3 = new PopupWindow((View) d61Var.y, iN, iN2, false);
                                d61Var.x = popupWindow3;
                                popupWindow3.setOutsideTouchable(false);
                                d61Var.x.setTouchable(true);
                                d61Var.x.setClippingEnabled(!d61Var.j);
                                d61Var.y.addView((View) md1Var2, -1, -1);
                                d61Var.v = new LinearLayout(activity);
                                int i210 = i2;
                                layoutParams = new RelativeLayout.LayoutParams(f32.n(activity.getResources().getDisplayMetrics(), i210), f32.n(activity.getResources().getDisplayMetrics(), i210));
                                str = d61Var.i;
                                switch (str.hashCode()) {
                                    case -1364013995:
                                        if (str.equals("center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(13);
                                        }
                                        break;
                                    case -1012429441:
                                        if (str.equals("top-left")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(9);
                                        }
                                        break;
                                    case -655373719:
                                        if (str.equals("bottom-left")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(9);
                                        }
                                        break;
                                    case 1163912186:
                                        if (str.equals("bottom-right")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(11);
                                        }
                                        break;
                                    case 1288627767:
                                        if (str.equals("bottom-center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(14);
                                        }
                                        break;
                                    case 1755462605:
                                        if (str.equals("top-center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(14);
                                        }
                                        break;
                                    default:
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(11);
                                        break;
                                }
                                d61Var.v.setOnClickListener(new f1(d61Var));
                                d61Var.v.setContentDescription("Close button");
                                d61Var.y.addView(d61Var.v, layoutParams);
                                d61Var.x.showAtLocation(window.getDecorView(), 0, f32.n(activity.getResources().getDisplayMetrics(), iArr[0]), f32.n(activity.getResources().getDisplayMetrics(), iArr[1]));
                                int i211 = iArr[0];
                                int i31 = iArr[1];
                                dr0Var = d61Var.w;
                                if (dr0Var != null) {
                                    ((ir1) dr0Var.g).c.L1(ue0.j);
                                }
                                d61Var.r.W(new eg(1, iN, iN2));
                                d61Var.B(iArr[0], iArr[1] - zb3.q(d61Var.s)[0], d61Var.p, d61Var.m);
                                d61Var.C("resized");
                                return;
                            }
                            d61Var.z("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (iIntValue == 3) {
                    e61 e61Var = new e61(md1Var, map);
                    Activity activity2 = e61Var.i;
                    if (activity2 == null) {
                        e61Var.z("Activity context is not available");
                        return;
                    }
                    vc3 vc3Var = vc3.C;
                    zb3 zb3Var6 = vc3Var.c;
                    if (!((Boolean) na1.p(activity2, gx0.b)).booleanValue() || q90.a(activity2).f.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        e61Var.z("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        e61Var.z("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        e61Var.z("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        e61Var.z("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources resourcesC = vc3Var.h.c();
                    AlertDialog.Builder builderK = zb3.k(activity2);
                    builderK.setTitle(resourcesC != null ? resourcesC.getString(R.string.s1) : "Save image");
                    builderK.setMessage(resourcesC != null ? resourcesC.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    builderK.setPositiveButton(resourcesC != null ? resourcesC.getString(R.string.s3) : "Accept", new gw1(e61Var, str4, lastPathSegment));
                    builderK.setNegativeButton(resourcesC != null ? resourcesC.getString(R.string.s4) : "Decline", new th0(3, e61Var));
                    builderK.create().show();
                    return;
                }
                if (iIntValue == 4) {
                    b61 b61Var = new b61(md1Var, map);
                    Activity activity3 = b61Var.j;
                    if (activity3 == null) {
                        b61Var.z("Activity context is not available.");
                        return;
                    }
                    vc3 vc3Var2 = vc3.C;
                    zb3 zb3Var7 = vc3Var2.c;
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    dq.g(type, "Intent can not be null");
                    if (activity3.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        b61Var.z("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder builderK2 = zb3.k(activity3);
                    Resources resourcesC2 = vc3Var2.h.c();
                    builderK2.setTitle(resourcesC2 != null ? resourcesC2.getString(R.string.s5) : "Create calendar event");
                    builderK2.setMessage(resourcesC2 != null ? resourcesC2.getString(R.string.s6) : "Allow Ad to create a calendar event?");
                    builderK2.setPositiveButton(resourcesC2 != null ? resourcesC2.getString(R.string.s3) : "Accept", new a61(b61Var, i11));
                    builderK2.setNegativeButton(resourcesC2 != null ? resourcesC2.getString(R.string.s4) : "Decline", new a61(b61Var, i10));
                    builderK2.create().show();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.g.E(true);
                        return;
                    } else if (iIntValue != 7) {
                        jn.R("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((ir1) this.h.g).m.a();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (md1Var == null) {
            jn.T("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str5)) {
            i9 = 7;
        } else if ("landscape".equalsIgnoreCase(str5)) {
            i9 = 6;
        } else if (!z) {
            i9 = 14;
        }
        md1Var.y(i9);
    }
}
