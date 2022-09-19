package structural

interface ISubject {
    fun request()
}

class Subject : ISubject {
    override fun request() {
    }
}

class Proxy() : ISubject {

    var subject: Subject? = null

    override fun request() {
        if (subject == null)
            subject = Subject()
        return subject!!.request()
    }
}

