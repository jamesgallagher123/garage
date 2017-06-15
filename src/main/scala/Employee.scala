/**
  * Created by Administrator on 15/06/2017.
  */
class Employee(val firstName: String,
               var surname: String,
               val dateOfBirth: String,
               val address: String,
               var postcode: String,
               var email: String,
               var phoneNumber: String,
               val employeeID: Int,
               var job: String) extends Person() {
    override def toString: String = {
        s"Name: $firstName $surname. DOB: $dateOfBirth. Address: $address. Postcode: $postcode. Email: $email. Phone number: $phoneNumber. ID: $employeeID. Job: $job."
    }
}