package digital.wup.superheroapp.api

@MustBeDocumented
expect annotation class GET(val value: String = "")

@MustBeDocumented
expect annotation class Path(val value: String, val encoded: Boolean = false)