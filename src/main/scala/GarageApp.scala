/**
  * Created by Administrator on 15/06/2017.
  */
object GarageApp {
    def main(args: Array[String]){

        val employee1 = new Employee("James", "Gallagher", "10/09/95", "2 Ogden Street", "M25 1JL",
            "james.gallagher@qa.com", "07892952449", 1, "Scala Developer")
        val customer1 = new Customer("Adam", "Dye", "15/02/93", "10 Scouse Lane", "L10 123",
            "adam.dye@qa.com", "078989898998", 1)
        val car1 = new Car("Ford Focus", "ABC123", 4, 5, "Red")
        val bike1 = new Bike("Yamaha", "XYZ123", 2, "Pink")

        val garage = new Garage(true)

        garage.addVehicle(car1)
        car1.parts.foreach(println)
        println
        garage.fix(car1)

        //garage.registerEmployee(employee1)
        //garage.removeVehicleByID(1)
        // garage.removeVehicleByType("Bike")
        //garage.viewContents()
    }
}