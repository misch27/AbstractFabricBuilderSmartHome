class SiemensFactory: SmartThingsFactory {
    override fun createButton(): SmartButton {
        return SiemensSmartButton()
    }

    override fun createLight(): SmartLight {
        return SiemensLight()
    }
}