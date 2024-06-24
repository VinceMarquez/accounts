echo Building Docker image...
docker build . -t accountsservice

if not%errorlevel% == 0 (
    echo Docker build failed. Exiting.
    exit /b 1
)

echo Running Docker container...
docker run -p 8080:8080 accountsservice

if not%errorlevel% == 0 (
    echo Docker run failed. Exiting.
    exit /b 1
)