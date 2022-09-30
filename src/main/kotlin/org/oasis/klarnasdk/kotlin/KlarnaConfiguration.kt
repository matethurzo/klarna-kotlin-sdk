package org.oasis.klarnasdk.kotlin

class Region private constructor(
    private val region: String
) {

    companion object {
        val na = Region("na")

        val us = na
        val ca = na
        val mx = na

        val eu = Region("eu")

        val uk = eu
        val gb = eu
        val at = eu
        val de = eu
        val se = eu
        val es = eu
        val pt = eu
        val gr = eu
        val hu = eu

        val oc = Region("oc")

        val ap = oc
        val au = oc
        val nz = oc
    }

    override fun toString(): String = this.region

    override fun equals(other: Any?): Boolean =
        if (other is Region) {
            region == other.region
        } else {
            false
        }

}

fun configuration(init: KlarnaConfiguration.() -> Unit): KlarnaConfiguration {
    val config = KlarnaConfiguration()
    config.init()
    return config
}

class KlarnaConfiguration {

    var credentials: Pair<String, String> = "" to ""
    var idempotencyKey: String? = null
    var region: Region = Region.eu
    var testMode: Boolean = false

    fun credentials(creds: () -> Pair<String, String>) {
        this.credentials = creds.invoke()
    }

    fun idempotencyKey(key: () -> String) {
        this.idempotencyKey = key.invoke()
    }

    fun region(r: () -> Region) {
        this.region = r.invoke()
    }

    fun testMode(tm: () -> Boolean) {
        this.testMode = tm.invoke()
    }

    fun klarnaEndpoint() =
        when (region) {
            Region.na, Region.oc -> "https://api-${region}.${if (testMode) "playground." else ""}klarna.com"
            else -> "https://api.playground.klarna.com"
        }

    fun mergeConfiguration(other: KlarnaConfiguration): KlarnaConfiguration {
        return this
    }

}
