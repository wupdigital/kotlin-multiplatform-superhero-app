package digital.wup.superheroapp.api

import org.springframework.web.bind.annotation.Mapping

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Mapping
actual annotation class GET(actual val value: String = "")

@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
actual annotation class Path(actual val value: String, actual val encoded: Boolean = false)