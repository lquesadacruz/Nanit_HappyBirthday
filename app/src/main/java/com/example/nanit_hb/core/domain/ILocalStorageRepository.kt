package com.example.nanit_hb.core.domain

interface ILocalStorageRepository {
  suspend fun getConnectionValues(): Pair<String, Int>?

  suspend fun updateConnectionValues(lastIp: String, lastPort: Int)

  suspend fun clearConnectionValues()
}
