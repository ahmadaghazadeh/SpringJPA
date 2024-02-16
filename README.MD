docker run --rm -d -p 23306:3306 mysql

docker run --name mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -p 23306:3306 