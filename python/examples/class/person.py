class Person:

    # class attribute
    x = 7

    def __init__(self, name, age):
        # instance attributes
        self.name = name
        self._age = age # underscore is the convention for private attributes

    def __str__(self):
        return "{} - {}".format(self.name, self._age)
