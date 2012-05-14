Mode Template for Processing 2.0a5 or later
===========================================

[www.processing.org](http://www.processing.org)

Florian Jenett<br />
Martin Leopold

Notes
-----
* By default this extends JavaMode so you'll get the familiar editor and all functionality you are used to from vanilla processing in your mode. See instructions if you don't want to extend JavaMode.

Requirements
------------
* Processing 2.0a5 or later, we built trunk from SVN (April 30, 2012)
* Apache Ant to build.

Instructions
------------
* Set properties in build.xml
    * The name of your mode (lib.name) must end in "Mode" (e.g. MyFancyMode) otherwise it won't work.
    * Set the path to your processing jars (core.jar, pde.jar)
    * If you want to automatically install your mode (target: install ), set the path to your modes folder (typically a folder named "modes" inside your sketchbook folder)
    * If you want to run processing after building (target: run), set the path to your processing executable.

* Other libraries that you need in your mode can be placed in "lib". They will be added to the classpath for building and bundled with your mode.

* Ant Targets:
    * **build**: builds your mode, creates a folder containing the mode in "dist". This can be put into the modes folder inside your sketchbook.
    * **install**: builds your mode and copies it to your modes folder.
    * **run**: builds and installs your mode, then runs processing.

* You can start building your mode by implementing some of the commented-out methods in TemplateMode.java thus overriding JavaMode's default functionality.

* Check out the following classes for more methods to use and/or override:
    * processing.mode.java.JavaMode
    * processing.app.Mode
    * processing.app.Editor
    * processing.mode.java.JavaEditor

* To setup a more general Mode (not extending JavaMode) change the TemplateMode class to extend processing.app.Mode instead of JavaMode and implement all the commented methods. Also Remove @Override annotations.