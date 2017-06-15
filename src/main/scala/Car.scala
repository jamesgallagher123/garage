/**
  * Created by Administrator on 15/06/2017.
  */
class Car(val model: String,
          val reg: String,
          val tyres: Int,
          var doors: Int,
          var colour: String) extends Vehicle() {
    override def toString: String = {
        s"ID: $id. Model: $model. Reg: $reg. Tyres: $tyres. Doors: $doors. Colour: $colour."
    }
}