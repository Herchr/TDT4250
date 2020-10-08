# TDT4250
## Assignment 1
#### Repo structure and content
* **tdt4250.a1**
     * **src** contains the source code generated by .genmodel.
          * **util** contains the file A1Validaotor.java, where both the auto-generated constraints and the handwritten constraints are located.
          * **impl** contains the file A1FactoryImpl.java, where the handwritten constraint for the course code is located. Also contains the file SemesterImpl.java, where the code for the derived feature "year" is located.
     * **model** contains the ecore model, the generator model, and the dynamic instance. The semester class in the ecore model contains OCL.

## Assignment 2

- This assignment was implemented using an M2T tranformation with Acceleo.
- To avoid duplication, the Semester class no longer contains a list of courses. The courses are instead accessed through the courseStatus attribute.

* **tdt4250.a1.tests**
     contains the generated tests for all the classes of the model

* **WebPageM2T**
     * **src**
          * **main** contains the transformation
     * **dst_code** contains the website in html format. [Here](https://github.com/Herchr/TDT4250/WebPageM2T/dst_code/NTNU.html) is the website.
 

    
