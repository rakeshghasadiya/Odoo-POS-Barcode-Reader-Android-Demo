package com.silentinfotech.barcodedemo;

import com.google.android.gms.vision.barcode.Barcode;

/**
 * Created by rakesh on 29/08/17.
 */

public interface SetOnBarcodeDetected {
    void onCodeDetect(Barcode barcode);
}
