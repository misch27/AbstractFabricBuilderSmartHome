fun main() {
    val homeFormat = "flat"
    val smartFirm = "siemens"

    val homeBuilder = if (homeFormat == "flat") FlatBuilder() else СountryHouseBuilder()
    homeBuilder.designRoom("bathroom")
    homeBuilder.designRoom("sleeping room")
    homeBuilder.designRoom("kitchen")
    homeBuilder.designGarage(-1)

    val smartFactory = if (smartFirm == "siemens") SiemensFactory() else XiaomiFactory()

    val kitchenLight = smartFactory.createLight()
    val sleepingButton = smartFactory.createButton()
    homeBuilder.setSmartButton(sleepingButton)
    homeBuilder.setSmartLight(kitchenLight)


}