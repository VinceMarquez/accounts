echo Running Maven clean install...
mvn clean install

if not%errorlevel% == 0 (
    echo Maven build failed. Exiting.
    exit /b 1
)