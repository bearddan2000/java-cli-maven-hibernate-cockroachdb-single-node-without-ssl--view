# java-cli-maven-hibernate-cockroachdb-single-node-without-ssl--view

## Description
Creates a small database table
called `dog` and populates with
hql. Creates 2 lookup tables `breedLookup`
and `colorLookup` and 4N `dog`.

Joins `breedLookup` and `colorLookup`
to form a new table `dogextended`. These
views are deministrated 3 ways, `ResultTransformer`,
looking up ids on `breedLookup` and `colorLookup`,
and non-ResultTransformer method.

Add an immutable entity `breedcount` as a view uses a subquery join.

A java maven build, that connects to single node
cockroach database without ssl.

## Tech stack
- java
- maven
  - hibernate
  - hql
  - log4j
  - postgres drivers

## Docker stack
- cockroachdb/cockroach:v19.2.2
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
- [webui](http://localhost:8080)

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [ResultTransformer code based on](https://thorben-janssen.com/hibernate-resulttransformer/)
- [HQL code based on](https://www.journaldev.com/2954/hibernate-query-language-hql-example-tutorial)
- [Hibernate config based on](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/An-example-hibernatecfgxml-for-MySQL-8-and-Hibernate-5)
- [Hibernate code based on](https://github.com/lokeshgupta1981/hibernate/tree/master/hibernate-hello-world)
