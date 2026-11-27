# Day 07 - XPath and CSS Selector Practice

## CSS Selector Revision

Today I revised CSS selectors and practiced how to identify web elements using different CSS selector methods.

1. **ID selector** - Uses the ID value of an element.
2. **Class selector** - Uses the class value of an element.
3. **Attribute selector** - Uses an attribute and its value.

CSS selectors are useful when we need to identify elements using their attributes.

## What is XPath?

XPath stands for **XML Path Language**. It is used to locate elements on a web page by using the HTML structure.

XPath is useful when other locators are not suitable or when we need to identify an element using its text or attributes.

### XPath Syntax

`//tagname[@attribute='attributevalue']`

- `//` searches for an element anywhere in the page.
- `tagname` represents the HTML tag.
- `@` is used before the attribute name.
- The attribute value is written inside the single quotes.

### XPath Using Text

We can also locate links using their visible text.

1. `//a[text()='link text']`
2. `//a[.='link text']`

Here, `a` represents the anchor tag used for links. The dot (`.`) is used to check the element's text.

### XPath Using Index

Sometimes multiple elements match the same XPath. We can use an index to select a particular element.

Example:

`(//a[text()='link text'])[1]`

Here, `[1]` selects the first matching element.

## Practical

Created a Java program named `XPathCssDemo.java` to practice CSS selectors and XPath expressions.

## What I Learned

- Revised CSS selector syntax and understood its usage.
- Learned what XPath is and why it is used in Selenium.
- Understood XPath syntax using tag name, attribute and attribute value.
- Learned how to locate links using visible text.
- Understood the difference between `text()` and `.` in XPath.
- Learned how to use an index when XPath matches multiple elements.
- Understood why an XPath should identify the correct element.

## Outcome

Learned how to write XPath expressions using attributes and text and how to identify a particular element when multiple matches are found.

## Coming Next

- More CSS selector examples.
- Absolute XPath and Relative XPath.
- Practice using all Selenium locators.
