# MatrixSequenceFinder is a test task for Akvelon Company.
    The service allows to accept matrices consisting of 1's and 0's
    and to return the longest sequential queue of 1's either within
    a single row or a column of a matrix

#### Technical details:
    - Used Spring Boot and Maven for project setup;
    - The application is build as a REST API;
    - Used validation of input (Javax validation);
    
#### To start and use the application:
    - Download and deploy the project;
    - Open Postman or any other utility for sending POST requests;
    - Send POST to http://localhost:8080/matrix-input (check your 
        default localhost port) with the body containing JSON object
        which contains two-dimensional matrix consisting of 1's 
        and 0's with the property name "matrix".
        Example:
            "matrix": [
            		[1,0,0],
            		[1,0,0,1,0,1,1,1,1,1],
            		[1,1,0,1,1,1],
            		[1],
            		[1],
            		[1]
            	]
        The service will send back the longest sequence of 1's (6 in
        this case)
        If you try to input any othe integer except 1 or 0 the service
        will send an error.
