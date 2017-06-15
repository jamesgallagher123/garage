/**
  * Created by Administrator on 15/06/2017.
  */
object GarageApp {
    def main(args: Array[String]){

        val garage = new Garage(true)

        val employee1 = new Employee("James", "Gallagher", "10/09/95", "2 Ogden Street", "M25 1JL",
            "james.gallagher@qa.com", "07892952449", 1, "Scala Developer")

        for (x <- 1 to 5) {
            garage.addVehicle(new Car("Ford Focus", "ABC123", 4, 5, "Red"))
        }



        //garage.registerEmployee(employee1)
        //garage.removeVehicleByID(1)
        //garage.removeVehicleByType("Bike")
        //garage.viewContents()

    }
}