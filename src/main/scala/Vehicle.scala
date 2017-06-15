/**
  * Created by Administrator on 15/06/2017.
  */
abstract class Vehicle {
    var id: Int = 1
    if (vehicleArrayBuffer.isEmpty) {
        id = 1
    } else {
        id = vehicleArrayBuffer.last.id + 1
    }
    val model: String
    val reg: String
    val tyres: Int
    var colour: String
    var parts = scala.collection.mutable.ArrayBuffer.empty[Part]
    parts = partArrayBuffer
    parts.foreach(x => {
        x.fixTime = 1 + random.nextInt(10)
        x.price = 10 + random.nextInt(40)
        x.isBroken = math.random < 0.5
    })
    garage.addVehicle(this)
}