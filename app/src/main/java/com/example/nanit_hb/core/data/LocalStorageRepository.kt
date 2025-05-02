package com.example.nanit_hb.core.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.example.nanit_hb.core.domain.ILocalStorageRepository
import kotlinx.coroutines.flow.firstOrNull

class LocalStorageRepository(
    private val dataStore: DataStore<Preferences>,
) : ILocalStorageRepository {
  private object PreferencesKeys {
    val LAST_IP = androidx.datastore.preferences.core.stringPreferencesKey("last_ip")
    val LAST_PORT = androidx.datastore.preferences.core.intPreferencesKey("last_port")
  }

  override suspend fun getConnectionValues(): Pair<String, Int>? {
    val preferences =
        dataStore.data.firstOrNull { prefs ->
          prefs.contains(PreferencesKeys.LAST_IP) && prefs.contains(PreferencesKeys.LAST_PORT)
        }
    if (preferences != null)
        return (preferences[PreferencesKeys.LAST_IP] ?: "") to
            (preferences[PreferencesKeys.LAST_PORT] ?: 0)

    return null
  }

  override suspend fun updateConnectionValues(lastIp: String, lastPort: Int) {
    dataStore.edit { preferences ->
      preferences[PreferencesKeys.LAST_IP] = lastIp
      preferences[PreferencesKeys.LAST_PORT] = lastPort
    }
  }

  override suspend fun clearConnectionValues() {
    dataStore.edit { preferences ->
      if (preferences.contains(PreferencesKeys.LAST_IP)) {
        preferences.remove(PreferencesKeys.LAST_IP)
      }
      if (preferences.contains(PreferencesKeys.LAST_PORT)) {
        preferences.remove(PreferencesKeys.LAST_PORT)
      }
    }
  }
}
