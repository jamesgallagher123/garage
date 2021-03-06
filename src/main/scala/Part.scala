/**
  * Created by Administrator on 15/06/2017.
  */
class Part(val name: String) {
    var fixTime = 0
    var price = 0
    var isBroken = false
    override def toString: String = {
        var outputString: String = s"Name $name. Price: £$price. Time taken to fix: $fixTime hours. "
        if (isBroken) {
            outputString += "Broken."
        } else {
            outputString += "Not broken."
        }
        return outputString
    }
}