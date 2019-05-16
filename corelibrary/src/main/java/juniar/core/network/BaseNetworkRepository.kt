package juniar.core

import juniar.core.network.BaseNetworkService
import juniar.core.network.BaseRepository
import javax.inject.Inject

class BaseNetworkRepository @Inject constructor(protected val baseNetworkService: BaseNetworkService) : BaseRepository