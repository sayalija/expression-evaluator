Expression Evaluator
=========

This evaluator will evaluate expression and give result

Installation
============
Copy the zip file.

Extract the contents of zip file.

Run build.xml using ant and get evaluator.zip

Set an environment variable EVALUATOR_HOME to evaluator unzipped folder

Append PATH environment variable as %EVALUATOR_HOME%\bin


-----------------

#RELEASE 0.6
  - This release will support

        decimal numbers
        input with and without spaces
  - Example

        36 /( 2+ ( 3 *1 ) -2)+(1^2)   gives  13.0
        36 / ( 2+( 3* 1 ) - 2 ) gives 12.0

#RELEASE 0.5
  - This release will support

        brackets in expression

  - Example

        36 / ( 2 + ( 3 * 1 ) - 2 ) + ( 1 ^ 2 )   gives  13.0
        36 / ( 2 + ( 3 * 1 ) - 2 ) gives 12.0

#RELEASE 0.4
  - This release will support

        a pair if brackets
  - Result:

        result will be display in decimal value
  - Example

        12 - ( 3 * 2 )   gives  18.0
        ( 2 ^ 2) + 4 gives 8.0
  - Expression should have space in between every operator and operand and bracket

#RELEASE 0.3

  - Operations it can perform are:

        addition, subtraction, multiplication, division, power of
  - Numbers on which it can work are:

        positive/ negative, whole numbers
        non decimal numbers
  - Result:
        result will be display in decimal value
  - Example

        12 - 3 * 2   gives  18.0
        2 ^ 31 gives 2.14748364
        3 * 12 ^ 2 gives 1296.0


#RELEASE 0.2

  - Operations it can perform are:

        addition
  - Numbers on which it can work are:

        positive numbers
        multiple numbers
        non decimal numbers
  - Example

        12 + 3 + 2   gives  17

#RELEASE 0.1

  - Operations it can perform are:

        addition
  - Numbers on which it can work are:

        only 2 positive numbers
  - Example

        2 + 3   gives  5
  - Expression should have space in between every operator and operand
