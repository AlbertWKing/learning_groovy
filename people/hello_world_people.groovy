class Person {
    String firstName
    String lastName
    int age
    String FullName() {firstName + " " + lastName}
}

Person person = new Person(
    firstName: "John",
    lastName: "Doe",
    age: 40)

println person.FullName()

println person.age

Person jerry = new Person(
    firstName: "Gerald",
    lastName: "Blake",
    age: 20
)

println jerry.FullName()


Person marcus = new Person()
marcus.setFirstName("Marcus")
marcus.setLastName("Lane")
marcus.setAge(25)

println marcus.FullName()
println marcus.getAge()
println marcus.age

println person.age

// okay well this is incredibly weird, you have to define the list once, but after that you *can't*
// use def again, you have to just redefine it???

def persons = [person.FullName(), jerry.FullName(), marcus.FullName()]

persons = [person, jerry, marcus]

for (Person p : persons) {
    println p.FullName()
}

// println persons


