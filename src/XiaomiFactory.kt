class XiaomiFactory: SmartThingsFactory {
    override fun createButton(): SmartButton {
        return XiaomiSmartButton()
    }

    override fun createLight(): SmartLight {
        return XiaomiLight()
    }
}