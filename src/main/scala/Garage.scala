/**
  * Created by Administrator on 15/06/2017.
  */
class Garage(var isOpen: Boolean) {
    val random = scala.util.Random

    var vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
    var employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
    var partArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]

    partArrayBuffer += new Part("Engine")
    partArrayBuffer += new Part("Gear Box")
    partArrayBuffer += new Part("Front Light")
    partArrayBuffer += new Part("Back Light")
    partArrayBuffer += new Part("Transmission")
    partArrayBuffer += new Part("Ignition")
    partArrayBuffer += new Part("Fuel Tank")
    partArrayBuffer += new Part("Indicators")
    partArrayBuffer += new Part("Battery")
    partArrayBuffer += new Part("Exhaust")
    partArrayBuffer += new Part("Suspension")
    partArrayBuffer += new Part("Filtration")
    partArrayBuffer += new Part("Brake Pad")
    partArrayBuffer += new Part("Piston Ring")
    partArrayBuffer += new Part("Sump Plug")
    partArrayBuffer += new Part("Oil Pump")
    partArrayBuffer += new Part("Timing Belt")
    partArrayBuffer += new Part("Turbo Charger")
    partArrayBuffer += new Part("Drive Belt")
    partArrayBuffer += new Part("Head Bolt")
    partArrayBuffer += new Part("Starter Motor")
    partArrayBuffer += new Part("Alternator")
    partArrayBuffer += new Part("Spring")
    partArrayBuffer += new Part("Engine Part")
    partArrayBuffer += new Part("Catalytic Converter")
    partArrayBuffer += new Part("Accelerator Cable")
    partArrayBuffer += new Part("Clutch Cable")
    partArrayBuffer += new Part("Catch")
    partArrayBuffer += new Part("Wheel Bolt")
    partArrayBuffer += new Part("Vacuum Pumps")
    partArrayBuffer += new Part("Calipers")

    def addVehicle(vehicle: Vehicle): Unit = {
        //assign id
        if (vehicleArrayBuffer.isEmpty) {
            vehicle.id = 1
        } else {
            vehicle.id = vehicleArrayBuffer.last.id + 1
        }
        //add to array buffer
        vehicleArrayBuffer += vehicle
        //assign broken parts
        vehicle.parts = partArrayBuffer
        vehicle.parts.foreach(x => {
            x.fixTime = 1 + random.nextInt(10)
            x.price = 10 + random.nextInt(40)
            x.isBroken = math.random < 0.5
        })
    }

    def removeVehicleByID(id: Int): Unit = {
        vehicleArrayBuffer.foreach(x => if (x.id == id) {
            vehicleArrayBuffer -= x
            return
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
        println(s"Vehicle ${vehicle.id} will take $hours hours to fix and cost £$price.")
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