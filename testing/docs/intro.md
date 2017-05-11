# intro to testing


### Types of testing
* Black Box
* White Box
* Functional
* Unit
* Integration
* System
* Smoke
* UAT


### Black Box vs White Box
How the tester executes the code can be accomplished by Black Box Testing or White Box Testing.

###### Black Box Testing
* The program is treated like a black box, thus the user cannot see the code.
* It is testing that is driven from the outside, from the customer’s perspective and is carried out without knowledge of the details of the underlying code.
* It is not based on any knowledge of internal design or code. Tests are based on requirements and functionality.

###### White/Glass Box Testing
* Programmer uses his understanding and access to the source code to develop test cases.
* White box testing is based on coverage of code statements, paths, branches, conditions, logical expressions (true/false), loops, and internal data structures.


### Unit testing
* The most ‘micro’ scale of testing where the smallest executable pieces of code.
* Performed by the programmer and not by testers, as it requires detailed knowledge of the internal program design and code
* Perform line coverage testing. This is the execution of every line of code at least once.
* Perform branch coverage testing. This is the execution of each branch twice – once for a true value and one for a false value.
* Perform condition testing. This is the execution of each condition at least once for true and once for false.


### Integration Testing
* Testing of combined parts of an application to determine if they function together correctly.
* The 'parts' can be code modules, 3rd party applications etc.


### Smoke Test or Qualification testing
* Each time the test team receives a new version of the program, an initial test is performed to determine whether the build is stable enough to be tested.
* It is a short test hitting all major pieces of functionality – a “shot through the dark” to determine if the software is performing well enough to accept it for a major testing effort.
* An ideal test to be automated. Subsequently can be run by the development staff before testing begins.
* For example, if the new software is crashing systems every 5 minutes, bogging down systems to a crawl, or destroying databases, the software may not be in a 'sane' enough condition to warrant further testing in its current state


### Functional testing
* Functional Testing is a black-box type testing geared to functional requirements of an application. The following are types of functional testing:
* **Specification Verification** testing. The QA group checks the system against the related design documentation or specifications. The team compares the program’s behavior against every word of the documentation.
* **State Transitions**. Test the system capability to switch transitions and not lose track of its current state.
* **Multi-Processing**. Test the system’s capability to multi-task and verify that multiple users can use it at the same time.
* **Error Recovery**. Test every error message of the program. Verify that a message is displayed and that it is the correct message. Verify the system can anticipate errors and protect against them, notice error conditions and deal with a detected error in a reasonable way.
* **Output**. Test the output of the program whether display, print, graph or saved. Verify the look, spelling, usability and legibility.
* Some sub-testing of functional testing includes Equivalency issues, Boundary conditions and Random.


### System Testing
* Black-box type of testing that is based on overall requirements specifications; covers all combined parts of a system.
* Complete system testing which does NOT repeat functionality testing
* System testing includes Performance, Load, Volume, Memory, Compatibility, Conversion and Recovery. These types of testing are described in the next sections.


### User Acceptance Testing
* Final testing based on specifications of the end-user or customer. The customers use the product in the same way they would while performing their daily jobs.
* Compare the end product to the needs of the end users
* Ensure your test group tests all acceptance tests before delivering it to the customer. Strive for realism.
* **Alpha Testing** – End users inside the company that were not involved in the development of the product.
* **Beta Testing**  - Subset of actual customers outside the company. They use the product in the same way that they would if they bought the finished version. Get feedback!


### Performance Testing
Performance testing, a non-functional testing technique to determine the system parameters in terms of responsiveness and stability under various workload.

Performance testing measures the quality attributes of the system, such as **scalability**, **reliability** and **resource usage**.

###### Load testing
It is the simplest form of testing conducted to understand the behavior of the system under a specific load. Load testing will result in measuring important business critical transactions and load on the database, application server, etc., are also monitored.

###### Stress testing
It is performed to find the upper limit capacity of the system and also to determine how the system performs if the current load goes well above the expected maximum.

###### Spike testing
Spike testing is performed by increasing the number of users suddenly by a very large amount and measuring the performance of the system. The main aim is to determine whether the system will be able to sustain the workload.

###### Performance Testing Tools
* Jmeter - http://jmeter.apache.org/
* Open STA - http://opensta.org/
* Load Runner - http://www.hp.com/
* Web Load - http://www.radview.com/


### Regression Testing
* Whenever developers change or modify their software, even a small tweak can have unexpected consequences.  
* Testing existing software applications to make sure that a change or addition hasn’t broken any existing functionality is called regression testing. 
* Its purpose is to catch bugs that may have been accidentally introduced into a new build or release candidate, and to ensure that previously eradicated bugs continue to stay dead.  
* By re-running testing scenarios that were originally scripted when known problems were first fixed, you can make sure that any new changes to an application haven’t resulted in a regression, or caused components that formerly worked to fail.  
* Such tests can be performed manually on small projects, but in most cases repeating a suite of tests each time an update is made is too time-consuming and complicated to consider, so automated testing is typically required.


### Automation Testing

###### What to automate?
* Business critical functions (traditional)
* All functionality (agile)

###### When to automate?
* Traditional – After few rounds of manual testing or after making sure the system is stable
* Current trend – Before the application is developed

###### How to automate?
* Using automation tools
* Popular testing tools
* QTP, Rational, Silk, Compuware
* Selenium webdriver, Squish, Sikulli
* JUnit, TestNG, Nunit, Nose
* WATIR, Cucumber
