interface SmartThingsFactory {
    fun createButton(): SmartButton
    fun createLight(): SmartLight
}