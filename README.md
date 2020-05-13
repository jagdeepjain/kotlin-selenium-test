# Kotlin + Selenium WebDriver 
With the usage of Kotlin, it seems to faster in execution than Java so thought of using the same for UI testing and there this sample project.

This project demonstrates usage of Kotlin with Selenium WebDriver for UI testing.

## Running Test
```
$ mvn test -Dtest=GoogleSearchResultsTest
```

## Test Execution Results
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.example.GoogleSearchResultsTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@1bc6a36e
Starting ChromeDriver 80.0.3987.106 (f68069574609230cf9b635cd784cfb1bf81bb53a-refs/branch-heads/3987@{#882}) on port 12153
Only local connections are allowed.
Please protect ports used by ChromeDriver and related test frameworks to prevent access by malicious code.
[1589315968.308][WARNING]: FromSockAddr failed on netmask
[1589315969.327][WARNING]: This version of ChromeDriver has not been tested with Chrome version 81.
May 13, 2020 2:09:29 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.967 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.742 s
[INFO] Finished at: 2020-05-13T02:09:33+05:30
[INFO] ------------------------------------------------------------------------

```