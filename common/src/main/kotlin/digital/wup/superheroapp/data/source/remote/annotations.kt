package digital.wup.superheroapp.data.source.remote

expect annotation class GET(val value: String = "")

expect annotation class Path(val value: String, val encoded: Boolean = false)