package cn.spacexc.wearbili.remake.app.search.domain.remote.hot

data class HotSearch(
    val call_reason: Int,
    val goto_type: Int,
    val goto_value: String,
    val heat_layer: String,
    val hot_id: Int,
    val icon: String,
    val id: Int,
    val keyword: String,
    val live_id: List<Any>,
    val name_type: String,
    val pos: Int,
    val resource_id: Int,
    val score: Double,
    val show_name: String,
    val stat_datas: StatDatas,
    val status: String,
    val word_type: Int
)