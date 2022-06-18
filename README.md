# GROUP21-ADP3-JUNE
Project description
This Project is an application management system that will help colleges organise, digitalize and automate academic facing processes.
Define
A college wishes to use technology to help processing the required steps of academic facing by digitalizing and automate these steps. This project will collect the student and Employee details and store that information in an easier to find database.
Scope of Functionalities
The scope of this project aims to improve the organisational processes of the college by digitising and automating its systems.
This program will have a database that will store information about staff and students and allow users to access it.
This database will store information of students at the college such as their student id, student name.
This database will store information of staff at the college such as their staff id, staff name.
This database will store the emails of both staff and students.
This database will store the addresses of both staff and students which includes their country, city, postal code, street name, street number, complex name and unit number.

Team and roles
Team leader-Warren,
Members:
Nawaaz,
Aristoteles,
Levi,
Zelino and
Mpho
Objective/Goal
to complete each of these milestones on those specific time. These are to be deliveries in a specific time frame. The work schedule is task as the following;
9th-18thJune
9th-domain
10th-domain-submit your domain
11th-Factory
12th-Factor-Submit your factory
13th-Repository
14th-Repository-Submit your Repository
15th-Services
16th-ServicesàSubmit your Services
17th-Controller
18th-Controller---------“Readme.md”- Submit your Controller and “Readme.md” file
 
Task/Milestones
The milestones and tasks were divided by each on the group. UML diagram entity were divided as following;
     Warren-Employee and Employee Address
         Nawaaz-Student and Student Address
         Aristoteles- City
         Levi-Country
         Zelino-Name
       Mpho-Address

 
 





Flaws in both the (uml domain) design
Uml is a software modelling language with an emphasis on graphics and motion
 
Although a favourite method by many developers it has its flaw which some can be recognized in this given uml
Time
Takes too long to maintain the uml to work properly
To many unnecessary entities
To focused on the software features
Many entities could have been included in the same entity such as country or city.
Standalone entity requires many uses of resources
Public and private change unnecessary yet more frustrating when comes to coding
Diagram looks messy and time consuming in term of understanding the end goal and requirements.

Improvements that you could make to this solution
The database may be a bit limited with what information is stored in it, so I would add more variables for the database to manage to make the system more complete.
I would have the database store information on courses and which course a student is taking.
I would have the courses specify which classes are involved with each course.
I would have the database specify whether the staff member is a lecturer or not.
I would have the database specify what course a lecturer is teaching.
I would include department information including how many students are registered at the college.
Testing
The testing method we use is JUnit 5 testing. JUnit is a Java unit testing framework that's one of the best test methods for regression testing. An open-source framework, it is used to write and run repeatable automated tests. The tests we have done in our assignment tests to pass the objects and the embedded entities. We tested Save, Read one, Delete and Read many test case operations. 




How the project was coded
The entire project is coded in Java for Springboot application and we used the following design patterns: 
Builder Pattern
Singleton Pattern
Autowired Singleton Pattern
Factory Method Pattern
Java Persistence API 
Facade Pattern
Requirements/how to run application
Tools:
IDE
JDK 16
Mapping
Spring boot
First things first when running the program, you should have an IDE which is IntelliJ, and you must also install JDK 16 which is a builder tool, since we working on a spring boot application you should make sure that you have added the spring boot dependency on the POM file, and there should also be Beans which shows you are running a spring boot application, also mapping which lists all methods with the @RequestMapping annotation or its shortcuts, such as @GetMapping. Lastly you can run an HTTP request, open it in a requests file, or in the web browser.
Flaws in the implementation of the system
We faced some flaws on cyclic dependency almost all the entities where depending on each other in order for them to run, it was a challenge because we shared the entities amongst the team so in order to run your entity you required one of the members entity, and having to meet regularly to check that everyone is progressing well with their task.




