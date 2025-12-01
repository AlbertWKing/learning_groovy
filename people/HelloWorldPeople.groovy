// From LinkedIn Learning video https://www.linkedin.com/learning/learning-groovy/classes-and-methods?resume=false&u=0

class HelloWorldPeople {
    static void main(String[] args) {
        Person person = new Person()
        person.setFirstName("John")
        person.setLastName("Doe")
        person.setAge(40)
        
        println person.getFullName()
        println person.getAge()
    }
}
