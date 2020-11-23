import java.util.NoSuchElementException

class FlatBuilder : Builder {

    data class FlatPlace(
        val roomName: String,
        val roomFloor: Int? = null
    )

    private val drawingHouse: MutableList<FlatPlace> = mutableListOf()

    override fun designRoom(name: String) {
        drawingHouse.add(
            FlatPlace(name)
        )
    }

    override fun designAttic() {
        throw NoSuchMethodException("the attic cannot be placed in the flat")
    }

    override fun designPool() {
        throw NoSuchMethodException("the pool cannot be placed in the flat")
    }

    override fun designGarage(garageFloor: Int) {
        if (garageFloor<=0) {
        drawingHouse.add(
            FlatPlace(
                roomName = "garage",
                roomFloor = garageFloor
            )
        )
        } else {
            throw NoSuchElementException("In an flat the garage can only be lower than the ground")
        }
    }

    override fun setSmartLight(light: SmartLight) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setSmartButton(button: SmartButton) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.Templates
    }
}