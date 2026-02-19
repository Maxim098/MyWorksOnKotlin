package CollectionAndGenerics

import java.time.LocalTime

class Wrapper<T> {
    val obj: T
    val currentTimeCreate: LocalTime

    constructor(obj: T) {
        this.obj = obj
        currentTimeCreate = LocalTime.now()
    }
}