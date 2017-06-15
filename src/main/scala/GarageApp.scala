/**
  * Created by Administrator on 15/06/2017.
  */
object GarageApp {
    def main(args: Array[String]){
        var vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
        var employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
        var partArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]
        val random = scala.util.Random
        val garage = new Garage(true)
        var engine = new Part("Engine")
        var gearBox = new Part("Gear Box")
        var frontLight = new Part("Front Light")
        var backLight = new Part("Back Light")
        var transmission = new Part("Transmission")
        var ignition = new Part("Ignition")
        var fuelTank = new Part("Fuel Tank")
        var indicators = new Part("Indicators")
        var battery = new Part("Battery")
        var exhaust = new Part("Exhaust")
        var suspension = new Part("Suspension")
        var filtration = new Part("Filtration")
        var brakePad = new Part("Brake Pad")
        var pistonRing = new Part("Piston Ring")
        var sumpPlug = new Part("Sump Plug")
        var oilPump = new Part("Oil Pump")
        var timingBelt = new Part("Timing Belt")
        var turboCharger = new Part("Turbo Charger")
        var driveBelt = new Part("Drive Belt")
        var headBolt = new Part("Head Bolt")
        var starterMotor = new Part("Starter Motor")
        var alternator = new Part("Alternator")
        var spring = new Part("Spring")
        var engineMount = new Part("Engine Part")
        var catalyticConverter = new Part("Catalytic Converter")
        var acceleratorCable = new Part("Accelerator Cable")
        var clutchCable = new Part("Clutch Cable")
        var clutch = new Part("Catch")
        var wheelBolt = new Part("Wheel Bolt")
        var vacuumPumps = new Part("Vacuum Pumps")
        var calipers = new Part("Calipers")
        val employee1 = new Employee("James", "Gallagher", "10/09/95", "2 Ogden Street", "M25 1JL",
            "james.gallagher@qa.com", "07892952449", 1, "Scala Developer")
        val customer1 = new Customer("Adam", "Dye", "15/02/93", "10 Scouse Lane", "L10 123",
            "adam.dye@qa.com", "078989898998", 1)
        val car1 = new Car("Ford Focus", "ABC123", 4, 5, "Red")
        val bike1 = new Bike("Yamaha", "XYZ123", 2, "Pink")


        car1.parts.foreach(println)
        garage.fix(car1)

        //garage.registerEmployee(employee1)
        //garage.removeVehicleByID(1)
        // garage.removeVehicleByType("Bike")
        //garage.viewContents()
    }
}