from person import Person

# instantiate Person objects
john = Person("john", 28)
amy = Person("amy", 32)

# each object gets their own instance attributes
print(john.name is amy.name)

# all instances share class attributes
print(john.x is amy.x is Person.x)
