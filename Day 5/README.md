# Day 05 - Opening Multiple Browsers

## Exception When an Element is Not Found

Today I learned that when Selenium cannot find a web element, it throws an exception. When an exception occurs, the remaining code will not execute. So we need to identify the element correctly to continue the execution.

## Opening Multiple Browsers

I learned how to open multiple browsers using Selenium. The requirement was to open Chrome, Firefox and Edge browsers and close them after the program execution.

## Approach

I understood how to create separate methods for each browser. Each method creates a WebDriver object, opens the required URL and maximizes the browser window.

## Why Declare the Driver at Class Level?

I learned that the driver list is declared outside the methods at class level. This allows us to access the list from different methods. If it is declared inside one method, other methods cannot directly access it.

## Why Use a List?

Since we are opening multiple browsers, we need to store multiple WebDriver objects. I learned how to use List and ArrayList to store these objects.

## For-Each Loop

I learned how to use a for-each loop to access every WebDriver object in the list. Using this loop, we can close all the browsers one by one.

## What I Learned

Today I learned how to open different browsers using Selenium, store WebDriver objects in an ArrayList and close all browsers using a for-each loop.
