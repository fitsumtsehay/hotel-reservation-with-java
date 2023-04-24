## A hotel reservation application that allows customers to find and book a hotel room. 
### Introduction:
This is a Java application that implements a simple hotel reservation system. The system provides a command-line interface for users to find and book available rooms, view their reservations, create customer accounts, and access an admin menu.
### Classes and Interfaces:
#### Customer: This class contains the details of a customer, including their first name, last name, and email. The constructor of this class checks whether the email address provided is in a valid format using regular expressions.

CustomerService: This class contains methods for adding a new customer, retrieving a customer by email, and getting a list of all customers.

IRoom: This interface defines the methods that must be implemented by any class that represents a room, including methods to retrieve the room number, price, room type, and whether the room is free.

RoomType: This enum defines two values for the room type, SINGLE and DOUBLE, along with their respective labels. It also provides a method to retrieve the RoomType value based on its label.

Room: This class represents a room and has a room number, price, and room type as parameters. It also implements the IRoom interface and provides implementations for the methods defined in that interface. It also overrides the equals() and hashCode() methods to enable object comparison.

FreeRoom: This subclass of the Room class represents a free room. It has a room number and a room type as parameters.

Reservation: This class contains the details of a reservation, including the customer, the room, and the check-in and check-out dates.

ReservationService: This class is responsible for managing the system's reservations. It has methods for creating new customers, booking rooms, retrieving reservations for a customer, and finding available rooms for a given date range.

MainMenu: This class provides the main menu for the hotel reservation system. It includes options for finding and reserving a room, viewing a customer's reservations, creating a new customer account, accessing the admin menu, and exiting the application.

AdminResource: This class provides methods for managing the system's customers and rooms. It has methods for adding rooms, retrieving all rooms and customers, and displaying all reservations.

Functionality:

The findAndReserveRoom() method allows users to search for available rooms by entering check-in and check-out dates. If there are no available rooms for the specified dates, the method provides alternative dates with available rooms. If the user chooses to book a room, they are prompted to provide their email address and select a room from the list of available rooms.

The reserveRoom() method allows users to reserve a room by booking it and creating a reservation for the specified dates. If the user has an existing account, they can enter their email address to book the room. If they do not have an account, they are prompted to create a new one.

Both the MainMenu and AdminResource classes make use of the CustomerService and ReservationService classes, which are responsible for managing the system's customers and reservations. The classes use the Singleton pattern to ensure that there is only one instance of each class.

Conclusion:
This Java application provides a simple yet effective hotel reservation system with various features for users to interact with. The application is designed to be easy to use and maintain, with well-organized classes and interfaces, and follows industry-standard design patterns such as Singleton.
[](https://user-images.githubusercontent.com/63597726/233846826-ba397815-ec3d-434b-9e91-365f76d0cb00.mp4)

