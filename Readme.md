## RMI

* **RMI [Remote Method Invocation]**

 Mechanism that allows object residing in one jvm to be accessed/invoked by an object residing in another jvm.  [Read More](https://www.tutorialspoint.com/java_rmi/java_rmi_introduction.htm)


* [**Telusko Video Tutorials PlayList**](https://www.youtube.com/playlist?list=PLGwb7xZHg-oMR0e6TSHKbc2SKOn_HJ-DR)

    * **RMI Steps:**
      * Create the Remote Interface. **`Add.java`**
      * Create the Implementation of the Remote Interface **`AddImpl.java`**
      * Compile the stub and skeleton 
            
            rmic AddImpl.java
      * Start the registry (rmiregistry)
            
            start rmiregistry
      * Create and Start Server **``RMIServer.java``**

            java RMIServer
      * Create and Start Client **`RMIClient.java`**

            java RMIClient

    * [Compiling the source code and running the server & client](https://www.youtube.com/watch?v=Ph00dbYeGXI&list=PLGwb7xZHg-oMR0e6TSHKbc2SKOn_HJ-DR&index=5)