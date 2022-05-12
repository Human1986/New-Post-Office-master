# Collection iterating
 
The purpose of this exercise is to train you to work with collections, namely create and add elements, iterate over them to perform operations on each element.

Estimated time - 60 minutes.

## Description

In this task, you will simulate the work of one of the New Post offices, which can take parcels/boxes in the range of 0.5 - 20 kg in weight and no more than 0.25 m3 in volume.

You have the Box class that describes a parcel. 
The parcel has the following characteristics: sender, recipient, weight, volume, cost. All characteristics, except for the cost, is passed to the constructor to create an object. 
The cost is calculated based on the value of weight, volume, and value.

The `NewPostOffice` class has:
- `NewPostOffice()` - creates an office (an empty collection of parcels);
- `Collection<Box> getListBox()` - returns a collection of parcels in the office;
- `static BigDecimal calculateCostOfBox(double weight, double volume, int value)` - calculates the cost of a parcel.

Please, proceed to the NewPostOffice class and implement its methods using an iterator:
- `Collection<Box> deliveryBoxToRecipient(String recipient)` - returns all parcels of the specified recipient. Parcels found must be removed from the office.
- `void declineCostOfBox(double percent)` - changes the cost of each parcel in the office by the specified percent.
- `boolean addBox(String sender, String recipient, double weight, double volume, int value)` – creates a parcel, calculates its cost and adds it to the office.

### Details:

- The sender and receiver must exist
- The weight must be in the range 0.5 - 20.0 kg
- The volume must be greater than zero and less than 0.25 m3
- The value must be greater than zero
- If the above data gets invalid values, then the java.lang.IllegalArgumentException is thrown


### Restriction:
- it is forbidden to use Lambda and Streams API.
