/**
  * Created by Administrator on 15/06/2017.
  */
class Garage(var isOpen: Boolean) {
    def addVehicle(vehicle: Vehicle): Unit = {
        vehicleArrayBuffer += vehicle
    }

    def removeVehicleByID(id: Int): Unit = {
        vehicleArrayBuffer.foreach(x => if (x.id == id) {
            vehicleArrayBuffer -= x
        })
    }

    def removeVehicleByType(classType: String): Unit = {
        classType match {
            case "Car" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Car]) vehicleArrayBuffer -= x)
            case "Bike" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Bike]) vehicleArrayBuffer -= x)
            case _ => println("Please enter string Car or Bike.")
        }
    }

    def viewContents(): Unit = {
        println("Vehicles:")
        if (vehicleArrayBuffer.isEmpty) {
            println("There are no vehicles.")
        } else {
            vehicleArrayBuffer.foreach(println)
        }
        println("Employees:")
        if (employeeArrayBuffer.isEmpty) {
            println("There are no employees.")
        } else {
            employeeArrayBuffer.foreach(println)
        }
    }

    def fix(vehicle: Vehicle): Unit = {
        var price: Int = 0
        var hours: Int = 0
        vehicle.parts.foreach(x => {
            if (x.isBroken) {
                price += x.price
                hours += x.fixTime
                x.isBroken = false
            }
        })
        println(s"The vehicle will take $hours hours to fix and cost £$price.")
    }

    def registerEmployee(employee: Employee): Unit = {
        employeeArrayBuffer += employee
    }

    def open(): Unit = {
        this.isOpen = true
    }

    def close(): Unit = {
        this.isOpen = false
    }
}
