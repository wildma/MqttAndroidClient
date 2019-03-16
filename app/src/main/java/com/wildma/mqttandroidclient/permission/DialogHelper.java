package com.wildma.mqttandroidclient.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.wildma.mqttandroidclient.R;


/**
 * Desc	        ${DialogHelper}
 */
public class DialogHelper {

    public static void showRationaleDialog(final PermissionUtils.OnRationaleListener.ShouldRequest shouldRequest, Activity activity) {
        if (activity == null)
            return;
        new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Light_Dialog_Alert)
                .setTitle(android.R.string.dialog_alert_title)
                .setMessage(R.string.permission_denied_hint)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        shouldRequest.again(true);
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        shouldRequest.again(false);
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }

    public static void showOpenAppSettingDialog(Activity activity) {
        if (activity == null)
            return;
        new AlertDialog.Builder(activity, R.style.Theme_AppCompat_Light_Dialog_Alert)
                .setTitle(android.R.string.dialog_alert_title)
                .setMessage(R.string.permission_denied_forever_hint)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        PermissionUtils.launchAppDetailsSettings();
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
}
