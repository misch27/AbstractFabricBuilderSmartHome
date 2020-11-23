interface Builder {
    fun designRoom(name: String)

    fun designAttic()

    fun designPool()

    fun designGarage(garageFloor: Int)

    fun setSmartLight(light: SmartLight)

    fun setSmartButton(button: SmartButton)
}