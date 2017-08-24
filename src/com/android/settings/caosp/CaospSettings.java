package com.android.settings.caosp;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import com.android.internal.logging.nano.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class CaospSettings extends SettingsPreferenceFragment implements
        Preference.OnPreferenceChangeListener {
    private static final String TAG = "CaospSettings";

    public static final String CATEGORY_CAOSP = "com.android.settings.category.ia.caosp";

    @Override
    public int getMetricsCategory() {
        return MetricsEvent.CAOSP_SETTINGS;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.caosp_settings);
    }

    public boolean onPreferenceChange(Preference preference, Object objValue) {

        return true;
    }
}
