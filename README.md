# Decorator Design Pattern for Restaurant Order System

## Overview
This project implements a software system for a restaurant to manage customer orders. Customers can order various food items like burgers, fries, and hot dogs, each with a base price and optional toppings that increase the price. The system allows for creating new food items, calculating total order costs, and applying discounts based on customer loyalty status.

## Design
The system uses the decorator design pattern to add toppings to food items dynamically. Each food item is represented by a class implementing a `FoodItem` interface, and toppings are represented by decorator classes that extend `FoodItem`.

## Classes
- `FoodItem`: Interface defining methods for getting the name, price, and toppings of a food item.
- `Burger`, `Fries`, `Hotdog`: Concrete implementations of `FoodItem` representing base food items.
- `ToppingDecorator`: Abstract decorator class extending `FoodItem` and containing a reference to a `FoodItem` object.
- `CheeseTopping`, `SpreadTopping`, `KetchupTopping`: Concrete decorator classes adding specific toppings to food items.

## Order Management
- `Order`: Class representing a customer's order, containing a list of food items and toppings. It calculates the total cost of the order.
- `Loyalty`: Class representing customer loyalty status, with a method to apply a discount to the total order cost based on the status.

## Usage
1. Create instances of base food items (`Burger`, `Fries`, `Hotdog`) with their base prices.
2. Add toppings to food items using decorator classes (`CheeseTopping`, `SpreadTopping`, `KetchupTopping`).
3. Create an order by adding food items with toppings.
4. Apply a loyalty discount to the order based on the customer's status using the `Loyalty` class.

