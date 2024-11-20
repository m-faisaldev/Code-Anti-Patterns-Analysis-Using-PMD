package a0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1644d extends AbstractC1641a implements InterfaceC1646f {
    C1644d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // a0.InterfaceC1646f
    public final String b() {
        Parcel i8 = i(1, h());
        String readString = i8.readString();
        i8.recycle();
        return readString;
    }

    @Override // a0.InterfaceC1646f
    public final boolean t(boolean z8) {
        Parcel h8 = h();
        AbstractC1643c.a(h8, true);
        Parcel i8 = i(2, h8);
        boolean b8 = AbstractC1643c.b(i8);
        i8.recycle();
        return b8;
    }
}