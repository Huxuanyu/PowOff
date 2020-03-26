package com.powoff;

import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

import androidx.annotation.RequiresApi;

public class PerformSystemService extends AccessibilityService {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
            performGlobalAction(AccessibilityService.GLOBAL_ACTION_POWER_DIALOG);
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onInterrupt() {
        // TODO Auto-generated method stub

    }
}
