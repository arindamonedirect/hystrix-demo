# hystrix-demo

To run this project, checkout and run the following command: 

```
mvn spring-boot:run
```


To run the mock server that feeds data to the rest endpoint: 

1. Checkout json-server at
https://github.com/typicode/json-server.git and open the project. 
2. Open the file db.json and overwrite it with the following content:
```javascript
{
  "data": {"id": 100, "description" : "rest endpoint desc", "isSold": true, "price": 100}
}
```
3. Run the following commands from in this json-server project's classpath: 
```
$ npm install -g json-server
```
```
$ json-server --watch db.json
```

