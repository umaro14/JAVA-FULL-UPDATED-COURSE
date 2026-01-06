# JDBC Drivers
JDBC drivers are software components that enable Java applications to communicate with different types of databases. Each database (like MySQL, Oracle, or PostgreSQL) requires a specific JDBC driver that translates Java JDBC calls into the database-specific protocol.

The JDBC classes are contained in the Java packages java.sql and javax.sql.

JDBC allows Java applications to perform the following

Connect to a data source (e.g., MySQL, PostgreSQL).
Send SQL queries and update statements to the database.
Retrieve and process results from the database.
Structure of JDBC Driver
The above JDBC Driver structure illustrates the architecture of JDBC driver, where an application interacts with the JDBC API. The API communicates with the JDBC Driver Manager, which manages different database drivers e.g. SQL server, Oracle to establish database connectivity.