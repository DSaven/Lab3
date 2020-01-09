import java.io.File

class LogOpenListener : EventListener {
    private lateinit var log: File

    constructor(fileName: String) {
        log = File(fileName)
    }

    override fun update(eventType: String, file: File) {
        println("File save to $log: Someone has performed $eventType operation with this file: ${file.name}")
    }
}