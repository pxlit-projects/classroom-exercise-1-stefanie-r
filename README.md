# Classroom exercise

## Exercise 1
Our MoonDollahs CoffeeShop has some baristas with their own work ethic and is serving coffee to customers.

Some baristas will get the customers name wrong because they're lazy or can't hear very well.

Right now we know of 3 baristas: _Vicky_, _Gemma_ and _Gianluca_. What happens when we hire a new barista who's also called _Gemma_, but has a **different work ethic**?

Your job is to refactor the code so responsibilities of classes are distributed properly, so we can more easily add a new barista.

You can assume that we'll only hire a new barista that has one of the already existing work ethics.

You will have to refactor the BaristaTest.

At the end of your refactoring, all of the existing tests should not fail.

## How to run in your IDE
In `build.gradle` I included the `idea` and `eclipse` plugins, so all there is to it is `./gradlew eclipse` or `./gradlew idea` or `./gradlew.bat ...` if you're on windows.
