echo Running Docker container...
docker run -p 8080:8080 accountsservice

if not%errorlevel% == 0 (
    echo Docker run failed. Exiting.
    exit /b 1
)