from person import Person

# instantiate Person objects
john = Person("john", 28)
amy = Person("amy", 32)

# add instance attributes
john.hair = "blonde"
print(john.hair)

# add class attributes
Person.y = "test"
print(Person.y)
