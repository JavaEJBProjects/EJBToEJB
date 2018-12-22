# EJBToEJB
Calling EJB Application From Another EJB Application

Sample EJB application which call another EJBapplication through testclient
1. Before running this application you must have application server. We have used Glassfish v3 for testing.
We have below projects
EJB-App-1 -> This application used by EJB-App-2 internally
EJB-App-1-Delegate -> This project is used for creating delegate jar used in EJB-App-2 for calling EJB-App-1
EJB-App-1-Ear -> Used for Bundle the application jar into Ear
EJB-App-2 -> This is the main application used by cleint
EJB-App-2-Ear --> Used for Bundle the application jar into Ear, We have to bundle EJB-App-1-Delegate(should contain in lib) with ear to use service of EJB-App-1
SimpleTestClient -> purpose for Testing the application. Import as is into IDE and add dependency of EJB-App-2 and appserv-rt and javaee jar to run the application. appserv-rt and javaee jar can be found under lib directory of glassfish server or you can also download from maven.

2. Clone the this project on desktop using git bash.
3. Take the build of aplication. It will create below Ear

EJB-App-1-Ear-0.0.1-SNAPSHOT
EJB-App-2-Ear-0.0.1-SNAPSHOT

4. Deploy Ear on application server one by one
5. Import SimpleTestClient into IDE and perform testing.


