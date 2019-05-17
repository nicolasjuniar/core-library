package juniar.core.network

class BaseNetworkRepository<T : BaseNetworkService>(private val baseNetworkService: T) : BaseRepository