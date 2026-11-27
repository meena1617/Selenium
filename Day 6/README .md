# Day 06 - Locator Syntax and CSS Selectors

## Syntax of a Locator

Before writing any locator, first understand the syntax. Every element on a web page follows this order:

1. **Tag name**
2. **Attribute**
3. **Attribute value**

- A tag can have one or many attributes, and each attribute has a value.
- Attribute name examples: `id`, `name`, `class`, link text and partial link text.
- Attribute value is the value given to that attribute by the web developer.
- Example: for the Google logo, the tag may have an `id` attribute with the value `logo`.

## 8 Locators in Selenium

1. **id** - Uses the `id` attribute value of the element.
2. **name** - Uses the `name` attribute value.
3. **className** - Uses the `class` attribute value.
4. **tagName** - Uses the HTML tag name, for example `input` or `a`.
5. **linkText** - Uses the full visible text of a link.
6. **partialLinkText** - Uses part of the visible text of a link.
7. **cssSelector** - Uses tag name, attribute and attribute value.
8. **xpath** - Uses the path of the element in the HTML.

Locators 1 to 6 are simple and used first. CSS selector and XPath are useful when the element cannot be identified easily with the other locators.

## CSS Selector

CSS selectors are of four types:

1. Simple selector
2. Attribute selector
3. Pseudo-class selector
4. Combinator selector

In our initial practice, we focus mainly on **simple selector** and **attribute selector**.

### Simple Selector

Uses the tag name and the ID or class value.

### Attribute Selector

Uses the tag name, the attribute and the attribute value.

### How to Write

- With ID: `tagname#idvalue`
- With class: `tagname.classvalue`
- With any attribute: `tagname[attribute='value']`

## What I Learned

- Understood the basic syntax of a locator.
- Learned about all 8 locators available in Selenium.
- Understood when to use simple locators and CSS selectors.
- Learned the difference between simple selectors and attribute selectors.
- Practiced writing CSS selectors using ID, class and other attributes.
- Understood how `#`, `.` and square brackets are used in CSS selectors.

## Outcome

Gained basic knowledge of Selenium locators and learned how to identify web elements using CSS selectors.

## Coming Next

- XPath.
- More CSS selector practice.
