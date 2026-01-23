/*
 * SPDX-FileCopyrightText: 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.mediatek.common.util;

import android.content.Context;
import java.util.List;

public class OperatorCustomizationFactoryLoader {
    public static class OperatorFactoryInfo {
        public OperatorFactoryInfo(String libName, String factoryName, String packageName, 
                                   String operator) {}
    }

    public static Object loadFactory(Context context, List<OperatorFactoryInfo> list) {
        return null;
    }
}
