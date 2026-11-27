# Day 08 - CSS Selectors and Types of XPath

## CSS Selector

Today I practiced different ways of writing CSS selectors to identify web elements.

### Types of CSS Selectors

1. **ID Selector** - `tagname#idvalue`
2. **Class Selector** - `tagname.classvalue`
3. **Attribute Selector** - `tagname[attribute='value']`

We can also use special symbols to locate elements based on attribute values.

- `^=` - Selects elements whose attribute value starts with the given value.
- `$=` - Selects elements whose attribute value ends with the given value.

## What is XPath?

XPath stands for **XML Path Language**. It is used to identify elements through the HTML structure of a web page.

XPath is useful when other locators cannot identify an element easily or when the element value is not unique.

## Types of XPath

There are two types of XPath:

### 1. Absolute XPath

Absolute XPath starts from the root element of the HTML page and follows the complete path to reach the required element.

- It uses a single slash `/`.
- It starts from the `html` tag.
- It follows the complete path of the element.
- It can be difficult to write and maintain.
- If the page structure changes, the XPath may stop working.

Example:

`/html/body/div[1]/form/input[2]`

### 2. Relative XPath

Relative XPath can locate an element from anywhere in the HTML document.

- It uses double slashes `//`.
- It is commonly used in Selenium automation.
- It is easier to write and maintain compared to absolute XPath.

Examples:

- `//input[@id='idvalue']`
- `//input[@class='classvalue']`
- `//input[@name='namevalue']`

## Practical

Created a Java program named `LocatorsDemo.java` to practice CSS selectors and XPath.

## What I Learned

- Revised CSS selectors using ID, class and attribute values.
- Learned how to use `^=` to identify attribute values that start with specific text.
- Learned how to use `$=` to identify attribute values that end with specific text.
- Understood the meaning and use of XPath.
- Learned the difference between Absolute XPath and Relative XPath.
- Understood why Absolute XPath is difficult to maintain.
- Learned why Relative XPath is commonly used in Selenium.
- Practiced writing Relative XPath using ID, class and name attributes.
- Revised all 8 Selenium locators.

## Outcome

Gained knowledge of different XPath types and learned how to identify web elements using CSS selectors and XPath.

## Coming Next

- WebElement methods.
- Getting text and attribute values.
- Checking element states.
