### Learnings

JavaScript is a scripting language you can use to make web pages interactive. It is one of the core technologies of the web, along with HTML and CSS, and is supported by all modern browsers.

#### [Comment Your JavaScript Code](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/001-comment-your-javascript-code.js)
- There are two ways to write comments in JavaScript:
    1. Using // will tell JavaScript to ignore the remainder of the text on the current line. This is an in-line comment.
    2. You can make a multi-line comment beginning with /* and ending with */.
-  As you write code, you should regularly add comments to clarify the function of parts of your code. Good commenting can help communicate the intent of your code—both for others and for your future self.

#### [Declare JavaScript Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/002-declare-javascript-variables.js)
- JavaScript provides eight different data types which are undefined, null, boolean, string, symbol, bigint, number, and object.
- Variables allow computers to store and manipulate data in a dynamic fashion. They do this by using a "label" to point to the data rather than using the data itself. Any of the eight data types may be stored in a variable.
- In JavaScript we end statements with semicolons.
- Variable names can be made up of numbers, letters, and $ or _, but may not contain spaces or start with a number.

#### [Storing Values with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/003-storing-values-with-the-assignment-operator.js)
- In JavaScript, you can store a value in a variable with the assignment operator (=).
- If there are any calculations to the right of the = operator, those are performed before the value is assigned to the variable on the left of the operator.

#### [Assigning the Value of One Variable to Another](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/004-assigning-the-value-of-one-variable-to-another.js)
- After a value is assigned to a variable using the assignment operator, you can assign the value of that variable to another variable using the assignment operator.

#### [Initializing Variables with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/005-initializing-variables-with-the-assignment-operator.js)
- It is common to initialize a variable to an initial value in the same line as it is declared.

#### [Declare String Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/006-declare-string-variables.js)
- "your name" is called a string literal. A string literal, or string, is a series of zero or more characters enclosed in single or double quotes.

#### [Understanding Uninitialized Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/007-understanding-uninitialized-variables.js)
- When JavaScript variables are declared, they have an initial value of undefined. If you do a mathematical operation on an undefined variable your result will be NaN which means "Not a Number". If you concatenate a string with an undefined variable, you will get a string of undefined.

#### [Understanding Case Sensitivity in Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/008-understanding-case-sensitivity-in-variables.js)
- MYVAR is not the same as MyVar nor myvar.
- Best Practice: Write variable names in JavaScript in camelCase. In camelCase, multi-word variable names have the first word in lowercase and the first letter of each subsequent word is capitalized.

#### [Explore Differences Between the var and let Keywords](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/009-explore-differences-between-the-var-and-let-keywords.js)
- One of the biggest problems with declaring variables with the var keyword is that you can easily overwrite variable declarations:
    ```
    var camper = "James";
    var camper = "David";
    console.log(camper);
    ```
- A keyword called `let` was introduced in ES6, a major update to JavaScript, to solve this potential issue with the var keyword.

#### [Declare a Read-Only Variable with the const Keyword](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/010-declare-a-read-only-variable-with-the-const-keyword.js)
- The keyword `let` is not the only new way to declare variables. In ES6, you can also declare variables using the `const` keyword.
- `const` has all the awesome features that `let` has, with the added bonus that variables declared using const are read-only. They are a constant value, which means that once a variable is assigned with const, it cannot be reassigned.

#### [Add Two Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/011-add-two-numbers-with-javascript.js)
- Number is a data type in JavaScript which represents numeric data.
- JavaScript uses the `+` symbol as an addition operator when placed between two numbers.

#### [Subtract One Number from Another with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/012-subtract-one-number-from-another-with-javascript.js)
- JavaScript uses the `-` symbol for subtraction.

#### [Multiply Two Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/013-multiply-two-numbers-with-javascript.js)
- JavaScript uses the `*` symbol for multiplication of two numbers.

#### [Divide One Number by Another with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/014-divide-one-number-by-another-with-javascript.js)
- JavaScript uses the `/` symbol for division.

#### [Increment a Number with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/015-increment-a-number-with-javascript.js)
- You can easily increment or add one to a variable with the ++ operator.
- `i++;` is the equivalent of `i = i + 1;`

#### [Decrement a Number with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/016-decrement-a-number-with-javascript.js)
- You can easily decrement or decrease a variable by one with the -- operator.
- `i--;` is the equivalent of `i = i - 1;`

#### [Create Decimal Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/017-create-decimal-numbers-with-javascript.js)
- We can store decimal numbers in variables too. Decimal numbers are sometimes referred to as floating point numbers or floats.

#### [Multiply Two Decimals with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/018-multiply-two-decimals-with-javascript.js)
- In JavaScript, you can also perform calculations with decimal numbers, just like whole numbers.
- Multiply two decimal numbers.

#### [Divide One Decimal by Another with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/019-divide-one-decimal-by-another-with-javascript.js)
- Divide one decimal by another.

#### [Finding a Remainder in JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/020-finding-a-remainder-in-javascript.js)
- The remainder operator `%` gives the remainder of the division of two numbers.
- In mathematics, a number can be checked to be even or odd by checking the remainder of the division of the number by 2. Even numbers have a remainder of 0, while odd numbers a remainder of 1.
- <b>Note:</b> The remainder operator is sometimes incorrectly referred to as the modulus operator. It is very similar to modulus, but does not work properly with negative numbers.

#### [Compound Assignment With Augmented Addition](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/021-compound-assignment-with-augmented-addition.js)
- `myVar = myVar + 5;` to add 5 to myVar. Since this is such a common pattern, there are operators which do both a mathematical operation and assignment in one step.
- One such operator is the `+=` operator.

#### [Compound Assignment With Augmented Subtraction](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/022-compound-assignment-with-augmented-subtraction.js)
- Like the `+=` operator, `-=` subtracts a number from a variable.
- `myVar = myVar - 5;` will subtract 5 from myVar. This can be rewritten as: `myVar -= 5;`

#### [Compound Assignment With Augmented Multiplication](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/023-compound-assignment-with-augmented-multiplication.js)
- The `*=` operator multiplies a variable by a number.

#### [Compound Assignment With Augmented Division](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/024-compound-assignment-with-augmented-division.js)
- The `/=` operator divides a variable by another number.

#### [Escaping Literal Quotes in Strings](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/025-escaping-literal-quotes-in-strings.js)
- When you are defining a string you must start and end with a single or double quote. What happens when you need a literal quote: `"` or `'` inside of your string?
- In JavaScript, you can escape a quote from considering it as an end of string quote by placing a backslash (`\`) in front of the quote.

#### [Quoting Strings with Single Quotes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/026-quoting-strings-with-single-quotes.js)
- String values in JavaScript may be written with single or double quotes, as long as you start and end with the same type of quote. Unlike some other programming languages, single and double quotes work the same in JavaScript.

#### [Escape Sequences in Strings](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/027-escape-sequences-in-strings.js)
- Quotes are not the only characters that can be escaped inside a string. Escape sequences allow you to use characters you may not otherwise be able to use in a string.
    |   Code  |   Output    |
    | :----:  |   :-----:    |
    |   \'    |	single quote |
    |   \"	  | double quote |
    |   \\	  |  backslash   |
    |   \n	  |   newline    |
    |   \t	  |     tab      |
    |   \r	  | carriage return |
    |   \b	  |   backspace  |
    |   \f	  |   form feed  |
- Note that the backslash itself must be escaped in order to display as a backslash.

#### [Concatenating Strings with Plus Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/028-concatenating-strings-with-plus-operator.js)
- In JavaScript, when the `+` operator is used with a String value, it is called the concatenation operator. You can build a new string out of other strings by concatenating them together.
- <b>Note:</b> Watch out for spaces. Concatenation does not add spaces between concatenated strings, so you'll need to add them yourself.

#### [Concatenating Strings with the Plus Equals Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/029-concatenating-strings-with-the-plus-equals-operator.js)
- We can also use the `+=` operator to concatenate a string onto the end of an existing string variable. This can be very helpful to break a long string over several lines.

#### [Constructing Strings with Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/030-constructing-strings-with-variables.js)
- By using the concatenation operator (`+`), you can insert one or more variables into a string you're building.

#### [Appending Variables to Strings](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/031-appending-variables-to-strings.js)
- Just as we can build a string over multiple lines out of string literals, we can also append variables to a string using the plus equals (`+=`) operator.

#### [Find the Length of a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/032-find-the-length-of-a-string.js)
- You can find the length of a String value by writing `.length` after the string variable or string literal.

#### [Use Bracket Notation to Find the First Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/033-use-bracket-notation-to-find-the-first-character-in-a-string.js)
- Bracket notation is a way to get a character at a specific index within a string.
- Most modern programming languages, like JavaScript, don't start counting at 1 like humans do. They start at 0. This is referred to as Zero-based indexing.
- For example, the character at index 0 in the word `Charles` is `C`. So if `const firstName = "Charles"`, you can get the value of the first letter of the string by using `firstName[0]`.

#### [Understand String Immutability](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/034-understand-string-immutability.js)
- In JavaScript, String values are immutable, which means that they cannot be altered once created.
- Note that this does not mean that string could not be re-assigned. The only way to change the string would be to re-assign it with a new value.

#### [Use Bracket Notation to Find the Nth Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/035-use-bracket-notation-to-find-the-nth-character-in-a-string.js)
- You can also use bracket notation to get the character at other positions within a string.
- Remember that computers start counting at 0, so the first character is actually the zeroth character.

#### [Use Bracket Notation to Find the Last Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/036-use-bracket-notation-to-find-the-last-character-in-a-string.js)
- In order to get the last letter of a string, you can subtract one from the string's length.

#### [Use Bracket Notation to Find the Nth-to-Last Character in a String](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/037-use-bracket-notation-to-find-the-nth-to-last-character-in-a-string.js)
- You can use the same principle we just used to retrieve the last character in a string to retrieve the Nth-to-last character.
- For example, you can get the value of the third-to-last letter of the `const firstName = "Augusta"` string by using `firstName[firstName.length - 3]`.

#### [Word Blanks](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/038-word-blanks.js)
- You are provided sentences with some missing words, like nouns, verbs, adjectives and adverbs. You then fill in the missing pieces with words of your choice in a way that the completed sentence makes sense.

#### [Store Multiple Values in one Variable using JavaScript Arrays](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/039-store-multiple-values-in-one-variable-using-javascript-arrays.js)
- With JavaScript array variables, we can store several pieces of data in one place.
- You start an array declaration with an opening square bracket, end it with a closing square bracket, and put a comma between each entry, like this: `const sandwich = ["peanut butter", "jelly", "bread"];`

#### [Nest one Array within Another Array](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/040-nest-one-array-within-another-array.js)
- You can also nest arrays within other arrays, like below: `const teams = [["Bulls", 23], ["White Sox", 45]];`
- This is also called a multi-dimensional array.

#### [Access Array Data with Indexes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/041-access-array-data-with-indexes.js)
- We can access the data inside arrays using indexes.
- Array indexes are written in the same bracket notation that strings use, except that instead of specifying a character, they are specifying an entry in the array. Like strings, arrays use zero-based indexing, so the first element in an array has an index of `0`.

#### [Modify Array Data With Indexes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/042-modify-array-data-with-indexes.js)
- Unlike strings, the entries of arrays are mutable and can be changed freely, even if the array was declared with `const`.
- <b>Note:</b> There shouldn't be any spaces between the array name and the square brackets, like array [0]. Although JavaScript is able to process this correctly, this may confuse other programmers reading your code.

#### [Access Multi-Dimensional Arrays With Indexes](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/043-access-multi-dimensional-arrays-with-indexes.js)
- One way to think of a multi-dimensional array, is as an array of arrays. When you use brackets to access your array, the first set of brackets refers to the entries in the outermost (the first level) array, and each additional pair of brackets refers to the next level of entries inside.

#### [Manipulate Arrays With push Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/044-manipulate-arrays-with-push.js)
- An easy way to append data to the end of an array is via the `push()` method.
- The `push()` method takes one or more arguments and appends them to the end of the array, in the order in which they appear. It returns the new length of the array.

#### [Manipulate Arrays With pop Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/045-manipulate-arrays-with-pop.js)
- Another way to change the data in an array is with the `.pop()` function.
- `.pop()` is used to pop a value off of the end of an array. We can store this popped off value by assigning it to a variable. In other words, `.pop()` removes the last element from an array and returns that element.
- Any type of entry can be popped off of an array - numbers, strings, even nested arrays.

#### [Manipulate Arrays With shift Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/046-manipulate-arrays-with-shift.js)
- `pop()` always removes the last element of an array. What if you want to remove the first?
- That's where `.shift()` comes in. It works just like `.pop()`, except it removes the first element instead of the last.

#### [Manipulate Arrays With unshift Method](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/047-manipulate-arrays-with-unshift.js)
- Not only can you shift elements off of the beginning of an array, you can also unshift elements to the beginning of an array i.e. add elements in front of the array.
- `.unshift()` works exactly like `.push()`, but instead of adding the element at the end of the array, `unshift()` adds the element at the beginning of the array.

#### [Shopping List](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/048-shopping-list.js)
- Create a shopping list in the variable `myList`. The list should be a multi-dimensional array containing several sub-arrays.
- The first element in each sub-array should contain a string with the name of the item. The second element should be a number representing the quantity

#### [Write Reusable JavaScript with Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/049-write-reusable-javascript-with-functions.js)
- In JavaScript, we can divide up our code into reusable parts called functions.
- You can call or invoke this function by using its name followed by parentheses, like this: `functionName();`.
- All of the code between the curly braces will be executed every time the function is called.

#### [Passing Values to Functions with Arguments](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/050-passing-values-to-functions-with-arguments.js)
- Parameters are variables that act as placeholders for the values that are to be input to a function when it is called.
- When a function is defined, it is typically defined along with one or more parameters. The actual values that are input (or "passed") into a function when it is called are known as arguments.

#### [Return a Value from a Function with Return](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/051-return-a-value-from-a-function-with-return.js)
- We can pass values into a function with arguments. You can use a `return` statement to send a value back out of a function.

#### [Global Scope and Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/052-global-scope-and-functions.js)
- In JavaScript, scope refers to the visibility of variables. Variables which are defined outside of a function block have Global scope. This means, they can be seen everywhere in your JavaScript code.
- Variables which are declared without the `let` or `const` keywords are automatically created in the `global` scope. This can create unintended consequences elsewhere in your code or when running a function again. You should always declare your variables with `let` or `const`.

#### [Local Scope and Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/053-local-scope-and-functions.js)
- Variables which are declared within a function, as well as the function parameters, have local scope. That means they are only visible within that function.

#### [Global vs. Local Scope in Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/054-global-vs--local-scope-in-functions.js)
- It is possible to have both local and global variables with the same name. When you do this, the local variable takes precedence over the global variable.

#### [Understanding Undefined Value returned from a Function](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/055-understanding-undefined-value-returned-from-a-function.js)
- A function can include the `return` statement but it does not have to. In the case that the function doesn't have a `return` statement, when you call it, the function processes the inner code but the returned value is `undefined`.

#### [Assignment with a Returned Value](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/056-assignment-with-a-returned-value.js)
- If you'll recall from our discussion about [Storing Values with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/003-storing-values-with-the-assignment-operator.js), everything to the right of the equal sign is resolved before the value is assigned. This means we can take the return value of a function and assign it to a variable.

#### [Stand in Line](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/057-stand-in-line.js)
- In Computer Science a `queue` is an abstract Data Structure where items are kept in order. New items can be added at the back of the queue and old items are taken off from the front of the queue.

#### [Understanding Boolean Values](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/058-understanding-boolean-values.js)
- Another data type is the Boolean. Booleans may only be one of two values: `true` or `false`. They are basically little on-off switches, where `true` is on and `false` is off. These two states are mutually exclusive.
- <b>Note:</b> Boolean values are never written with quotes. The strings `"true"` and `"false"` are not Boolean and have no special meaning in JavaScript.

#### [Use Conditional Logic with If Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/059-use-conditional-logic-with-if-statements.js)
- `if` statements are used to make decisions in code. The keyword `if` tells JavaScript to execute the code in the curly braces under certain conditions, defined in the parentheses. These conditions are known as `Boolean` conditions and they may only be `true` or `false`.
- When the condition evaluates to `true`, the program executes the statement inside the curly braces. When the Boolean condition evaluates to `false`, the statement inside the curly braces will not execute.

#### [Comparison with the Equality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/060-comparison-with-the-equality-operator.js)
- There are many comparison operators in JavaScript. All of these operators return a boolean `true` or `false` value.
- The most basic operator is the equality operator `==`. The equality operator compares two values and returns `true` if they're equivalent or `false` if they are not. Note that equality is different from assignment (`=`), which assigns the value on the right of the operator to a variable on the left.

#### [Comparison with the Strict Equality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/061-comparison-with-the-strict-equality-operator.js)
- Strict equality (`===`) is the counterpart to the equality operator (`==`). However, unlike the equality operator, which attempts to convert both values being compared to a common type, the strict equality operator does not perform a type conversion.
- If the values being compared have different types, they are considered unequal, and the strict equality operator will return false.

#### [Practice comparing different values](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/062-practice-comparing-different-values.js)
- If the values being compared are not of the same type, the equality operator will perform a type conversion, and then evaluate the values. However, the strict equality operator will compare both the data type and value as-is, without converting one type to the other.
- <b>Note:</b> In JavaScript, you can determine the type of a variable or a value with the `typeof` operator.

#### [Comparison with the Inequality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/063-comparison-with-the-inequality-operator.js)
- The inequality operator (`!=`) is the opposite of the equality operator. Inequality means not equal. The inequality operator returns `false` when the equality operator would return `true` and vice versa. Like the equality operator, the inequality operator will convert data types of values while comparing.

#### [Comparison with the Strict Inequality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/064-comparison-with-the-strict-inequality-operator.js)
- The strict inequality operator (`!==`) is the logical opposite of the strict equality operator. It means "Strictly Not Equal" and returns `false` where strict equality would return `true` and vice versa. The strict inequality operator will not convert data types.

#### [Comparison with the Greater Than Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/065-comparison-with-the-greater-than-operator.js)
- The greater than operator (`>`) compares the values of two numbers. If the number to the left is greater than the number to the right, it returns `true`. Otherwise, it returns `false`.
- Like the equality operator, the greater than operator will convert data types of values while comparing.

#### [Comparison with the Greater Than Or Equal To Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/066-comparison-with-the-greater-than-or-equal-to-operator.js)
- The greater than or equal to operator (`>=`) compares the values of two numbers. If the number to the left is greater than or equal to the number to the right, it returns `true`. Otherwise, it returns `false`.
- Like the equality operator, the greater than or equal to operator will convert data types while comparing.

#### [Comparison with the Less Than Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/067-comparison-with-the-less-than-operator.js)
- The less than operator (`<`) compares the values of two numbers. If the number to the left is less than the number to the right, it returns `true`. Otherwise, it returns `false`. Like the equality operator, the less than operator converts data types while comparing.

#### [Comparison with the Less Than Or Equal To Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/068-comparison-with-the-less-than-or-equal-to-operator.js)
- The less than or equal to operator (`<=`) compares the values of two numbers. If the number to the left is less than or equal to the number to the right, it returns `true`. If the number on the left is greater than the number on the right, it returns `false`. Like the equality operator, the less than or equal to operator converts data types.

#### [Comparisons with the Logical And Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/069-comparisons-with-the-logical-and-operator.js)
- Sometimes you will need to test more than one thing at a time. The logical and operator (`&&`) returns true if and only if the operands to the left and right of it are `true`.
- The same effect could be achieved by nesting an `if` statement inside another `if`.

#### [Comparisons with the Logical Or Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/070-comparisons-with-the-logical-or-operator.js)
- The logical or operator (`||`) returns true if either of the operands is `true`. Otherwise, it returns `false`.
- The logical or operator is composed of two pipe symbols: (`||`). This can typically be found between your Backspace and Enter keys

#### [Introducing Else Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/071-introducing-else-statements.js)
- When a condition for an `if` statement is true, the block of code following it is executed. What about when that condition is false? Normally nothing would happen. With an `else` statement, an alternate block of code can be executed.

#### [Introducing Else If Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/072-introducing-else-if-statements.js)
- If you have multiple conditions that need to be addressed, you can chain `if` statements together with `else if` statements.

#### [Logical Order in If Else Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/073-logical-order-in-if-else-statements.js)
- Order is important in `if`, `else if` statements.
- The function is executed from top to bottom so you will want to be careful of what statement comes first.

#### [Chaining If Else Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/074-chaining-if-else-statements.js)
- `if/else` statements can be chained together for complex logic.

#### [Golf Code](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/075-golf-code.js)
- In the game of Golf, each hole has a `par`, meaning, the average number of `strokes` a golfer is expected to make in order to sink the ball in the hole to complete the play. Depending on how far above or below `par` your `strokes` are, there is a different nickname.
- Your function will be passed `par` and `strokes` arguments.

#### [Selecting from Many Options with Switch Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/076-selecting-from-many-options-with-switch-statements.js)
- If you need to match one value against many options, you can use a switch statement. A `switch` statement compares the value to the case statements which define various possible values. Any valid JavaScript statements can be executed inside a case block and will run from the first matched `case` value until a `break` is encountered.

#### [Adding a Default Option in Switch Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/077-adding-a-default-option-in-switch-statements.js)
- In a `switch` statement you may not be able to specify all possible values as `case` statements. Instead, you can add the `default` statement which will be executed if no matching `case` statements are found. Think of it like the final `else` statement in an `if/else` chain.
- A `default` statement should be the last case.

#### [Multiple Identical Options in Switch Statements](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/078-multiple-identical-options-in-switch-statements.js)
- If the `break` statement is omitted from a `switch` statement's `case`, the following `case` statement(s) are executed until a `break` is encountered. If you have multiple inputs with the same output, you can represent them in a `switch` statement.

#### [Replacing If Else Chains with Switch](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/079-replacing-if-else-chains-with-switch.js)
- If you have many options to choose from, a `switch` statement can be easier to write than many chained `if`/`else if` statements. 

#### [Returning Boolean Values from Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/080-returning-boolean-values-from-functions.js)
- You may recall from [Comparison with the Equality Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/060-comparison-with-the-equality-operator.js) that all comparison operators return a boolean `true` or `false` value.

#### [Return Early Pattern for Functions](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/081-return-early-pattern-for-functions.js)
- When a `return` statement is reached, the execution of the current function stops and control returns to the calling location.
- Remember that `undefined` is a keyword, not a string.

#### [Counting Cards](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/082-counting-cards.js)
- In the casino game Blackjack, a player can determine whether they have an advantage on the next hand over the house by keeping track of the relative number of high and low cards remaining in the deck. This is called Card Counting.
- Having more high cards remaining in the deck favors the player. Each card is assigned a value according to the table below. When the count is positive, the player should bet high. When the count is zero or negative, the player should bet low.
    | Count Change| Cards |
    | :---------: | :---: |
    |   +1  | 2, 3, 4, 5, 6 |
    |   0	|   7, 8, 9     |
    |  -1	| 10, 'J', 'Q', 'K', 'A' |

#### [Build JavaScript Objects](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/083-build-javascript-objects.js)
- Objects are similar to `arrays`, except that instead of using indexes to access and modify their data, you access the data in objects through what are called `properties`.
- Objects are useful for storing data in a structured way, and can represent real world objects, like a cat.

#### [Accessing Object Properties with Dot Notation](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/084-accessing-object-properties-with-dot-notation.js)
- There are two ways to access the properties of an object: dot notation (`.`) and bracket notation (`[]`), similar to an array.
- Dot notation is what you use when you know the name of the property you're trying to access ahead of time.

#### [Accessing Object Properties with Bracket Notation](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/085-accessing-object-properties-with-bracket-notation.js)
- The second way to access the properties of an object is bracket notation (`[]`). If the property of the object you are trying to access has a space in its name, you will need to use bracket notation.

#### [Accessing Object Properties with Variables](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/086-accessing-object-properties-with-variables.js)
- Another use of bracket notation on objects is to access a property which is stored as the value of a variable. This can be very useful for iterating through an object's properties or when accessing a lookup table.
- Note that we do not use quotes around the variable name when using it to access the property because we are using the value of the variable, not the name.

#### [Updating Object Properties](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/087-updating-object-properties.js)
- After you've created a JavaScript object, you can update its properties at any time just like you would update any other variable. You can use either dot or bracket notation to update.

#### [Add New Properties to a JavaScript Object](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/088-add-new-properties-to-a-javascript-object.js)
- You can add new properties to existing JavaScript objects the same way you would modify them.

#### [Delete Properties from a JavaScript Object](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/089-delete-properties-from-a-javascript-object.js)
- We can also delete properties from objects like this: `delete ourDog.bark;`
- You may use either dot or bracket notation.

#### [Using Objects for Lookups](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/090-using-objects-for-lookups.js)
- Objects can be thought of as a key/value storage, like a dictionary. If you have tabular data, you can use an object to lookup values rather than a `switch` statement or an `if/else` chain. This is most useful when you know that your input data is limited to a certain range.

#### [Testing Objects for Properties](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/091-testing-objects-for-properties.js)
- To check if a property on a given object exists or not, you can use the `.hasOwnProperty()` method. `someObject.hasOwnProperty(someProperty)` returns `true` or `false` depending on if the property is found on the object or not.

#### [Manipulating Complex Objects](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/092-manipulating-complex-objects.js)
- Sometimes you may want to store data in a flexible Data Structure. A JavaScript object is one way to handle flexible data. They allow for arbitrary combinations of strings, numbers, booleans, arrays, functions, and objects.

#### [Accessing Nested Objects](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/093-accessing-nested-objects.js)
- The sub-properties of objects can be accessed by chaining together the dot or bracket notation.

#### [Accessing Nested Arrays](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/094-accessing-nested-arrays.js)
- As we have seen in earlier examples, objects can contain both nested objects and nested arrays. Similar to accessing nested objects, array bracket notation can be chained to access nested arrays.

#### [Record Collection](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/095-record-collection.js)
- You are creating a function that aids in the maintenance of a musical album collection. The collection is organized as an object that contains multiple albums which are also objects. Each album is represented in the collection with a unique `id` as the property name. Within each album object, there are various properties describing information about the album. Not all albums have complete information.

#### [Iterate with JavaScript While Loops](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/096-iterate-with-javascript-while-loops.js)
- You can run the same code multiple times by using a loop.
- The first type of loop we will learn is called a `while` loop because it runs while a specified condition is true and stops once that condition is no longer true.

#### [Iterate with JavaScript For Loops](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/097-iterate-with-javascript-for-loops.js)
- You can run the same code multiple times by using a loop.
- The most common type of JavaScript loop is called a `for` loop because it runs for a specific number of times.
- For loops are declared with three optional expressions separated by semicolons: `for (a; b; c)`, where `a` is the initialization statement, `b` is the condition statement, and `c` is the final expression.
- The initialization statement is executed one time only before the loop starts. It is typically used to define and setup your loop variable.
- The condition statement is evaluated at the beginning of every loop iteration and will continue as long as it evaluates to `true`. When the condition is `false` at the start of the iteration, the loop will stop executing. This means if the condition starts as false, your loop will never execute.
- The final expression is executed at the end of each loop iteration, prior to the next condition check and is usually used to increment or decrement your loop counter.

#### [Iterate Odd Numbers With a For Loop](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/098-iterate-odd-numbers-with-a-for-loop.js)
- For loops don't have to iterate one at a time. By changing our `final-expression`, we can count by even numbers.
- We'll start at `i = 0` and loop while `i < 10`. We'll increment `i` by 2 each loop with `i += 2`.

#### [Count Backwards With a For Loop](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/099-count-backwards-with-a-for-loop.js)
- A for loop can also count backwards, so long as we can define the right conditions.
- In order to decrement by two each iteration, we'll need to change our initialization, condition, and final expression.

#### [Iterate Through an Array with a For Loop](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/100-iterate-through-an-array-with-a-for-loop.js)
- A common task in JavaScript is to iterate through the contents of an array. One way to do that is with a `for` loop. 

#### [Nesting For Loops](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/101-nesting-for-loops.js)
- If you have a multi-dimensional array, you can use the same logic as the prior waypoint to loop through both the array and any sub-arrays.

#### [Iterate with JavaScript Do...While Loops](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/102-iterate-with-javascript-do---while-loops.js)
- The next type of loop you will learn is called a `do...while` loop. It is called a `do...while` loop because it will first `do` one pass of the code inside the loop no matter what, and then continue to run the loop `while` the specified condition evaluates to `true`.

#### [Replace Loops using Recursion](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/103-replace-loops-using-recursion.js)
- Recursion is the concept that a function can be expressed in terms of itself. To help understand this, start by thinking about the following task: multiply the first `n` elements of an array to create the product of those elements.

#### [Profile Lookup](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/104-profile-lookup.js)
- We have an array of objects representing different people in our contacts lists.
- A `lookUpProfile` function that takes `name` and a property (`prop`) as arguments has been pre-written for you.
- The function should check if `name` is an actual contact's `firstName` and the given property (`prop`) is a property of that contact.
- If both are true, then return the "value" of that property.
- If `name` does not correspond to any contacts then return the string `No such contact`.
- If `prop` does not correspond to any valid properties of a contact found to match `name` then return the string `No such property`.

#### [Generate Random Fractions with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/105-generate-random-fractions-with-javascript.js)
- Random numbers are useful for creating random behavior.
- JavaScript has a `Math.random()` function that generates a random decimal number between `o` (inclusive) and `1` (exclusive). Thus `Math.random()` can return a `0` but never return a `1`.
- <b>Note:</b> Like [Storing Values with the Assignment Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/003-storing-values-with-the-assignment-operator.js), all function calls will be resolved before the `return` executes, so we can `return` the value of the `Math.random()` function.

#### [Generate Random Whole Numbers with JavaScript](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/106-generate-random-whole-numbers-with-javascript.js)
- You can generate random decimal numbers with `Math.random()`, but sometimes you need to generate random whole numbers.
- The following process will give you a random whole number less than `20`:
    - Use `Math.random()` to generate a random decimal number.
    - Multiply that random decimal number by `20`.
    - Use `Math.floor()` to round this number down to its nearest whole number.

#### [Generate Random Whole Numbers within a Range](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/107-generate-random-whole-numbers-within-a-range.js)
- You can generate a random whole number in the range from zero to a given number. You can also pick a different lower number for this range.
- You'll call your minimum number `min` and your maximum number `max`.
- This formula gives a random whole number in the range from `min` to `max`: `Math.floor(Math.random() * (max - min + 1)) + min`.

#### [Use the parseInt Function](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/108-use-the-parseint-function.js)
- The `parseInt()` function parses a string and returns an integer. Here's an example: `const a = parseInt("007");`
- The above function converts the string `007` to the integer `7`. If the first character in the string can't be converted into a number, then it returns `NaN`.

#### [Use the parseInt Function with a Radix](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/109-use-the-parseint-function-with-a-radix.js)
- The `parseInt()` function parses a string and returns an integer. It takes a second argument for the radix, which specifies the base of the number in the string. The radix can be an integer between 2 and 36.
- The function call looks like: `parseInt(string, radix);`

#### [Use the Conditional (Ternary) Operator](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/110-use-the-conditional-ternary-operator.js)
- The conditional operator, also called the ternary operator, can be used as a one line if-else expression.
- The syntax is `a ? b : c`, where `a` is the condition, `b` is the code to run when the condition returns `true`, and `c` is the code to run when the condition returns `false`.

#### [Use Multiple Conditional (Ternary) Operators](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/111-use-multiple-conditional-ternary-operators.js)
- In the previous challenge, you used a single conditional operator. You can also chain them together to check for multiple conditions.

#### [Use Recursion to Create a Countdown](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/112-use-recursion-to-create-a-countdown.js)
- In a previous challenge, you learned how to use recursion to replace a `for` loop. Now, let's look at a more complex function that returns an array of consecutive integers starting with `1` through the number passed to the function.
- As mentioned in the previous challenge, there will be a <i>base case</i>. The base case tells the recursive function when it no longer needs to call itself. It is a simple case where the return value is already known. There will also be a <i>recursive call</i> which executes the original function with different arguments. If the function is written correctly, eventually the base case will be reached.
- For example, say you want to write a recursive function that returns an array containing the numbers `1` through `n`. This function will need to accept an argument, `n`, representing the final number. Then it will need to call itself with progressively smaller values of `n` until it reaches `1`.

#### [Use Recursion to Create a Range of Numbers](https://github.com/keerthisureka/Quinbay/blob/main/Part-2(Frontend)/Basic%20JavaScript/113-use-recursion-to-create-a-range-of-numbers.js)
- Continuing from the previous challenge, we provide you another opportunity to create a recursive function to solve a problem.
- We have defined a function named `rangeOfNumbers` with two parameters. The function should return an array of integers which begins with a number represented by the `startNum` parameter and ends with a number represented by the `endNum` parameter. The starting number will always be less than or equal to the ending number. Your function must use recursion by calling itself and not use loops of any kind. It should also work for cases where both `startNum` and `endNum` are the same.