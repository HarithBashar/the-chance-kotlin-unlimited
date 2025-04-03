package month_1.w1_ipv4_app

fun main() {

}

fun isIpv4Valid(ip: String): Boolean {
    val ipList: List<String> = ip.split('.')
    if (ipList.size != 4) return false
    ipList.forEach {
        try {
            if (it.length > 1 && it.startsWith('0')) return false
            val segment: Int = it.toInt()
            if (segment < 0 || segment > 255) return false
        } catch (e: Exception) {
            return false
        }
    }

    return true
}
