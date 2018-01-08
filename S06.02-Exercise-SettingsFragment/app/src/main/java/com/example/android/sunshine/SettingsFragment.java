package com.example.android.sunshine;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by matev on 2018. 01. 08..
 */

public class SettingsFragment extends PreferenceFragmentCompat
        implements Preference.OnPreferenceChangeListener {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_general);

        Preference prefLocation = findPreference(getString(R.string.pref_location_key));
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(prefLocation.getContext());
        prefLocation.setOnPreferenceChangeListener(this);
        onPreferenceChange(prefLocation, sharedPreferences.getString(prefLocation.getKey(), ""));
    }


    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        String value = newValue.toString();
        preference.setSummary(value);
        return true;
    }
}