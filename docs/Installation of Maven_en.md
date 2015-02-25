<h1>Maven installation</h1>

We'll be using Maven for this hackaton, it is an utility for building our Java code and its dependency management.

<h2>Requirements</h2>

JRE/JDK 1.7

<h2>Installatie instructies</h2>

Maven does not require an installer, you just need to copy the 32/64 bit version for your OS (which one you need depends on your installed Java version) to the desired path and extract it.

<h2>Configure the environment variables</h2>

<h3>Windows</h3>

Open theWindows Environment variables and make the following changes:

<ul>
    <li>add a  variabele with the name: M2_HOME toe, the value is the location of the maven installation directory</li>
    <li>add the following to the PATH variabele: %M2\_HOME%\bin</li>
</ul>

<h3>Non Windows</h3>

Perform the following command: export PATH=$PATH:MAVEN\_INSTALLATION\_DIRECTORY

<h3>Optional</h3>

You can add MAVEN\_OPTS variabele to control settings such as the amount of reserved memory.

<h2>Verify if everything works</h2>
Open a terminal and perform the 'mvn -version' command. If you get an error message verify if the JAVA\_HOME and M2\_HOME variables are correctly defined.
