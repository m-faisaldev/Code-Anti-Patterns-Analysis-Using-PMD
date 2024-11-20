package a0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1645e extends AbstractBinderC1642b implements InterfaceC1646f {
    public static InterfaceC1646f h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof InterfaceC1646f ? (InterfaceC1646f) queryLocalInterface : new C1644d(iBinder);
    }
}